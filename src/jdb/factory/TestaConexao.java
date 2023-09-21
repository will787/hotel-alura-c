package jdb.factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();

        try (Connection connection1 = connectionFactory.recuperarConexao()) {
            // Verificar se a conexão foi bem-sucedida
            if (!connection.isClosed()) {
                System.out.println("Conexão com o banco de dados bem-sucedida.");

                // Execute uma consulta de teste aqui, se necessário.
                // Por exemplo:
                // PreparedStatement statement = connection.prepareStatement("SELECT 1");
                // ResultSet resultSet = statement.executeQuery();
                // ...
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao conectar ao banco de dados.");
        }
    }

}
