package br.com.baychronic.gs.model.dao;

import br.com.baychronic.gs.model.vo.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface ContatoDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Contato,Integer para mostrar que a entidade é o Contato
 *  e o tipo da chave primaria é Integer
 */
public interface ContatoDAO extends JpaRepository<Contato, Integer> {
}
