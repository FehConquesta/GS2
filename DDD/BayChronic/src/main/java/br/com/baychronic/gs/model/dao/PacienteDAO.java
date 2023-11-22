package br.com.baychronic.gs.model.dao;

import br.com.baychronic.gs.model.vo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  Interface PacienteDAO
 *  essa interface extends o JpaRepository do Spring Data JPA
 *  O JpaRepository é uma interface que fornece os metodos para operações CRUD
 *  Colocamos o Paciente,Integer para mostrar que a entidade é o Paciente
 *  e o tipo da chave primaria é Integer
 */
public interface PacienteDAO extends JpaRepository<Paciente, Integer> {
}
