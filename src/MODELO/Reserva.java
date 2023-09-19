package MODELO;

import java.sql.Date;

public class Reserva {
    private Integer id;
    private Date dataEntrada;
    private Date dataSaida;
    private String valor;
    private String formaPagamento;

    public Reserva(Integer id, Date dataEntrada, Date dataSaida, String valor, String formaPagamento) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public Reserva( Date dataEntrada, Date dataSaida, String valor, String formaPagamento) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }
}
