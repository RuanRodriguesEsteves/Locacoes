package view;

import dao.Conexao;
import dao.TipoQuadraDAO;
import model.TipoQuadra;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TipoQuadraView extends javax.swing.JInternalFrame {

    public TipoQuadraView() {
        initComponents();
    }
    
    private void limparCampos(){
        jtfDescricao.setText("");
           jftfId.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpTipoQuadra = new javax.swing.JDesktopPane();
        jlId = new javax.swing.JLabel();
        jftfId = new javax.swing.JFormattedTextField();
        jtfDescricao = new javax.swing.JTextField();
        jlDescricao = new javax.swing.JLabel();
        jbProcurar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbDesativar = new javax.swing.JButton();
        jbAtivar = new javax.swing.JButton();
        jcbSituacaoCadastro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTipoQuadra = new javax.swing.JTable();
        jbFechar = new javax.swing.JButton();
        jbLimparDados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(true);
        setTitle("Cadastro Tipo Quadra");

        jdpTipoQuadra.setBackground(new java.awt.Color(124, 164, 204));

        jlId.setText("ID:");

        try {
            jftfId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfIdActionPerformed(evt);
            }
        });

        jlDescricao.setText("Descrição:");

        jbProcurar.setText("Procurar");
        jbProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcurarActionPerformed(evt);
            }
        });

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbDesativar.setText("Desativar");
        jbDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDesativarActionPerformed(evt);
            }
        });

        jbAtivar.setText("Ativar");
        jbAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtivarActionPerformed(evt);
            }
        });

        jcbSituacaoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativado", "Desativado" }));
        jcbSituacaoCadastro.setSelectedIndex(1);
        jcbSituacaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSituacaoCadastroActionPerformed(evt);
            }
        });

        jtTipoQuadra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTipoQuadra);
        if (jtTipoQuadra.getColumnModel().getColumnCount() > 0) {
            jtTipoQuadra.getColumnModel().getColumn(0).setMinWidth(125);
            jtTipoQuadra.getColumnModel().getColumn(0).setPreferredWidth(75);
            jtTipoQuadra.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbLimparDados.setText("Limpar Campos");
        jbLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparDadosActionPerformed(evt);
            }
        });

        jLabel1.setText("Situação Cadastro:");

        jdpTipoQuadra.setLayer(jlId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jftfId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jtfDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jlDescricao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jbProcurar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jbDesativar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jbAtivar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jcbSituacaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jbFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jbLimparDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTipoQuadra.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpTipoQuadraLayout = new javax.swing.GroupLayout(jdpTipoQuadra);
        jdpTipoQuadra.setLayout(jdpTipoQuadraLayout);
        jdpTipoQuadraLayout.setHorizontalGroup(
            jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpTipoQuadraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jdpTipoQuadraLayout.createSequentialGroup()
                        .addGroup(jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpTipoQuadraLayout.createSequentialGroup()
                                .addComponent(jcbSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbProcurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbDesativar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAtivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                                .addComponent(jbLimparDados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFechar))
                            .addGroup(jdpTipoQuadraLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jdpTipoQuadraLayout.setVerticalGroup(
            jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpTipoQuadraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlDescricao)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(jdpTipoQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProcurar)
                    .addComponent(jbCadastrar)
                    .addComponent(jbDesativar)
                    .addComponent(jbAtivar)
                    .addComponent(jcbSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFechar)
                    .addComponent(jbLimparDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTipoQuadra)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpTipoQuadra)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfIdActionPerformed
        
    }//GEN-LAST:event_jftfIdActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jcbSituacaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSituacaoCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSituacaoCadastroActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        String sql = "";
        String sql2 = "";
        int situacaoCadastro = jcbSituacaoCadastro.getSelectedIndex();
        String id = jftfId.getText();
        String descricao = jtfDescricao.getText();
        
        DefaultTableModel dtmTipoQuadra = (DefaultTableModel) jtTipoQuadra.getModel();
        dtmTipoQuadra.setRowCount(0);
        System.out.println(dtmTipoQuadra.getRowCount());
        
        if(id.equals("      ") && descricao.equals("")){
            sql2 = "";
        }else if(!id.equals("      ") && !descricao.equals("")){
            sql2 = " AND tq.id = " + id + " AND tq.descricao LIKE '%" + descricao + "%'";
        }else if(!id.equals("      ") && descricao.equals("")){
            sql2 = " AND tq.id = " + id;
        }else if(id.equals("      ") && !descricao.equals("")){
            sql2 = " AND tq.descricao LIKE '%" + descricao + "%'";
        }
        
        if(situacaoCadastro == 1){
            sql = "SELECT tq.id, tq.descricao, sc.descricao FROM tipoquadra tq INNER JOIN situacaocadastro sc ON sc.id = tq.id_situacaocadastro WHERE id_situacaoCadastro = 1" + sql2 + " ORDER BY tq.id";
        }else if(situacaoCadastro == 2){
            sql = "SELECT tq.id, tq.descricao, sc.descricao FROM tipoquadra tq INNER JOIN situacaocadastro sc ON sc.id = tq.id_situacaocadastro WHERE id_situacaoCadastro = 2" + sql2 + " ORDER BY tq.id";
        }else{
            sql = "SELECT tq.id, tq.descricao, sc.descricao FROM tipoquadra tq INNER JOIN situacaocadastro sc ON sc.id = tq.id_situacaocadastro WHERE id_situacaoCadastro in (1, 2)" + sql2 + " ORDER BY tq.id";
        }
        
        try {
            Connection conexao = new Conexao().getConnection();
            System.out.println("Conectado");
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Object[] tipoQuadra = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)};
                dtmTipoQuadra.addRow(tipoQuadra);
            }
            
            System.out.println(dtmTipoQuadra.getRowCount());
            
            if(dtmTipoQuadra.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Registro não encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoQuadra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbProcurarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        String descricao = jtfDescricao.getText();
        TipoQuadra tipoQuadra = new TipoQuadra(descricao);
        
        try {
            Connection conexao = new Conexao().getConnection();
            TipoQuadraDAO tipoQuadraDao = new TipoQuadraDAO(conexao);
            tipoQuadraDao.insert(tipoQuadra);
        } catch (SQLException ex) {
            Logger.getLogger(TipoQuadra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesativarActionPerformed
        int id = Integer.parseInt(jftfId.getText());

        try {
            Connection conexao = new Conexao().getConnection();
            TipoQuadraDAO tipoQuadraDao = new TipoQuadraDAO(conexao);
            tipoQuadraDao.updateDesativar(id);
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TipoQuadraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbDesativarActionPerformed

    private void jbAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtivarActionPerformed
        int id = Integer.parseInt(jftfId.getText());

        try {
            Connection conexao = new Conexao().getConnection();
            TipoQuadraDAO tipoQuadraDao = new TipoQuadraDAO(conexao);
            tipoQuadraDao.updateAtivar(id);
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(TipoQuadraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAtivarActionPerformed

    private void jbLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDadosActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparDadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtivar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbDesativar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimparDados;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JComboBox<String> jcbSituacaoCadastro;
    private javax.swing.JDesktopPane jdpTipoQuadra;
    private javax.swing.JFormattedTextField jftfId;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlId;
    private javax.swing.JTable jtTipoQuadra;
    private javax.swing.JTextField jtfDescricao;
    // End of variables declaration//GEN-END:variables
}
