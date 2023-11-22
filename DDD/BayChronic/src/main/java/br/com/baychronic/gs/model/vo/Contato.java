package br.com.baychronic.gs.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do Contato
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Contato com a tabela t_bc_contato
 * @author luiz.biazzola
 */
@Entity
@Table(name = "t_bc_contato")
public class Contato {

    /**
     * Atributo private int idContato
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_bc_contato
     * E a @Column para mostrar que o atributo será armazenado na coluna id_contato no banco de dados
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato")
    private int idContato;

    /**
     * Atributo privado String nome
     * Será responsável por armazenas o nome do Contato
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome
     * do banco de dados
     */
    @Column(name = "nome")
    private String nome;

    /**
     * Atributo privado String telefone
     * Será responsável por armazenas o telefone do Contato
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna telefone
     * do banco de dados
     */
    @Column(name = "telefone")
    private String telefone;
    /**
     * Atributo privado String email
     * Será responsável por armazenas o email do Contato
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna email
     * do banco de dados
     */
    @Column(name = "email")
    private String email;

    /**
     * @return idContato
     */
    public int getIdContato() {
        return idContato;
    }

    /**
     * @param idContato the idContato to set
     */
    public void setIdContato(int idContato) {
        this.idContato = idContato;
    }

    /**
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
