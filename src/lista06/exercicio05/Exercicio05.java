package lista06.exercicio05;

import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio05 extends javax.swing.JFrame {

    private static int x;
    static Random random = new Random();

    /**
     * Creates new form Exercicio05
     */
    public Exercicio05() {
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

        lbl_principal = new javax.swing.JLabel();
        lbl_texto = new javax.swing.JLabel();
        lbl_chute = new javax.swing.JLabel();
        tf_chute = new javax.swing.JTextField();
        btn_chute = new javax.swing.JButton();
        btn_novoJogo = new javax.swing.JButton();
        tf_resultado = new javax.swing.JTextField();
        lbl_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivinhação");

        lbl_principal.setText("Jogo de adivinhação");

        lbl_texto.setText("Eu tenho um número entre 1 e 100, você pode adivinhá-lo?");

        lbl_chute.setText("Entre com o seu chute:");

        btn_chute.setText("Chutar");
        btn_chute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chuteActionPerformed(evt);
            }
        });

        btn_novoJogo.setText("Novo Jogo");
        btn_novoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoJogoActionPerformed(evt);
            }
        });

        tf_resultado.setEditable(false);

        lbl_resultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_novoJogo)
                    .addComponent(btn_chute, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_texto)
                    .addComponent(lbl_principal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_chute)
                        .addGap(12, 12, 12)
                        .addComponent(tf_chute, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_resultado)
                        .addGap(5, 5, 5)
                        .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal)
                .addGap(18, 18, 18)
                .addComponent(lbl_texto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_chute)
                    .addComponent(tf_chute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_chute, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_novoJogo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_chuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chuteActionPerformed
        int chute;
        if (!tf_chute.getText().equals("")) {
            try {
                chute = Integer.valueOf(tf_chute.getText());
                if (chute == x) {
                    tf_resultado.setText("Correto! O número foi encontrado.");
                    tf_chute.setEditable(false);
                    btn_chute.setEnabled(false);
                } else {
                    if (chute > x) {
                        tf_resultado.setText("O número é menor que o chute.");
                    } else {
                        tf_resultado.setText("O número é maior que o chute.");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Número inválido, tente novamente...", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_chuteActionPerformed

    private void btn_novoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoJogoActionPerformed
        tf_chute.setEditable(true);
        tf_chute.setText("");
        tf_resultado.setText("");
        btn_chute.setEnabled(true);
        x = random.nextInt(101);
    }//GEN-LAST:event_btn_novoJogoActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio05().setVisible(true);
            }
        });
        x = random.nextInt(101);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chute;
    private javax.swing.JButton btn_novoJogo;
    private javax.swing.JLabel lbl_chute;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JTextField tf_chute;
    private javax.swing.JTextField tf_resultado;
    // End of variables declaration//GEN-END:variables

}