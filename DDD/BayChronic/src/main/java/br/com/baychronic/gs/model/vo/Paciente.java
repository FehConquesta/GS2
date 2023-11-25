package br.com.baychronic.gs.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do Paciente
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Paciente com a tabela t_bc_paciente
 * @author luiz.biazzola
 */
@Entity
@Table(name = "t_bc_paciente")
public class Paciente {
    /**
     * Atributo private int idPaciente
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_bc_paciente
     * E a @Column para mostrar que o atributo será armazenado na coluna id_paciente no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private int idPaciente;
    /**
     * Atributo privado String nome
     * Será responsável por armazenas o nome do paciente
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome
     * do banco de dados
     */
    @Column(name = "nome")
    private String nome;
    /**
     * Atributo privado int idade
     * Será responsável por armazenas a idade do paciente
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna idade
     * do banco de dados
     */
    @Column(name = "idade")
    private int idade;
    /**
     * Atributo privado String telefone
     * Será responsável por armazenas o telefone do paciente
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna telefone
     * do banco de dados
     */
    @Column(name = "telefone")
    private String telefone;
    /**
     * Atributo privado idPlanoSaude
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe PlanoSaude
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_plano_saude do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_plano_saude")
    private PlanoSaude idPlanoSaude;
    /**
     * Atributo privado idContato
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Contato
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_Contato do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_contato")
    private Contato idContato;
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
     * @return idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
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
     * @return idPlanoSaude
     */
    public PlanoSaude getIdPlanoSaude() {
        return idPlanoSaude;
    }

    /**
     * @param idPlanoSaude the idPlanoSaude to set
     */
    public void setIdPlanoSaude(PlanoSaude idPlanoSaude) {
        this.idPlanoSaude = idPlanoSaude;
    }

    /**
     * @return idContato
     */
    public Contato getIdContato() {
        return idContato;
    }

    /**
     * @param idContato the idContato to set
     */
    public void setIdContato(Contato idContato) {
        this.idContato = idContato;
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
