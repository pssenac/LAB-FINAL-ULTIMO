/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.ModeloTabela;
import Models.ConexaoBD;
import Models.DAO;
import Models.ValidarCPF;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TelaCliente extends javax.swing.JInternalFrame {

    String sqlTabela = "select * from cliente inner join endereco on FKendereco = idendereco";
    boolean a;
    int vd = 0;
    boolean t = false;
    public DAO DAO;
    public ClienteController cli;

    public TelaCliente() {
        initComponents();
        cli = new ClienteController();
        if (!cli.logarBD()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }

        DAO = new DAO();

        DAO.carregarTabela();
        AtivarCampos(true, false, false, false, false, false, false, false, false, false, false,
                false, false);

        AtivarBotoes(true, false, false, false, false);

        LimpaCampo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbIdCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jpEndereco = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtCpf = new javax.swing.JTextField();
        lblIdend = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        lblExisteCpf = new javax.swing.JLabel();
        btnPesquisa1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("CADASTRO DE CLIENTES");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cliente_tela.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Id :");

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setEnabled(false);

        lbIdCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("CPF :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("RG :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Telefone :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Celular :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("E-Mail :");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEmail.setEnabled(false);

        jpEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("CEP :");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Logradouro :");

        txtLogradouro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLogradouro.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Bairro :");

        txtBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBairro.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Número :");

        txtNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNumero.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Complemento :");

        txtComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComplemento.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Cidade :");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCidade.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("UF :");

        txtCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCep.setEnabled(false);

        javax.swing.GroupLayout jpEnderecoLayout = new javax.swing.GroupLayout(jpEndereco);
        jpEndereco.setLayout(jpEnderecoLayout);
        jpEnderecoLayout.setHorizontalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLogradouro))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpEnderecoLayout.setVerticalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar_Cliente.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.png"))); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apagar.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete03.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCpf.setEnabled(false);
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });

        lblIdend.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIdend.setEnabled(false);
        lblIdend.setFocusable(false);

        txtRg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRg.setEnabled(false);

        txtTel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTel.setEnabled(false);

        txtCel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCel.setEnabled(false);

        lblExisteCpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblExisteCpf.setForeground(new java.awt.Color(255, 0, 51));
        lblExisteCpf.setText(".");

        btnPesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisa3.png"))); // NOI18N
        btnPesquisa1.setMaximumSize(new java.awt.Dimension(30, 30));
        btnPesquisa1.setMinimumSize(new java.awt.Dimension(30, 30));
        btnPesquisa1.setPreferredSize(new java.awt.Dimension(30, 30));
        btnPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(lbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtNome))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(lblExisteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdend, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblExisteCpf))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIdend, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel7))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1205, 674);
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc=" BOTAO ADICIONAR "> 
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        AtivarCampos(true, true, true, true, true, true, true, true, true, true, true,
                true, true);

        AtivarBotoes(false, true, false, true, true);

        LimpaCampo();
        vd = 1;
        t = false;


    }//GEN-LAST:event_btnAdicionarActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTAO LIMPAR ">
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimpaCampo();
    }//GEN-LAST:event_btnLimparActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTAO SALVAR ">
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        boolean cpf = DAO.clicpf(txtCpf.getText());
        lblExisteCpf.setText("");

        ValidarCPF valCpf = new ValidarCPF() {
        };
        if (valCpf.validaCPF(txtCpf.getText()) == true) {
            // jLabelValCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/102.png")));
            DAO dao = new DAO();
            dao.bd.getConnection();
            String buscaCpf = txtCpf.getText();
            PreparedStatement sta;
            try {
                sta = dao.bd.connection.prepareStatement("select * from cliente where cpf = ? limit 1");
                sta.setString(1, buscaCpf);
                ResultSet rs = sta.executeQuery();
                while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "CPF já cadastrado anteriormente!");
                    txtCpf.setText("");
                    txtCpf.grabFocus();
                }
            } catch (SQLException ex) {
            }
        }
            if (cpf == true && !"".equals(txtCpf.getText())) {
                pesquisaCpf(cpf);
            }

            switch (vd) {
                case 1:

                    ClienteController clicontrol = new ClienteController();
                    if (VerificarCamposVazios() == true) {
                        JOptionPane.showMessageDialog(null, "Campos obrigatórios estão vazios!");
                        a = false;
                    }

                    if (cpf != true && VerificarCamposVazios() != true) {

                        clicontrol.salvarCliente(txtNome.getText(), txtCpf.getText(), txtRg.getText(), txtNumero.getText(),
                                txtCel.getText(), txtEmail.getText(), txtCep.getText(), txtBairro.getText(),
                                txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(),
                                txtCidade.getText(), txtUf.getText());

                        AtivarCampos(false, false, false, false, false, false, false, false, false, false, false,
                                false, false);

                        AtivarBotoes(true, false, false, false, false);
                        preencherTabela(sqlTabela);
                        LimpaCampo();

                    }
                    break;

                case 2:

                    ClienteController clicontro2 = new ClienteController();

                    clicontro2.editarCliente(lbIdCliente.getText(), lblIdend.getText(), txtNome.getText(), txtCpf.getText(), txtCpf.getText(), txtNumero.getText(),
                            txtCel.getText(), txtEmail.getText(), txtCep.getText(), txtBairro.getText(),
                            txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(),
                            txtCidade.getText(), txtUf.getText());
                    AtivarCampos(false, false, false, false, false, false, false, false, false, false, false,
                            false, false);
                    preencherTabela(sqlTabela);
                    LimpaCampo();

                    break;
            }
    }//GEN-LAST:event_btnSalvarActionPerformed
    //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" PESQUISA CPF CLIENTE">
    public void pesquisaCpf(boolean cpf) {
        if (cpf == true && t != true) {
            lblExisteCpf.setText("CPF cadastrado");

        } else {
            lblExisteCpf.setText("");
        }
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" METODO SELECAO LINHA CLIENTE ">
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linhaSelecionada = jTable1.getSelectedRow();
        lbIdCliente.setText(jTable1.getValueAt(linhaSelecionada, 0).toString());
        txtNome.setText(jTable1.getValueAt(linhaSelecionada, 1).toString());
        txtCpf.setText(jTable1.getValueAt(linhaSelecionada, 2).toString());
        txtRg.setText(jTable1.getValueAt(linhaSelecionada, 3).toString());
        txtTel.setText(jTable1.getValueAt(linhaSelecionada, 4).toString());
        txtCel.setText(jTable1.getValueAt(linhaSelecionada, 5).toString());
        txtEmail.setText(jTable1.getValueAt(linhaSelecionada, 6).toString());
        txtCep.setText(jTable1.getValueAt(linhaSelecionada, 9).toString());
        txtBairro.setText(jTable1.getValueAt(linhaSelecionada, 10).toString());
        txtLogradouro.setText(jTable1.getValueAt(linhaSelecionada, 11).toString());
        txtComplemento.setText(jTable1.getValueAt(linhaSelecionada, 12).toString());
        txtNumero.setText(jTable1.getValueAt(linhaSelecionada, 13).toString());
        txtCidade.setText(jTable1.getValueAt(linhaSelecionada, 14).toString());
        txtUf.setText(jTable1.getValueAt(linhaSelecionada, 15).toString());
        lblIdend.setText(jTable1.getValueAt(linhaSelecionada, 8).toString());

        AtivarCampos(false, false, false, false, false, false, false, false, false, false, false,
                false, false);

        AtivarBotoes(false, false, true, false, true);


    }//GEN-LAST:event_jTable1MouseClicked
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTÃO ALTERAR ">
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        AtivarCampos(true, true, true, true, true, true, true, true, true, true, true,
                true, true);

        AtivarBotoes(false, true, false, false, true);
        vd = 2;
        t = true;
    }//GEN-LAST:event_btnAlterarActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="  BOTAO CANCELAR ">
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        AtivarBotoes(true, false, false, false, false);

        AtivarCampos(true, false, false, false, false, false, false, false, false, false, false,
                false, false);
        LimpaCampo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisa1ActionPerformed
        String sql = "select * from cliente inner join endereco on FKendereco = idendereco where nomeCliente like '%" + txtNome.getText() + "%' ";
        preencherTabela(sql);

    }//GEN-LAST:event_btnPesquisa1ActionPerformed

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        if (txtCpf.getText().length() > 10 && !(evt.getKeyChar() == KeyEvent.VK_DELETE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else {
            char input = evt.getKeyChar();
            if ((input < '0' || input > '9') && input != '\b') {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Caractere inválido");
            }
        }
    }//GEN-LAST:event_txtCpfKeyTyped
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR CAMPOS ">
    public void LimpaCampo() {

        lbIdCliente.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtTel.setText("");
        txtCel.setText("");
        txtEmail.setText("");

        txtCep.setText("");
        txtLogradouro.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        txtUf.setText("");

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CAMPO ">
    public void AtivarCampos(boolean c1, boolean c2, boolean c3, boolean c4, boolean c5, boolean c6, boolean c7, boolean c8, boolean c9,
            boolean c10, boolean c11, boolean c12, boolean c13) {

        txtNome.setEnabled(c1);
        txtCpf.setEnabled(c2);
        txtRg.setEnabled(c3);
        txtTel.setEnabled(c4);
        txtCel.setEnabled(c5);
        txtEmail.setEnabled(c6);

        txtCep.setEnabled(c7);
        txtLogradouro.setEnabled(c8);
        txtBairro.setEnabled(c9);
        txtNumero.setEnabled(c10);
        txtComplemento.setEnabled(c11);
        txtCidade.setEnabled(c12);
        txtUf.setEnabled(c13);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" METODO BOTAO ">
    private void AtivarBotoes(boolean addFnc, boolean gravaFnc, boolean alterarFnc,
            boolean limparFnc, boolean cancelarFnc) {

        btnAdicionar.setEnabled(addFnc);
        btnSalvar.setEnabled(gravaFnc);
        btnAlterar.setEnabled(alterarFnc);
        btnLimpar.setEnabled(limparFnc);
        btnCancelar.setEnabled(cancelarFnc);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CAMPOS VAZIOS ">
    public boolean VerificarCamposVazios() {
        if (txtBairro.getText().equals("")) {
            a = true;
        }
        if (txtCel.getText().equals("") && txtTel.getText().equals("")) {
            a = true;
        }
        if (txtCep.getText().equals("")) {
            a = true;
        }
        if (txtUf.getText().equals("")) {
            a = true;
        }
        if (txtCidade.getText().equals("")) {
            a = true;
        }
        if (txtCpf.getText().equals("")) {
            a = true;
        }
        if (txtLogradouro.getText().equals("")) {
            a = true;
        }
        if (txtNome.getText().equals("")) {
            a = true;
        }
        if (txtNumero.getText().equals("")) {
            a = true;
        }
        if (txtRg.getText().equals("")) {
            a = true;
        }
        return a;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA CLIENTE">
    public void preencherTabela(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Id", "nome", "Cpf", "Rg", "Telefone", "celular", "email", "fkend",
            "idEndereço", "Cep", "bairro", "logradouro", "complemento", "numero", "cidade", "estado"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                dados.add(new Object[]{dao.resultSet.getString("idcliente"), dao.resultSet.getString("nomeCliente"), dao.resultSet.getString("cpf"),
                    dao.resultSet.getString("rg"), dao.resultSet.getString("telefone"), dao.resultSet.getString("celular"),
                    dao.resultSet.getString("email"), dao.resultSet.getString("FKendereco"), dao.resultSet.getString("idendereco"),
                    dao.resultSet.getString("cep"), dao.resultSet.getString("bairro"), dao.resultSet.getString("logradouro"),
                    dao.resultSet.getString("complemento"), dao.resultSet.getString("numero"), dao.resultSet.getString("cidade"),
                    dao.resultSet.getString("estado")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + " Campo incorreto ou Cliente inexistente, a Pesquisa não pode ser feita");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jTable1.setModel(model);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jTable1.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(110);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(7).setResizable(false);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(8).setResizable(false);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(9).setResizable(false);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(10).setResizable(false);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(11).setResizable(false);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(12).setResizable(false);
        jTable1.getColumnModel().getColumn(13).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(13).setResizable(false);
        jTable1.getColumnModel().getColumn(14).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(14).setResizable(false);
        jTable1.getColumnModel().getColumn(15).setPreferredWidth(-1);
        jTable1.getColumnModel().getColumn(15).setResizable(false);

        jTable1.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisa1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpEndereco;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lblExisteCpf;
    private javax.swing.JLabel lblIdend;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
