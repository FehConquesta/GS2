package br.com.baychronic.gs.controller;

import br.com.baychronic.gs.model.bo.CredencialBO;
import br.com.baychronic.gs.model.vo.Credencial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas ao Credencial.
 *
 * @author luiz.biazzola
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/credencial")
public class CredencialController {
    @Autowired
    private CredencialBO credencialBO;
    /**
     * Construtor para injetar o serviço CredencialBO.
     *
     * @param credencialBO O serviço CredencialBO a ser injetado.
     */
    public CredencialController(CredencialBO credencialBO) {
        this.credencialBO = credencialBO;
    }

    //Está comentado pois as Credenciais não podem ser listadas.

//    /**
//     * Endpoint para listar todos os Credencial.
//     *
//     * @return ResponseEntity contendo a lista de Credencial e o status 200 se bem-sucedido.
//     */
//    @GetMapping
//    public ResponseEntity<List<Credencial>> listarCredencial(){
//        return ResponseEntity.status(200).body(credencialBO.listarCredenciais());
//    }
    /**
     * Endpoint para criar uma nova Credencial.
     *
     * @param credencial O Credencial a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Credencial recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Credencial> criarCredencial(@RequestBody Credencial credencial ){
        return ResponseEntity.status(201).body(credencialBO.criarCredencial(credencial));
    }
    /**
     * Endpoint para editar uma Credencial existente.
     *
     * @param id          O ID da Credencial a ser editado, fornecido como parte da URL.
     * @param credencial a Credencial atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo a Credencial atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Credencial> editarCredencial(@RequestBody Integer id, Credencial credencial ){
        return ResponseEntity.status(200).body(credencialBO.alterarCredencial(id,credencial));
    }
    /**
     * Endpoint para excluir uma Credencial pelo ID.
     *
     * @param id O ID da Credencial a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirCredencial(@PathVariable Integer id){
        credencialBO.excluirCredencial(id);
        return ResponseEntity.status(204).build();
    }



}
