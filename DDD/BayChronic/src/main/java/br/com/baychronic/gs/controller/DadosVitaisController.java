package br.com.baychronic.gs.controller;


import br.com.baychronic.gs.model.bo.DadosVitaisBO;
import br.com.baychronic.gs.model.vo.DadosVitais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas ao DadosVitais.
 *
 * @author luiz.biazzola
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/dadosvitais")
public class DadosVitaisController {

    @Autowired
    private DadosVitaisBO dadosVitaisBO;
    /**
     * Construtor para injetar o serviço PacienteBO.
     *
     * @param dadosVitaisBO O serviço DadosVitaisBO a ser injetado.
     */
    public DadosVitaisController(DadosVitaisBO dadosVitaisBO) {
        this.dadosVitaisBO = dadosVitaisBO;
    }

    /**
     * Endpoint para listar todos os DadosVitais.
     *
     * @return ResponseEntity contendo a lista de DadosVitais e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<DadosVitais>> listarDadosVitais(){
        return ResponseEntity.status(200).body(dadosVitaisBO.listarDadosVitais());
    }
    /**
     * Endpoint para criar um novo DadoVital.
     *
     * @param dadosVitais O DadosVitais a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o DadosVitais recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<DadosVitais> criarDadosVitais(@RequestBody DadosVitais dadosVitais  ){
        return ResponseEntity.status(201).body(dadosVitaisBO.criarDadosVitais(dadosVitais));
    }
    /**
     * Endpoint para editar um DadoVital existente.
     *
     * @param id          O ID do DadoVital a ser editado, fornecido como parte da URL.
     * @param dadosVitais O DadoVital atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo os DadosVitais atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<DadosVitais> editarDadosVitais(@RequestBody Integer id, DadosVitais dadosVitais ){
        return ResponseEntity.status(200).body(dadosVitaisBO.alterarDadosVitais(id,dadosVitais));
    }
    /**
     * Endpoint para excluir um DadoVital pelo ID.
     *
     * @param id O ID do DadosVitais a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirDadosVitais(@PathVariable Integer id){
        dadosVitaisBO.excluirDadosVitais(id);
        return ResponseEntity.status(204).build();
    }

}
