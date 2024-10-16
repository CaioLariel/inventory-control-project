/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import utils.UtilTelas;

/**
 *
 * @author Gustavo
 */
public class TelaEstoque extends javax.swing.JFrame {

    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Consulta = new javax.swing.JButton();
        Add1 = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        jVoltar.setText("VOLTAR");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText(" ESTOQUE");

        Consulta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Consulta.setText("CONSULTA");
        Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaActionPerformed(evt);
            }
        });

        Add1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Add1.setText("ADICIONAR");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        Remover.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Remover.setText("ATUALIZAR");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Voltar.setText("VOLTAR");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estoque (1).png"))); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(319, 319, 319))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add1)
                            .addComponent(Consulta)
                            .addComponent(Remover))
                        .addGap(329, 329, 329))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Voltar)
                        .addGap(347, 347, 347))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(Add1)
                .addGap(66, 66, 66)
                .addComponent(Remover)
                .addGap(62, 62, 62)
                .addComponent(Consulta)
                .addGap(70, 70, 70)
                .addComponent(Voltar)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jVoltarActionPerformed

    private void ConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaActionPerformed
        TelaConsultaEstoque tela_consulta = new TelaConsultaEstoque();
        UtilTelas.formataTela(this, tela_consulta);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultaActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        TelaAdicionar tela_adicionar = new TelaAdicionar();
        UtilTelas.formataTela(this, tela_adicionar);

        // TODO add your handling code here:
    }//GEN-LAST:event_Add1ActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        TelaAtualizar tela_atualizar = new TelaAtualizar();
        UtilTelas.formataTela(this, tela_atualizar);
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoverActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        TelaPrincipal tela_principal = new TelaPrincipal();
        UtilTelas.formataTela(this, tela_principal);

// TODO add your handling code here:
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add1;
    private javax.swing.JButton Consulta;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
