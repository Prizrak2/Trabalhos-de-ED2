/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import classes.Arvore;
import java.util.logging.Level;
import java.util.logging.Logger;
import interfaces.iArvoreBinaria;
import javax.swing.JOptionPane;

/**
 *
 * @author lusra
 */
public class MainUI extends javax.swing.JFrame {
    iArvoreBinaria arvore = new Arvore();
    /**
     * Creates new form MainUI
     */
    public MainUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1_Elemento = new javax.swing.JTextField();
        jTextField2_numeroElementos = new javax.swing.JTextField();
        jComboBox1_Ordem = new javax.swing.JComboBox<>();
        jButton1_exibirArvore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2_Adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jComboBox1_Ordem.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1_Ordem.setForeground(new java.awt.Color(102, 255, 102));
        jComboBox1_Ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre-Fixado a Esquerda", "Pre-Fixado a Direita", "Central a Esquerda", "Central a Direita", "Pos-Fixado a Esquerda", "Pos-Fixado a Direita" }));

        jButton1_exibirArvore.setBackground(new java.awt.Color(255, 153, 153));
        jButton1_exibirArvore.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_exibirArvore.setForeground(new java.awt.Color(102, 255, 102));
        jButton1_exibirArvore.setText("EXIBIR ÁRVORE");
        jButton1_exibirArvore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_exibirArvoreActionPerformed(evt);
            }
        });

        jLabel1.setText("Elemento:");

        jLabel2.setText("Número de Elementos:");

        jButton2_Adicionar.setBackground(new java.awt.Color(255, 153, 153));
        jButton2_Adicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2_Adicionar.setForeground(new java.awt.Color(102, 255, 102));
        jButton2_Adicionar.setText("ADICIONAR");
        jButton2_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AdicionarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1_exibirArvore)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1_Elemento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2_numeroElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton2_Adicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jComboBox1_Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_Elemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2_Adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1_Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_numeroElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(65, 65, 65)
                .addComponent(jButton1_exibirArvore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AdicionarActionPerformed
        try {
            // TODO add your handling code here:
            arvore.adicionar(Integer.parseInt(jTextField1_Elemento.getText()));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Elemento não pode ser repetido");
        }
        String NumeroElementos = String.valueOf(arvore.tamanhoArvore());
        jTextField2_numeroElementos.setText(NumeroElementos);
    }//GEN-LAST:event_jButton2_AdicionarActionPerformed

    private void jButton1_exibirArvoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_exibirArvoreActionPerformed
        // TODO add your handling code here:
        String ordemImpressao = (String) jComboBox1_Ordem.getSelectedItem();
        
        switch(ordemImpressao){
            case "Pre-Fixado a Esquerda":
                jTextArea1.setText(arvore.preFixadoEsquerda());
                break;
            case "Pre-Fixado a Direita":
                jTextArea1.setText(arvore.preFixadoDireita());
                break;
            case "Central a Esquerda":
                jTextArea1.setText(arvore.centralEsquerda());
                break;
            case "Central a Direita":
                jTextArea1.setText(arvore.centralDireita());
                break;
            case "Pos-Fixado a Esquerda":
                jTextArea1.setText(arvore.posFixadoEsquerda());
                break;
            case "Pos-Fixado a Direita":
                jTextArea1.setText(arvore.posFixadoDireita());
                break;
        }
    }//GEN-LAST:event_jButton1_exibirArvoreActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_exibirArvore;
    private javax.swing.JButton jButton2_Adicionar;
    private javax.swing.JComboBox<String> jComboBox1_Ordem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1_Elemento;
    private javax.swing.JTextField jTextField2_numeroElementos;
    // End of variables declaration//GEN-END:variables
}