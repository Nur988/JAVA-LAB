/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket.scoreboard;

/**
 *
 * @author ASUS
 */
public class match extends javax.swing.JFrame {

    /**
     * Creates new form match
     */
    public match() {
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

        scorefield = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        one1 = new javax.swing.JButton();
        two1 = new javax.swing.JButton();
        three1 = new javax.swing.JButton();
        four1 = new javax.swing.JButton();
        five1 = new javax.swing.JButton();
        one3 = new javax.swing.JButton();
        two3 = new javax.swing.JButton();
        three3 = new javax.swing.JButton();
        four3 = new javax.swing.JButton();
        five3 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MATCH CREATOR");
        setBackground(new java.awt.Color(0, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().setLayout(null);

        scorefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorefieldActionPerformed(evt);
            }
        });
        getContentPane().add(scorefield);
        scorefield.setBounds(912, 145, 188, 80);

        one.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one);
        one.setBounds(483, 251, 41, 25);

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two);
        two.setBounds(542, 251, 39, 25);

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three);
        three.setBounds(588, 251, 39, 25);

        four.setText("4");
        getContentPane().add(four);
        four.setBounds(634, 251, 39, 25);

        five.setText("5");
        getContentPane().add(five);
        five.setBounds(685, 251, 39, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(517, 151, 156, 80);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 683, 105, 80);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(290, 683, 110, 80);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("OVERS LEFT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(127, 798, 108, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("OVERS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(322, 798, 61, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(39, 437, 146, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("1ST INNINGS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 723, 146, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("BATSMAN A");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(165, 58, 105, 41);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BATSMAN B");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(935, 58, 105, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("WICKETS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(567, 464, 86, 22);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(534, 346, 150, 80);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(550, 643, 126, 62);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("EXTRAS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(829, 556, 70, 22);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(981, 433, 166, 82);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("RUNRATE");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(72, 583, 87, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(528, 0, 206, 40);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(121, 147, 159, 77);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("NEW INNINGS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(21, 905, 181, 57);

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("SAVE DATA");
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 903, 181, 57);

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("END INNINGS");
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 903, 181, 57);

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("CLEAR BOARD");
        getContentPane().add(jButton4);
        jButton4.setBounds(700, 903, 181, 57);

        jButton5.setBackground(new java.awt.Color(0, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 255));
        jButton5.setText("CLOSE");
        getContentPane().add(jButton5);
        jButton5.setBounds(927, 905, 181, 57);

        one1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        one1.setText("1");
        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });
        getContentPane().add(one1);
        one1.setBounds(82, 251, 41, 25);

        two1.setText("2");
        two1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two1ActionPerformed(evt);
            }
        });
        getContentPane().add(two1);
        two1.setBounds(130, 251, 39, 25);

        three1.setText("3");
        three1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three1ActionPerformed(evt);
            }
        });
        getContentPane().add(three1);
        three1.setBounds(176, 251, 39, 25);

        four1.setText("4");
        getContentPane().add(four1);
        four1.setBounds(222, 251, 39, 25);

        five1.setText("5");
        getContentPane().add(five1);
        five1.setBounds(268, 251, 39, 25);

        one3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        one3.setText("1");
        one3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one3ActionPerformed(evt);
            }
        });
        getContentPane().add(one3);
        one3.setBounds(876, 251, 41, 25);

        two3.setText("2");
        two3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two3ActionPerformed(evt);
            }
        });
        getContentPane().add(two3);
        two3.setBounds(935, 251, 39, 25);

        three3.setText("3");
        three3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three3ActionPerformed(evt);
            }
        });
        getContentPane().add(three3);
        three3.setBounds(981, 251, 39, 25);

        four3.setText("4");
        getContentPane().add(four3);
        four3.setBounds(1032, 251, 39, 25);

        five3.setText("5");
        getContentPane().add(five3);
        five3.setBounds(1083, 251, 39, 25);
        getContentPane().add(filler1);
        filler1.setBounds(829, 540, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scorefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scorefieldActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
        String s=scorefield.getText();
        scorefield.setText(s+1);
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
        String s=scorefield.getText();
        
        scorefield.setText(s+'2');
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        String s=scorefield.getText();
        scorefield.setText(s+3);
    }//GEN-LAST:event_threeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_one1ActionPerformed

    private void two1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_two1ActionPerformed

    private void three1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_three1ActionPerformed

    private void one3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_one3ActionPerformed

    private void two3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_two3ActionPerformed

    private void three3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_three3ActionPerformed

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
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new match().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton five;
    private javax.swing.JButton five1;
    private javax.swing.JButton five3;
    private javax.swing.JButton four;
    private javax.swing.JButton four1;
    private javax.swing.JButton four3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton one;
    private javax.swing.JButton one1;
    private javax.swing.JButton one3;
    private javax.swing.JTextField scorefield;
    private javax.swing.JButton three;
    private javax.swing.JButton three1;
    private javax.swing.JButton three3;
    private javax.swing.JButton two;
    private javax.swing.JButton two1;
    private javax.swing.JButton two3;
    // End of variables declaration//GEN-END:variables
}
