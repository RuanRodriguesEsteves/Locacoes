package view;

import dao.Conexao;
import dao.QuadraDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Quadra;

public class QuadraView extends javax.swing.JInternalFrame {

    public QuadraView() {
        initComponents();
    }
    
    private void limparCampos(){
        jftfId.setText("");
        jtfNome.setText("");
        jftfTipoQuadra.setText("");
        jtfValorMinuto.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jdpQuadra = new javax.swing.JDesktopPane();
        jlId = new javax.swing.JLabel();
        jftfId = new javax.swing.JFormattedTextField();
        jtfNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlTipoQuadra = new javax.swing.JLabel();
        jcbSituacaoCadastro = new javax.swing.JComboBox<>();
        jlSituacaoCadastro = new javax.swing.JLabel();
        jbProcurar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbDesativar = new javax.swing.JButton();
        jbAtivar = new javax.swing.JButton();
        jbLimparDados = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTipoQuadra = new javax.swing.JTable();
        jlValorMinuto = new javax.swing.JLabel();
        jtfValorMinuto = new javax.swing.JTextField();
        jftfTipoQuadra = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setResizable(true);
        setTitle("Cadastro Quadra");

        jdpQuadra.setBackground(new java.awt.Color(124, 164, 204));

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

        jlNome.setText("Nome:");

        jlTipoQuadra.setText("Tipo Quadra:");

        jcbSituacaoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativado", "Desativado" }));
        jcbSituacaoCadastro.setSelectedIndex(1);
        jcbSituacaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSituacaoCadastroActionPerformed(evt);
            }
        });

        jlSituacaoCadastro.setText("Situação Cadastro:");

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

        jbLimparDados.setText("Limpar Campos");
        jbLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparDadosActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jtTipoQuadra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor Minuto", "Tipo Quadra", "Situação Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTipoQuadra);
        if (jtTipoQuadra.getColumnModel().getColumnCount() > 0) {
            jtTipoQuadra.getColumnModel().getColumn(0).setMinWidth(75);
            jtTipoQuadra.getColumnModel().getColumn(0).setPreferredWidth(75);
            jtTipoQuadra.getColumnModel().getColumn(0).setMaxWidth(125);
            jtTipoQuadra.getColumnModel().getColumn(2).setMinWidth(100);
            jtTipoQuadra.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtTipoQuadra.getColumnModel().getColumn(2).setMaxWidth(125);
        }

        jlValorMinuto.setText("Valor Minuto:");

        try {
            jftfTipoQuadra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Localizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jdpQuadra.setLayer(jlId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jftfId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jlTipoQuadra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jcbSituacaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jlSituacaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jbProcurar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jbDesativar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jbAtivar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jbLimparDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jbFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jlValorMinuto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jtfValorMinuto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jftfTipoQuadra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpQuadra.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpQuadraLayout = new javax.swing.GroupLayout(jdpQuadra);
        jdpQuadra.setLayout(jdpQuadraLayout);
        jdpQuadraLayout.setHorizontalGroup(
            jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpQuadraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jdpQuadraLayout.createSequentialGroup()
                        .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlId)
                            .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTipoQuadra)
                            .addGroup(jdpQuadraLayout.createSequentialGroup()
                                .addComponent(jftfTipoQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValorMinuto)
                            .addGroup(jdpQuadraLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtfValorMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpQuadraLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jcbSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbProcurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbDesativar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAtivar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jbLimparDados))
                            .addComponent(jlSituacaoCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFechar)))
                .addContainerGap())
        );
        jdpQuadraLayout.setVerticalGroup(
            jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpQuadraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlNome)
                    .addComponent(jlTipoQuadra)
                    .addComponent(jlSituacaoCadastro)
                    .addComponent(jlValorMinuto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpQuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbProcurar)
                    .addComponent(jbCadastrar)
                    .addComponent(jbDesativar)
                    .addComponent(jbAtivar)
                    .addComponent(jbFechar)
                    .addComponent(jbLimparDados)
                    .addComponent(jtfValorMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftfTipoQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpQuadra)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpQuadra)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfIdActionPerformed

    }//GEN-LAST:event_jftfIdActionPerformed

    private void jcbSituacaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSituacaoCadastroActionPerformed

    }//GEN-LAST:event_jcbSituacaoCadastroActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        String id = jftfId.getText();
        String tipoQuadra = jftfTipoQuadra.getText();
        int situacaoCadastro = jcbSituacaoCadastro.getSelectedIndex();
        String nome = jtfNome.getText();
        
        String sql = "";
        String sql2 = "";
        
        if(!id.equals("      ") && !tipoQuadra.equals("    ") && !nome.equals("")){
            sql2 = " AND q.id = " + id + " AND q.nome LIKE '%" + nome + "%' AND q.id_tipoquadra = " + tipoQuadra;
        }else if(id.equals("      ") && !tipoQuadra.equals("    ") && !nome.equals("")){
            sql2 = " AND q.nome LIKE '%" + nome + "%' AND q.id_tipoquadra = " + tipoQuadra;
        }else if(!id.equals("      ") && tipoQuadra.equals("    ") && !nome.equals("")){
            sql2 = " AND q.id = " + id + " AND q.nome LIKE '%" + nome + "%'";
        }else if(!id.equals("      ") && !tipoQuadra.equals("    ") && nome.equals("")){
            sql2 = " AND q.id = " + id + "%' AND q.id_tipoquadra = " + tipoQuadra;
        }else if(!id.equals("      ") && tipoQuadra.equals("    ") && nome.equals("")){
            sql2 = " AND q.id = " + id;
        }else if(id.equals("      ") && !tipoQuadra.equals("    ") && nome.equals("")){
            sql2 = " AND q.id_tipoquadra = " + tipoQuadra;
        }if(id.equals("      ") && tipoQuadra.equals("    ") && !nome.equals("")){
            sql2 = " AND q.nome LIKE '%" + nome + "%'";
        }
        
        if(situacaoCadastro == 1){
            sql = "SELECT q.id, q.nome, q.valorminuto, tq.descricao, sc.descricao FROM quadra q INNER JOIN tipoquadra tq ON tq.id = q.id_tipoquadra INNER JOIN situacaocadastro sc ON sc.id = q.id_situacaocadastro WHERE q.id_situacaocadastro = 1" + sql2 + " ORDER BY q.id";
        }else if(situacaoCadastro == 2){
            sql = "SELECT q.id, q.nome, q.valorminuto, tq.descricao, sc.descricao FROM quadra q INNER JOIN tipoquadra tq ON tq.id = q.id_tipoquadra INNER JOIN situacaocadastro sc ON sc.id = q.id_situacaocadastro WHERE q.id_situacaocadastro = 2" + sql2 + " ORDER BY q.id";
        }else{
            sql = "SELECT q.id, q.nome, q.valorminuto, tq.descricao, sc.descricao FROM quadra q INNER JOIN tipoquadra tq ON tq.id = q.id_tipoquadra INNER JOIN situacaocadastro sc ON sc.id = q.id_situacaocadastro WHERE q.id_situacaocadastro in (1,2)" + sql2 + " ORDER BY q.id";
        }
        
        DefaultTableModel dtmQuadra = (DefaultTableModel) jtTipoQuadra.getModel();
        dtmQuadra.setRowCount(0);
        
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Object[] quadra = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5)};
                dtmQuadra.addRow(quadra);
            }
            
            if(dtmQuadra.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Registro não encontrado");
            }
            
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(QuadraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbProcurarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        int tipoQuadra = Integer.parseInt(jftfTipoQuadra.getText());
        String nome = jtfNome.getText();
        double valorMinuto = Double.parseDouble(jtfValorMinuto.getText());
        
        System.out.println(tipoQuadra);
        
        Quadra quadra = new Quadra(tipoQuadra, nome, valorMinuto);
        
        System.out.println(quadra.getTipoDaQuadra());
        
        try {
            Connection conexao = new Conexao().getConnection();
            QuadraDAO quadraDao = new QuadraDAO(conexao);
            quadraDao.insert(quadra);
        } catch (SQLException ex) {
            Logger.getLogger(QuadraView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesativarActionPerformed
        int id = Integer.parseInt(jftfId.getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            QuadraDAO quadraDao = new QuadraDAO(conexao);
            quadraDao.updateDesativar(id);
        } catch (SQLException ex) {
            Logger.getLogger(QuadraView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbDesativarActionPerformed

    private void jbAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtivarActionPerformed
        int id = Integer.parseInt(jftfId.getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            QuadraDAO quadraDao = new QuadraDAO(conexao);
            quadraDao.updateAtivar(id);
        } catch (SQLException ex) {
            Logger.getLogger(QuadraView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbAtivarActionPerformed

    private void jbLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDadosActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparDadosActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TipoQuadraView tipoQuadra = new TipoQuadraView();
        jdpQuadra.add(tipoQuadra);
        tipoQuadra.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbAtivar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbDesativar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimparDados;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JComboBox<String> jcbSituacaoCadastro;
    private javax.swing.JDesktopPane jdpQuadra;
    private javax.swing.JFormattedTextField jftfId;
    private javax.swing.JFormattedTextField jftfTipoQuadra;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSituacaoCadastro;
    private javax.swing.JLabel jlTipoQuadra;
    private javax.swing.JLabel jlValorMinuto;
    private javax.swing.JTable jtTipoQuadra;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfValorMinuto;
    // End of variables declaration//GEN-END:variables
}
