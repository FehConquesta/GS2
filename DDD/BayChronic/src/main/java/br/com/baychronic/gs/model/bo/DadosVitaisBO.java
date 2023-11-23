package br.com.baychronic.gs.model.bo;

import br.com.baychronic.gs.model.dao.DadosVitaisDAO;
import br.com.baychronic.gs.model.vo.DadosVitais;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço DadosVitaisBO para gestão de entidade dos DadosVitais
 *
 * @author luiz.biazzola
 */
@Service
public class DadosVitaisBO {
    /**
     * Injeção de dependencia
     */
    private DadosVitaisDAO repository;

    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public DadosVitaisBO(DadosVitaisDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os DadosVitais
     * @return lista de DadosVitais
     */
    public List<DadosVitais> listarDadosVitais(){
        List<DadosVitais> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Dado Vital (pressão,saturação,glicemia)
     * @param dadosVitais a entidade DadosVitais que será criada
     * @return o novoDadosVitais criado
     */
    public DadosVitais criarDadosVitais(DadosVitais dadosVitais){
        DadosVitais novoDadosVitais = repository.save(dadosVitais);
        return novoDadosVitais;
    }

    /**
     * Metodo para alterar um Dado Vital existente com base em um ID fornecido
     *
     * @param id O id do DadoVital a ser atualizado
     * @param dadosVitais A do DadosVitais
     * @return DadosVitaisAtualizado
     */
    public DadosVitais alterarDadosVitais(Integer id, DadosVitais dadosVitais){
        Optional<DadosVitais> optionalDadosVitais = repository.findById(id);
        if(optionalDadosVitais.isPresent()){
            DadosVitais dadosVitaisDesatualizados = optionalDadosVitais.get();
            dadosVitaisDesatualizados.setPas(dadosVitais.getPas());
            dadosVitaisDesatualizados.setPad(dadosVitais.getPad());
            dadosVitaisDesatualizados.setSaturacao(dadosVitais.getSaturacao());
            dadosVitaisDesatualizados.setNivelGlicemico(dadosVitais.getNivelGlicemico());
            //Aqui não deixaremos atualizar o idDadosVitais por ser a chave primaria nem o idPaciente, visto que não tem
            //logica alterar o paciente que coletou os dados

            DadosVitais dadosVitaisAtualizado = repository.save(dadosVitaisDesatualizados);

            return dadosVitaisAtualizado;
        }
        else {
            System.out.println("Id não encontrado");
            return null;
        }

    }
    /**
     * Metodo para excluir um DadoVital com base em um id fornecido
     * @param id O id do DadoVital a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirDadosVitais(Integer id){
        repository.deleteById(id);
        return true;
    }

    /**
     * Metodo para informar se a pressão está alta ou baixa
     * De acordo com o ministerio da saude a pressão alta é quando ela está acima de 140/90mmHG
     * E a pressão baixa quando está abaixo de 90/60mmHg
     * A Glicemia abaixo de 70.0 SEM estar em jejum é considerado um caso de Hipoglicemia
     * Já a glicemia acima de 126.0 é considerado Hiperglicemia e tem altas chances de ser diabete
     * A saturação abaixo de 93% pode gerar diversos sintomas podendo até levar a complicações graves
     *
     * @param dadosVitais
     * @return Pressão, Saturação e glicemia
     */
    public String monitoramentoDadosVitais(DadosVitais dadosVitais){
        int pas = dadosVitais.getPas();
        int pad = dadosVitais.getPad();
        float saturacao = dadosVitais.getSaturacao();
        float glicemia = dadosVitais.getNivelGlicemico();

        if(pas < 90 && pad <60){
            System.out.println("A Sua pressão está BAIXA !!!");
            //Todo para o Front implementaria uma mensagem de alerta
        } else if (pas > 140 && pad > 90 ) {
            System.out.println("A sua pressão está ALTA !!!");
            //Todo para o Front implementaria uma mensagem de alerta
        }

        if(glicemia <= 70.0){
            System.out.println("Você está com Hipoglicemia, Cuidado!!!");
            //Todo Front implementaria uma mensagem de alerta
        } else if (glicemia > 126.0) {
            System.out.println("Você pode estar com Diabetes !!!");
            //Todo para o Front implementaria uma mensagem de alerta
        }

        if (saturacao < 93){
            System.out.println("Procure um medico, sua saturação está baixa.");
            //Todo para o Front implementaria uma mensagem de alerta
        }


        return "Pressão: " + pas +"/"+pad +"mmHg. Glicemia: " + glicemia +"mg/dL. Saturação: "+saturacao;

    }


}
