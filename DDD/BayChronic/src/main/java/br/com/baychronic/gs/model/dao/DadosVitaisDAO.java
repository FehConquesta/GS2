package br.com.baychronic.gs.model.dao;


import br.com.baychronic.gs.model.vo.DadosVitais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface DadosVitaisDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o DadosVitais,Integer para mostrar que a entidade é o DadosVitais
 *  e o tipo da chave primaria é Integer
 */
public interface DadosVitaisDAO extends JpaRepository<DadosVitais, Integer> {
}
