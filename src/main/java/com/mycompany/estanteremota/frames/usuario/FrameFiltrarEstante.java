package com.mycompany.estanteremota.frames.usuario;

public class FrameFiltrarEstante extends javax.swing.JFrame {

    public FrameFiltrarEstante() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFiltrarEstante = new javax.swing.JPanel();
        lblEscolherEstante = new javax.swing.JLabel();
        btnAplicarFiltro = new javax.swing.JButton();
        boxEscolherFiltro = new javax.swing.JComboBox<>();
        boxEscolherEstante = new javax.swing.JComboBox<>();
        lblEscolherFiltro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelFiltrarEstante.setBackground(new java.awt.Color(255, 204, 255));

        lblEscolherEstante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEscolherEstante.setText("#1 escolha a estante que deseja filtrar:");

        btnAplicarFiltro.setBackground(new java.awt.Color(153, 0, 153));
        btnAplicarFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicarFiltro.setText("aplicar");
        btnAplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarFiltroActionPerformed(evt);
            }
        });

        boxEscolherFiltro.setBackground(new java.awt.Color(153, 0, 153));
        boxEscolherFiltro.setForeground(new java.awt.Color(255, 255, 255));
        boxEscolherFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEscolherFiltroActionPerformed(evt);
            }
        });

        boxEscolherEstante.setBackground(new java.awt.Color(153, 0, 153));
        boxEscolherEstante.setForeground(new java.awt.Color(255, 255, 255));
        boxEscolherEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEscolherEstanteActionPerformed(evt);
            }
        });

        lblEscolherFiltro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEscolherFiltro.setText("#2 escolha o tipo de filtro:");

        javax.swing.GroupLayout panelFiltrarEstanteLayout = new javax.swing.GroupLayout(panelFiltrarEstante);
        panelFiltrarEstante.setLayout(panelFiltrarEstanteLayout);
        panelFiltrarEstanteLayout.setHorizontalGroup(
            panelFiltrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrarEstanteLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelFiltrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAplicarFiltro)
                    .addGroup(panelFiltrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boxEscolherFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxEscolherEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEscolherEstante)
                        .addComponent(lblEscolherFiltro)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelFiltrarEstanteLayout.setVerticalGroup(
            panelFiltrarEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrarEstanteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblEscolherEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxEscolherEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEscolherFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(boxEscolherFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAplicarFiltro)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFiltrarEstante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFiltrarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarFiltroActionPerformed


    }//GEN-LAST:event_btnAplicarFiltroActionPerformed

    private void boxEscolherFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEscolherFiltroActionPerformed

    }//GEN-LAST:event_boxEscolherFiltroActionPerformed

    private void boxEscolherEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEscolherEstanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEscolherEstanteActionPerformed

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
            java.util.logging.Logger.getLogger(FrameFiltrarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFiltrarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFiltrarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFiltrarEstante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFiltrarEstante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEscolherEstante;
    private javax.swing.JComboBox<String> boxEscolherFiltro;
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JLabel lblEscolherEstante;
    private javax.swing.JLabel lblEscolherFiltro;
    private javax.swing.JPanel panelFiltrarEstante;
    // End of variables declaration//GEN-END:variables
}
