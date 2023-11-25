package br.com.baychronic.gs.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do Credencial
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Credencial com a tabela t_bc_credencial
 * @author luiz.biazzola
 */
@Entity
@Table(name = "t_bc_credencial")
public class Credencial {
    /**
     * Atributo private int idCredencial
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_bc_credencial
     * E a @Column para mostrar que o atributo será armazenado na coluna id_credencial no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_credencial")
    private int idCredencial;
    /**
     * Atributo privado String user
     * Será responsável por armazenas o usuario de acesso
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna user
     * do banco de dados
     */
    @Column(name = "usuario")
    private String usuario;
    /**
     * Atributo privado String pwd
     * Será responsável por armazenas a senha de acesso
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna pwd
     * do banco de dados
     */
    @Column(name = "senha")
    private String senha;

    /**
     * @return idCredencial
     */
    public int getIdCredencial() {
        return idCredencial;
    }

    /**
     * @param idCredencial the idCredencial to set
     */
    public void setIdCredencial(int idCredencial) {
        this.idCredencial = idCredencial;
    }

    /**
     * @return user
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the user to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return pwd
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the pwd to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
