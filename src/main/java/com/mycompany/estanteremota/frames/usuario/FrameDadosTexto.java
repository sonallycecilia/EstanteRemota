package com.mycompany.estanteremota.frames.usuario;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.classes.models.Artigo;
import com.mycompany.estanteremota.classes.models.Livro;
import com.mycompany.estanteremota.classes.models.Texto;
import javax.swing.JCheckBox;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class FrameDadosTexto extends javax.swing.JFrame {
    public static Texto texto;
    public static Usuario usuario;
    
    public FrameDadosTexto() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConfirmarDadosTexto = new javax.swing.JPanel();
        lblConfirmacaoDados = new javax.swing.JLabel();
        btnConfirmarDados = new javax.swing.JButton();
        scrollConfirmarDados = new javax.swing.JScrollPane();
        txtPaneConfirmarDados = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificar Dados do Texto");

        panelConfirmarDadosTexto.setBackground(new java.awt.Color(255, 204, 255));

        lblConfirmacaoDados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblConfirmacaoDados.setText("// confirmação de dados do texto:");

        btnConfirmarDados.setBackground(new java.awt.Color(153, 0, 153));
        btnConfirmarDados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmarDados.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarDados.setText("confirmar");
        btnConfirmarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDadosActionPerformed(evt);
            }
        });

        txtPaneConfirmarDados.setBackground(new java.awt.Color(255, 204, 255));
        txtPaneConfirmarDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollConfirmarDados.setViewportView(txtPaneConfirmarDados);

        javax.swing.GroupLayout panelConfirmarDadosTextoLayout = new javax.swing.GroupLayout(panelConfirmarDadosTexto);
        panelConfirmarDadosTexto.setLayout(panelConfirmarDadosTextoLayout);
        panelConfirmarDadosTextoLayout.setHorizontalGroup(
            panelConfirmarDadosTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmarDadosTextoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelConfirmarDadosTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmacaoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelConfirmarDadosTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnConfirmarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollConfirmarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelConfirmarDadosTextoLayout.setVerticalGroup(
            panelConfirmarDadosTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmarDadosTextoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblConfirmacaoDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollConfirmarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmarDados)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfirmarDadosTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfirmarDadosTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDadosActionPerformed
       dispose();
    }//GEN-LAST:event_btnConfirmarDadosActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDadosTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDadosTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDadosTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDadosTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDadosTexto().setVisible(true);
            }
        });
    }
    public boolean setTexto(String[] dadosTexto, JCheckBox checkBoxLivro, JCheckBox checkBoxArtigo){
        StyledDocument config = txtPaneConfirmarDados.getStyledDocument();
        SimpleAttributeSet estiloNegrito = new SimpleAttributeSet();
        StyleConstants.setBold(estiloNegrito, true);
        try {
            config.insertString(config.getLength(), "Nome: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[0] + "\n", null);
            config.insertString(config.getLength(), "Autores: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[1] + "\n", null);
            config.insertString(config.getLength(), "Ano de publicação: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[2] + "\n", null);
            config.insertString(config.getLength(), "Total de páginas: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[3] + "\n", null);
            config.insertString(config.getLength(), "Status: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[4] + "\n", null);
            config.insertString(config.getLength(), "Começo da leitura: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[5] + "\n", null);
            config.insertString(config.getLength(), "Termino da leitura: ", estiloNegrito);
            config.insertString(config.getLength(), dadosTexto[6] + "\n", null);
            
            //variavéis especificas 
            if (checkBoxLivro.isSelected()) {
                config.insertString(config.getLength(), "Editora: ", estiloNegrito);
                config.insertString(config.getLength(), dadosTexto[8] + "\n", null);
                config.insertString(config.getLength(), "Gênero: ", estiloNegrito);
                config.insertString(config.getLength(), dadosTexto[9] + "\n", null);
            }
            if (checkBoxArtigo.isSelected()) {
                config.insertString(config.getLength(), "Revista: ", estiloNegrito);
                config.insertString(config.getLength(), dadosTexto[8] + "\n", null);
                config.insertString(config.getLength(), "Palavras-chave: ", estiloNegrito);
                config.insertString(config.getLength(), dadosTexto[9] + "\n", null);
            }
            return true;

        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean criarTexto(String[] dadosTexto, String nomeUsuario, JCheckBox checkBoxLivro, JCheckBox checkBoxArtigo, String nomeEstante){
        //convertendo as variaveis especificas
        int qtdPaginas, anoPublicacao;

        anoPublicacao = Integer.parseInt(dadosTexto[2]);
        qtdPaginas = Integer.parseInt(dadosTexto[3]);

        if (checkBoxArtigo.isSelected()) {
            texto = new Artigo(dadosTexto[0], dadosTexto[1], anoPublicacao,
                qtdPaginas, dadosTexto[4], dadosTexto[5], dadosTexto[6], dadosTexto[7],
                dadosTexto[8], dadosTexto[9]);

            Estante.escreverDados(EstanteRemota.diretorioDB,
                    nomeUsuario, "modelos\\Artigos", texto.toString());
        } else if (checkBoxLivro.isSelected()) {

            texto = new Livro(dadosTexto[0], dadosTexto[1], anoPublicacao,
                   qtdPaginas, dadosTexto[4], dadosTexto[5], dadosTexto[6], dadosTexto[7],
                   dadosTexto[8], dadosTexto[9]);

            Estante.escreverDados(EstanteRemota.diretorioDB,
                    nomeUsuario, "modelos\\Livros", texto.toString());
            }
        Estante.escreverDados(EstanteRemota.diretorioDB, 
                nomeUsuario, nomeEstante, texto.toString());
        
        if(texto != null){
            return true;
        } else {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarDados;
    private javax.swing.JLabel lblConfirmacaoDados;
    private javax.swing.JPanel panelConfirmarDadosTexto;
    private javax.swing.JScrollPane scrollConfirmarDados;
    private javax.swing.JTextPane txtPaneConfirmarDados;
    // End of variables declaration//GEN-END:variables


}
