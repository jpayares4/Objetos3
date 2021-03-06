/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.NumerosComplejos;
import javax.swing.JOptionPane;

/**
 *
 * @author Payares
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmbLimpiar.setEnabled(true);
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
        cmbOperacion = new javax.swing.JComboBox<>();
        cmdCalcular = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNumeradorReal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominadorReal = new javax.swing.JTextField();
        txtNumeradorImaginario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominadorImaginario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtReal1 = new javax.swing.JTextField();
        txtImaginario1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtReal2 = new javax.swing.JTextField();
        txtImaginario2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtReal3 = new javax.swing.JTextField();
        txtImaginario3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Calculadora de numeros complejos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 260, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 80, -1));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 20));

        cmbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbLimpiar.setText("Limpiar");
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 90, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Division"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeradorReal.setEditable(false);
        jPanel2.add(txtNumeradorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 25));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 10));

        txtDenominadorReal.setEditable(false);
        jPanel2.add(txtDenominadorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, 60, 25));

        txtNumeradorImaginario.setEditable(false);
        jPanel2.add(txtNumeradorImaginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 25));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 60, 10));

        txtDenominadorImaginario.setEditable(false);
        jPanel2.add(txtDenominadorImaginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 55, 60, 25));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel10.setText("i");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 40, 10, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 100));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero 1."));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 25));
        jPanel4.add(txtImaginario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 25));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("i");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 10, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 80));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero 2."));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReal2ActionPerformed(evt);
            }
        });
        jPanel5.add(txtReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 25));
        jPanel5.add(txtImaginario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel6.setText("i");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 10, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 200, 70));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReal3.setEditable(false);
        jPanel6.add(txtReal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 25));

        txtImaginario3.setEditable(false);
        jPanel6.add(txtImaginario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 25));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel13.setText("i");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 10, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 240, 90));

        txtSalir.setText("Salir");
        jPanel1.add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(571, 313));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtReal1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte real del primer numero");
            txtReal1.requestFocusInWindow();
        } else if (txtImaginario1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte imaginaria del primer numero");
            txtImaginario1.requestFocusInWindow();
        } else if (txtReal2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte real del segundo numero");
            txtReal2.requestFocusInWindow();
        } else if (txtImaginario2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte imaginaria del segundo numero");
            txtImaginario2.requestFocusInWindow();
        } else {
            int op;
            int r1,  r2,i1,i2, aux;
            NumerosComplejos n1, n2, n3;
            try {
                op = cmbOperacion.getSelectedIndex();
                r1 = Integer.parseInt(txtReal1.getText());
                i1 = Integer.parseInt(txtImaginario1.getText());
                r2 = Integer.parseInt(txtReal2.getText());
                i2 = Integer.parseInt(txtImaginario2.getText());

                n1 = new NumerosComplejos (r1, i1);
                n2 = new NumerosComplejos (r2, i2);
                switch (op) {
                    case 0:
                    n3 = n1.sumar(n2);
                    txtReal3.setText("" + n3.getParte_real());
                    txtImaginario3.setText("" + n3.getParte_imaginaria());
                    break;
                    case 1:
                    n3 = n1.restar(n2);
                    txtReal3.setText(String.valueOf(n3.getParte_real()));
                    txtImaginario3.setText("" + n3.getParte_imaginaria());
                    break;
                    case 2:
                    n3 = n1.multiplicar(n2);
                    txtReal3.setText(String.valueOf(n3.getParte_real()));
                    txtImaginario3.setText(String.valueOf(n3.getParte_imaginaria()));
                    break;
                    case 3:
                    n3 = n1.dividir(n2);
                    txtReal3.setText("");
                    txtImaginario3.setText("");
                    aux = (n2.getParte_real() * n2.getParte_real()) + (n2.getParte_imaginaria() * n2.getParte_imaginaria());
                    txtNumeradorReal.setText(String.valueOf(n3.getParte_real()));
                    txtDenominadorReal.setText(String.valueOf(aux));
                    txtNumeradorImaginario.setText(String.valueOf(n3.getParte_imaginaria()));
                    txtDenominadorImaginario.setText(String.valueOf(aux));
                    break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor No valido", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }
        cmbLimpiar.setEnabled(true);
               
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed
        // TODO add your handling code here:
        txtReal1.setText("");
        txtImaginario1.setText("");
        txtReal2.setText("");
        txtImaginario2.setText("");
        txtReal3.setText("");
        txtImaginario3.setText("");
        txtNumeradorReal.setText("");
        txtDenominadorReal.setText("");
        txtNumeradorImaginario.setText("");
        txtDenominadorImaginario.setText("");
        txtReal1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void txtReal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReal2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDenominadorImaginario;
    private javax.swing.JTextField txtDenominadorReal;
    private javax.swing.JTextField txtImaginario1;
    private javax.swing.JTextField txtImaginario2;
    private javax.swing.JTextField txtImaginario3;
    private javax.swing.JTextField txtNumeradorImaginario;
    private javax.swing.JTextField txtNumeradorReal;
    private javax.swing.JTextField txtReal1;
    private javax.swing.JTextField txtReal2;
    private javax.swing.JTextField txtReal3;
    private javax.swing.JButton txtSalir;
    // End of variables declaration//GEN-END:variables
}
