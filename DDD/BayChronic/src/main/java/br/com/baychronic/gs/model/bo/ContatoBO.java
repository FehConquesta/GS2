package br.com.baychronic.gs.model.bo;

import br.com.baychronic.gs.model.dao.ContatoDAO;
import br.com.baychronic.gs.model.vo.Contato;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço ContatoBO para gestão de entidades do Contato
 *
 * @author luiz.biazzola
 */
@Service
public class ContatoBO {
    /**
     * Injeção de dependencia
     */
    private ContatoDAO repository;

    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public ContatoBO(ContatoDAO repository) {
        this.repository = repository;
    }

    /**
     * Metodo para gerar uma lista com todos os Contatos
     * @return Lista de Contatos
     */
    public List<Contato> listarContatos(){
        List<Contato> lista = repository.findAll();
        return lista;
    }

    /**
     * Metodo para criar um novo Contato
     * @param contato a entidade Contato que será criada
     * @return o novoContato criado
     */
    public Contato criarContato(Contato contato){
        Contato novoContato = repository.save(contato);
        return novoContato;
    }
    /**
     * Metodo para alterar um Contato existente com base em um ID fornecido
     *
     * @param id O id do Contato a ser atualizado
     * @param contato A do Contato
     * @return contatoAtualizado
     */
    public Contato alterarContato(Integer id, Contato contato){
        Optional<Contato> optionalContato = repository.findById(id);
        if(optionalContato.isPresent()){
            Contato contatoDesatualizado = optionalContato.get();
            contatoDesatualizado.setNome(contato.getNome());
            contatoDesatualizado.setEmail(contato.getEmail());
            contatoDesatualizado.setTelefone(contato.getTelefone());

            Contato contatoAtualizado = repository.save(contatoDesatualizado);

            return contatoAtualizado;

        }
        else{
            System.out.println("Id não encontrado");
            return null;
        }
    }

    /**
     * Metodo para excluir um Contato com base em um id fornecido
     * @param id O id do Contato a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirContato(Integer id){
        repository.deleteById(id);
        return true;
    }


}
