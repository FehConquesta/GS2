package br.com.baychronic.gs.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do Profissional
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Profissional com a tabela t_bc_profissional
 * @author luiz.biazzola
 */
@Entity
@Table(name = "t_bc_profissional")
public class Profissional {
    /**
     * Atributo private int idProfissional
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_bc_profissional
     * E a @Column para mostrar que o atributo será armazenado na coluna id_profissional no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profissional")
    private int idProfissional;
    /**
     * Atributo privado String nome
     * Será responsável por armazenas o nome do profissional
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome
     * do banco de dados
     */
    @Column(name = "nome")
    private String nome;
    /**
     * Atributo privado String especializacao
     * Será responsável por armazenas a especializacao do profissional
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome
     * do banco de dados
     */
    @Column(name = "especializacao")
    private String especializacao;
    /**
     * Atributo privado idCredencial
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Credencial
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_credencial do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_credencial")
    private Credencial idCredencial;

    /**
     * @return idProfissional
     */
    public int getIdProfissional() {
        return idProfissional;
    }

    /**
     * @param idProfissional the idProfissional to set
     */
    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
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

    /**
     * @return especializacao
     */
    public String getEspecializacao() {
        return especializacao;
    }

    /**
     * @param especializacao the especializacao to set
     */
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    /**
     * @return idCredencial
     */
    public Credencial getIdCredencial() {
        return idCredencial;
    }

    /**
     * @param idCredencial the idCredencial to set
     */
    public void setIdCredencial(Credencial idCredencial) {
        this.idCredencial = idCredencial;
    }
}
