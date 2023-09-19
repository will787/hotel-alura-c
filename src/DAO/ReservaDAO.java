package DAO;

import MODELO.Reserva;

import java.sql.*;

public class ReservaDAO {

    private Connection connection;

    public ReservaDAO(Connection connection) {this.connection = connection;}

    public void salvar(Reserva reserva){
        try {
            String sql = "INSERT INTO reservas (data_entrada, data_saida, valor, formaPagamento), VALUES (?, ?, ?, ?)";

                try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
                    pstm.setDate(1, reserva.getDataEntrada());
                    pstm.setDate(2, reserva.getDataSaida());
                    pstm.setString(3, reserva.getValor());
                    pstm.setString(4, reserva.getFormaPagamento());

                    pstm.execute();

                    try(ResultSet rst = pstm.getGeneratedKeys()){
                        while (rst.next()){
                            reserva.setId(rst.getInt(1));
                        }
                    }
                }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
