/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Graphics;
import java.awt.Image;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Marcio
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/LogoLabTecnologia.jpg"));

        Image image = icon.getImage();
        jpPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){

                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnEstornoVenda1 = new javax.swing.JButton();
        btnEstornoVenda = new javax.swing.JButton();
        btnOrdem = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JM_cadastro = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(8, 73, 20));
        setResizable(false);

        jpPrincipal.setLayout(new javax.swing.BoxLayout(jpPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cliente_tela.png"))); // NOI18N
        btnCliente.setToolTipText("Cadastrar Cliente");
        btnCliente.setBorderPainted(false);
        btnCliente.setMaximumSize(new java.awt.Dimension(115, 115));
        btnCliente.setMinimumSize(new java.awt.Dimension(115, 115));
        btnCliente.setPreferredSize(new java.awt.Dimension(115, 115));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/venda_Tela.png"))); // NOI18N
        btnVenda.setToolTipText("Vendas");
        btnVenda.setMaximumSize(new java.awt.Dimension(115, 115));
        btnVenda.setMinimumSize(new java.awt.Dimension(115, 115));
        btnVenda.setPreferredSize(new java.awt.Dimension(115, 115));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnEstornoVenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estornoVenda_tela.png"))); // NOI18N
        btnEstornoVenda1.setToolTipText("Estorno");
        btnEstornoVenda1.setMaximumSize(new java.awt.Dimension(115, 115));
        btnEstornoVenda1.setMinimumSize(new java.awt.Dimension(115, 115));
        btnEstornoVenda1.setPreferredSize(new java.awt.Dimension(115, 115));
        btnEstornoVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstornoVenda1ActionPerformed(evt);
            }
        });

        btnEstornoVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estornoOrdem_tela.png"))); // NOI18N
        btnEstornoVenda.setToolTipText("Funcionários");
        btnEstornoVenda.setMaximumSize(new java.awt.Dimension(115, 115));
        btnEstornoVenda.setMinimumSize(new java.awt.Dimension(115, 115));
        btnEstornoVenda.setPreferredSize(new java.awt.Dimension(115, 115));
        btnEstornoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstornoVendaActionPerformed(evt);
            }
        });

        btnOrdem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ordem_tela.png"))); // NOI18N
        btnOrdem.setToolTipText("Ordem de Serviço");
        btnOrdem.setMaximumSize(new java.awt.Dimension(115, 115));
        btnOrdem.setMinimumSize(new java.awt.Dimension(115, 115));
        btnOrdem.setPreferredSize(new java.awt.Dimension(115, 115));
        btnOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdemActionPerformed(evt);
            }
        });

        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admin_tela.png"))); // NOI18N
        btnAdmin.setToolTipText("Ordem de Serviço");
        btnAdmin.setMaximumSize(new java.awt.Dimension(115, 115));
        btnAdmin.setMinimumSize(new java.awt.Dimension(115, 115));
        btnAdmin.setPreferredSize(new java.awt.Dimension(115, 115));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEstornoVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrdem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstornoVenda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstornoVenda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstornoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JM_cadastro.setText("Cadastros");
        jMenuBar1.add(JM_cadastro);

        jMenu2.setText("Relatórios");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Vendas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ordem de Serviço");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(748, 932));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void btnEstornoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornoVendaActionPerformed
        TelaEstornoOrdemServico obj = new TelaEstornoOrdemServico();
        if (jpPrincipal.getAllFrames().length == 0) {
            jpPrincipal.add(obj);
            obj.setVisible(true);
        } else {
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnEstornoVendaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        TelaCliente obj = new TelaCliente();
        if (jpPrincipal.getAllFrames().length == 0) {
            jpPrincipal.add(obj);
            obj.setVisible(true);
        } else {
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdemActionPerformed
        TelaOrdemServico obj = new TelaOrdemServico();
        if (jpPrincipal.getAllFrames().length == 0) {
            jpPrincipal.add(obj);
            obj.setVisible(true);
        } else {
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnOrdemActionPerformed

    private void btnEstornoVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornoVenda1ActionPerformed
        TelaEstornoVendas1 obj = new TelaEstornoVendas1();
        if (jpPrincipal.getAllFrames().length == 0) {
            jpPrincipal.add(obj);
            obj.setVisible(true);
        } else {
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnEstornoVenda1ActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        TelaAdmin adm = new TelaAdmin();
        adm.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        TelaVendas obj = new TelaVendas();
        if (jpPrincipal.getAllFrames().length == 0) {
            jpPrincipal.add(obj);
            obj.setVisible(true);
        } else {
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);

            }
        });
    }

    public void AtivarBtnAdm(boolean res) {
        if (res) {
            btnAdmin.setEnabled(true);
        } else {
            btnAdmin.setEnabled(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JM_cadastro;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEstornoVenda;
    private javax.swing.JButton btnEstornoVenda1;
    private javax.swing.JButton btnOrdem;
    private javax.swing.JButton btnVenda;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
