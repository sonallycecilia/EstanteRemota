package com.mycompany.estanteremota.frames.usuario;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.frames.warnings.WarningsInternas;
import javax.swing.JOptionPane;

public class FrameExcluirEstante extends javax.swing.JFrame {
    private static Usuario usuario;
    
    public FrameExcluirEstante() {
        initComponents();
        usuario = new Usuario("Sonally", "Naly", "123");
        setLocationRelativeTo(null);
        carregarEstantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastrarEstante = new javax.swing.JPanel();
        lblExcluirEstante = new javax.swing.JLabel();
        btnExcluirEstante = new javax.swing.JButton();
        boxExcluirEstante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(328, 196));

        panelCadastrarEstante.setBackground(new java.awt.Color(255, 204, 255));
        panelCadastrarEstante.setMaximumSize(new java.awt.Dimension(328, 196));
        panelCadastrarEstante.setMinimumSize(new java.awt.Dimension(328, 196));
        panelCadastrarEstante.setPreferredSize(new java.awt.Dimension(328, 196));

        lblExcluirEstante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblExcluirEstante.setText("// escolha a estante que deseja excluir:");

        btnExcluirEstante.setBackground(new java.awt.Color(153, 0, 153));
        btnExcluirEstante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirEstante.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirEstante.setText("excluir");
        btnExcluirEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstanteActionPerformed(evt);
            }
        });

        boxExcluirEstante.setBackground(new java.awt.Color(153, 0, 153));
        boxExcluirEstante.setForeground(new java.awt.Color(255, 255, 255));
        boxExcluirEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxExcluirEstanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastrarEstanteLayout = new javax.swing.GroupLayout(panelCadastrarEstante);
        panelCadastrarEstante.setLayout(panelCadastrarEstanteLayout);
        panelCadastrarEstanteLayout.setHorizontalGroup(
            panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarEstanteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExcluirEstante)
                    .addGroup(panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluirEstante)
                        .addComponent(boxExcluirEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelCadastrarEstanteLayout.setVerticalGroup(
            panelCadastrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastrarEstanteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblExcluirEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boxExcluirEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluirEstante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(panelCadastrarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstanteActionPerformed
        if (boxExcluirEstante.getSelectedIndex() > 0){
            boolean excluiu = false;
            String nomeEstante = boxExcluirEstante.getSelectedItem().toString();
            int resposta  = JOptionPane.showConfirmDialog(
                    this, "Tem certeza que deseja excluir a estante '" + nomeEstante + "'?", 
                    "Confirmação de dados",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
            if (resposta == 0){
                excluiu = Estante.excluirEstante(EstanteRemota.diretorioDB,
                        usuario.getLogin(), nomeEstante + ".txt");
                if(excluiu){
                    WarningsInternas.mensagem("Estante '" + 
                            nomeEstante + "' excluida!");
                    dispose();
                } else{
                    WarningsInternas.erro("Erro ao excluir estante '" + nomeEstante +"'.");
                }
            }else if (resposta == 1){
                dispose();
            }
        } 
    }//GEN-LAST:event_btnExcluirEstanteActionPerformed

    private void boxExcluirEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxExcluirEstanteActionPerformed
        

    }//GEN-LAST:event_boxExcluirEstanteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameExcluirEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameExcluirEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameExcluirEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameExcluirEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameExcluirEstante().setVisible(true);
            }
        });
    }

    
    public void carregarEstantes(){
        for (int i = 0; i < usuario.getListaEstantes().length; i++) {
                String nome = usuario.getListaEstantes()[i].getName();
                nome = nome.replaceAll("\\.txt$", "");
                boxExcluirEstante.addItem(nome);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxExcluirEstante;
    private javax.swing.JButton btnExcluirEstante;
    private javax.swing.JLabel lblExcluirEstante;
    private javax.swing.JPanel panelCadastrarEstante;
    // End of variables declaration//GEN-END:variables
}
