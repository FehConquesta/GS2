package br.com.baychronic.gs.model.dao;

import br.com.baychronic.gs.model.vo.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface ProfissionalDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Profissional,Integer para mostrar que a entidade é o Profissional
 *  e o tipo da chave primaria é Integer
 */
public interface ProfissionalDAO extends JpaRepository<Profissional, Integer> {
}
