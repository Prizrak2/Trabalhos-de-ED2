/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import classes.Aluno;
import classes.Curso;
import classes.Enfase;
import classes.enums.TurnoEnum;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author misuka
 */
public class TelaAluno extends javax.swing.JFrame {

    Map<String, Aluno> arvoreAluno = null;
    Map<Integer, Enfase> arvoreEnfase = null;
    Map<Integer, Curso> arvoreCurso = null;
    
    public TelaAluno(Map<String, Aluno> arvoreAluno, Map<Integer, Enfase> arvoreEnfase, Map<Integer, Curso> arvoreCurso) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.arvoreAluno = arvoreAluno;
        this.arvoreEnfase = arvoreEnfase;
        this.arvoreCurso = arvoreCurso;
        carregarComboBoxes();
        mostrarNaGrid();
    }
    
    private void carregarComboBoxes(){
        Iterator<Enfase> iteradorEnfase = arvoreEnfase.values().iterator();
        Iterator<Curso> iteratorCurso = arvoreCurso.values().iterator();
        
        jComboBox_Turno.removeAllItems();
        for(TurnoEnum turno : TurnoEnum.values()){
            jComboBox_Turno.addItem(turno.getDescricao());
        }
        
        jComboBox_Enfase.removeAllItems();
        while(iteradorEnfase.hasNext()){
            jComboBox_Enfase.addItem(iteradorEnfase.next().viewAsString());
        }
        
        jComboBox_Curso.removeAllItems();
        while(iteratorCurso.hasNext()){
            jComboBox_Curso.addItem(iteratorCurso.next().viewAsString());
        }
    }
    private void mostrarNaGrid(){
        try {
            Iterator<Aluno> iterador = arvoreAluno.values().iterator();
            DefaultTableModel model =  (DefaultTableModel) jTable_Saida.getModel();
            model.setNumRows(0);
            while(iterador.hasNext()){
                Aluno objetoAuxiliar = iterador.next();
                String[] linha = new String[6];
                linha[0]= objetoAuxiliar.getMatricula();
                linha[1]= objetoAuxiliar.getNome();
                linha[2] = objetoAuxiliar.getTurno();
                linha[3] = objetoAuxiliar.getPeriodo()+"";
                linha[4] = objetoAuxiliar.getEnfase().viewAsString();
                linha[5] = objetoAuxiliar.getCurso().viewAsString();
                model.addRow(linha);
            }            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }
    private void limparDados(){
        jTextField_Matricula.setText("");
        jTextField_Nome.setText("");
        jTextField_Periodo.setText("");
        jComboBox_Curso.setSelectedIndex(0);
        jComboBox_Enfase.setSelectedIndex(0);
        jComboBox_Turno.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Matricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_Turno = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Periodo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_Enfase = new javax.swing.JComboBox<>();
        jComboBox_Curso = new javax.swing.JComboBox<>();
        jButton_Incluir = new javax.swing.JButton();
        jButton_Alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Saida = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setText("Aluno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Matrícula");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Turno");

        jComboBox_Turno.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Periodo");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Enfase");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Curso");

        jComboBox_Enfase.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jComboBox_Curso.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jButton_Incluir.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton_Incluir.setText("Incluir");
        jButton_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IncluirActionPerformed(evt);
            }
        });

        jButton_Alterar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton_Alterar.setText("Alterar");
        jButton_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlterarActionPerformed(evt);
            }
        });

        jTable_Saida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nome", "Turno", "Periodo", "Enfase", "Curso"
            }
        ));
        jTable_Saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SaidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Saida);
        if (jTable_Saida.getColumnModel().getColumnCount() > 0) {
            jTable_Saida.getColumnModel().getColumn(0).setMinWidth(140);
            jTable_Saida.getColumnModel().getColumn(0).setMaxWidth(140);
            jTable_Saida.getColumnModel().getColumn(2).setMinWidth(80);
            jTable_Saida.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable_Saida.getColumnModel().getColumn(3).setMinWidth(70);
            jTable_Saida.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Nome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Periodo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_Enfase, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_Curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_Turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_Enfase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IncluirActionPerformed
        // TODO add your handling code here:
        try {
            if(jTextField_Matricula.getText().isEmpty()) throw new Exception("Campo Matricula Vazio");
            if(!jTextField_Matricula.getText().matches("\\d{4}\\.\\d{1}\\.\\d{3}\\.\\d{4}")) throw new Exception("A Matrícula deve ser no formato dddd.d.ddd.dddd (d representa um dígito)");
            if(arvoreAluno.containsKey(jTextField_Matricula.getText())) throw new Exception("Já existe um aluno com essa matrícula");
            if(jTextField_Nome.getText().isEmpty()) throw new Exception("Campo Nome Vazio");
            if(jTextField_Periodo.getText().isEmpty()) throw new Exception("Campo Periodo Vazio");
            if(!jTextField_Periodo.getText().matches("\\d+")) throw new Exception("O Periodo deve conter apenas números");
            
            String vetEnfase[] = jComboBox_Enfase.getSelectedItem().toString().split("-");
            String vetCurso[] = jComboBox_Curso.getSelectedItem().toString().split("-");
            
            Aluno novoAluno = new Aluno(
                    jTextField_Matricula.getText(), 
                    jTextField_Nome.getText().toUpperCase().toUpperCase(),
                    jComboBox_Turno.getSelectedItem().toString(),
                    Integer.parseInt(jTextField_Periodo.getText()),
                    arvoreEnfase.get(Integer.valueOf(vetEnfase[0].trim())), 
                    arvoreCurso.get(Integer.valueOf(vetCurso[0].trim())));
            
            arvoreAluno.put(jTextField_Matricula.getText(), novoAluno);
            limparDados();
            mostrarNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButton_IncluirActionPerformed

    private void jButton_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlterarActionPerformed
        // TODO add your handling code here:
        try {
            if(jTextField_Matricula.getText().isEmpty()) throw new Exception("Campo Matricula Vazio");
            if(!jTextField_Matricula.getText().matches("\\d{4}\\.\\d{1}\\.\\d{3}\\.\\d{4}")) throw new Exception("A Matrícula deve ser no formato dddd.d.ddd.dddd (d representa um dígito)");
            if(!arvoreAluno.containsKey(jTextField_Matricula.getText())) throw new Exception("Não existe um aluno com essa matrícula");
            if(jTextField_Nome.getText().isEmpty()) throw new Exception("Campo Nome Vazio");
            if(jTextField_Periodo.getText().isEmpty()) throw new Exception("Campo Periodo Vazio");
            if(!jTextField_Periodo.getText().matches("\\d+")) throw new Exception("O Periodo deve conter apenas números");
            
            String vetEnfase[] = jComboBox_Enfase.getSelectedItem().toString().split("-");
            String vetCurso[] = jComboBox_Curso.getSelectedItem().toString().split("-");
            
            Aluno novoAluno = new Aluno(
                    jTextField_Matricula.getText(), 
                    jTextField_Nome.getText().toUpperCase().toUpperCase(),
                    jComboBox_Turno.getSelectedItem().toString(),
                    Integer.parseInt(jTextField_Periodo.getText()),
                    arvoreEnfase.get(Integer.valueOf(vetEnfase[0].trim())), 
                    arvoreCurso.get(Integer.valueOf(vetCurso[0].trim())));
            
            arvoreAluno.put(jTextField_Matricula.getText(), novoAluno);
            limparDados();
            mostrarNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro);
        }
    }//GEN-LAST:event_jButton_AlterarActionPerformed

    private void jTable_SaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SaidaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Saida.getModel();
        int selectedRowIndex = jTable_Saida.getSelectedRow();
        
        jTextField_Matricula.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField_Nome.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jComboBox_Turno.setSelectedItem(model.getValueAt(selectedRowIndex, 2).toString());
        jTextField_Periodo.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jComboBox_Enfase.setSelectedItem(model.getValueAt(selectedRowIndex, 4).toString());
        jComboBox_Curso.setSelectedItem(model.getValueAt(selectedRowIndex, 5).toString());
        
    }//GEN-LAST:event_jTable_SaidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Alterar;
    private javax.swing.JButton jButton_Incluir;
    private javax.swing.JComboBox<String> jComboBox_Curso;
    private javax.swing.JComboBox<String> jComboBox_Enfase;
    private javax.swing.JComboBox<String> jComboBox_Turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Saida;
    private javax.swing.JTextField jTextField_Matricula;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Periodo;
    // End of variables declaration//GEN-END:variables
}
