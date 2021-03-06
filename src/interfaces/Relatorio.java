/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.CadastroEventos;
import classes.InscritosEvento;
import classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author P2
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();

        DefaultTableModel dtm = (DefaultTableModel) tabelaEventosTotal.getModel();

        for (int i = 0; i < CadastroEventos.eventos.size(); i++) {
            int cont = 0, cont2 = 0, cont3 = 0;
            for (int j = 0; j < InscritosEvento.inscritos.size(); j++) {
                if (CadastroEventos.eventos.get(i).getCodigo() == InscritosEvento.inscritos.get(j).getCodEvento()) {
                    cont++;
                    if (InscritosEvento.inscritos.get(j).isPresente() == true) {
                        cont2++;
                    } else {
                        cont3++;
                    }
                }
            }
            dtm.addRow(new Object[]{CadastroEventos.eventos.get(i).getCodigo(), CadastroEventos.eventos.get(i).getNome(),
                cont, cont2, cont3});
        }
        int total = 0, total2 = 0, total3 = 0;
        for (int i = 0; i < CadastroEventos.eventos.size(); i++) {
            total += (int) tabelaEventosTotal.getValueAt(i, 2);
            total2 += (int) tabelaEventosTotal.getValueAt(i, 3);
            total3 += (int) tabelaEventosTotal.getValueAt(i, 4);
        }
        dtm.addRow(new Object[]{"TOTAL", CadastroEventos.eventos.size(), total, total2, total3});

        ////
        DefaultTableModel dtmm = (DefaultTableModel) tabelaRelatorioEvento.getModel();
        for (int i = 0; i < CadastroEventos.eventos.size(); i++) {
            dtmm.addRow(new Object[]{CadastroEventos.eventos.get(i).getCodigo(), CadastroEventos.eventos.get(i).getNome()});
        }
        btnAusentes.setEnabled(false);
        btnPresentes.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEventosTotal = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaRelatorioEvento = new javax.swing.JTable();
        btnPresentes = new javax.swing.JButton();
        btnAusentes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAdministrador = new javax.swing.JButton();
        btnUsuarioComum = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        btnTodosUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório Geral dos Eventos"));

        tabelaEventosTotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Evento", "Nome Evento", "Inscritos", "Presentes", "Ausentes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEventosTotal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório por Evento"));

        jLabel1.setText("Selecione o evento que deseja e a atividade a ser realizada");

        tabelaRelatorioEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Evento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaRelatorioEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaRelatorioEventoMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaRelatorioEvento);

        btnPresentes.setText("Presentes");
        btnPresentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentesActionPerformed(evt);
            }
        });

        btnAusentes.setText("Ausentes");
        btnAusentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAusentesActionPerformed(evt);
            }
        });

        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Presença"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelaAlunos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPresentes, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(btnAusentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPresentes)
                        .addGap(33, 33, 33)
                        .addComponent(btnAusentes)
                        .addGap(53, 53, 53))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório dos Perfis de Usuários"));

        btnAdministrador.setText("Administradores");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnUsuarioComum.setText("Usuários Comuns");
        btnUsuarioComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioComumActionPerformed(evt);
            }
        });

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Permissão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabelaUsuarios);

        btnTodosUsuarios.setText("Todos usuários do sistema");
        btnTodosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosUsuariosActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o tipo de perfil de usuário desejado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdministrador)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuarioComum)
                        .addGap(18, 18, 18)
                        .addComponent(btnTodosUsuarios))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdministrador)
                    .addComponent(btnUsuarioComum)
                    .addComponent(btnTodosUsuarios))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaRelatorioEventoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaRelatorioEventoMouseReleased
        // TODO add your handling code here:
        if (tabelaRelatorioEvento.getSelectedRow() != -1) {
            btnAusentes.setEnabled(true);
            btnPresentes.setEnabled(true);
        }

    }//GEN-LAST:event_tabelaRelatorioEventoMouseReleased

    private void btnPresentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentesActionPerformed
        // TODO add your handling code here:
        int linhaSel = tabelaRelatorioEvento.getSelectedRow();
        int codigoEvento = (int) tabelaRelatorioEvento.getValueAt(linhaSel, 0);

        DefaultTableModel tblRemove = (DefaultTableModel) tabelaAlunos.getModel();
        tblRemove.setNumRows(0);
        int cont = 0;
        DefaultTableModel dtm = (DefaultTableModel) tabelaAlunos.getModel();
        for (int i = 0; i < InscritosEvento.inscritos.size(); i++) {
            if (codigoEvento == InscritosEvento.inscritos.get(i).getCodEvento() && InscritosEvento.inscritos.get(i).isPresente() == true) {
                dtm.addRow(new Object[]{InscritosEvento.inscritos.get(i).getNome(), InscritosEvento.inscritos.get(i).getCpf(),
                    "Presente"});
                cont++;
            }
        }
        if (dtm.getRowCount() == 0) {
            for (int i = 0; i < InscritosEvento.inscritos.size(); i++) {
                if (codigoEvento == InscritosEvento.inscritos.get(i).getCodEvento() && InscritosEvento.inscritos.get(i).isPresente() == false) {
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "NÃO HÁ ALUNO INSCRITO NESSE EVENTO");
            } else {
                JOptionPane.showMessageDialog(null, "NÃO HÁ ALUNO PRESENTE NESSE EVENTO");
            }

        } else {
            dtm.addRow(new Object[]{"TOTAL", "", cont});
        }

    }//GEN-LAST:event_btnPresentesActionPerformed

    private void btnAusentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusentesActionPerformed
        // TODO add your handling code here:
        int linhaSel = tabelaRelatorioEvento.getSelectedRow();
        int codigoEvento = (int) tabelaRelatorioEvento.getValueAt(linhaSel, 0);

        DefaultTableModel tblRemove = (DefaultTableModel) tabelaAlunos.getModel();
        tblRemove.setNumRows(0);
        int cont = 0;
        DefaultTableModel dtm = (DefaultTableModel) tabelaAlunos.getModel();
        for (int i = 0; i < InscritosEvento.inscritos.size(); i++) {
            if (codigoEvento == InscritosEvento.inscritos.get(i).getCodEvento() && InscritosEvento.inscritos.get(i).isPresente() == false) {
                dtm.addRow(new Object[]{InscritosEvento.inscritos.get(i).getNome(), InscritosEvento.inscritos.get(i).getCpf(),
                    "Ausente"});
                cont++;
            }
        }
        if (dtm.getRowCount() == 0) {
            for (int i = 0; i < InscritosEvento.inscritos.size(); i++) {
                if (codigoEvento == InscritosEvento.inscritos.get(i).getCodEvento() && InscritosEvento.inscritos.get(i).isPresente() == true) {
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "NÃO HÁ ALUNO INSCRITO NESSE EVENTO");
            } else {
                JOptionPane.showMessageDialog(null, "NÃO HÁ ALUNO AUSENTE NESSE EVENTO");
            }

        } else {
            dtm.addRow(new Object[]{"TOTAL", "", cont});
        }
    }//GEN-LAST:event_btnAusentesActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblRemove = (DefaultTableModel) tabelaUsuarios.getModel();
        tblRemove.setNumRows(0);
        int cont = 0;
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsuarios.getModel();
        for (int i = 0; i < Usuario.usuarios.size(); i++) {
            if(Usuario.usuarios.get(i).isPermissao()==true){
                dtm.addRow(new Object[]{Usuario.usuarios.get(i).getNome(), Usuario.usuarios.get(i).getCpf(),
                    "Administrador"});
                cont++;
            }
        }
        if (dtm.getRowCount() == 0) {
            for (int i = 0; i < Usuario.usuarios.size(); i++) {
                if (Usuario.usuarios.get(i).isPermissao()==false) {
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "NÃO HÁ USUÁRIOS NO SISTEMA");
            } else {
                JOptionPane.showMessageDialog(null, "NÃO HÁ ADMINISTRADORES NO SISTEMA");
            }

        } else {
            dtm.addRow(new Object[]{"TOTAL", "", cont});
        }
        
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnUsuarioComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioComumActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblRemove = (DefaultTableModel) tabelaUsuarios.getModel();
        tblRemove.setNumRows(0);
        int cont = 0;
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsuarios.getModel();
        for (int i = 0; i < Usuario.usuarios.size(); i++) {
            if(Usuario.usuarios.get(i).isPermissao()==false){
                dtm.addRow(new Object[]{Usuario.usuarios.get(i).getNome(), Usuario.usuarios.get(i).getCpf(),
                    "Usuário Comum"});
                cont++;
            }
        }
        if (dtm.getRowCount() == 0) {
            for (int i = 0; i < Usuario.usuarios.size(); i++) {
                if (Usuario.usuarios.get(i).isPermissao()==true) {
                    cont++;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "NÃO HÁ USUÁRIOS NO SISTEMA");
            } else {
                JOptionPane.showMessageDialog(null, "NÃO HÁ USUÁRIOS COMUNS NO SISTEMA");
            }

        } else {
            dtm.addRow(new Object[]{"TOTAL", "", cont});
        }
    }//GEN-LAST:event_btnUsuarioComumActionPerformed

    private void btnTodosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosUsuariosActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tblRemove = (DefaultTableModel) tabelaUsuarios.getModel();
        tblRemove.setNumRows(0);
        int cont = 0;
        String perfil;
       
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsuarios.getModel();
        for (int i = 0; i < Usuario.usuarios.size(); i++) {
            if(Usuario.usuarios.get(i).isPermissao()==false){
                dtm.addRow(new Object[]{Usuario.usuarios.get(i).getNome(), Usuario.usuarios.get(i).getCpf(),
                    "Usuário Comum"});
                cont++;
            }else{
                dtm.addRow(new Object[]{Usuario.usuarios.get(i).getNome(), Usuario.usuarios.get(i).getCpf(),
                    "Administrador"});
                cont++;
            }
        }
        if (dtm.getRowCount() != 0) {
            dtm.addRow(new Object[]{"TOTAL", "", cont});
        } else {
            JOptionPane.showMessageDialog(null, "NÃO HÁ USUÁRIOS NO SISTEMA");
        }
    }//GEN-LAST:event_btnTodosUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAusentes;
    private javax.swing.JButton btnPresentes;
    private javax.swing.JButton btnTodosUsuarios;
    private javax.swing.JButton btnUsuarioComum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTable tabelaEventosTotal;
    private javax.swing.JTable tabelaRelatorioEvento;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
