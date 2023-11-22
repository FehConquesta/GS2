package br.com.baychronic.gs.model.bo;


import br.com.baychronic.gs.model.dao.PlanoSaudeDAO;
import br.com.baychronic.gs.model.vo.PlanoSaude;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço PlanoSaudeBO para gestão de entidades do PlanoSaude
 *
 * @author luiz.biazzola
 */
@Service
public class PlanoSaudeBO {
    /**
     * Injeção de dependencia
     */
    private PlanoSaudeDAO repository;
    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public PlanoSaudeBO(PlanoSaudeDAO repository) {
        this.repository = repository;
    }
    /**
     * Metodo para gerar uma lista com todos os PlanosSaude
     * @return Lista de PlanosSaude
     */
    public List<PlanoSaude> listarPlanosSaude(){
        List<PlanoSaude> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo PlanoSaude
     * @param planoSaude a entidade PlanoSaude que será criada
     * @return o novoPlanoSaude criado
     */
    public PlanoSaude criarPlanoSaude(PlanoSaude planoSaude){
        PlanoSaude novoPlanoSaude = repository.save(planoSaude);
        return novoPlanoSaude;
    }
    /**
     * Metodo para alterar um PlanoSaude existente com base em um ID fornecido
     *
     * @param id O id do PlanoSaude a ser atualizado
     * @param contato A do PlanoSaude
     * @return planoSaudeAtualizado
     */
    public PlanoSaude alterarPlanoSaude(Integer id, PlanoSaude planoSaude){
        Optional<PlanoSaude> optionalPlanoSaude = repository.findById(id);
        if(optionalPlanoSaude.isPresent()){
            PlanoSaude planoSaudeDesatualizado = optionalPlanoSaude.get();
            planoSaudeDesatualizado.setNome(planoSaude.getNome());
            planoSaudeDesatualizado.setNivel(planoSaude.getNivel());

            PlanoSaude planoSaudeAtualizado = repository.save(planoSaudeDesatualizado);

            return  planoSaudeAtualizado;
        }
        else{
            System.out.println("Id não encontrado");
            return null;
        }
    }
    /**
     * Metodo para excluir um PlanoSaude com base em um id fornecido
     * @param id O id do PlanoSaude a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirPlanoSaude(Integer id){
        repository.deleteById(id);
        return true;
    }

}
