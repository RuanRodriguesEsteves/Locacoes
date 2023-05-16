package view;

import dao.Conexao;
import dao.Tabelas;
import java.sql.Connection;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/view/img/Principal.png"));
        Image image = icon.getImage();
        jdpPrincipal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiLocatario = new javax.swing.JMenuItem();
        jmiLocacao = new javax.swing.JMenuItem();
        jmiQuadra = new javax.swing.JMenuItem();
        jmiTipoQuadra = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Locações");

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmiLocatario.setText("Locatário");
        jmiLocatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLocatarioActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiLocatario);

        jmiLocacao.setText("Locação");
        jmiLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLocacaoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiLocacao);

        jmiQuadra.setText("Quadra");
        jmiQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiQuadraActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiQuadra);

        jmiTipoQuadra.setText("Tipo Quadra");
        jmiTipoQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoQuadraActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiTipoQuadra);

        jMenuBar1.add(jmCadastro);

        jMenu1.setText("Sistema");

        jMenuItem1.setText("Atualizar Tabelas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiQuadraActionPerformed
        QuadraView quadra = new QuadraView();
        jdpPrincipal.add(quadra);
        quadra.setVisible(true);
    }//GEN-LAST:event_jmiQuadraActionPerformed

    private void jmiTipoQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoQuadraActionPerformed
        TipoQuadraView tipoQuadra = new TipoQuadraView();
        jdpPrincipal.add(tipoQuadra);
        tipoQuadra.setVisible(true);
    }//GEN-LAST:event_jmiTipoQuadraActionPerformed

    private void jmiLocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLocatarioActionPerformed
        LocatarioView locatarioView = new LocatarioView();
        jdpPrincipal.add(locatarioView);
        locatarioView.setVisible(true);
    }//GEN-LAST:event_jmiLocatarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Connection Conexao = new Conexao().getConnection();
            Tabelas tabelas = new Tabelas(Conexao);
            tabelas.atualizarTabelas();
            JOptionPane.showInternalMessageDialog(null, "Tabelas Atualizadas.");
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLocacaoActionPerformed
        LocacaoView locacaoView = new LocacaoView();
        jdpPrincipal.add(locacaoView);
        locacaoView.setVisible(true);
    }//GEN-LAST:event_jmiLocacaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenuItem jmiLocacao;
    private javax.swing.JMenuItem jmiLocatario;
    private javax.swing.JMenuItem jmiQuadra;
    private javax.swing.JMenuItem jmiTipoQuadra;
    // End of variables declaration//GEN-END:variables
}
