package com.mycompany.estanteremota.frames.usuario;

import com.mycompany.estanteremota.EstanteRemota;
import com.mycompany.estanteremota.classes.entitys.Estante;
import com.mycompany.estanteremota.classes.entitys.Usuario;
import com.mycompany.estanteremota.frames.warnings.WarningsInternas;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class FramePrincipalUsuario extends javax.swing.JFrame {

    private static Usuario usuario;
    private String[] dadosTexto = new String[10];
    
    private FrameCriarEstante frameCriarEstante;
    private FrameDadosTexto frameDadosTexto;
    private FrameExcluirEstante frameExcluirEstante;
    private FrameFiltrarEstante frameFiltrarEstante;

    public FramePrincipalUsuario() {
        initComponents();
        usuario = new Usuario("Sonally", "Naly", "123");
        lblNomeUsuario.setText("//bem-vindo(a), " + usuario.getNome() + "!");

        //panelEstante.setVisible(false);
        //scrollEstante.setVisible(false);
        //tableEstante.setVisible(false);
        carregarBoxEstantes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelUsuario = new javax.swing.JPanel();
        lblNomeUsuario = new javax.swing.JLabel();
        boxEstantes = new javax.swing.JComboBox<>();
        lblNomeEstanteAtual = new javax.swing.JLabel();
        backAddTexto = new javax.swing.JPanel();
        painelAddTexto = new javax.swing.JPanel();
        boxStatusTextoAdd = new javax.swing.JComboBox<>();
        lblStatusTextoAdd = new javax.swing.JLabel();
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
        lblEditoraOurevista = new javax.swing.JLabel();
        lblGeneroOuChave = new javax.swing.JLabel();
        txtFieldAnoPublicacaoAdd = new javax.swing.JTextField();
        txtFieldEditoraOuRevista = new javax.swing.JTextField();
        txtFieldGeneroOuChave = new javax.swing.JTextField();
        lblFormularioCadastro = new javax.swing.JLabel();
        btnCadastrarLivro1 = new javax.swing.JButton();
        backEstante = new javax.swing.JPanel();
        scrollEstante = new javax.swing.JScrollPane();
        tableEstante = new javax.swing.JTable();
        btnExcluirLivro = new javax.swing.JButton();
        checkBoxEditarEstante = new javax.swing.JCheckBox();
        btnSalvarEstante = new javax.swing.JButton();
        menuUsuario = new javax.swing.JMenuBar();
        btnPerfilUsuario = new javax.swing.JMenu();
        btnBoxEstantes = new javax.swing.JMenu();
        btnCriarEstante = new javax.swing.JMenuItem();
        menuExcluirEstante = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFiltrar = new javax.swing.JMenuItem();
        btnMetas = new javax.swing.JMenu();
        btnDeslogar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Usuário");
        setMaximumSize(new java.awt.Dimension(1000, 680));
        setMinimumSize(new java.awt.Dimension(1000, 680));
        setResizable(false);

        painelUsuario.setBackground(new java.awt.Color(153, 0, 153));
        painelUsuario.setMaximumSize(new java.awt.Dimension(1000, 800));
        painelUsuario.setName("Tela Principal"); // NOI18N
        painelUsuario.setPreferredSize(new java.awt.Dimension(1000, 800));
        painelUsuario.setRequestFocusEnabled(false);

        lblNomeUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setText("// bem-vindo, fulano!");

        boxEstantes.setBackground(new java.awt.Color(255, 204, 255));
        boxEstantes.setModel(boxEstantes.getModel());
        boxEstantes.setToolTipText("  \n");
        boxEstantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstantesActionPerformed(evt);
            }
        });

        lblNomeEstanteAtual.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lblNomeEstanteAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEstanteAtual.setText("-> escolha uma estante:");

        backAddTexto.setBackground(new java.awt.Color(255, 204, 255));

        painelAddTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelAddTexto.setEnabled(false);
        painelAddTexto.setMaximumSize(new java.awt.Dimension(201, 664));
        painelAddTexto.setMinimumSize(new java.awt.Dimension(201, 664));

        boxStatusTextoAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lido", "nao lido", "lendo" }));
        boxStatusTextoAdd.setToolTipText("lido\nnao lido\nlendo\n");
        boxStatusTextoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxStatusTextoAddActionPerformed(evt);
            }
        });

        lblStatusTextoAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblStatusTextoAdd.setText("status do texto: ");

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

        lblNomeTextoAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblNomeTextoAdd.setText("# nome do texto: ");

        lblAutoresTextoAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblAutoresTextoAdd.setText("# autores:");

        lblQtdPaginasAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblQtdPaginasAdd.setText("# quantidade de páginas");

        lblAnoPubliAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblAnoPubliAdd.setText("# ano de publicação:");

        lblInicioLeituraAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblInicioLeituraAdd.setText("# início da leitura: ");

        lblFimLeituraAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblFimLeituraAdd.setText("# témino da leitura: ");

        lblEditoraOurevista.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblEditoraOurevista.setText("#");

        lblGeneroOuChave.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblGeneroOuChave.setText("#");

        lblFormularioCadastro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFormularioCadastro.setText("~ FORMULÁRIO DE CADASTRO ~");

        btnCadastrarLivro1.setBackground(new java.awt.Color(153, 0, 153));
        btnCadastrarLivro1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarLivro1.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarLivro1.setText("cadastrar");
        btnCadastrarLivro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAddTextoLayout = new javax.swing.GroupLayout(painelAddTexto);
        painelAddTexto.setLayout(painelAddTextoLayout);
        painelAddTextoLayout.setHorizontalGroup(
            painelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAddTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAddTextoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(painelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxStatusTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelAddTextoLayout.createSequentialGroup()
                                .addComponent(checkBoxLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxArtigo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblFimLeituraAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelAddTextoLayout.createSequentialGroup()
                        .addGroup(painelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataChooserFimLeitura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInicioLeituraAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataChooserInicioLeitura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldGeneroOuChave)
                            .addComponent(txtFieldEditoraOuRevista)
                            .addComponent(txtFieldAnoPublicacaoAdd)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAddTextoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrarLivro1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblFormularioCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldAutoresAdd)
                            .addComponent(txtFieldQtdPaginasAdd)
                            .addComponent(lblAnoPubliAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblQtdPaginasAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(painelAddTextoLayout.createSequentialGroup()
                                .addComponent(lblNomeTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblAutoresTextoAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGeneroOuChave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFieldNomeTextoAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEditoraOurevista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(painelAddTextoLayout.createSequentialGroup()
                        .addComponent(lblStatusTextoAdd)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelAddTextoLayout.setVerticalGroup(
            painelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAddTextoLayout.createSequentialGroup()
                .addComponent(lblFormularioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblStatusTextoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxStatusTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLivro)
                    .addComponent(checkBoxArtigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeTextoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldNomeTextoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAutoresTextoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldAutoresAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQtdPaginasAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldQtdPaginasAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAnoPubliAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldAnoPublicacaoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEditoraOurevista)
                .addGap(2, 2, 2)
                .addComponent(txtFieldEditoraOuRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGeneroOuChave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldGeneroOuChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInicioLeituraAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataChooserInicioLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFimLeituraAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataChooserFimLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnCadastrarLivro1)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout backAddTextoLayout = new javax.swing.GroupLayout(backAddTexto);
        backAddTexto.setLayout(backAddTextoLayout);
        backAddTextoLayout.setHorizontalGroup(
            backAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backAddTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAddTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backAddTextoLayout.setVerticalGroup(
            backAddTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backAddTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAddTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        backEstante.setBackground(new java.awt.Color(255, 204, 255));

        scrollEstante.setBackground(new java.awt.Color(255, 255, 255));
        scrollEstante.setForeground(new java.awt.Color(255, 255, 255));

        tableEstante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Autor", "Páginas", "Status", "Lançamento", "Inicio", "Fim", "Registro", "Editora/Revista", "Tags"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableEstante.setEnabled(false);
        scrollEstante.setViewportView(tableEstante);

        btnExcluirLivro.setBackground(new java.awt.Color(153, 0, 153));
        btnExcluirLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirLivro.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirLivro.setText("excluir livro");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });

        checkBoxEditarEstante.setBackground(new java.awt.Color(255, 204, 255));
        checkBoxEditarEstante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxEditarEstante.setForeground(new java.awt.Color(153, 0, 153));
        checkBoxEditarEstante.setText("editar estante");
        checkBoxEditarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxEditarEstanteActionPerformed(evt);
            }
        });

        btnSalvarEstante.setBackground(new java.awt.Color(153, 0, 153));
        btnSalvarEstante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvarEstante.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarEstante.setText("salvar alterações");
        btnSalvarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEstanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backEstanteLayout = new javax.swing.GroupLayout(backEstante);
        backEstante.setLayout(backEstanteLayout);
        backEstanteLayout.setHorizontalGroup(
            backEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(backEstanteLayout.createSequentialGroup()
                .addContainerGap(639, Short.MAX_VALUE)
                .addComponent(checkBoxEditarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarEstante)
                .addGap(9, 9, 9)
                .addComponent(btnExcluirLivro)
                .addGap(14, 14, 14))
            .addGroup(backEstanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEstante)
                .addContainerGap())
        );
        backEstanteLayout.setVerticalGroup(
            backEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backEstanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backEstanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirLivro)
                    .addComponent(btnSalvarEstante)
                    .addComponent(checkBoxEditarEstante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelUsuarioLayout = new javax.swing.GroupLayout(painelUsuario);
        painelUsuario.setLayout(painelUsuarioLayout);
        painelUsuarioLayout.setHorizontalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelUsuarioLayout.createSequentialGroup()
                        .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNomeEstanteAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelUsuarioLayout.createSequentialGroup()
                        .addComponent(backAddTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelUsuarioLayout.setVerticalGroup(
            painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuarioLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEstanteAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxEstantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backAddTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuUsuario.setBackground(new java.awt.Color(255, 204, 255));
        menuUsuario.setMaximumSize(new java.awt.Dimension(1000, 680));
        menuUsuario.setMinimumSize(new java.awt.Dimension(1000, 680));

        btnPerfilUsuario.setText("Perfil  |");
        menuUsuario.add(btnPerfilUsuario);

        btnBoxEstantes.setText("Estante   |");

        btnCriarEstante.setText("criar estante");
        btnCriarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarEstanteActionPerformed(evt);
            }
        });
        btnBoxEstantes.add(btnCriarEstante);

        menuExcluirEstante.setText("excluir estante");
        menuExcluirEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirEstanteActionPerformed(evt);
            }
        });
        btnBoxEstantes.add(menuExcluirEstante);
        btnBoxEstantes.add(jSeparator1);

        menuFiltrar.setText("filtrar");
        menuFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFiltrarActionPerformed(evt);
            }
        });
        btnBoxEstantes.add(menuFiltrar);

        menuUsuario.add(btnBoxEstantes);

        btnMetas.setText("Metas   |");
        menuUsuario.add(btnMetas);

        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });
        menuUsuario.add(btnDeslogar);

        setJMenuBar(menuUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxArtigoActionPerformed
        if (checkBoxArtigo.isSelected()) {
            lblEditoraOurevista.setText("# nome da revista: ");
            lblGeneroOuChave.setText("# palavras-chave: ");
            lblEditoraOurevista.setVisible(true);
            lblGeneroOuChave.setVisible(true);
            txtFieldEditoraOuRevista.setVisible(true);
            txtFieldGeneroOuChave.setVisible(true);
            checkBoxLivro.setVisible(false);

        } else if (!checkBoxArtigo.isSelected()) {
            lblEditoraOurevista.setVisible(false);
            lblGeneroOuChave.setVisible(false);
            txtFieldEditoraOuRevista.setVisible(false);
            txtFieldGeneroOuChave.setVisible(false);
            checkBoxLivro.setVisible(true);

        }
    }//GEN-LAST:event_checkBoxArtigoActionPerformed

    private void checkBoxLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLivroActionPerformed
        if (checkBoxLivro.isSelected()) {
            lblEditoraOurevista.setText("# nome editora:");
            lblGeneroOuChave.setText("# gênero do livro:");
            lblEditoraOurevista.setVisible(true);
            lblGeneroOuChave.setVisible(true);
            txtFieldEditoraOuRevista.setVisible(true);
            txtFieldGeneroOuChave.setVisible(true);
            checkBoxArtigo.setVisible(false);
        } else if (!checkBoxLivro.isSelected()) {
            lblEditoraOurevista.setVisible(false);
            lblGeneroOuChave.setVisible(false);
            checkBoxArtigo.setVisible(true);
            txtFieldEditoraOuRevista.setVisible(false);
            txtFieldGeneroOuChave.setVisible(false);
        }
    }//GEN-LAST:event_checkBoxLivroActionPerformed

    private void boxStatusTextoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxStatusTextoAddActionPerformed
        if (boxStatusTextoAdd.getSelectedItem().toString() == "lido") {
            lblInicioLeituraAdd.setVisible(true);
            dataChooserInicioLeitura.setVisible(true);
            lblFimLeituraAdd.setVisible(true);
            dataChooserFimLeitura.setVisible(true);

        } else if (boxStatusTextoAdd.getSelectedItem().toString() == "nao lido") {
            lblInicioLeituraAdd.setVisible(false);
            dataChooserInicioLeitura.setVisible(false);
            lblFimLeituraAdd.setVisible(false);
            dataChooserFimLeitura.setVisible(false);

        } else if (boxStatusTextoAdd.getSelectedItem().toString() == "lendo") {
            lblInicioLeituraAdd.setVisible(true);
            dataChooserInicioLeitura.setVisible(true);
            lblFimLeituraAdd.setVisible(false);
            dataChooserFimLeitura.setVisible(false);

        }
    }//GEN-LAST:event_boxStatusTextoAddActionPerformed

    private void btnCriarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarEstanteActionPerformed
        if (frameCriarEstante == null || !frameCriarEstante.isVisible()){
            frameCriarEstante = new FrameCriarEstante();
            frameCriarEstante.setVisible(true);
            frameCriarEstante.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnCriarEstanteActionPerformed

    private void btnCadastrarLivro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivro1ActionPerformed
        limparDadosTexto();

        if (checkBoxLivro.isSelected() || checkBoxArtigo.isSelected()) {
            //iniciando variaveis
            String nomeTexto, inicioLeitura, nomeAutores, nomeEditora, fimLeitura,
            nomeGenero, nomeRevista, palavrasChave, qtdPaginas, anoPublicacao,
            statusTexto, dataRegistro;

            Date inicio = null, fim = null;

            nomeTexto = EstanteRemota.formatarEntradaString(txtFieldNomeTextoAdd.getText());
            dadosTexto[0] = nomeTexto;
            nomeAutores = EstanteRemota.formatarEntradaString(txtFieldAutoresAdd.getText());
            dadosTexto[1] = nomeAutores;
            anoPublicacao = EstanteRemota.formatarEntradaString(txtFieldAnoPublicacaoAdd.getText());
            dadosTexto[2] = anoPublicacao;
            qtdPaginas = EstanteRemota.formatarEntradaString(txtFieldQtdPaginasAdd.getText());
            dadosTexto[3] = qtdPaginas;
            statusTexto = EstanteRemota.formatarEntradaString(boxStatusTextoAdd.getSelectedItem().toString());
            dadosTexto[4] = statusTexto;

            //configurações de datas
            if (statusTexto.equals("Lido") || statusTexto.equals("Lendo")) {
                inicio = dataChooserInicioLeitura.getDate();
                inicioLeitura = EstanteRemota.formatarData(inicio);
                dadosTexto[5] = inicioLeitura;

                if (statusTexto.equals("Lido")) {
                    fim = dataChooserFimLeitura.getDate();
                    fimLeitura = EstanteRemota.formatarData(fim);
                    dadosTexto[6] = fimLeitura;
                }
                if (fim == null) {
                    dadosTexto[6] = "-";
                }
            } else if (statusTexto.equals("Nao Lido")) {
                dadosTexto[5] = "-"; //inicioLeitura
                dadosTexto[6] = "-"; //fimLeitura
            }

            dataRegistro = EstanteRemota.formatarData(new Date());
            dadosTexto[7] = dataRegistro;
            //se a data de fim é maior do que a de começo, mostra um erro
            if ((fim != null && inicio != null) && fim.before(inicio)) {
                WarningsInternas.mensagem("A data de término de leitura é maior que a de começo");
            }

            if (checkBoxLivro.isSelected()) {
                nomeEditora = EstanteRemota.formatarEntradaString(txtFieldEditoraOuRevista.getText());
                dadosTexto[8] = nomeEditora;
                nomeGenero = EstanteRemota.formatarEntradaString(txtFieldGeneroOuChave.getText());
                dadosTexto[9] = nomeGenero;
            } else if (checkBoxArtigo.isSelected()) {
                palavrasChave = EstanteRemota.formatarEntradaString(txtFieldGeneroOuChave.getText());
                dadosTexto[9] = palavrasChave;
                nomeRevista = EstanteRemota.formatarEntradaString(txtFieldEditoraOuRevista.getText());
                dadosTexto[8] = nomeRevista;
            }

            //verificar se todos os campos estão com texto
            boolean ehValido = true;
            for (String entrada : dadosTexto) {
                ehValido = EstanteRemota.verificarEntradaVazia(entrada);
                if (!ehValido) {
                    return; //ja sai do loop
                }
            }

            //verificando se é uma Estante válida
            if (boxEstantes.getSelectedIndex() > 0) {
                //mostra se as informações estão corretas
                telaConfirmacaoDados();
            } else {
                WarningsInternas.mensagem("Selecione uma Estante válida.");
            }

        } else {
            WarningsInternas.mensagem("Selecione um tipo de texto (Livro/Artigo).");
        }
    }//GEN-LAST:event_btnCadastrarLivro1ActionPerformed

    private void checkBoxEditarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxEditarEstanteActionPerformed
        if (checkBoxEditarEstante.isSelected()){
            tableEstante.setEnabled(true);
        }else{
            tableEstante.setEnabled(false);
        }
    }//GEN-LAST:event_checkBoxEditarEstanteActionPerformed

    private void btnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivroActionPerformed
        int linha = tableEstante.getSelectedRow();
        if (linha < 0){
            WarningsInternas.erro("Selecione um livro válido.");
        } else{
            DefaultTableModel tabelaEstante = 
                    (DefaultTableModel) tableEstante.getModel();
            tabelaEstante.removeRow(linha);
            WarningsInternas.erro("Livro excluido!");
        }
    }//GEN-LAST:event_btnExcluirLivroActionPerformed

    private void btnSalvarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEstanteActionPerformed

            DefaultTableModel tabelaEstante = 
                    (DefaultTableModel) tableEstante.getModel();
            
            int linhasTabelaEstante = tabelaEstante.getRowCount();
            int colunasTabelaEstante = tabelaEstante.getColumnCount();
            StringBuilder dadosEstante = new StringBuilder();
           
            
            limparDadosTexto();
            for (int i = 0; i < linhasTabelaEstante; i++){
                StringBuilder livro = new StringBuilder();
                for (int j = 0; j < colunasTabelaEstante; j++){
                    Object celula = tabelaEstante.getValueAt(i, j);
                    String dado = (celula != null) ? celula.toString() : " - ";
                    dadosTexto[j] = dado;
                }
                for (int k = 0; k < 10; k++) {
                    livro.append(dadosTexto[k]);
                    if (k != 9){
                        livro.append(" | ");
                    }    
                }
                dadosEstante.append(livro.toString());
                dadosEstante.append("\n");
                limparDadosTexto();
            }
            //escrevendo e criando nova estante
            boolean salvou = Estante.salvarEstante(EstanteRemota.diretorioDB, 
                    usuario.getLogin(), boxEstantes.getSelectedItem().toString(), dadosEstante);
            if (salvou){
                WarningsInternas.mensagem("Estante salva com sucesso!");
            }else{
                WarningsInternas.erro("Erro ao salvar os dados");
            }
             
    }//GEN-LAST:event_btnSalvarEstanteActionPerformed

    private void boxEstantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstantesActionPerformed
        if (boxEstantes.getSelectedIndex() > 0){
            limparDadosTexto();
            DefaultTableModel tabelaEstante = (DefaultTableModel) tableEstante.getModel();
            tabelaEstante.setRowCount(0); //limpa a tabela
            ArrayList<String> estante = Estante.mostrarTextos(
                    EstanteRemota.diretorioDB, 
                    usuario.getLogin(), 
                    boxEstantes.getSelectedItem().toString());
            
            if (tableEstante.getRowCount() < estante.size()){
                for (String linhaLivro : estante) {
                dadosTexto = linhaLivro.split(" \\| ");
                tabelaEstante.addRow(dadosTexto);
                }
            }
                
        }else if (boxEstantes.getSelectedItem() != "-"){
            WarningsInternas.erro("Selecione uma estante válida!");
        }
    }//GEN-LAST:event_boxEstantesActionPerformed

    private void menuExcluirEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirEstanteActionPerformed
        if (frameExcluirEstante == null || !frameExcluirEstante.isVisible()){
            frameExcluirEstante = new FrameExcluirEstante();
            frameExcluirEstante.setVisible(true);
            
        }
    }//GEN-LAST:event_menuExcluirEstanteActionPerformed

    private void menuFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFiltrarActionPerformed
        if (frameFiltrarEstante == null || !frameFiltrarEstante.isVisible()){
            frameFiltrarEstante = new FrameFiltrarEstante();
            frameFiltrarEstante.setVisible(true);
        }
    }//GEN-LAST:event_menuFiltrarActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDeslogarActionPerformed

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

    //metodos de gerais
    public void carregarBoxEstantes() {
        if (boxEstantes.getSelectedIndex() == -1){
            boxEstantes.addItem("-");
            for (int i = 0; i < usuario.getListaEstantes().length; i++) {
                String nome = usuario.getListaEstantes()[i].getName();
                nome = nome.replaceAll("\\.txt$", "");
                boxEstantes.addItem(nome);
            }
        }
    }

    public void telaConfirmacaoDados() {
        boolean ehValido;
        if (frameDadosTexto == null || !frameDadosTexto.isVisible()){
            frameDadosTexto = new FrameDadosTexto();
            frameDadosTexto.setVisible(true);
            frameDadosTexto.setLocationRelativeTo(null);
            ehValido = frameDadosTexto.setTexto(dadosTexto, checkBoxLivro, checkBoxArtigo);
            
            if(ehValido){
                ehValido = false;
                ehValido = frameDadosTexto.criarTexto(dadosTexto, usuario.getLogin(), checkBoxLivro, checkBoxArtigo,
                        boxEstantes.getSelectedItem().toString());
                if (ehValido){
                    txtFieldNomeTextoAdd.setText("");
                    txtFieldAutoresAdd.setText("");
                    txtFieldQtdPaginasAdd.setText("");
                    txtFieldAnoPublicacaoAdd.setText("");
                    dataChooserInicioLeitura.setDate(null);
                    dataChooserFimLeitura.setDate(null);
                    txtFieldEditoraOuRevista.setText("");
                    txtFieldGeneroOuChave.setText("");
                }
            } else{
                WarningsInternas.erro("Erro ao criar texto.");
            }
        }
    }
    
    public void limparDadosTexto(){
        for (int i = 0; i < dadosTexto.length; i++){
            dadosTexto[i] = null;
        }
    }
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backAddTexto;
    private javax.swing.JPanel backEstante;
    public static javax.swing.JComboBox<String> boxEstantes;
    private javax.swing.JComboBox<String> boxStatusTextoAdd;
    private javax.swing.JMenu btnBoxEstantes;
    private javax.swing.JButton btnCadastrarLivro1;
    private javax.swing.JMenuItem btnCriarEstante;
    private javax.swing.JMenu btnDeslogar;
    private javax.swing.JButton btnExcluirLivro;
    private javax.swing.JMenu btnMetas;
    private javax.swing.JMenu btnPerfilUsuario;
    private javax.swing.JButton btnSalvarEstante;
    private javax.swing.JCheckBox checkBoxArtigo;
    private javax.swing.JCheckBox checkBoxEditarEstante;
    private javax.swing.JCheckBox checkBoxLivro;
    private com.toedter.calendar.JDateChooser dataChooserFimLeitura;
    private com.toedter.calendar.JDateChooser dataChooserInicioLeitura;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblAnoPubliAdd;
    private javax.swing.JLabel lblAutoresTextoAdd;
    private javax.swing.JLabel lblEditoraOurevista;
    private javax.swing.JLabel lblFimLeituraAdd;
    private javax.swing.JLabel lblFormularioCadastro;
    private javax.swing.JLabel lblGeneroOuChave;
    private javax.swing.JLabel lblInicioLeituraAdd;
    private javax.swing.JLabel lblNomeEstanteAtual;
    private javax.swing.JLabel lblNomeTextoAdd;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblQtdPaginasAdd;
    private javax.swing.JLabel lblStatusTextoAdd;
    private javax.swing.JMenuItem menuExcluirEstante;
    private javax.swing.JMenuItem menuFiltrar;
    private javax.swing.JMenuBar menuUsuario;
    private javax.swing.JPanel painelAddTexto;
    private javax.swing.JPanel painelUsuario;
    private javax.swing.JScrollPane scrollEstante;
    private javax.swing.JTable tableEstante;
    private javax.swing.JTextField txtFieldAnoPublicacaoAdd;
    private javax.swing.JTextField txtFieldAutoresAdd;
    private javax.swing.JTextField txtFieldEditoraOuRevista;
    private javax.swing.JTextField txtFieldGeneroOuChave;
    private javax.swing.JTextField txtFieldNomeTextoAdd;
    private javax.swing.JTextField txtFieldQtdPaginasAdd;
    // End of variables declaration//GEN-END:variables
}
