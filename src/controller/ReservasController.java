package controller;

import DAO.ReservaDAO;
import MODELO.Reserva;
import jdb.factory.ConnectionFactory;

import java.sql.Connection;
import java.util.List;

public class ReservasController {

    private ReservaDAO reservaDAO;

    public ReservasController(){
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.reservaDAO = new ReservaDAO(connection);
    }

    public void salvar(Reserva reserva){ this.reservaDAO.salvar(reserva); }

    //public List<Reserva> buscar(){ return.this.reservaDAO.buscar;}
}

