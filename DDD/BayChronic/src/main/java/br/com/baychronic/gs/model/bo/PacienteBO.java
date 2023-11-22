package br.com.baychronic.gs.model.bo;


import br.com.baychronic.gs.model.dao.PacienteDAO;
import br.com.baychronic.gs.model.vo.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço PacienteBO para gestão de entidades do Paciente
 *
 * @author luiz.biazzola
 */
@Service
public class PacienteBO {
    /**
     * Injeção de dependencia
     */
    private PacienteDAO repository;
    /**
     * Construtor para injeção de dependencia
     *
     * @param repository
     */
    public PacienteBO(PacienteDAO repository) {
        this.repository = repository;
    }

    /**
     * Metodo para gerar uma lista com todos os Pacientes
     * @return lista de Pacientes
     */
    public List<Paciente> listarPacientes(){
        List<Paciente> lista = repository.findAll();
        return lista;
    }
    /**
     * Metodo para criar um novo Paciente
     * @param paciente a entidade Paciente que será criada
     * @return o novoPaciente criado
     */
    public Paciente criarPaciente(Paciente paciente){
        Paciente novoPaciente = repository.save(paciente);
        return novoPaciente;
    }

    /**
     * Metodo para alterar um Paciente existente com base em um ID fornecido
     *
     * @param id O id do Paciente a ser atualizado
     * @param paciente A do Paciente
     * @return pacienteAtualizado
     */
    public Paciente alterarPaciente(Integer id, Paciente paciente){
        Optional<Paciente> optionalPaciente = repository.findById(id);
        if(optionalPaciente.isPresent()){
            Paciente pacienteDesatualizado = optionalPaciente.get();
            pacienteDesatualizado.setNome(paciente.getNome());
            pacienteDesatualizado.setIdade(paciente.getIdade());
            pacienteDesatualizado.setTelefone(paciente.getTelefone());
            pacienteDesatualizado.setIdPlanoSaude(paciente.getIdPlanoSaude());
            pacienteDesatualizado.setIdContato(paciente.getIdContato());
            pacienteDesatualizado.setIdCredencial(paciente.getIdCredencial());

            Paciente pacienteAtualizado = repository.save(pacienteDesatualizado);

            return  pacienteAtualizado;
        }
        else {
            System.out.println("Id não encontrado");
            return null;
        }
    }
    /**
     * Metodo para excluir um Paciente com base em um id fornecido
     * @param id O id do Paciente a ser excluido
     * @return Verdadeiro caso a exclusão for bem sucedida, falso caso contrario
     */
    public Boolean excluirPaciente(Integer id){
        repository.deleteById(id);
        return true;
    }

}
