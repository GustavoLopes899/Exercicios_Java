package lista07.exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 extends javax.swing.JFrame {

    /**
     * Creates new form Exercicio02
     */
    public Exercicio02() {
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
        lbl_nome = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        lbl_nota1 = new javax.swing.JLabel();
        tf_nota1 = new javax.swing.JTextField();
        lbl_peso1 = new javax.swing.JLabel();
        lbl_nota2 = new javax.swing.JLabel();
        tf_nota2 = new javax.swing.JTextField();
        lbl_peso2 = new javax.swing.JLabel();
        lbl_nota3 = new javax.swing.JLabel();
        tf_nota3 = new javax.swing.JTextField();
        lbl_peso3 = new javax.swing.JLabel();
        lbl_nota4 = new javax.swing.JLabel();
        tf_nota4 = new javax.swing.JTextField();
        lbl_peso4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_media = new javax.swing.JLabel();
        tf_media = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_principal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_principal.setText("Notas do Aluno");

        lbl_nome.setText("Nome:");

        lbl_nota1.setText("Nota 1:");

        lbl_peso1.setText("Peso: 2.0");

        lbl_nota2.setText("Nota 2:");

        lbl_peso2.setText("Peso: 1.0");

        lbl_nota3.setText("Nota 3:");

        lbl_peso3.setText("Peso: 2.0");

        lbl_nota4.setText("Nota 4:");

        lbl_peso4.setText("Peso: 5.0");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_media.setText("Média Final:");

        tf_media.setEditable(false);
        tf_media.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tf_nome)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_principal)
                                        .addGap(79, 79, 79))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(142, 142, 142))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lbl_nota1)
                            .addComponent(lbl_nota2)
                            .addComponent(lbl_nota3)
                            .addComponent(lbl_nota4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_peso4)
                                    .addComponent(lbl_peso3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_peso1)
                                    .addComponent(lbl_peso2))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lbl_media)
                                    .addComponent(tf_media, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_principal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_nome)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_nota1)
                    .addComponent(tf_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peso1)
                    .addComponent(lbl_media))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_nota2)
                    .addComponent(tf_nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peso2)
                    .addComponent(tf_media, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_nota3)
                    .addComponent(tf_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peso3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_nota4)
                    .addComponent(tf_nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_peso4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double nota1, nota2, nota3, nota4, media;
        String nome, status;
        try {
            nome = tf_nome.getText();
            nota1 = Double.valueOf(tf_nota1.getText());
            nota2 = Double.valueOf(tf_nota2.getText());
            nota3 = Double.valueOf(tf_nota3.getText());
            nota4 = Double.valueOf(tf_nota4.getText());
            media = ((nota1 * 2) + (nota2 * 1) + (nota3 * 2) + (nota4 * 5))/10;
            tf_media.setText(String.valueOf(media));
            status = String.format("Situação do(a) aluno(a) %s:\n", nome);
            if (media > 6) {
                status += "Aprovado!";
            } else {
                if (media < 6 && media > 3) {
                    status += "Exame";
                } else {
                    status += "Reprovado";
                }
            }
            JOptionPane.showMessageDialog(null, status, "Status do aluno", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Nota(s) inválida, tente novamente", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Exercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_media;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nota1;
    private javax.swing.JLabel lbl_nota2;
    private javax.swing.JLabel lbl_nota3;
    private javax.swing.JLabel lbl_nota4;
    private javax.swing.JLabel lbl_peso1;
    private javax.swing.JLabel lbl_peso2;
    private javax.swing.JLabel lbl_peso3;
    private javax.swing.JLabel lbl_peso4;
    private javax.swing.JLabel lbl_principal;
    private javax.swing.JTextField tf_media;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_nota1;
    private javax.swing.JTextField tf_nota2;
    private javax.swing.JTextField tf_nota3;
    private javax.swing.JTextField tf_nota4;
    // End of variables declaration//GEN-END:variables

}
