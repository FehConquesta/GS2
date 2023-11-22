package br.com.baychronic.gs.model.dao;

import br.com.baychronic.gs.model.vo.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface CredencialDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Credencial,Integer para mostrar que a entidade é o Credencial
 *  e o tipo da chave primaria é Integer
 */
public interface CredencialDAO extends JpaRepository<Credencial, Integer> {
}
