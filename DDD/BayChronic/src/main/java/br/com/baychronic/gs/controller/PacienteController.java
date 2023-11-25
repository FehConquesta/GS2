package br.com.baychronic.gs.controller;

import br.com.baychronic.gs.model.bo.PacienteBO;
import br.com.baychronic.gs.model.vo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas ao Paciente.
 *
 * @author luiz.biazzola
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteBO pacienteBO;
    /**
     * Construtor para injetar o serviço PacienteBO.
     *
     * @param pacienteBO O serviço PacienteBO a ser injetado.
     */
    public PacienteController(PacienteBO pacienteBO) {
        this.pacienteBO = pacienteBO;
    }
    /**
     * Endpoint para listar todos os Pacientes.
     *
     * @return ResponseEntity contendo a lista de Pacientes e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes(){
        return ResponseEntity.status(200).body(pacienteBO.listarPacientes());
    }
    /**
     * Endpoint para criar um novo Paciente.
     *
     * @param paciente O Paciente a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Paciente recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Paciente> criarPaciente(@RequestBody Paciente paciente ){
        return ResponseEntity.status(201).body(pacienteBO.criarPaciente(paciente));
    }
    /**
     * Endpoint para editar um Paciente existente.
     *
     * @param id          O ID do Paciente a ser editado, fornecido como parte da URL.
     * @param paciente O Paciente atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Paciente atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Paciente> editarPaciente(@RequestBody Integer id, Paciente paciente ){
        return ResponseEntity.status(200).body(pacienteBO.alterarPaciente(id,paciente));
    }
    /**
     * Endpoint para excluir um Paciente pelo ID.
     *
     * @param id O ID do Paciente a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirPaciente(@PathVariable Integer id){
        pacienteBO.excluirPaciente(id);
        return ResponseEntity.status(204).build();
    }




}
