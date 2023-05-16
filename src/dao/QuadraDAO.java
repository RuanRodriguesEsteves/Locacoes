package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Quadra;

public class QuadraDAO {
    private final Connection connection;
    
    public QuadraDAO(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Quadra quadra) throws SQLException{
        
        if(!quadra.getNome().equals("")){
            String sql = "INSERT INTO quadra (nome, valorminuto, id_tipoquadra, id_situacaocadastro) VALUES ('" + quadra.getNome() + "', '" + quadra.getValorMinuto() + "', '" + quadra.getTipoDaQuadra() + "', 1)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            JOptionPane.showInternalMessageDialog(null, "Cadastrado Com Sucesso");
        }else{
            JOptionPane.showInternalMessageDialog(null, "Verifique os Campos!");
        }
    }
    
    public void updateAtivar(int id) throws SQLException{
        String sql = "UPDATE quadra SET id_situacaocadastro = 1 WHERE id = " + id;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        
        if(statement.executeUpdate() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum registro alterado");
        }else{
            JOptionPane.showMessageDialog(null, "Ativado com Sucesso");
        }
        
        connection.close();
    }
    
    public void updateDesativar(int id) throws SQLException{
        String sql = "UPDATE quadra SET id_situacaocadastro = 2 WHERE id = " + id;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        
        if(statement.executeUpdate() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum registro alterado");
        }else{
            JOptionPane.showMessageDialog(null, "Desativado com Sucesso");
        }
        
        connection.close();
    }
}
