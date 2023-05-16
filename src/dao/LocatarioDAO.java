package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Locatario;

public class LocatarioDAO {
    private final Connection connection;
    
    public LocatarioDAO(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Locatario locatario) throws SQLException{
        String sql = "INSERT INTO locatario (nome, cpf, telefone, datanascimento, id_situacaocadastro) VALUES ('" + locatario.getNome() + "', '" + locatario.getCpf() + "', '" + locatario.getTelefone() + "', '" + locatario.getDataNascimento() + "', 1)";
        
        if(!locatario.getNome().equals("")){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();
            JOptionPane.showInternalMessageDialog(null, "Cadastrado Com Sucesso");
        }else{
            JOptionPane.showInternalMessageDialog(null, "Verifique os Campos!");
        }
    }
    
    public void updateDesativar(int id) throws SQLException{
        String sql = "UPDATE locatario SET id_situacaocadastro = 2 WHERE id = " + id;
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        if(statement.executeUpdate() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum registro alterado");
        }else{
            JOptionPane.showMessageDialog(null, "Desativado com Sucesso");
        }
        
        connection.close();
    }
    
    public void updateAtivar(int id) throws SQLException{
        String sql = "UPDATE locatario SET id_situacaocadastro = 1 WHERE id = " + id;
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        if(statement.executeUpdate() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum registro alterado");
        }else{
            JOptionPane.showMessageDialog(null, "Ativado com Sucesso");
        }
        
        connection.close();
    }
}
