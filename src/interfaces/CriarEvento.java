/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.CadastroEventos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author P2
 */
public class CriarEvento extends javax.swing.JFrame {

    /**
     * Creates new form CriarEvento
     */
    private boolean alterar;

    public CriarEvento() {
        initComponents();
        txtData.setEnabled(false);
        txtHoraFim.setEnabled(false);
        txtHoraInicio.setEnabled(false);
        txtNome.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnCadastrar.setEnabled(false);
        btnExcluir.setEnabled(false);
        alterar = false;

        DefaultTableModel dtm = (DefaultTableModel) tabelaEventos.getModel();

        for (int i = 0; i < CadastroEventos.eventos.size(); i++) {
            dtm.addRow(new Object[]{CadastroEventos.eventos.get(i).getCodigo(), CadastroEventos.eventos.get(i).getNome(),
                CadastroEventos.eventos.get(i).getData(), CadastroEventos.eventos.get(i).getHoraInicio(),
                CadastroEventos.eventos.get(i).getHoraFim()});
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JFormattedTextField();
        txtHoraFim = new javax.swing.JFormattedTextField();
        btnNovo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEventos = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Eventos"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Data:");

        jLabel3.setText("Hora de Início:");

        jLabel4.setText("Hora de Término:");

        try {
            txtHoraInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtHoraFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData)
                            .addComponent(txtNome)
                            .addComponent(txtHoraInicio)
                            .addComponent(txtHoraFim)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)
                        .addGap(10, 10, 10)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Data", "Hora de Início", "Hora de Término"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaEventosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEventos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:

        if (txtNome.getText().equals("") || txtData.getText().equals("") || txtHoraInicio.getText().equals("")
                || txtHoraFim.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Não pode haver campos em branco!");

        } else {

            String nomeEvento = txtNome.getText();
            String data = txtData.getText();
            String hora = txtHoraInicio.getText();
            String horaFim = txtHoraFim.getText();

            CadastroEventos cadEventos = new CadastroEventos();

            if (alterar == true) {
                alterar = false;
                int pos = tabelaEventos.getSelectedRow();
                CadastroEventos.eventos.get(pos).setNome(nomeEvento);
                CadastroEventos.eventos.get(pos).setData(data);
                CadastroEventos.eventos.get(pos).setHoraInicio(hora);
                CadastroEventos.eventos.get(pos).setHoraFim(horaFim);

                tabelaEventos.setValueAt(nomeEvento, pos, 1);
                tabelaEventos.setValueAt(data, pos, 2);
                tabelaEventos.setValueAt(hora, pos, 3);
                tabelaEventos.setValueAt(horaFim, pos, 4);

                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            } else {
                int i = CadastroEventos.eventos.size();

                if (i == 0) {
                    cadEventos.cadastrar(nomeEvento, data, hora, horaFim, 1);
                    CadastroEventos.eventos.add(cadEventos);
                    DefaultTableModel dtm = (DefaultTableModel) tabelaEventos.getModel();
                    dtm.addRow(new Object[]{1, nomeEvento, data, hora, horaFim});
                    JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                } else {
                    int y = CadastroEventos.eventos.get(i - 1).getCodigo() + 1;
                    cadEventos.cadastrar(nomeEvento, data, hora, horaFim, y);
                    CadastroEventos.eventos.add(cadEventos);
                    DefaultTableModel dtm = (DefaultTableModel) tabelaEventos.getModel();
                    dtm.addRow(new Object[]{y, nomeEvento, data, hora, horaFim});
                    JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
                }

            }

            btnNovo.setEnabled(true);
            btnCadastrar.setText("Cadastrar");
            btnCadastrar.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtNome.setEnabled(false);
            txtData.setEnabled(false);
            txtHoraInicio.setEnabled(false);
            txtHoraFim.setEnabled(false);

            txtNome.setText("");
            txtData.setText("");
            txtHoraInicio.setText("");
            txtHoraFim.setText("");

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        btnNovo.setEnabled(false);
        btnCadastrar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtData.setEnabled(true);
        txtHoraInicio.setEnabled(true);
        txtNome.setEnabled(true);
        txtHoraFim.setEnabled(true);
        txtNome.setText("");
        txtData.setText("");
        txtHoraInicio.setText("");
        txtHoraFim.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        btnNovo.setEnabled(false);
        btnCadastrar.setText("Salvar");
        btnCadastrar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtNome.setEnabled(true);
        txtData.setEnabled(true);
        txtHoraInicio.setEnabled(true);
        txtHoraFim.setEnabled(true);
        alterar = true;
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int excluir = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esse item?", "Alerta", JOptionPane.YES_NO_OPTION);

        if (excluir == JOptionPane.YES_OPTION) {
            int pos = tabelaEventos.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel) tabelaEventos.getModel();
            dtm.removeRow(pos);
            CadastroEventos.eventos.remove(pos);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtNome.setText("");
            txtData.setText("");
            txtHoraInicio.setText("");
            txtHoraFim.setText("");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaEventosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEventosMouseReleased
        // TODO add your handling code here:
        if (tabelaEventos.getSelectedRow() != -1) {
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);

            int linhaSel = tabelaEventos.getSelectedRow();

            txtNome.setText(tabelaEventos.getValueAt(linhaSel, 1).toString());
            txtData.setText(tabelaEventos.getValueAt(linhaSel, 2).toString());
            txtHoraInicio.setText(tabelaEventos.getValueAt(linhaSel, 3).toString());
            txtHoraFim.setText(tabelaEventos.getValueAt(linhaSel, 4).toString());

        }
    }//GEN-LAST:event_tabelaEventosMouseReleased

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
            java.util.logging.Logger.getLogger(CriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEventos;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHoraFim;
    private javax.swing.JFormattedTextField txtHoraInicio;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
