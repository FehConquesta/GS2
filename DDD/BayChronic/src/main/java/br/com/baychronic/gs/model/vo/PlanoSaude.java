package br.com.baychronic.gs.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do PlanoSaude
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * PlanoSaude com a tabela t_bc_plano_saude
 * @author luiz.biazzola
 */
@Entity
@Table(name = "t_bc_plano_saude")
public class PlanoSaude {
    /**
     * Atributo private int idPlanoSaude
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_bc_plano_saude
     * E a @Column para mostrar que o atributo será armazenado na coluna id_plano_saude no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano_saude")
    private int idPlanoSaude;
    /**
     * Atributo privado String nome
     * Será responsável por armazenas o nome do plano de saude (ex: Ouro, Prata, Bronze)
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome
     * do banco de dados
     */
    @Column(name = "nome")
    private String nome;
    /**
     * Atributo privado String nivel
     * Será responsável por armazenas o nivel do plano de saude (ex:varia de 1-3 sendo o nivel 3 o mais baixo e 1 o melhor)
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nivel
     * do banco de dados
     */
    @Column(name = "nivel")
    private int nivel;

    /**
     * @return idPlanoSaude
     */
    public int getIdPlanoSaude() {
        return idPlanoSaude;
    }

    /**
     * @param idPlanoSaude the idPlanoSaude to set
     */
    public void setIdPlanoSaude(int idPlanoSaude) {
        this.idPlanoSaude = idPlanoSaude;
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
     * @return nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
