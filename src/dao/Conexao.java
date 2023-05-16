package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String url = "jdbc:postgresql://localhost:5432/locacoes";
    String user = "postgres";
    String password = "123456";
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
}