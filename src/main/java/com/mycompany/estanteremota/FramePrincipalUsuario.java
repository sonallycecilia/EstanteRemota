package com.mycompany.estanteremota;

import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class FramePrincipalUsuario extends javax.swing.JFrame {
    private static Usuario usuario;

    public FramePrincipalUsuario() {
        initComponents();
        usuario = new Usuario("Sonally", "Naly", "123");
        lblNomeUsuario.setText("Olá, " + usuario.getNome());
        
        txtFieldNomeVar1Add.setVisible(false);
        txtFieldNomeVar2Add.setVisible(false);

        carregarBoxEstantes();
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        lblNomeUsuario = new javax.swing.JLabel();
        boxEstantes = new javax.swing.JComboBox<>();
        btnCriarEstante = new javax.swing.JButton();
        lblNomeEstanteAtual = new javax.swing.JLabel();
        jPanelAddTexto = new javax.swing.JPanel();
        boxStatusTextoAdd = new javax.swing.JComboBox<>();
        lblStatusTextoAdd = new javax.swing.JLabel();
        btnCadastrarLivro = new javax.swing.JButton();
        checkBoxLivro = new javax.swing.JCheckBox();
        checkBoxArtigo = new javax.swing.JCheckBox();
        lblNomeTextoAdd = new javax.swing.JLabel();
        txtFieldNomeTextoAdd = new javax.swing.JTextField();
        lblAutoresTextoAdd = new javax.swing.JLabel();
        txtFieldAutoresAdd = new javax.swing.JTextField();
        lblQtdPaginasAdd = new javax.swing.JLabel();
        txtFieldQtdPaginasAdd = new javax.swing.JTextField();
        lblAnoPubliAdd = new javax.swing.JLabel();
        lblInicioLeituraAdd = new javax.swing.JLabel();
        dataChooserInicioAdd = new com.toedter.calendar.JDateChooser();
        lblFimLeituraAdd = new javax.swing.JLabel();
        dataChooseFimAdd = new com.toedter.calendar.JDateChooser();
        lblNomeVar1Add = new javax.swing.JLabel();
        lblNomeVar2Add = new javax.swing.JLabel();
        txtFieldanoPublicacaoAdd = new javax.swing.JTextField();
        txtFieldNomeVar1Add = new javax.swing.JTextField();
        txtFieldNomeVar2Add = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenu.setMaximumSize(new java.awt.Dimension(800, 400));
        jPanelMenu.setName("Tela Principal"); // NOI18N

        lblNomeUsuario.setText("Olá, fulano!");

        boxEstantes.setModel(boxEstantes.getModel());
        boxEstantes.setToolTipText("  \n");
        boxEstantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstantesActionPerformed(evt);
            }
        });

        btnCriarEstante.setText("criar estante");
        btnCriarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarEstanteActionPerformed(evt);
            }
        });

        lblNomeEstanteAtual.setText("Estante atual: ");

        jPanelAddTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boxStatusTextoAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lido", "nao lido", "lendo" }));
        boxStatusTextoAdd.setToolTipText("lido\nnao lido\nlendo\n");
        boxStatusTextoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxStatusTextoAddActionPerformed(evt);
            }
        });

        lblStatusTextoAdd.setText("status do texto: ");

        btnCadastrarLivro.setText("cadastrar");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        checkBoxLivro.setText("livro");
        checkBoxLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLivroActionPerformed(evt);
            }
        });

        checkBoxArtigo.setText("artigo");
        checkBoxArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxArtigoActionPerformed(evt);
            }
        });

        lblNomeTextoAdd.setText("nome do texto: ");

        txtFieldNomeTextoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNomeTextoAddActionPerformed(evt);
            }
        });

        lblAutoresTextoAdd.setText("autores:");

        lblQtdPaginasAdd.setText("quantidade de páginas: ");

        lblAnoPubliAdd.setText("ano de publicação:");

        lblInicioLeituraAdd.setText("início da leitura: ");

        lblFimLeituraAdd.setText("témino da leitura: ");

        lblNomeVar1Add.setText(" ");

        lblNomeVar2Add.setText(" ");

        txtFieldanoPublicacaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldanoPublicacaoAddActionPerformed(evt);
            }
        });

        txtFieldNomeVar1Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNomeVar1AddActionPerformed(evt);
            }
        });

        txtFieldNomeVar2Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNomeVar2AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddTextoLayout = new javax.swing.GroupLayout(jPanelAddTexto);
        jPanelAddTexto.setLayout(jPanelAddTextoLayout);
        jPanelAddTextoLayout.setHorizontalGroup(
            jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataChooseFimAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddTextoLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(dataChooserInicioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFieldNomeVar1Add)
                    .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                        .addGroup(jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                                .addComponent(checkBoxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxArtigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNomeTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeVar1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boxStatusTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAutoresTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQtdPaginasAdd)
                                .addComponent(lblAnoPubliAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblStatusTextoAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addComponent(txtFieldNomeTextoAdd)
                                .addComponent(txtFieldAutoresAdd)
                                .addComponent(txtFieldQtdPaginasAdd)
                                .addComponent(lblInicioLeituraAdd)
                                .addComponent(lblFimLeituraAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(btnCadastrarLivro))
                                .addComponent(lblNomeVar2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldanoPublicacaoAdd)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtFieldNomeVar2Add))
                .addContainerGap())
        );
        jPanelAddTextoLayout.setVerticalGroup(
            jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblStatusTextoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStatusTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLivro)
                    .addComponent(checkBoxArtigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeTextoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNomeTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutoresTextoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldAutoresAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQtdPaginasAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldQtdPaginasAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAnoPubliAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldanoPublicacaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInicioLeituraAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataChooserInicioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFimLeituraAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataChooseFimAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeVar1Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNomeVar1Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeVar2Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldNomeVar2Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnCadastrarLivro)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNomeEstanteAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMenuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCriarEstante))
                            .addGroup(jPanelMenuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanelAddTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 398, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeUsuario)
                    .addComponent(boxEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarEstante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeEstanteAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAddTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldanoPublicacaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldanoPublicacaoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldanoPublicacaoAddActionPerformed

    private void btnCriarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarEstanteActionPerformed
        JDialog janelaCriarEstante = new JDialog();
        janelaCriarEstante.setSize(300, 200);
        janelaCriarEstante.setResizable(false);
        janelaCriarEstante.setTitle("Criar Estante");

        JTextField txtFieldNomeEstante = new JTextField();
        txtFieldNomeEstante.setBounds(50, 30, 200, 30);

        JButton btnSalvarEstante = new JButton("salvar");
        btnSalvarEstante.setBounds(100, 80, 100, 30);

        janelaCriarEstante.setLayout(null);
        janelaCriarEstante.add(txtFieldNomeEstante);
        janelaCriarEstante.add(btnSalvarEstante);
        janelaCriarEstante.setLocationRelativeTo(null);
        janelaCriarEstante.setVisible(true);

        btnSalvarEstante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeEstante;
                boolean valido = true;
                nomeEstante = txtFieldNomeEstante.getText();
                nomeEstante = EstanteRemota.formatarEntradaString(nomeEstante);
                System.out.println("Texto digitado: " + nomeEstante);
                valido = WarningsEntrada.validarEntrada(janelaCriarEstante, nomeEstante);
                if (valido){
                    Estante.criarArquivo(EstanteRemota.diretorioDB, usuario.getLogin(), nomeEstante);
                    boxEstantes.addItem(nomeEstante);
                }
                janelaCriarEstante.dispose();
            }
        });
    }//GEN-LAST:event_btnCriarEstanteActionPerformed

    private void boxEstantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstantesActionPerformed
        String nomeEstante = boxEstantes.getSelectedItem().toString();
        lblNomeEstanteAtual.setText("Estante Atual: " + nomeEstante);
    }//GEN-LAST:event_boxEstantesActionPerformed

    private void txtFieldNomeVar1AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeVar1AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNomeVar1AddActionPerformed

    private void checkBoxArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxArtigoActionPerformed
        if (checkBoxArtigo.isSelected()){
            lblNomeVar1Add.setText("nome da revista: ");
            lblNomeVar2Add.setText("palavras-chave: ");
            lblNomeVar1Add.setVisible(true);
            lblNomeVar2Add.setVisible(true);
            txtFieldNomeVar1Add.setVisible(true);
            txtFieldNomeVar2Add.setVisible(true);
            checkBoxLivro.setVisible(false);
        }
        else if (!checkBoxArtigo.isSelected()){
            lblNomeVar1Add.setVisible(false);
            lblNomeVar2Add.setVisible(false);
            txtFieldNomeVar1Add.setVisible(false);
            txtFieldNomeVar2Add.setVisible(false);
            checkBoxLivro.setVisible(true);
        }
    }//GEN-LAST:event_checkBoxArtigoActionPerformed

    private void checkBoxLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLivroActionPerformed
        if (checkBoxLivro.isSelected()){
            lblNomeVar1Add.setText("nome editora:");
            lblNomeVar2Add.setText("gênero do livro: ");
            lblNomeVar1Add.setVisible(true);
            lblNomeVar2Add.setVisible(true);
            txtFieldNomeVar1Add.setVisible(true);
            txtFieldNomeVar2Add.setVisible(true);
            checkBoxArtigo.setVisible(false);
        }
        else if (!checkBoxLivro.isSelected()) {
            lblNomeVar1Add.setVisible(false);
            lblNomeVar2Add.setVisible(false);
            checkBoxArtigo.setVisible(true);
            txtFieldNomeVar1Add.setVisible(false);
            txtFieldNomeVar2Add.setVisible(false);
        }
    }//GEN-LAST:event_checkBoxLivroActionPerformed

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        String nomeTexto, nomeAutores, inicioLeitura, nomeEditora,
        nomeGenero, nomeRevista, palavrasChaves, qtdPaginas,
        anoPublicacao, statusTexto;

        nomeTexto = txtFieldNomeTextoAdd.getText();
        nomeAutores = txtFieldAutoresAdd.getText();
        qtdPaginas = txtFieldQtdPaginasAdd.getText();
        statusTexto = boxEstantes.getSelectedItem().toString();
        inicioLeitura = dataChooserInicioAdd.getDateFormatString();
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void boxStatusTextoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxStatusTextoAddActionPerformed
        if (boxStatusTextoAdd.getSelectedItem().toString() == "lido"){
            lblInicioLeituraAdd.setVisible(true);
            dataChooserInicioAdd.setVisible(true);
            lblFimLeituraAdd.setVisible(true);
            dataChooseFimAdd.setVisible(true);
        }
        else if (boxStatusTextoAdd.getSelectedItem().toString() == "nao lido"){
            lblInicioLeituraAdd.setVisible(false);
            dataChooserInicioAdd.setVisible(false);
            lblFimLeituraAdd.setVisible(false);
            dataChooseFimAdd.setVisible(false);
        }
        else if (boxStatusTextoAdd.getSelectedItem().toString() == "lendo"){
            lblInicioLeituraAdd.setVisible(true);
            dataChooserInicioAdd.setVisible(true);
            lblFimLeituraAdd.setVisible(false);
            dataChooseFimAdd.setVisible(false);
        }
    }//GEN-LAST:event_boxStatusTextoAddActionPerformed

    private void txtFieldNomeTextoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeTextoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNomeTextoAddActionPerformed

    private void txtFieldNomeVar2AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeVar2AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNomeVar2AddActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipalUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipalUsuario().setVisible(true);

            }
        });
    }
    
    //metodos de inicialização
    public void carregarBoxEstantes() {
        boxEstantes.addItem("-");
        for (int i = 0; i < usuario.getListaEstantes().length; i++){
            String nome = usuario.getListaEstantes()[i].getName();
            nome = nome.replaceAll("\\.txt$", "");
            System.out.println(nome);
            boxEstantes.addItem(nome);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstantes;
    private javax.swing.JComboBox<String> boxStatusTextoAdd;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnCriarEstante;
    private javax.swing.JCheckBox checkBoxArtigo;
    private javax.swing.JCheckBox checkBoxLivro;
    private com.toedter.calendar.JDateChooser dataChooseFimAdd;
    private com.toedter.calendar.JDateChooser dataChooserInicioAdd;
    private javax.swing.JPanel jPanelAddTexto;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel lblAnoPubliAdd;
    private javax.swing.JLabel lblAutoresTextoAdd;
    private javax.swing.JLabel lblFimLeituraAdd;
    private javax.swing.JLabel lblInicioLeituraAdd;
    private javax.swing.JLabel lblNomeEstanteAtual;
    private javax.swing.JLabel lblNomeTextoAdd;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNomeVar1Add;
    private javax.swing.JLabel lblNomeVar2Add;
    private javax.swing.JLabel lblQtdPaginasAdd;
    private javax.swing.JLabel lblStatusTextoAdd;
    private javax.swing.JTextField txtFieldAutoresAdd;
    private javax.swing.JTextField txtFieldNomeTextoAdd;
    private javax.swing.JTextField txtFieldNomeVar1Add;
    private javax.swing.JTextField txtFieldNomeVar2Add;
    private javax.swing.JTextField txtFieldQtdPaginasAdd;
    private javax.swing.JTextField txtFieldanoPublicacaoAdd;
    // End of variables declaration//GEN-END:variables
}
