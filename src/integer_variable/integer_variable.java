/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integer_variable;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author FAHIM
 */
public class integer_variable extends javax.swing.JFrame {

    /**
     * Creates new form integer_variable
     */
    public integer_variable() {
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

        firstnum = new javax.swing.JLabel();
        secondnum = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Subbtn = new javax.swing.JButton();
        Mulbtn = new javax.swing.JButton();
        Divbtn = new javax.swing.JButton();
        showresult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstnum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstnum.setText("firstnum");
        getContentPane().add(firstnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        secondnum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondnum.setText("secondnum");
        getContentPane().add(secondnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        result.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        result.setText("result");
        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 180, 40));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 180, 40));

        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        Subbtn.setText("Subtract");
        Subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Subbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, 40));

        Mulbtn.setText("Multiply");
        Mulbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Mulbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, 40));

        Divbtn.setText("Divide");
        Divbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Divbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 40));
        getContentPane().add(showresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 194, 210, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
  
   int num1 = Integer.parseInt(jTextField1.getText());
   int num2 = Integer.parseInt(jTextField2.getText());
   int result = num1 + num2;
   showresult.setText("Addition of "+num1+" and "+num2+" is "+result);
    }//GEN-LAST:event_AddbtnActionPerformed

    private void MulbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulbtnActionPerformed
 
   int num1 = Integer.parseInt(jTextField1.getText());
   int num2 = Integer.parseInt(jTextField2.getText());
   int result = num1 * num2;
   showresult.setText("Multiplication of "+num1+" and "+num2+" is "+result);
    }//GEN-LAST:event_MulbtnActionPerformed

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    private void SubbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubbtnActionPerformed

   int num1 = Integer.parseInt(jTextField1.getText());
   int num2 = Integer.parseInt(jTextField2.getText());
   int result = num1 - num2;
   showresult.setText("Subtraction of "+num1+" and "+num2+" is "+result);
    }//GEN-LAST:event_SubbtnActionPerformed

    private void DivbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivbtnActionPerformed

   int num1 = Integer.parseInt(jTextField1.getText());
   int num2 = Integer.parseInt(jTextField2.getText());
   int result = num1 / num2;
   showresult.setText("Division of "+num1+" and "+num2+" is "+result);
    }//GEN-LAST:event_DivbtnActionPerformed

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
            java.util.logging.Logger.getLogger(integer_variable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(integer_variable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(integer_variable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(integer_variable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new integer_variable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Divbtn;
    private javax.swing.JButton Mulbtn;
    private javax.swing.JButton Subbtn;
    private javax.swing.JLabel firstnum;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel result;
    private javax.swing.JLabel secondnum;
    private javax.swing.JLabel showresult;
    // End of variables declaration//GEN-END:variables
}
