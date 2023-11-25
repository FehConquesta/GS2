package br.com.baychronic.gs.controller;

import br.com.baychronic.gs.model.bo.PlanoSaudeBO;
import br.com.baychronic.gs.model.vo.PlanoSaude;
import br.com.baychronic.gs.model.vo.Profissional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas ao PlanoSaude.
 *
 * @author luiz.biazzola
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/planosaude")
public class PlanoSaudeController {

    @Autowired
    private PlanoSaudeBO planoSaudeBO;
    /**
     * Construtor para injetar o serviço PlanoSaudeBO.
     *
     * @param planoSaudeBO O serviço PlanoSaudeBO a ser injetado.
     */
    public PlanoSaudeController(PlanoSaudeBO planoSaudeBO) {
        this.planoSaudeBO = planoSaudeBO;
    }
    /**
     * Endpoint para listar todos os Planos de Saude.
     *
     * @return ResponseEntity contendo a lista de PlanosSaude e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<PlanoSaude>> listarPlanosSaude(){
        return ResponseEntity.status(200).body(planoSaudeBO.listarPlanosSaude());
    }
    /**
     * Endpoint para criar um novo PlanoSaude.
     *
     * @param planoSaude O PlanoSaude a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o PlanoSaude recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<PlanoSaude> criarPlanoSaude(@RequestBody PlanoSaude planoSaude ){
        return ResponseEntity.status(201).body(planoSaudeBO.criarPlanoSaude(planoSaude));
    }
    /**
     * Endpoint para editar um PlanoSaude existente.
     *
     * @param id          O ID do PlanoSaude a ser editado, fornecido como parte da URL.
     * @param planoSaude O PlanoSaude atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o PlanoSaude atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<PlanoSaude> editarPlanoSaude(@RequestBody Integer id, PlanoSaude planoSaude){
        return ResponseEntity.status(200).body(planoSaudeBO.alterarPlanoSaude(id,planoSaude));
    }
    /**
     * Endpoint para excluir um PlanoSaude pelo ID.
     *
     * @param id O ID do PlanoSaude a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirPlanoSaude(@PathVariable Integer id){
        planoSaudeBO.excluirPlanoSaude(id);
        return ResponseEntity.status(204).build();
    }


}
