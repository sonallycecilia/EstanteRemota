package com.mycompany.estanteremota.frames;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.frames.warnings.WarningsEntrada;
import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.classes.models.Artigo;
import com.mycompany.estanteremota.classes.models.Livro;
import com.mycompany.estanteremota.classes.models.Texto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class FramePrincipalUsuario extends javax.swing.JFrame {
    private static Usuario usuario;
    private static Texto texto;
    
    public FramePrincipalUsuario() {
        initComponents();
        usuario = new Usuario("Sonally", "Naly", "123");
        lblNomeUsuario.setText("Olá, " + usuario.getNome());
        
        txtFieldEditoraOuRevista.setVisible(false);
        txtFieldGeneroOuChave.setVisible(false);

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
        dataChooserInicioLeitura = new com.toedter.calendar.JDateChooser();
        lblFimLeituraAdd = new javax.swing.JLabel();
        dataChooserFimLeitura = new com.toedter.calendar.JDateChooser();
        lblNomeVar1Add = new javax.swing.JLabel();
        lblNomeVar2Add = new javax.swing.JLabel();
        txtFieldAnoPublicacaoAdd = new javax.swing.JTextField();
        txtFieldEditoraOuRevista = new javax.swing.JTextField();
        txtFieldGeneroOuChave = new javax.swing.JTextField();

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

        txtFieldAnoPublicacaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldAnoPublicacaoAddActionPerformed(evt);
            }
        });

        txtFieldEditoraOuRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEditoraOuRevistaActionPerformed(evt);
            }
        });

        txtFieldGeneroOuChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldGeneroOuChaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAddTextoLayout = new javax.swing.GroupLayout(jPanelAddTexto);
        jPanelAddTexto.setLayout(jPanelAddTextoLayout);
        jPanelAddTextoLayout.setHorizontalGroup(
            jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataChooserFimLeitura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddTextoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dataChooserInicioLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFieldEditoraOuRevista)
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
                                .addComponent(lblNomeVar2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldAnoPublicacaoAdd)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtFieldGeneroOuChave))
                .addContainerGap())
            .addGroup(jPanelAddTextoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnCadastrarLivro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(txtFieldAnoPublicacaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInicioLeituraAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataChooserInicioLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFimLeituraAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataChooserFimLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeVar1Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldEditoraOuRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomeVar2Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldGeneroOuChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarLivro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(0, 394, Short.MAX_VALUE)))
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
                .addGap(1073, 1073, 1073))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldAnoPublicacaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldAnoPublicacaoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldAnoPublicacaoAddActionPerformed

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

    private void txtFieldEditoraOuRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEditoraOuRevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEditoraOuRevistaActionPerformed

    private void checkBoxArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxArtigoActionPerformed
        if (checkBoxArtigo.isSelected()){
            lblNomeVar1Add.setText("nome da revista: ");
            lblNomeVar2Add.setText("palavras-chave: ");
            lblNomeVar1Add.setVisible(true);
            lblNomeVar2Add.setVisible(true);
            txtFieldEditoraOuRevista.setVisible(true);
            txtFieldGeneroOuChave.setVisible(true);
            checkBoxLivro.setVisible(false);
        }
        else if (!checkBoxArtigo.isSelected()){
            lblNomeVar1Add.setVisible(false);
            lblNomeVar2Add.setVisible(false);
            txtFieldEditoraOuRevista.setVisible(false);
            txtFieldGeneroOuChave.setVisible(false);
            checkBoxLivro.setVisible(true);
        }
    }//GEN-LAST:event_checkBoxArtigoActionPerformed

    private void checkBoxLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLivroActionPerformed
        if (checkBoxLivro.isSelected()){
            lblNomeVar1Add.setText("nome editora:");
            lblNomeVar2Add.setText("gênero do livro:");
            lblNomeVar1Add.setVisible(true);
            lblNomeVar2Add.setVisible(true);
            txtFieldEditoraOuRevista.setVisible(true);
            txtFieldGeneroOuChave.setVisible(true);
            checkBoxArtigo.setVisible(false);
        }
        else if (!checkBoxLivro.isSelected()) {
            lblNomeVar1Add.setVisible(false);
            lblNomeVar2Add.setVisible(false);
            checkBoxArtigo.setVisible(true);
            txtFieldEditoraOuRevista.setVisible(false);
            txtFieldGeneroOuChave.setVisible(false);
        }
    }//GEN-LAST:event_checkBoxLivroActionPerformed

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        if (checkBoxLivro.isSelected() || checkBoxArtigo.isSelected()){
            //iniciando variaveis
            String nomeTexto, inicioLeitura, nomeAutores, nomeEditora, fimLeitura,
            nomeGenero, nomeRevista, palavrasChave, qtdPaginas, anoPublicacao, 
            statusTexto, dataRegistro;
            Date inicio = null, fim = null;
            String[] validarEntrada = new String[10];
            
            nomeTexto = EstanteRemota.formatarEntradaString(txtFieldNomeTextoAdd.getText());
            validarEntrada[0] = nomeTexto;
            nomeAutores = EstanteRemota.formatarEntradaString(txtFieldAutoresAdd.getText());
            validarEntrada[1] = nomeAutores;
            anoPublicacao = EstanteRemota.formatarEntradaString(txtFieldAnoPublicacaoAdd.getText());
            validarEntrada[2] = anoPublicacao;
            qtdPaginas = EstanteRemota.formatarEntradaString(txtFieldQtdPaginasAdd.getText());
            validarEntrada[3] = qtdPaginas;
            statusTexto = EstanteRemota.formatarEntradaString(boxStatusTextoAdd.getSelectedItem().toString());
            validarEntrada[4] = statusTexto;
            
            //configurações de datas
            if (statusTexto.equals("Lido") || statusTexto.equals("Lendo")){
                inicio = dataChooserInicioLeitura.getDate();
                inicioLeitura = EstanteRemota.formatarData(inicio);
                validarEntrada[5] = inicioLeitura;
                
                if(statusTexto.equals("Lido")){
                fim = dataChooserFimLeitura.getDate();
                fimLeitura = EstanteRemota.formatarData(fim);
                validarEntrada[6] = fimLeitura;
                }
                if (fim == null){
                    validarEntrada[6] = "-";
                }
            } else if (statusTexto.equals("Nao Lido")){
                validarEntrada[5] = "-"; //inicioLeitura
                validarEntrada[6] = "-"; //fimLeitura
            }
            
            dataRegistro = EstanteRemota.formatarData(new Date());
            validarEntrada[7] = dataRegistro;
            //se a data de fim é maior do que a de começo, mostra um erro
            if ((fim != null && inicio != null) && fim.before(inicio)){
                JOptionPane.showMessageDialog(null, 
                "A data de término de leitura é maior que a de começo",
                "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            
            if (checkBoxLivro.isSelected()){
                nomeEditora = EstanteRemota.formatarEntradaString(txtFieldEditoraOuRevista.getText());
                validarEntrada[8] = nomeEditora;
                nomeGenero = EstanteRemota.formatarEntradaString(txtFieldGeneroOuChave.getText());
                validarEntrada[9] = nomeGenero;
                
            } else if (checkBoxArtigo.isSelected()){
                palavrasChave = EstanteRemota.formatarEntradaString(txtFieldGeneroOuChave.getText());
                validarEntrada[9] = palavrasChave;
                nomeRevista = EstanteRemota.formatarEntradaString(txtFieldEditoraOuRevista.getText());
                validarEntrada[8] = nomeRevista;

            }
            
            //verificar se todos os campos estão com texto
            boolean ehValido = true;
            for (String entrada : validarEntrada){
                ehValido = EstanteRemota.verificarEntradaVazia(entrada);
                if (!ehValido){
                    return; //ja sai do loop
                }
            }
            
            //verificando se é uma Estante válida
            if (boxEstantes.getSelectedItem() != "-"){
                //mostra se as informações estão corretas
                telaConfirmacaoDados(validarEntrada);
                for (String s : validarEntrada)
                    System.out.println(s);
            } else{
                JOptionPane.showMessageDialog(null, "Selecione uma Estante válida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um tipo de texto (Livro/Artigo).", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void boxStatusTextoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxStatusTextoAddActionPerformed
        if (boxStatusTextoAdd.getSelectedItem().toString() == "lido"){
            lblInicioLeituraAdd.setVisible(true);
            dataChooserInicioLeitura.setVisible(true);
            lblFimLeituraAdd.setVisible(true);
            dataChooserFimLeitura.setVisible(true);
        }
        else if (boxStatusTextoAdd.getSelectedItem().toString() == "nao lido"){
            lblInicioLeituraAdd.setVisible(false);
            dataChooserInicioLeitura.setVisible(false);
            lblFimLeituraAdd.setVisible(false);
            dataChooserFimLeitura.setVisible(false);
        }
        else if (boxStatusTextoAdd.getSelectedItem().toString() == "lendo"){
            lblInicioLeituraAdd.setVisible(true);
            dataChooserInicioLeitura.setVisible(true);
            lblFimLeituraAdd.setVisible(false);
            dataChooserFimLeitura.setVisible(false);
        }
    }//GEN-LAST:event_boxStatusTextoAddActionPerformed

    private void txtFieldNomeTextoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNomeTextoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNomeTextoAddActionPerformed

    private void txtFieldGeneroOuChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldGeneroOuChaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldGeneroOuChaveActionPerformed

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
    
    public void telaConfirmacaoDados(String[] array){
        JDialog janelaConfirmarDadosTexto = new JDialog();
        janelaConfirmarDadosTexto.setSize(300, 300);
        janelaConfirmarDadosTexto.setResizable(false);
        janelaConfirmarDadosTexto.setTitle("Confirmar Dados Cadastrados");

        JPanel panelDados = new JPanel(null); // Usando null layout para manter setBounds
        panelDados.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adiciona margens internas

        JTextPane textoPane = new JTextPane();
        textoPane.setEditable(false); // Torna o JTextPane não editável
        StyledDocument config = textoPane.getStyledDocument();
        SimpleAttributeSet estiloNegrito = new SimpleAttributeSet();
        StyleConstants.setBold(estiloNegrito, true);

        //manipulação de array
        String nomeAutores, generos, chaves;
        ArrayList<String> arrNomeAutores = new ArrayList<>();
        ArrayList<String> arrGenero = new ArrayList<>();
        ArrayList<String> arrPalavrasChave = new ArrayList<>();
        
        if(array[1] != null){
            for (String autor : array[2].split(" "))
                    arrNomeAutores.add(autor);
        }
        nomeAutores = String.join(Texto.SEPARADOR_STRING, arrNomeAutores);

        try {
            config.insertString(config.getLength(), "Nome: ", estiloNegrito);
            config.insertString(config.getLength(), array[0] + "\n", null);
            config.insertString(config.getLength(), "Autores: ", estiloNegrito);
            config.insertString(config.getLength(), array[1] + "\n", null);
            config.insertString(config.getLength(), "Ano de publicação: ", estiloNegrito);
            config.insertString(config.getLength(), nomeAutores + "\n", null);
            config.insertString(config.getLength(), "Total de páginas: ", estiloNegrito);
            config.insertString(config.getLength(), array[3] + "\n", null);
            config.insertString(config.getLength(), "Status: ", estiloNegrito);
            config.insertString(config.getLength(), array[4] + "\n", null);
            config.insertString(config.getLength(), "Começo da leitura: ", estiloNegrito);
            config.insertString(config.getLength(), array[5] + "\n", null);
            config.insertString(config.getLength(), "Termino da leitura: ", estiloNegrito);
            config.insertString(config.getLength(), array[6] + "\n", null);
                        
            //variavéis especificas 
            if (checkBoxLivro.isSelected()) {
                if(array[9] != null){
                    for (String genero : array[9].split(" "))
                            arrGenero.add(genero);
                }
                generos = String.join(Texto.SEPARADOR_STRING, arrGenero);
            
                config.insertString(config.getLength(), "Editora: ", estiloNegrito);
                config.insertString(config.getLength(), array[8] + "\n", null);
                config.insertString(config.getLength(), "Gênero: ", estiloNegrito);
                config.insertString(config.getLength(), generos + "\n", null);
            }
            if (checkBoxArtigo.isSelected()) {
                if(array[9] != null){
                    for (String chave : array[9].split(" "))
                            arrPalavrasChave.add(chave);
                }
                chaves = String.join(Texto.SEPARADOR_STRING, arrPalavrasChave);
                config.insertString(config.getLength(), "Revista: ", estiloNegrito);
                config.insertString(config.getLength(), array[8] + "\n", null);
                config.insertString(config.getLength(), "Palavras-chave: ", estiloNegrito);
                config.insertString(config.getLength(), chaves + "\n", null);
            }
            textoPane.setBounds(20, 20, 200, 200); // Definindo o tamanho e posição
            panelDados.add(textoPane);
            
            JButton btnConfirmarDadosTexto = new JButton("confirmar dados");
            btnConfirmarDadosTexto.setBounds(120, 220, 100, 30); // Ajuste das coordenadas X e Y
            panelDados.add(btnConfirmarDadosTexto);

            janelaConfirmarDadosTexto.add(panelDados);
            janelaConfirmarDadosTexto.setVisible(true);

            // Adicionando ActionListener para o botão "confirmar"
            btnConfirmarDadosTexto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //convertendo as variaveis especificas
                    int qtdPaginas, anoPublicacao;
                    
                    anoPublicacao = Integer.parseInt(array[2]);
                    qtdPaginas = Integer.parseInt(array[3]);
                 
                    if (checkBoxArtigo.isSelected()) {
                        
                        texto = new Artigo(array[0], arrNomeAutores, anoPublicacao,
                                qtdPaginas, array[4], array[5], array[6], array[7], 
                                array[8], arrPalavrasChave);

                        Estante.escreverDados(EstanteRemota.diretorioDB,
                                usuario.getLogin(), "modelos\\Artigos", texto.toString());
                    } else if (checkBoxLivro.isSelected()) {
                        
                        texto = new Livro(array[0], arrNomeAutores, anoPublicacao,
                                qtdPaginas, array[4], array[5], array[6], array[7], 
                                array[8], arrGenero);

                        Estante.escreverDados(EstanteRemota.diretorioDB,
                                usuario.getLogin(), "modelos\\Livros", texto.toString());
                    }

                    Estante.escreverDados(EstanteRemota.diretorioDB, usuario.getLogin(),
                            boxEstantes.getSelectedItem().toString(), texto.toString());

                    // Limpando os campos
                    txtFieldNomeTextoAdd.setText("");
                    txtFieldAutoresAdd.setText("");
                    txtFieldQtdPaginasAdd.setText("");
                    txtFieldAnoPublicacaoAdd.setText("");
                    txtFieldEditoraOuRevista.setText("");
                    txtFieldGeneroOuChave.setText("");
                    dataChooserInicioLeitura.setDate(null);
                    dataChooserFimLeitura.setDate(null);
                    janelaConfirmarDadosTexto.dispose();
                }
            });

        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstantes;
    private javax.swing.JComboBox<String> boxStatusTextoAdd;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnCriarEstante;
    private javax.swing.JCheckBox checkBoxArtigo;
    private javax.swing.JCheckBox checkBoxLivro;
    private com.toedter.calendar.JDateChooser dataChooserFimLeitura;
    private com.toedter.calendar.JDateChooser dataChooserInicioLeitura;
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
    private javax.swing.JTextField txtFieldAnoPublicacaoAdd;
    private javax.swing.JTextField txtFieldAutoresAdd;
    private javax.swing.JTextField txtFieldEditoraOuRevista;
    private javax.swing.JTextField txtFieldGeneroOuChave;
    private javax.swing.JTextField txtFieldNomeTextoAdd;
    private javax.swing.JTextField txtFieldQtdPaginasAdd;
    // End of variables declaration//GEN-END:variables
}
