package lista06.exercicio04;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Exercicio04 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio04
     */
    public Exercicio04() {
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
        tf_numeros = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        lbl_maior = new javax.swing.JLabel();
        tf_maior = new javax.swing.JTextField();
        lbl_menor = new javax.swing.JLabel();
        tf_menor = new javax.swing.JTextField();
        lbl_media = new javax.swing.JLabel();
        tf_media = new javax.swing.JTextField();
        btn_exibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_principal.setText("Digite números separados por vírgula:");

        tf_numeros.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf_numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_numerosActionPerformed(evt);
            }
        });

        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        lbl_maior.setText("Maior >>>>");

        lbl_menor.setText("Menor >>>>");

        lbl_media.setText("Média >>>>");

        btn_exibir.setText("Exibir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_principal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_exibir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lbl_maior)
                            .addComponent(lbl_menor)
                            .addComponent(lbl_media))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_maior, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_media, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ok))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_maior)
                    .addComponent(tf_maior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_menor)
                    .addComponent(tf_menor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_media))
                .addGap(26, 26, 26)
                .addComponent(btn_exibir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        if (tf_numeros.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Não foi inserido nenhum número", "Informação", JOptionPane.WARNING_MESSAGE);
        } else {
            ArrayList<Integer> lista = new ArrayList();
            String numeros[] = tf_numeros.getText().split(",");
            for (int i = 0; i < numeros.length; i++) {
                try {
                    lista.add(Integer.valueOf(numeros[i].trim()));
                    System.out.println(lista.get(i));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "O formato inserido está incorreto.", "Informação", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            double maior = lista.get(0), menor = lista.get(0), media = 0;
            for (int i : lista) {
                if (i > maior) {
                    maior = i;
                }
                if (i < menor) {
                    menor = i;
                }
                media += i;
            }
            media = media/lista.size();
            tf_maior.setText(String.valueOf(maior));
            tf_menor.setText(String.valueOf(menor));
            tf_media.setText(String.valueOf(media));
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void tf_numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_numerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_numerosActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exibir;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel lbl_maior;
    private javax.swing.JLabel lbl_media;
    private javax.swing.JLabel lbl_menor;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JTextField tf_maior;
    private javax.swing.JTextField tf_media;
    private javax.swing.JTextField tf_menor;
    private javax.swing.JTextField tf_numeros;
    // End of variables declaration//GEN-END:variables
}
