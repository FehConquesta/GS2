package br.com.baychronic.gs.model.dao;

import br.com.baychronic.gs.model.vo.PlanoSaude;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface PlanoSaudeDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o PlanoSaude,Integer para mostrar que a entidade é o PlanoSaude
 *  e o tipo da chave primaria é Integer
 */
public interface PlanoSaudeDAO extends JpaRepository<PlanoSaude, Integer> {
}
