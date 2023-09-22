package MODELO;

import java.sql.Date;

public class Hospedes {
    private Integer Id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private String telefone;
    private Integer idreserva;

    public Hospedes(String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone,
                    Integer idreserva) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.idreserva = idreserva;
    }

    public Hospedes(Integer id, String nome, String sobrenome, Date dataNascimento, String nacionalidade,
                    String telefone, Integer idreserva) {
        super();
        Id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.idreserva = idreserva;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdReserva() {
        return idreserva;
    }

    public void setIdReserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

}