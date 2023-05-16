package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.TipoQuadra;

public class TipoQuadraDAO {
    private final Connection connection;
    
    public TipoQuadraDAO(Connection connection){
        this.connection = connection;
    }
    
    public void insert(TipoQuadra tipoQuadra) throws SQLException{
        
        if(!tipoQuadra.getDescricao().equals("")){
            String sql = "INSERT INTO tipoquadra (descricao, id_situacaocadastro) VALUES ('" + tipoQuadra.getDescricao() + "', 1)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            JOptionPane.showInternalMessageDialog(null, "Cadastrado Com Sucesso");
        }else{
            JOptionPane.showInternalMessageDialog(null, "Verifique o Campo Descrição!");
        }
    }
    
    public void updateAtivar(int id) throws SQLException{
        String sql = "UPDATE tipoquadra SET id_situacaocadastro = 1 WHERE id = " + id;
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
        String sql = "UPDATE tipoquadra SET id_situacaocadastro = 2 WHERE id = " + id;
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
