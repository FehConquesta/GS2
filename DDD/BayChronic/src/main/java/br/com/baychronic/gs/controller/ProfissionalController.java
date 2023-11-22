package br.com.baychronic.gs.controller;


import br.com.baychronic.gs.model.bo.ProfissionalBO;
import br.com.baychronic.gs.model.vo.Profissional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas ao Profissional.
 *
 * @author luiz.biazzola
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/profissional")
public class ProfissionalController {

    @Autowired
    private ProfissionalBO profissionalBO;
    /**
     * Construtor para injetar o serviço ProfissionalBO.
     *
     * @param profissionalBO O serviço ProfissionalBO a ser injetado.
     */
    public ProfissionalController(ProfissionalBO profissionalBO) {
        this.profissionalBO = profissionalBO;
    }
    /**
     * Endpoint para listar todos os Profissionais.
     *
     * @return ResponseEntity contendo a lista de Profissionais e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Profissional>> listarProfissionais(){
        return ResponseEntity.status(200).body(profissionalBO.listarProfissionais());
    }
    /**
     * Endpoint para criar um novo Profissional.
     *
     * @param profissional O Profissional a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Profissional recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Profissional> criarProfissional(@RequestBody Profissional profissional ){
        return ResponseEntity.status(201).body(profissionalBO.criarProfissional(profissional));
    }
    /**
     * Endpoint para editar um Profissional existente.
     *
     * @param id          O ID do Profissional a ser editado, fornecido como parte da URL.
     * @param profissional O Profissional atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Profissional atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Profissional> editarProfissional(@RequestBody Integer id, Profissional profissional ){
        return ResponseEntity.status(200).body(profissionalBO.alterarProfissional(id,profissional));
    }
    /**
     * Endpoint para excluir um Profissional pelo ID.
     *
     * @param id O ID do Profissional a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirProfissional(@PathVariable Integer id){
        profissionalBO.excluirProfissional(id);
        return ResponseEntity.status(204).build();
    }


}



