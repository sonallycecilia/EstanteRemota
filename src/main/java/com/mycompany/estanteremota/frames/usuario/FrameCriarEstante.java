package com.mycompany.estanteremota.frames.usuario;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.frames.warnings.WarningsInternas;
import javax.swing.JOptionPane;

public class FrameCriarEstante extends javax.swing.JFrame {
    public static Usuario usuario;
    
    public FrameCriarEstante() {
        initComponents();
        setLocationRelativeTo(null);
        usuario = new Usuario("Sonally", "Naly", "123");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastrarEstante = new javax.swing.JPanel();
        txtFieldNomeCriarEstante = new javax.swing.JTextField();
        lblCriarEstante = new javax.swing.JLabel();
        btnSalvarEstante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Estante");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelCadastrarEstante.setBackground(new java.awt.Color(255, 204, 255));

        lblCriarEstante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCriarEstante.setText("// escolha o nome da estante:");

        btnSalvarEstante.setBackground(new java.awt.Color(153, 0, 153));
        btnSalvarEstante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarEstante.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarEstante.setText("salvar");
        btnSalvarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastrarEstanteLayout = new javax.swing.GroupLayout(panelCadastrarEstante);
        panelCadastrarEstante.setLayout(panelCadastrarEstanteLayout);
        panelCadastrarEstanteLayout.setHorizontalGroup(
            panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastrarEstanteLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarEstante)
                    .addGroup(panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFieldNomeCriarEstante)
                        .addComponent(lblCriarEstante, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        panelCadastrarEstanteLayout.setVerticalGroup(
            panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastrarEstanteLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblCriarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldNomeCriarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarEstante)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadastrarEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadastrarEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstanteActionPerformed
        String nomeEstante;
        boolean ehValido;
        nomeEstante = txtFieldNomeCriarEstante.getText();
        nomeEstante = EstanteRemota.formatarEntradaString(nomeEstante);
        ehValido = WarningsInternas.validarEntradaVazia(nomeEstante);
        if (ehValido){
            int resposta = JOptionPane.showConfirmDialog(
                    this, "O nome '" + nomeEstante + "' está correto?", 
                    "Confirmação de dados",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
            if (resposta == 0){
                boolean existe;
                existe = Estante.criarEstante(EstanteRemota.diretorioDB, usuario.getLogin(), nomeEstante);
                dispose();
                if (existe){
                    WarningsInternas.erro("Já existe uma estante com esse nome.");
                }
            }
        }
    }//GEN-LAST:event_btnSalvarEstanteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCriarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCriarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCriarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCriarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCriarEstante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarEstante;
    private javax.swing.JLabel lblCriarEstante;
    private javax.swing.JPanel panelCadastrarEstante;
    private javax.swing.JTextField txtFieldNomeCriarEstante;
    // End of variables declaration//GEN-END:variables
}
