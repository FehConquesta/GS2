package br.com.baychronic.gs.controller;

import br.com.baychronic.gs.model.bo.ContatoBO;
import br.com.baychronic.gs.model.vo.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para operações relacionadas ao Contato.
 *
 * @author luiz.biazzola
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    private ContatoBO contatoBO;
    /**
     * Construtor para injetar o serviço ContatoBO.
     *
     * @param contatoBO O serviço ContatoBO a ser injetado.
     */
    public ContatoController(ContatoBO contatoBO) {
        this.contatoBO = contatoBO;
    }
    /**
     * Endpoint para listar todos os Contatos.
     *
     * @return ResponseEntity contendo a lista de Contatos e o status 200 se bem-sucedido.
     */
    @GetMapping
    public ResponseEntity<List<Contato>> listarContatos(){
        return ResponseEntity.status(200).body(contatoBO.listarContatos());
    }
    /**
     * Endpoint para criar um novo Contato.
     *
     * @param contato O Contato a ser criado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Contato recém-criado e o status 201 se bem-sucedido.
     */
    @PostMapping
    public ResponseEntity<Contato> criarContato(@RequestBody Contato contato ){
        return ResponseEntity.status(201).body(contatoBO.criarContato(contato));
    }
    /**
     * Endpoint para editar um Contato existente.
     *
     * @param id          O ID do Contato a ser editado, fornecido como parte da URL.
     * @param contato O Contato atualizado, fornecido no corpo da requisição.
     * @return ResponseEntity contendo o Contato atualizado e o status 200 se bem-sucedido.
     */
    @PutMapping
    public ResponseEntity<Contato> editarContato(@RequestBody Integer id, Contato contato ){
        return ResponseEntity.status(200).body(contatoBO.alterarContato(id,contato));
    }
    /**
     * Endpoint para excluir um Contato pelo ID.
     *
     * @param id O ID do Contato a ser excluído, fornecido como parte da URL.
     * @return ResponseEntity com status 204 se bem-sucedido e corpo vazio.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirContato(@PathVariable Integer id){
        contatoBO.excluirContato(id);
        return ResponseEntity.status(204).build();
    }
}
