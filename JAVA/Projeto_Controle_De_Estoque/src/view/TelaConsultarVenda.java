/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.VendaController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Venda;
import utils.UtilTelas;
import view.TelaVenda;

public class TelaConsultarVenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsultarVenda
     */
    public TelaConsultarVenda() {
        initComponents();
    }
    
    VendaController vr = new VendaController();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jLabelProdutoVendido = new javax.swing.JLabel();
        jLabelProdutoVendido1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButtonConsultarItem = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonConsultarTodos = new javax.swing.JButton();
        jButtonConsultarCpf = new javax.swing.JButton();
        jTextConsultarItemPorId = new javax.swing.JTextField();
        jTextConsultarItemCpf = new javax.swing.JTextField();
        labelTodos = new java.awt.Label();
        labelID1 = new java.awt.Label();
        labelCpf1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Consultar Venda");
        Titulo.setToolTipText("");

        jTableVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id da venda", "CPF", "Id do produto", "Quantidade", "Total da venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableVendas.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTableVendas);

        jLabelProdutoVendido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelProdutoVendido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdutoVendido.setText("Selecionar produto no estoque: ");

        jLabelProdutoVendido1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelProdutoVendido1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdutoVendido1.setText("Selecionar produto no estoque: ");

        jTextField3.setToolTipText("Digite nesse campo o nome do cliente que está realizando a compra: ");

        jButtonConsultarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita (1).png"))); // NOI18N
        jButtonConsultarItem.setToolTipText("");
        jButtonConsultarItem.setBorderPainted(false);
        jButtonConsultarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarItemActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonConsultarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita (1).png"))); // NOI18N
        jButtonConsultarTodos.setToolTipText("");
        jButtonConsultarTodos.setBorderPainted(false);
        jButtonConsultarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTodosActionPerformed(evt);
            }
        });

        jButtonConsultarCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta-direita (1).png"))); // NOI18N
        jButtonConsultarCpf.setToolTipText("");
        jButtonConsultarCpf.setBorderPainted(false);
        jButtonConsultarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCpfActionPerformed(evt);
            }
        });

        jTextConsultarItemPorId.setToolTipText("");
        jTextConsultarItemPorId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextConsultarItemPorId.setName(""); // NOI18N
        jTextConsultarItemPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextConsultarItemPorIdActionPerformed(evt);
            }
        });

        jTextConsultarItemCpf.setToolTipText("");
        jTextConsultarItemCpf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextConsultarItemCpf.setName(""); // NOI18N
        jTextConsultarItemCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextConsultarItemCpfActionPerformed(evt);
            }
        });

        labelTodos.setText("Todos os Itens:");

        labelID1.setText("ID da Venda:");

        labelCpf1.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelID1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextConsultarItemPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonConsultarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextConsultarItemCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonConsultarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(labelTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonConsultarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(138, 139, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(jLabelProdutoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(jLabelProdutoVendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(255, 255, 255)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonConsultarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jButtonConsultarCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextConsultarItemCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextConsultarItemPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConsultarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVoltar)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(277, 277, 277)
                    .addComponent(jLabelProdutoVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabelProdutoVendido1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(289, 289, 289)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarItemActionPerformed
       String idString = jTextConsultarItemPorId.getText();
       int id = Integer.parseInt(idString);
       DefaultTableModel tableModel = (DefaultTableModel) jTableVendas.getModel();
       tableModel.setRowCount(0);
       try{
           
           ArrayList<Venda> vendas = vr.consultarVendaPorId(id);
           
           vendas.forEach((Venda venda) -> {
               tableModel.addRow(new Object[] {venda.getId(),venda.getCpf(),venda.getId_produto(),venda.getQuantidade(),venda.getTotal()});
            });
            jTableVendas.setModel(tableModel);
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_jButtonConsultarItemActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaVenda tela_venda = new TelaVenda();
        UtilTelas.formataTela(this, tela_venda);   
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonConsultarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTodosActionPerformed
        
       
       DefaultTableModel tableModel = (DefaultTableModel) jTableVendas.getModel();
       tableModel.setRowCount(0);
       try{
           
           ArrayList<Venda> vendas = vr.consultarTodasVendas();
           
           vendas.forEach((Venda venda) -> {
               tableModel.addRow(new Object[] {venda.getId(),venda.getCpf(),venda.getId_produto(),venda.getQuantidade(),venda.getTotal()});
            });
            jTableVendas.setModel(tableModel);
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_jButtonConsultarTodosActionPerformed

    private void jButtonConsultarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCpfActionPerformed
       String cpfString = jTextConsultarItemCpf.getText();
       long cpf = Long.parseLong(cpfString);
       DefaultTableModel tableModel = (DefaultTableModel) jTableVendas.getModel();
       tableModel.setRowCount(0);
       try{
           
           ArrayList<Venda> vendas = vr.consultarVendaPorCpf(cpf);
           
           vendas.forEach((Venda venda) -> {
               tableModel.addRow(new Object[] {venda.getId(),venda.getCpf(),venda.getId_produto(),venda.getQuantidade(),venda.getTotal()});
            });
            jTableVendas.setModel(tableModel);
       }catch(Exception e){
           
       }                                                   

    }//GEN-LAST:event_jButtonConsultarCpfActionPerformed

    private void jTextConsultarItemPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextConsultarItemPorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextConsultarItemPorIdActionPerformed

    private void jTextConsultarItemCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextConsultarItemCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextConsultarItemCpfActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonConsultarCpf;
    private javax.swing.JButton jButtonConsultarItem;
    private javax.swing.JButton jButtonConsultarTodos;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelProdutoVendido;
    private javax.swing.JLabel jLabelProdutoVendido1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTextField jTextConsultarItemCpf;
    private javax.swing.JTextField jTextConsultarItemPorId;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label labelCpf1;
    private java.awt.Label labelID1;
    private java.awt.Label labelTodos;
    // End of variables declaration//GEN-END:variables
}
