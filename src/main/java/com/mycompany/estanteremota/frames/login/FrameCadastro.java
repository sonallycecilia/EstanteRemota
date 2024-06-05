package com.mycompany.estanteremota.frames.login;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.frames.warnings.WarningsInternas;

public class FrameCadastro extends javax.swing.JFrame {
    
    private static Usuario usuario;
    
    public FrameCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCriarUsuario = new javax.swing.JButton();
        lblCriarEstante = new javax.swing.JLabel();
        txtFieldNomeCadastro = new javax.swing.JTextField();
        txtFieldLoginCadastro = new javax.swing.JTextField();
        lblCriarEstante1 = new javax.swing.JLabel();
        lblCriarEstante3 = new javax.swing.JLabel();
        txtFieldSenhaCadastro = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        btnCriarUsuario.setBackground(new java.awt.Color(153, 0, 153));
        btnCriarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCriarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCriarUsuario.setText("criar");
        btnCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarUsuarioActionPerformed(evt);
            }
        });

        lblCriarEstante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCriarEstante.setText("// nome completo:");

        txtFieldNomeCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNomeCadastroActionPerformed(evt);
            }
        });

        lblCriarEstante1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCriarEstante1.setText("// nome de login:");

        lblCriarEstante3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCriarEstante3.setText("// senha:");

        txtFieldSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSenhaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCriarUsuario)
                    .addComponent(lblCriarEstante3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldNomeCadastro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCriarEstante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCriarEstante1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldLoginCadastro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldSenhaCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblCriarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCriarEstante1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldLoginCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCriarEstante3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCriarUsuario)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarUsuarioActionPerformed
        String nome, login, senha;
        
        nome = EstanteRemota.formatarEntradaString(txtFieldNomeCadastro.getText());
        login = EstanteRemota.formatarEntradaString(txtFieldLoginCadastro.getText());
        senha = EstanteRemota.formatarEntradaString(txtFieldSenhaCadastro.getText());        
        
        usuario = new Usuario(nome, login, senha);
        System.out.println(EstanteRemota.diretorioDB);
        int criou;
        criou = usuario.criarPastaUsuario(EstanteRemota.diretorioDB, usuario.getLogin());
        if (criou == 1){
            WarningsInternas.mensagem("Usuário '" + login +"' criado com sucesso!");
            dispose();
        }else if (criou < 0) {
                WarningsInternas.erro("Login '"+ login + "' já está em uso!");
        }else{
            WarningsInternas.mensagem("Erro ao criar!");
        }   
    }//GEN-LAST:event_btnCriarUsuarioActionPerformed

    private void txtFieldNomeCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNomeCadastroActionPerformed

    private void txtFieldSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSenhaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSenhaCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCriarEstante;
    private javax.swing.JLabel lblCriarEstante1;
    private javax.swing.JLabel lblCriarEstante3;
    private javax.swing.JTextField txtFieldLoginCadastro;
    private javax.swing.JTextField txtFieldNomeCadastro;
    private javax.swing.JPasswordField txtFieldSenhaCadastro;
    // End of variables declaration//GEN-END:variables
}
