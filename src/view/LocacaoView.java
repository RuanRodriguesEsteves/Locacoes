package view;

import dao.Conexao;
import dao.LocacaoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Locacao;

public class LocacaoView extends javax.swing.JInternalFrame {

    public LocacaoView() {
        initComponents();
    }
    
    public void limparCampos(){
        jftfDataInicio.setText("");
        jftfHoraInicio.setText("");
        jftfHoraTermino.setText("");
        jftfId.setText("");
        jftfLocatario.setText("");
        jftfQuadra.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpLocacao = new javax.swing.JDesktopPane();
        jftfId = new javax.swing.JFormattedTextField();
        jlId = new javax.swing.JLabel();
        jlSituacao = new javax.swing.JLabel();
        jcbSituacao = new javax.swing.JComboBox<>();
        jbProcurar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFinalizar = new javax.swing.JButton();
        jbLimparCampos = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jftfLocatario = new javax.swing.JFormattedTextField();
        jlLocatario = new javax.swing.JLabel();
        jftfQuadra = new javax.swing.JFormattedTextField();
        jlQuadra = new javax.swing.JLabel();
        jftfDataInicio = new javax.swing.JFormattedTextField();
        jlData = new javax.swing.JLabel();
        jftfHoraInicio = new javax.swing.JFormattedTextField();
        jlHoraTermino = new javax.swing.JLabel();
        jftfHoraTermino = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcbEquipamento = new javax.swing.JComboBox<>();
        jlEquipamento = new javax.swing.JLabel();
        jlHoraInicio = new javax.swing.JLabel();
        jbLocalizarLocatario = new javax.swing.JButton();
        jbLocalizarQuadra = new javax.swing.JButton();

        setResizable(true);
        setTitle("Cadastro Locação");

        jdpLocacao.setBackground(new java.awt.Color(124, 164, 204));

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

        jlId.setText("ID:");

        jlSituacao.setText("Situação:");

        jcbSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Finalizado", "Cancelado" }));
        jcbSituacao.setSelectedIndex(1);
        jcbSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSituacaoActionPerformed(evt);
            }
        });

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

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFinalizar.setText("Finalizar");
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });

        jbLimparCampos.setText("Limpar Campos");
        jbLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparCamposActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        try {
            jftfLocatario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlLocatario.setText("Locatário:");

        try {
            jftfQuadra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlQuadra.setText("Quadra:");

        try {
            jftfDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlData.setText("Data");

        try {
            jftfHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlHoraTermino.setText("Hora Término");

        try {
            jftfHoraTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Locatário", "Quadra", "Data / Hora Início", "Data / Hora Término", "Equipamento", "Preço Total", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(75);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(115);
        }

        jcbEquipamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Com  Equipamento", "Sem Equipamento" }));
        jcbEquipamento.setSelectedIndex(1);

        jlEquipamento.setText("Equipamento:");

        jlHoraInicio.setText("Hora Início");

        jbLocalizarLocatario.setText("Localizar");
        jbLocalizarLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLocalizarLocatarioActionPerformed(evt);
            }
        });

        jbLocalizarQuadra.setText("Localizar");
        jbLocalizarQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLocalizarQuadraActionPerformed(evt);
            }
        });

        jdpLocacao.setLayer(jftfId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlSituacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jcbSituacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbProcurar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbFinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbLimparCampos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jftfLocatario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlLocatario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jftfQuadra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlQuadra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jftfDataInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jftfHoraInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlHoraTermino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jftfHoraTermino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jcbEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jlHoraInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbLocalizarLocatario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpLocacao.setLayer(jbLocalizarQuadra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpLocacaoLayout = new javax.swing.GroupLayout(jdpLocacao);
        jdpLocacao.setLayout(jdpLocacaoLayout);
        jdpLocacaoLayout.setHorizontalGroup(
            jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlLocatario)
                            .addGroup(jdpLocacaoLayout.createSequentialGroup()
                                .addComponent(jftfLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLocalizarLocatario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdpLocacaoLayout.createSequentialGroup()
                                .addComponent(jftfQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLocalizarQuadra))
                            .addComponent(jlQuadra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHoraInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlHoraTermino)
                            .addComponent(jftfHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbFechar))
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSituacao)
                            .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlEquipamento))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jdpLocacaoLayout.setVerticalGroup(
            jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpLocacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbLimparCampos)
                        .addComponent(jbFechar))
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId)
                            .addComponent(jlLocatario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfLocatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbLocalizarLocatario)
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addComponent(jlQuadra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftfQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLocalizarQuadra)))
                    .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbProcurar)
                        .addComponent(jbCadastrar)
                        .addComponent(jbCancelar)
                        .addComponent(jbFinalizar))
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addComponent(jlHoraTermino)
                        .addGap(29, 29, 29))
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlData)
                            .addComponent(jlHoraInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftfDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addComponent(jlEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdpLocacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jdpLocacaoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlSituacao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpLocacao)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpLocacao)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfIdActionPerformed

    }//GEN-LAST:event_jftfIdActionPerformed

    private void jcbSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSituacaoActionPerformed

    }//GEN-LAST:event_jcbSituacaoActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        String sql = "SELECT l.id, lc.nome, q.nome, l.datahorainicio, l.datahoratermino, l.necessitaequipamento, l.precototal, sl.descricao FROM locacao l INNER JOIN locatario lc ON l.id_locatario = lc.id INNER JOIN quadra q ON l.id_quadra = q.id INNER JOIN situacaolocacao sl ON sl.id = l.id_situacaolocacao;";
        DefaultTableModel dtmLocacao = (DefaultTableModel) jTable1.getModel();
        dtmLocacao.setRowCount(0);
        
        try{
            Connection conexao = new Conexao().getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Object[] locacao = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8)};
                dtmLocacao.addRow(locacao);
            }
            
            if(dtmLocacao.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Registro não encontrado");
            }
            
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbProcurarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        int quadra = Integer.parseInt(jftfQuadra.getText());
        int locatario = Integer.parseInt(jftfLocatario.getText());
        char necessitaEquipamento;
        String data = jftfDataInicio.getText();
        String horaInicio = jftfHoraInicio.getText();
        String horaTermino = jftfHoraTermino.getText();
        String dataHoraInicio = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2) + " " + horaInicio + ":00.000000";
        String dataHoraTermino = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2) + " " + horaTermino + ":00.000000";
        double precoQuadra = 1;
        double precoTotal;
        
        int horaInicioF = Integer.parseInt(horaInicio.substring(0, 2));
        int horaTerminoF = Integer.parseInt(horaTermino.substring(0, 2));
        int tempo = (horaTerminoF - horaInicioF) * 60;
        
        String sql = "SELECT valorminuto FROM quadra WHERE id = " + quadra;
        
        try {
            Connection buscaValorMinuto = new Conexao().getConnection();
            PreparedStatement statement = buscaValorMinuto.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
                
                precoQuadra = Double.parseDouble(resultSet.getString(1));
            }
            
            System.out.println("Chegou aqui");
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(jcbEquipamento.getSelectedIndex() == 1){
            necessitaEquipamento = 't';
            precoTotal = (tempo * precoQuadra) + 50;
        }else if(jcbEquipamento.getSelectedIndex() == 2){
            necessitaEquipamento = 'f';
            precoTotal = (tempo * precoQuadra);
        }else{
            JOptionPane.showMessageDialog(null, "Verifique o campo Equipamento.");
            return;
        }
        
        System.out.println("Data e Hora Início:" + dataHoraInicio);
        System.out.println("Data e Hora Término: " +dataHoraTermino);
        System.out.println("Tempo: " + tempo);
        System.out.println("Index Equipamento: " +jcbEquipamento.getSelectedIndex());
        System.out.println("Preço da Quadra: " + precoQuadra);
        System.out.println("Preço da Total: " + precoTotal);
        
        Locacao locacao = new Locacao(quadra, locatario, necessitaEquipamento, dataHoraInicio, dataHoraTermino, precoTotal);
        
        try {
            Connection conexao = new Conexao().getConnection();
            LocacaoDAO locacaoDao = new LocacaoDAO(conexao);
            locacaoDao.insert(locacao);
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        int id = Integer.parseInt(jftfId.getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            LocacaoDAO locacaoDao = new LocacaoDAO(conexao);
            locacaoDao.updateCacelar(id);
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
        int id = Integer.parseInt(jftfId.getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            LocacaoDAO locacaoDao = new LocacaoDAO(conexao);
            locacaoDao.updateFinalizar(id);
        } catch (SQLException ex) {
            Logger.getLogger(LocacaoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbFinalizarActionPerformed

    private void jbLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparCamposActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbLocalizarLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLocalizarLocatarioActionPerformed
        LocatarioView locatario = new LocatarioView();
        jdpLocacao.add(locatario);
        locatario.setVisible(true);
    }//GEN-LAST:event_jbLocalizarLocatarioActionPerformed

    private void jbLocalizarQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLocalizarQuadraActionPerformed
        QuadraView quadra = new QuadraView();
        jdpLocacao.add(quadra);
        quadra.setVisible(true);
    }//GEN-LAST:event_jbLocalizarQuadraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JButton jbLimparCampos;
    private javax.swing.JButton jbLocalizarLocatario;
    private javax.swing.JButton jbLocalizarQuadra;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JComboBox<String> jcbEquipamento;
    private javax.swing.JComboBox<String> jcbSituacao;
    private javax.swing.JDesktopPane jdpLocacao;
    private javax.swing.JFormattedTextField jftfDataInicio;
    private javax.swing.JFormattedTextField jftfHoraInicio;
    private javax.swing.JFormattedTextField jftfHoraTermino;
    private javax.swing.JFormattedTextField jftfId;
    private javax.swing.JFormattedTextField jftfLocatario;
    private javax.swing.JFormattedTextField jftfQuadra;
    private javax.swing.JLabel jlData;
    private javax.swing.JLabel jlEquipamento;
    private javax.swing.JLabel jlHoraInicio;
    private javax.swing.JLabel jlHoraTermino;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlLocatario;
    private javax.swing.JLabel jlQuadra;
    private javax.swing.JLabel jlSituacao;
    // End of variables declaration//GEN-END:variables
}