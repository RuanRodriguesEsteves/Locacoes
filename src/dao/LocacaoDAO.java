package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Locacao;

public class LocacaoDAO {
    private final Connection connection;
    
    public LocacaoDAO(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Locacao locacao) throws SQLException{
        String sql = "INSERT INTO locacao (necessitaequipamento, datahorainicio, datahoratermino, precototal, id_locatario, id_quadra, id_situacaolocacao) VALUES "
                + "('" + locacao.getNecessitaEquipamento() + "', '" + locacao.getDataHoraInicio() + "', '" + locacao.getDataHoraTermino() + "', '" + locacao.getPrecoTotal() + "', '" + locacao.getLocatario() + "', '" + locacao.getQuadra() + "', '3');";
        System.out.println(sql);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
        JOptionPane.showInternalMessageDialog(null, "Cadastrado Com Sucesso");
    }
    
    public void updateCacelar(int id) throws SQLException{
        String sql = "UPDATE locacao SET id_situacaolocacao = 2 WHERE id = " + id;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
        JOptionPane.showInternalMessageDialog(null, "Cancelado Com Sucesso");
    }
    
    public void updateFinalizar(int id) throws SQLException{
        String sql = "UPDATE locacao SET id_situacaolocacao = 1 WHERE id = " + id;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
        JOptionPane.showInternalMessageDialog(null, "Finalizado Com Sucesso");
    }
}
