package br.com.baychronic.gs.model.vo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * Classe VO do DadosVitais
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * DadosVitais com a tabela t_bc_monitoramento
 * @author luiz.biazzola
 */
@Entity
@Table(name = "t_bc_dados_vitais")
public class DadosVitais {
    /**
     * Atributo private int idDadosVitais
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_bc_dados_vitais
     * E a @Column para mostrar que o atributo será armazenado na coluna id_dados_vitais no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dados_vitais")
    private int idDadosVitais;
    /**
     * Atributo privado dataHora
     * Será responsável por armazenas a data e hora atual, utilizando o LocalDateTime
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna data_hora
     * do banco de dados
     */
    @Column(name = "data_hora")
    private LocalDateTime dataHora;
    /**
     * Atributo privado int pas
     * Será responsável por armazenas a pressão arterial Sistolica
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna pas
     * do banco de dados
     */
    @Column(name = "pas")
    private int pas;
    /**
     * Atributo privado int pad
     * Será responsável por armazenas a pressão arterial diastolica
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna pad
     * do banco de dados
     */
    @Column(name = "pad")
    private int pad;
    /**
     * Atributo privado float nivelGlicemico
     * Será responsável por armazenas a quantidade de açucar no sangue
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nivel_glicemico
     * do banco de dados
     */
    @Column(name = "nivel_glicemico")
    private float nivelGlicemico;
    /**
     * Atributo privado float saturacao
     * Será responsável por armazenas a quantidade de oxigenio no sangue
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna saturacao
     * do banco de dados
     */
    @Column(name = "saturacao")
    private float saturacao;
    /**
     * Atributo privado idPaciente
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Paciente
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_paciente do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_credencial")
    private Paciente idPaciente;

    /**
     *Construtor para inicializar o atributo dataHora com a Data e Hora atual
     */
    public DadosVitais(){
        this.dataHora = LocalDateTime.now();
    }

    /**
     * retorna a data e hora, como esse atributo será iniciado no construtor, ele vai retornar a data e hora atual
     * @return dataHora
     */
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    /**
     * @return idDadosVitais
     */
    public int getIdDadosVitais() {
        return idDadosVitais;
    }

    /**
     * @param idDadosVitais the idDadosVitais to set
     */
    public void setIdDadosVitais(int idDadosVitais) {
        this.idDadosVitais = idDadosVitais;
    }

    /**
     * @return pas
     */
    public int getPas() {
        return pas;
    }

    /**
     * @param pas the pas to set
     */
    public void setPas(int pas) {
        this.pas = pas;
    }

    /**
     * @return pad
     */
    public int getPad() {
        return pad;
    }

    /**
     * @param pad the pad to set
     */
    public void setPad(int pad) {
        this.pad = pad;
    }

    /**
     * @return nivelGlicemico
     */
    public float getNivelGlicemico() {
        return nivelGlicemico;
    }

    /**
     * @param nivelGlicemico the nivelGlicemico to set
     */
    public void setNivelGlicemico(float nivelGlicemico) {
        this.nivelGlicemico = nivelGlicemico;
    }

    /**
     * @return saturacao
     */
    public float getSaturacao() {
        return saturacao;
    }

    /**
     * @param saturacao the Saturacao to set
     */
    public void setSaturacao(float saturacao) {
        this.saturacao = saturacao;
    }

    /**
     * @return idPaciente
     */
    public Paciente getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }
}
