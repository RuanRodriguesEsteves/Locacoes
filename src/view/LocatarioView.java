package view;

import dao.Conexao;
import dao.LocatarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Locatario;

public class LocatarioView extends javax.swing.JInternalFrame {

    public LocatarioView() {
        initComponents();
    }
    
    private void limparCampos(){
        jftfId.setText("");
        jtfNome.setText("");
        jftfCpf.setText("");
        jftfTelefone.setText("");
        jftfDataNascimento.setText("");
    }

    private boolean verificarMaioridade(String dataNascimentoStr){
        Date dataAtual = new Date();
        Date dataNascimento;
        System.out.println(dataAtual);
        boolean maioridade;
        
        String anoAtual;
        int anoAtual2;
        String mesAtual;
        int mesAtual2;
        String diaAtual;
        int diaAtual2;
        
        String anoNascimento;
        int anoNascimento2;
        String mesNascimento;
        int mesNascimento2;
        String diaNascimento;
        int diaNascimento2;
        
        try {
            dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimentoStr);
            System.out.println(dataNascimento);
            
            anoAtual = new SimpleDateFormat("yyyy").format(dataAtual);
            anoAtual2 = Integer.parseInt(anoAtual);
            
            mesAtual = new SimpleDateFormat("MM").format(dataAtual);
            mesAtual2 = Integer.parseInt(mesAtual);
            
            diaAtual = new SimpleDateFormat("dd").format(dataAtual);
            diaAtual2 = Integer.parseInt(diaAtual);
            System.out.println(diaAtual2 + "/" + mesAtual2 + "/" + anoAtual2);
            
            /*---------------------------------------------*/
            
            anoNascimento = new SimpleDateFormat("yyyy").format(dataNascimento);
            anoNascimento2 = Integer.parseInt(anoNascimento);
            
            mesNascimento = new SimpleDateFormat("MM").format(dataNascimento);
            mesNascimento2 = Integer.parseInt(mesNascimento);
            
            diaNascimento = new SimpleDateFormat("dd").format(dataNascimento);
            diaNascimento2 = Integer.parseInt(diaNascimento);
            System.out.println(diaNascimento2 + "/" + mesNascimento2 + "/" + anoNascimento2);
            
            /*---------------------------------------------*/
            
            if(anoAtual2 - anoNascimento2 > 18){
                System.out.println("Maior de idade");
                maioridade = true;
                return maioridade;
            }else if(anoAtual2 - anoNascimento2 == 18){
                System.out.println("Igual a 18");
                if(mesAtual2 > mesNascimento2){
                    System.out.println("Maior de idade");
                    maioridade = true;
                    return maioridade;
                }else if(mesAtual2 == mesNascimento2){
                    if(diaAtual2 >= diaNascimento2){
                        System.out.println("Maior de idade");
                        maioridade = true;
                        return maioridade;
                    }else{
                        System.out.println("Menor de idade");
                        maioridade = false;
                        return maioridade;
                    }
                }
            }else{
                System.out.println("Menor de idade");
                maioridade = false;
                return maioridade;
            }
        } catch (ParseException ex) {
            Logger.getLogger(LocatarioView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Verifique o campo Data Nascimento");
            return false;
        }
        
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jftfId = new javax.swing.JFormattedTextField();
        jlId = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jftfCpf = new javax.swing.JFormattedTextField();
        jlCpf = new javax.swing.JLabel();
        jftfTelefone = new javax.swing.JFormattedTextField();
        jlTelefone = new javax.swing.JLabel();
        jftfDataNascimento = new javax.swing.JFormattedTextField();
        jlDataNascimento = new javax.swing.JLabel();
        jlSituacaoCadastro = new javax.swing.JLabel();
        jcbSituacaoCadastro = new javax.swing.JComboBox<>();
        jbProcurar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbDesativar = new javax.swing.JButton();
        jbAtivar = new javax.swing.JButton();
        jbLimparDados = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLocatario = new javax.swing.JTable();

        setResizable(true);
        setTitle("Cadastro Locatário");

        jDesktopPane1.setBackground(new java.awt.Color(124, 164, 204));

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

        jlNome.setText("Nome:");

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlCpf.setText("CPF:");

        try {
            jftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlTelefone.setText("Telefone:");

        try {
            jftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlDataNascimento.setText("Data Nascimento:");

        jlSituacaoCadastro.setText("Situação Cadastro:");

        jcbSituacaoCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativado", "Desativado" }));
        jcbSituacaoCadastro.setSelectedIndex(1);
        jcbSituacaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSituacaoCadastroActionPerformed(evt);
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

        jtLocatario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Ano Nascimento", "Situação Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLocatario);
        if (jtLocatario.getColumnModel().getColumnCount() > 0) {
            jtLocatario.getColumnModel().getColumn(0).setPreferredWidth(75);
            jtLocatario.getColumnModel().getColumn(0).setMaxWidth(125);
            jtLocatario.getColumnModel().getColumn(2).setMinWidth(150);
            jtLocatario.getColumnModel().getColumn(2).setPreferredWidth(150);
            jtLocatario.getColumnModel().getColumn(2).setMaxWidth(175);
            jtLocatario.getColumnModel().getColumn(3).setMinWidth(150);
            jtLocatario.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtLocatario.getColumnModel().getColumn(3).setMaxWidth(175);
            jtLocatario.getColumnModel().getColumn(4).setMinWidth(100);
            jtLocatario.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtLocatario.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jDesktopPane1.setLayer(jftfId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jftfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jftfTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jftfDataNascimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlDataNascimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlSituacaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbSituacaoCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbProcurar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbDesativar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbAtivar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbLimparDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbFechar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlId)
                            .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDataNascimento)
                            .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jbLimparDados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbFechar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jlSituacaoCadastro)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jlSituacaoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbFechar)
                                .addComponent(jbLimparDados))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbSituacaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbProcurar)
                                .addComponent(jbCadastrar)
                                .addComponent(jbDesativar)
                                .addComponent(jbAtivar))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlId)
                            .addComponent(jlNome)
                            .addComponent(jlCpf)
                            .addComponent(jlTelefone)
                            .addComponent(jlDataNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jftfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfIdActionPerformed

    }//GEN-LAST:event_jftfIdActionPerformed

    private void jcbSituacaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSituacaoCadastroActionPerformed

    }//GEN-LAST:event_jcbSituacaoCadastroActionPerformed

    private void jbProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcurarActionPerformed
        int situacaoCadastro = jcbSituacaoCadastro.getSelectedIndex();
        String id =jftfId.getText();
        String cpf = jftfCpf.getText();
        String telefone = jftfTelefone.getText();
        String nome = jtfNome.getText();
        
        String sql = "";
        String sql2 = "";
        
        DefaultTableModel dtmLocatario = (DefaultTableModel) jtLocatario.getModel();
        dtmLocatario.setRowCount(0);
        
        if(!id.equals("      ") && !cpf.equals("           ") && !telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND l.id = " + id + " AND l.cpf = '" + cpf + "' AND telefone = '" + telefone + "' AND nome LIKE '%" + nome + "%'";
        }else if(id.equals("      ") && !cpf.equals("           ") && !telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND l.cpf = '" + cpf + "' AND telefone = '" + telefone + "' AND nome LIKE '%" + nome + "%'";
        }else if(!id.equals("      ") && cpf.equals("           ") && !telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND l.id = " + id + " AND telefone = '" + telefone + "' AND nome LIKE '%" + nome + "%'";
        }else if(!id.equals("      ") && !cpf.equals("           ") && telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND l.id = " + id + " AND l.cpf = '" + cpf + "' AND nome LIKE '%" + nome + "%'";
        }else if(!id.equals("      ") && !cpf.equals("           ") && !telefone.equals("           ") && nome.equals("")){
            sql2 = " AND l.id = " + id + " AND l.cpf = '" + cpf + "' AND telefone = '" + telefone + "'";
        }else if(!id.equals("      ") && !cpf.equals("           ") && telefone.equals("           ") && nome.equals("")){
            sql2 = " AND l.id = " + id + " AND l.cpf = '" + cpf + "'";
        }else if(!id.equals("      ") && cpf.equals("           ") && !telefone.equals("           ") && nome.equals("")){
            sql2 = " AND l.id = " + id + " AND telefone = '" + telefone + "'";
        }else if(!id.equals("      ") && cpf.equals("           ") && telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND l.id = " + id + " AND nome LIKE '%" + nome + "%'";
        }else if(id.equals("      ") && !cpf.equals("           ") && !telefone.equals("           ") && nome.equals("")){
            sql2 = " AND l.cpf = '" + cpf + "' AND telefone = '" + telefone + "'";
        }else if(id.equals("      ") && !cpf.equals("           ") && telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND l.cpf = '" + cpf + "' AND nome LIKE '%" + nome + "%'";
        }else if(id.equals("      ") && cpf.equals("           ") && !telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND telefone = '" + telefone + "' AND nome LIKE '%" + nome + "%'";
        }else if(!id.equals("      ") && cpf.equals("           ") && telefone.equals("           ") && nome.equals("")){
            sql2 = " AND l.id = " + id;
        }else if(id.equals("      ") && !cpf.equals("           ") && telefone.equals("           ") && nome.equals("")){
            sql2 = " AND l.cpf = '" + cpf + "'";
        }else if(id.equals("      ") && cpf.equals("           ") && !telefone.equals("           ") && nome.equals("")){
            sql2 = " AND telefone = '" + telefone + "'";
        }else if(id.equals("      ") && cpf.equals("           ") &&telefone.equals("           ") && !nome.equals("")){
            sql2 = " AND nome LIKE '%" + nome + "%'";
        }
        
        if(situacaoCadastro == 1){
            sql = "SELECT l.id, l.nome, "
                    + "CONCAT(SUBSTRING(cpf, 1, 3), '.', SUBSTRING(cpf, 4, 3), '.', SUBSTRING(cpf, 7, 3), '-', SUBSTRING(cpf, 10, 3)) AS cpf, CONCAT('(', SUBSTRING(l.telefone, 1, 2), ') ', SUBSTRING(l.telefone, 3, 1), ' ', SUBSTRING(l.telefone, 4, 4), ' - ', "
                    + "SUBSTRING(l.telefone, 8, 4)) AS telefone, TO_CHAR(l.datanascimento, 'DD/MM/YYYY'), sc.descricao FROM locatario l INNER JOIN situacaocadastro sc ON sc.id = l.id_situacaocadastro "
                    + "WHERE l.id_situacaocadastro = 1" + sql2 + " ORDER BY l.id";
        }else if(situacaoCadastro == 2){
            sql = "SELECT l.id, l.nome, "
                    + "CONCAT(SUBSTRING(cpf, 1, 3), '.', SUBSTRING(cpf, 4, 3), '.', SUBSTRING(cpf, 7, 3), '-', SUBSTRING(cpf, 10, 3)) AS cpf, CONCAT('(', SUBSTRING(l.telefone, 1, 2), ') ', SUBSTRING(l.telefone, 3, 1), ' ', SUBSTRING(l.telefone, 4, 4), ' - ', "
                    + "SUBSTRING(l.telefone, 8, 4)) AS telefone, TO_CHAR(l.datanascimento, 'DD/MM/YYYY'), sc.descricao FROM locatario l INNER JOIN situacaocadastro sc ON sc.id = l.id_situacaocadastro "
                    + "WHERE l.id_situacaocadastro = 2" + sql2 + " ORDER BY l.id";
        }else{
            sql = "SELECT l.id, l.nome, "
                    + "CONCAT(SUBSTRING(cpf, 1, 3), '.', SUBSTRING(cpf, 4, 3), '.', SUBSTRING(cpf, 7, 3), '-', SUBSTRING(cpf, 10, 3)) AS cpf, CONCAT('(', SUBSTRING(l.telefone, 1, 2), ') ', SUBSTRING(l.telefone, 3, 1), ' ', SUBSTRING(l.telefone, 4, 4), ' - ', "
                    + "SUBSTRING(l.telefone, 8, 4)) AS telefone, TO_CHAR(l.datanascimento, 'DD/MM/YYYY'), sc.descricao FROM locatario l INNER JOIN situacaocadastro sc ON sc.id = l.id_situacaocadastro "
                    + "WHERE l.id_situacaocadastro in (1, 2)" + sql2 + " ORDER BY l.id";
        }
                
        try {
            Connection conexao = new Conexao().getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Object[] locatario = {resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)};
                dtmLocatario.addRow(locatario);
            }
            
            if(dtmLocatario.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Registro não encontrado");
            }
            
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(LocatarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbProcurarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        String nome = jtfNome.getText();
        long cpf =  Long.parseLong(jftfCpf.getText());
        long telefone = Long.parseLong(jftfTelefone.getText());
        String dataNascimento = jftfDataNascimento.getText();
        
        Locatario locatario = new Locatario(dataNascimento, nome, cpf, telefone);
        boolean maioridade = verificarMaioridade(dataNascimento);
        
        System.out.println(maioridade);
        
        if(maioridade == true){
            try {
                Connection conexao = new Conexao().getConnection();
                LocatarioDAO locatarioDao = new LocatarioDAO(conexao);
                locatarioDao.insert(locatario);
            } catch (SQLException ex) {
                Logger.getLogger(LocatarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Locatário Menor de Idade! Impossível cadastrar.");
        }
        
        limparCampos();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDesativarActionPerformed
        int id = Integer.parseInt(jftfId.getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            LocatarioDAO locatarioDao = new LocatarioDAO(conexao);
            locatarioDao.updateDesativar(id);
        } catch (SQLException ex) {
            Logger.getLogger(LocatarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbDesativarActionPerformed

    private void jbAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtivarActionPerformed
        int id = Integer.parseInt(jftfId.getText());
        
        try {
            Connection conexao = new Conexao().getConnection();
            LocatarioDAO locatarioDao = new LocatarioDAO(conexao);
            locatarioDao.updateAtivar(id);
        } catch (SQLException ex) {
            Logger.getLogger(LocatarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparCampos();
    }//GEN-LAST:event_jbAtivarActionPerformed

    private void jbLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDadosActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparDadosActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtivar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbDesativar;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbLimparDados;
    private javax.swing.JButton jbProcurar;
    private javax.swing.JComboBox<String> jcbSituacaoCadastro;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JFormattedTextField jftfDataNascimento;
    private javax.swing.JFormattedTextField jftfId;
    private javax.swing.JFormattedTextField jftfTelefone;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSituacaoCadastro;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTable jtLocatario;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
