/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.classes.Aluno;
import modelos.classes.Arvore;
import modelos.interfaces.iArvoreBinaria;
import persistencia.ManipulacaoArq;

/**
 *
 * @author lusra
 */
public class MainUI extends javax.swing.JFrame {
    List<Aluno> array = new LinkedList<>();
    iArvoreBinaria arvore = new Arvore();
    
    public MainUI() {
        initComponents();
        this.jButton1_Buscar.setEnabled(false);
        this.jButton1_Listar.setEnabled(false);
        this.jButton2_Incluir.setEnabled(false);
        this.jComboBox1_Ordem.setEnabled(false);
        this.jButton1_excluir.setEnabled(false);
        System.out.println((String) jComboBox1_Ordem.getSelectedItem());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1_Ordem = new javax.swing.JComboBox<>();
        jButton1_Listar = new javax.swing.JButton();
        jButton1_CARREGAR = new javax.swing.JButton();
        jButton1_Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1_excluir = new javax.swing.JButton();
        jButton2_Incluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1_Ordem.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1_Ordem.setForeground(new java.awt.Color(102, 255, 102));
        jComboBox1_Ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "crescente - nome", "decrescente - nome", "crescente - matricula", "decrescente - matricula" }));
        jComboBox1_Ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_OrdemActionPerformed(evt);
            }
        });

        jButton1_Listar.setBackground(new java.awt.Color(255, 153, 153));
        jButton1_Listar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_Listar.setForeground(new java.awt.Color(102, 255, 102));
        jButton1_Listar.setText("LISTAR");
        jButton1_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ListarActionPerformed(evt);
            }
        });

        jButton1_CARREGAR.setBackground(new java.awt.Color(255, 153, 153));
        jButton1_CARREGAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_CARREGAR.setForeground(new java.awt.Color(102, 255, 102));
        jButton1_CARREGAR.setText("CARREGAR");
        jButton1_CARREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CARREGARActionPerformed(evt);
            }
        });

        jButton1_Buscar.setBackground(new java.awt.Color(255, 153, 153));
        jButton1_Buscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_Buscar.setForeground(new java.awt.Color(102, 255, 102));
        jButton1_Buscar.setText("BUSCAR");
        jButton1_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_BuscarActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 153, 255));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("TABELA DE ALUNOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Turno", "Periodo", "Enfase", "Curso"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1_excluir.setBackground(new java.awt.Color(255, 153, 153));
        jButton1_excluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1_excluir.setForeground(new java.awt.Color(102, 255, 102));
        jButton1_excluir.setText("EXCLUIR");
        jButton1_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_excluirActionPerformed(evt);
            }
        });

        jButton2_Incluir.setBackground(new java.awt.Color(255, 153, 153));
        jButton2_Incluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2_Incluir.setForeground(new java.awt.Color(102, 255, 102));
        jButton2_Incluir.setText("INCLUIR");
        jButton2_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_IncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton2_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 908, Short.MAX_VALUE)
                .addComponent(jButton1_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton1_CARREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jComboBox1_Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(182, 182, 182)
                                    .addComponent(jButton1_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(181, 181, 181)
                                    .addComponent(jButton1_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(476, 476, 476))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(609, 609, 609)))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_CARREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(668, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(73, 73, 73)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1_Ordem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1_Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void mostrarNaGrid(List<Aluno> dadosDosAlunos) throws Exception{
            try{
                DefaultTableModel model =  (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                
                arvore = new Arvore();
                String[] linha = new String[6];
                for (Aluno aluno : dadosDosAlunos) {
                    arvore.adicionar(aluno, (String) jComboBox1_Ordem.getSelectedItem());
                }
                
                List<Aluno> alunosOrdenados = arvore.percorrerEmOrdem();
                for (Aluno aluno : alunosOrdenados) {
                    linha [0] = aluno.getMatricula();
                    linha [1] = aluno.getNome();
                    linha [2] = aluno.getTurno();
                    linha [3] = aluno.getPeriodo();
                    linha [4] = aluno.getEnfase();
                    linha [5] = aluno.getCurso();
                    model.addRow(linha);
                }

            }catch (Exception erro){
                JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }
    
    private void jComboBox1_OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_OrdemActionPerformed

    }//GEN-LAST:event_jComboBox1_OrdemActionPerformed

    private void jButton1_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ListarActionPerformed
        try {
            mostrarNaGrid(array);
        } catch (Exception ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1_ListarActionPerformed

    private void jButton1_CARREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CARREGARActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "text", "csv", "txt");
            fc.setFileFilter(filter);
            int returnVal = fc.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File arquivo = fc.getSelectedFile();
                ManipulacaoArq arq = new ManipulacaoArq(arquivo.toString());
                array = arq.obterListaAlunos();
                this.jButton2_Incluir.setEnabled(true);
                this.jButton1_Buscar.setEnabled(true);
                this.jButton1_Listar.setEnabled(true);
                this.jComboBox1_Ordem.setEnabled(true);
                this.jButton1_excluir.setEnabled(true);
                this.jButton1_CARREGAR.setEnabled(false);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);

                mostrarNaGrid(array);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButton1_CARREGARActionPerformed

    private void jButton1_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_BuscarActionPerformed
        // TODO add your handling code here:
        Buscar buscar = new Buscar(this);
        buscar.setVisible(true);
    }//GEN-LAST:event_jButton1_BuscarActionPerformed

    private void jButton1_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_excluirActionPerformed
        // TODO add your handling code here:
        Excluir excluir = new Excluir(this);
        excluir.setVisible(true);
    }//GEN-LAST:event_jButton1_excluirActionPerformed

    private void jButton2_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_IncluirActionPerformed
        Incluir incluir = new Incluir(this);
        incluir.setVisible(true);
    }//GEN-LAST:event_jButton2_IncluirActionPerformed

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
    private javax.swing.JButton jButton1_Buscar;
    private javax.swing.JButton jButton1_CARREGAR;
    private javax.swing.JButton jButton1_Listar;
    private javax.swing.JButton jButton1_excluir;
    private javax.swing.JButton jButton2_Incluir;
    public javax.swing.JComboBox<String> jComboBox1_Ordem;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
