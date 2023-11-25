package br.com.baychronic.gs.model.bo;

import br.com.baychronic.gs.model.dao.CredencialDAO;
import br.com.baychronic.gs.model.vo.Credencial;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço CredencialBO para gestão de entidades do Credencial
 *
 * @author luiz.biazzola
 */
@Service
public class CredencialBO {
    /**
     * Injeção de dependencia
     */
    private CredencialDAO repository;

    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public CredencialBO(CredencialDAO repository) {
        this.repository = repository;
    }

    /**
     * Metodo para gerar uma lista com todos as Credenciais
     * O codigo está comentado, pois como as credenciais são privadas elas não devem ser listadas.
     * @return Lista de Credenciais
     */
//    public List<Credencial> listarCredenciais(){
//        List<Credencial> lista = repository.findAll();
//        return lista;
//    }

    /**
     * Metodo para criar uma nova Credencial
     * @param credencial a entidade Credencial que será criada
     * @return o novaCredencial criado
     */
    public Credencial criarCredencial(Credencial credencial){
        Credencial novaCredencial = repository.save(credencial);
        return novaCredencial;
    }
    /**
     * Metodo para alterar a senha de uma Credencial existente com base em um ID fornecido
     * Optei por não deixar alterar o usuario pois em muitos sistemas/sites após criar um usuario não é possivel altera-lo
     * @param id O id da Credencial a ser atualizado
     * @param credencial A Credencial
     * @return CredencialAtualizado
     */
    public Credencial alterarCredencial(Integer id, Credencial credencial){
        Optional<Credencial> optionalCredencial = repository.findById(id);
        if(optionalCredencial.isPresent()){
            Credencial credencialDesatualizado = optionalCredencial.get();
            credencialDesatualizado.setSenha(credencial.getSenha());

            Credencial credencialAtualizado = repository.save(credencialDesatualizado);

            return credencialAtualizado;

        }
        else{
            System.out.println("Id não encontrado");
            return null;
        }
    }

    /**
     * Metodo para excluir uma Credencial com base em um id fornecido
     * @param id O id da Credencial a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirCredencial(Integer id){
        repository.deleteById(id);
        return true;
    }









}
