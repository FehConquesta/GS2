package br.com.baychronic.gs.model.bo;


import br.com.baychronic.gs.model.dao.ProfissionalDAO;
import br.com.baychronic.gs.model.vo.Profissional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço ProfissionalBO para gestão de entidades do Profissional
 *
 * @author luiz.biazzola
 */
@Service
public class ProfissionalBO {
    /**
     * Injeção de dependencia
     */
    private ProfissionalDAO repository;
    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public ProfissionalBO(ProfissionalDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os Profissionais
     * @return Lista de Profissionais
     */
    public List<Profissional> listarProfissionais(){
        List<Profissional> lista = repository.findAll();
        return lista;
    }

    /**
     * Metodo para criar um novo Profissional
     * @param profissional a entidade Profissional que será criada
     * @return o novoProfissional criado
     */
    public Profissional criarProfissional(Profissional profissional){
        Profissional novoProfissional = repository.save(profissional);
        return novoProfissional;
    }
    /**
     * Metodo para alterar um Profissional existente com base em um ID fornecido
     *
     * @param id O id do Profissional a ser atualizado
     * @param profissional A do Profissional
     * @return profissionalAtualizado
     */
    public Profissional alterarProfissional(Integer id, Profissional profissional){
        Optional<Profissional> optionalProfissional = repository.findById(id);
        if(optionalProfissional.isPresent()){
            Profissional profissionalDesatualizado = optionalProfissional.get();
            profissionalDesatualizado.setNome(profissional.getNome());
            profissionalDesatualizado.setEspecializacao(profissional.getEspecializacao());
            profissionalDesatualizado.setIdCredencial(profissional.getIdCredencial());

            Profissional profissionalAtualizado = repository.save(profissionalDesatualizado);

            return profissionalAtualizado;
        }
        else{
            System.out.println("Id não encontrado");
            return null;
        }
    }
    /**
     * Metodo para excluir um Profissional com base em um id fornecido
     * @param id O id do Profissional a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirProfissional(Integer id){
        repository.deleteById(id);
        return true;
    }


}


