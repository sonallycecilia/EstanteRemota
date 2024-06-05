
package com.mycompany.estanteremota.frames.login;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.frames.usuario.FramePrincipalUsuario;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.frames.warnings.WarningsInternas;
import java.io.File;

public class FrameLogin extends javax.swing.JFrame {
    
    private static Usuario usuario;
    private static FramePrincipalUsuario framePrincipalUsuario;
    private static FrameCadastro frameCadastro;

    public FrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFieldSenhaLogin = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtFieldNomeLogin = new javax.swing.JTextField();
        lblEscolherEstante1 = new javax.swing.JLabel();
        lblEscolherEstante2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        txtFieldSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSenhaLoginActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(153, 0, 153));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(153, 0, 153));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtFieldNomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNomeLoginActionPerformed(evt);
            }
        });

        lblEscolherEstante1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEscolherEstante1.setForeground(new java.awt.Color(255, 255, 255));
        lblEscolherEstante1.setText("# Login");

        lblEscolherEstante2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEscolherEstante2.setForeground(new java.awt.Color(255, 255, 255));
        lblEscolherEstante2.setText("# Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNomeLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscolherEstante2)
                    .addComponent(lblEscolherEstante1)
                    .addComponent(txtFieldSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lblEscolherEstante1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEscolherEstante2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String login, senha;
        if(!txtFieldNomeLogin.getText().isEmpty()){
            login = EstanteRemota.formatarEntradaString(txtFieldNomeLogin.getText());
            senha = EstanteRemota.formatarEntradaString(txtFieldSenhaLogin.getText());

            String caminhoLogin = Usuario.caminhoDoUsuario(login);
            File pastaUsuario = new File(caminhoLogin);
            if (pastaUsuario.exists()){
                if (framePrincipalUsuario == null || !framePrincipalUsuario.isVisible()){
                    framePrincipalUsuario = new FramePrincipalUsuario();
                    framePrincipalUsuario.setVisible(true);
                    framePrincipalUsuario.setResizable(false);
                    this.dispose();
                }
            } else{
                WarningsInternas.erro("Usuário não existe!");
            }
            
        }else{
            WarningsInternas.mensagem("A área de login não pode estar vazia!");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtFieldNomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeLoginActionPerformed
        String strNomeUsuario = txtFieldNomeLogin.getText();
    }//GEN-LAST:event_txtFieldNomeLoginActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (frameCadastro == null || !frameCadastro.isVisible()){
            frameCadastro = new FrameCadastro();
            frameCadastro.setVisible(true);
            frameCadastro.setResizable(false);
            frameCadastro.setLocationRelativeTo(null);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtFieldSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSenhaLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEscolherEstante1;
    private javax.swing.JLabel lblEscolherEstante2;
    private javax.swing.JTextField txtFieldNomeLogin;
    private javax.swing.JPasswordField txtFieldSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
