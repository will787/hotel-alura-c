package MODELO;

import java.sql.Date;

public class Hospedes {
    private Integer id;
    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    private String nacionalidade;
    private String telefone;
    private Integer idreserva;

    public Hospedes(Integer id, String nome, String sobrenome, Date dataNascimento, String nacionalidade, String telefone, Integer idreserva)
    {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.idreserva = idreserva;
    }



}
