/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.FornecedorController;
import Controller.ModeloTabela;
import Models.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TelaFornecedor extends javax.swing.JInternalFrame {

    boolean Cpfcnpj, a;
    public DAO DAO;
    public FornecedorController frn;
    int vd = 0;
    String sql = "select * from fornecedor inner join endereco on FKendereco = idendereco";

    public TelaFornecedor() {
        initComponents();
        frn = new FornecedorController();
        if (!frn.logarBD()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }
        DAO = new DAO();

        DAO.carregarTabela2();
        preencherTabela(sql);
        Limpar();
        AtivarCampos(/*true, true,*/true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        AtivarBotao(true, false, false, false, false, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEndereco = new javax.swing.JPanel();
        lblCep = new javax.swing.JLabel();
        lblLog = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblNum = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblComple = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUf = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCel = new javax.swing.JLabel();
        txtRepresentante = new javax.swing.JTextField();
        lblFixo = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtEmailRepresentante = new javax.swing.JTextField();
        txtContatoFixo = new javax.swing.JTextField();
        txtContatoCel = new javax.swing.JTextField();
        jpFornecedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblIdFornecedor = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpEmpresa = new javax.swing.JPanel();
        lblTipoCod = new javax.swing.JLabel();
        rbCpf = new javax.swing.JRadioButton();
        rbCnpj = new javax.swing.JRadioButton();
        txtCpfCnpj = new javax.swing.JTextField();
        lblRazao = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        lblFantasia = new javax.swing.JLabel();
        txtFantasia = new javax.swing.JTextField();
        lblRamo = new javax.swing.JLabel();
        txtRamo = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblIdendereco = new javax.swing.JLabel();

        setClosable(true);
        setTitle("FORNECEDOR");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaForn.png"))); // NOI18N

        jpEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lblCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCep.setText("CEP :");

        lblLog.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblLog.setText("Logradouro :");

        txtLogradouro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblBairro.setText("Bairro :");

        txtBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNum.setText("Número :");

        txtNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblComple.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblComple.setText("Complemento :");

        txtComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCidade.setText("Cidade :");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblUf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUf.setText("UF :");

        txtCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtUf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jpEnderecoLayout = new javax.swing.GroupLayout(jpEndereco);
        jpEndereco.setLayout(jpEnderecoLayout);
        jpEnderecoLayout.setHorizontalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(lblNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblComple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(lblLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLogradouro))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEnderecoLayout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblUf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpEnderecoLayout.setVerticalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLog)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComple)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCodigo.setText("Código");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Representante"));
        jPanel2.setToolTipText("");

        lblNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNome.setText("Nome:");

        lblCel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCel.setText("Contato Celular:");

        txtRepresentante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblFixo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFixo.setText("Contato Fixo:");

        lblemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblemail.setText("E-Mai Representante:");

        txtEmailRepresentante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtContatoFixo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtContatoCel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContatoFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContatoCel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblemail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFixo)
                    .addComponent(txtContatoFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel)
                    .addComponent(txtContatoCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtEmailRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Fornecedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

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

        javax.swing.GroupLayout jpFornecedorLayout = new javax.swing.GroupLayout(jpFornecedor);
        jpFornecedor.setLayout(jpFornecedorLayout);
        jpFornecedorLayout.setHorizontalGroup(
            jpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpFornecedorLayout.setVerticalGroup(
            jpFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblIdFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIdFornecedor.setText("123");

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addFornecedor.png"))); // NOI18N
        btnAdicionar.setToolTipText("Novo Fornecedor");
        btnAdicionar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.png"))); // NOI18N
        btnGravar.setToolTipText("Salvar");
        btnGravar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnGravar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnGravar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apagar.png"))); // NOI18N
        btnApagar.setToolTipText("Apagar");
        btnApagar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnApagar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnApagar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/EditarFornecedor.png"))); // NOI18N
        btnAlterar.setToolTipText("Editar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAlterar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAlterar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete03.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCancelar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCancelar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jpEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));

        lblTipoCod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTipoCod.setText("Tipo de Código: ");

        rbCpf.setText("CPF");
        rbCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCpfMouseClicked(evt);
            }
        });

        rbCnpj.setText("CNPJ");
        rbCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbCnpjMouseClicked(evt);
            }
        });

        txtCpfCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblRazao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRazao.setText("Razão Social:");

        txtNomeEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblFantasia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFantasia.setText("Nome Fantasia :");

        txtFantasia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblRamo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRamo.setText("Atividade Econômica Principal :");

        txtRamo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisa.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar");
        btnPesquisar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEmpresaLayout = new javax.swing.GroupLayout(jpEmpresa);
        jpEmpresa.setLayout(jpEmpresaLayout);
        jpEmpresaLayout.setHorizontalGroup(
            jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpEmpresaLayout.createSequentialGroup()
                                .addComponent(lblTipoCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbCnpj)))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addComponent(lblRazao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEmpresa))
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addComponent(lblFantasia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFantasia))
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addComponent(lblRamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRamo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdendereco)
                .addContainerGap())
        );
        jpEmpresaLayout.setVerticalGroup(
            jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbCpf)
                            .addComponent(rbCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEmpresaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFantasia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmpresaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdendereco)
                        .addGap(7, 7, 7)))
                .addGroup(jpEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRamo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdFornecedor)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jpFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jpEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="BOTAO ADICIONAR">
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        AtivarCampos(/*true, true,*/true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        AtivarBotao(false, true, true, false, false, true);
        Limpar();
        vd = 1;
    }//GEN-LAST:event_btnAdicionarActionPerformed
    //</editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="BOTAO GRAVAR">
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        boolean cnpj = DAO.pesquisaCnpj(txtCpfCnpj.getText());
        JOptionPane.showMessageDialog(null, cnpj);

        switch (vd) {

            case 1:
                FornecedorController forcontroller = new FornecedorController();
                if (VerificarCamops() == true) {
                    JOptionPane.showMessageDialog(null, "Campos Obrigatorios não preenchidos!");
                    a = false;
                } else {
                    String jj = forcontroller.salvarFornecedor(txtCpfCnpj.getText(), txtNomeEmpresa.getText(), txtFantasia.getText(),
                            txtRamo.getText(), txtRepresentante.getText(),
                            txtContatoFixo.getText(), txtContatoCel.getText(), txtEmailRepresentante.getText(),
                            txtCep.getText(), txtBairro.getText(),
                            txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(),
                            txtCidade.getText(), txtUf.getText());
                    JOptionPane.showMessageDialog(null, jj);
                    preencherTabela(sql);
                    Limpar();
                    AtivarCampos(/*true, true,*/true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                    AtivarBotao(true, false, false, false, true, true);
                }

                break;

            case 2:
                FornecedorController forcontrol = new FornecedorController();

               String jj =  forcontrol.alterarFornecedor(lblIdFornecedor.getText(), lblIdendereco.getText(), txtCpfCnpj.getText(), txtNomeEmpresa.getText(), txtFantasia.getText(),
                        txtRamo.getText(), txtRepresentante.getText(),
                        txtContatoFixo.getText(), txtContatoCel.getText(), txtEmailRepresentante.getText(),
                        txtCep.getText(), txtBairro.getText(),
                        txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(),
                        txtCidade.getText(), txtUf.getText());
                JOptionPane.showMessageDialog(null, jj);

                preencherTabela(sql);

                break;

        }


    }//GEN-LAST:event_btnGravarActionPerformed
    //</editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="BOTAO APAGAR">
    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        Limpar();
    }//GEN-LAST:event_btnApagarActionPerformed
    //</editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="BOTAO ALTERAR">
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AtivarCampos(/*true, true,*/true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
        AtivarBotao(false, true, false, true, false, true);
        vd = 2;


    }//GEN-LAST:event_btnAlterarActionPerformed
    //</editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="BOTAO CANCELAR">
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpar();
        AtivarCampos(/*true, true,*/true, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        AtivarBotao(true, false, false, false, false, false);
    }//GEN-LAST:event_btnCancelarActionPerformed
    //</editor-fold> 


    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        /* if (Cpfcnpj) {

        }*/
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rbCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCpfMouseClicked
        //Cpfcnpj = true;
    }//GEN-LAST:event_rbCpfMouseClicked

    private void rbCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbCnpjMouseClicked
        //Cpfcnpj = false;
    }//GEN-LAST:event_rbCnpjMouseClicked

    // <editor-fold defaultstate="collapsed" desc="METODO LINHA SELECIONADA ">
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int linhaSelecionada = jTable1.getSelectedRow();

        lblIdFornecedor.setText(jTable1.getValueAt(linhaSelecionada, 0).toString());
        txtCpfCnpj.setText(jTable1.getValueAt(linhaSelecionada, 1).toString());
        txtNomeEmpresa.setText(jTable1.getValueAt(linhaSelecionada, 2).toString());
        txtFantasia.setText(jTable1.getValueAt(linhaSelecionada, 3).toString());
        txtRamo.setText(jTable1.getValueAt(linhaSelecionada, 4).toString());
        txtRepresentante.setText(jTable1.getValueAt(linhaSelecionada, 5).toString());
        txtContatoFixo.setText(jTable1.getValueAt(linhaSelecionada, 6).toString());
        txtContatoCel.setText(jTable1.getValueAt(linhaSelecionada, 7).toString());
        txtEmailRepresentante.setText(jTable1.getValueAt(linhaSelecionada, 8).toString());
        lblIdendereco.setText(jTable1.getValueAt(linhaSelecionada, 9).toString());
        txtCep.setText(jTable1.getValueAt(linhaSelecionada, 11).toString());
        txtBairro.setText(jTable1.getValueAt(linhaSelecionada, 12).toString());
        txtLogradouro.setText(jTable1.getValueAt(linhaSelecionada, 13).toString());
        txtComplemento.setText(jTable1.getValueAt(linhaSelecionada, 14).toString());
        txtNumero.setText(jTable1.getValueAt(linhaSelecionada, 15).toString());
        txtCidade.setText(jTable1.getValueAt(linhaSelecionada, 16).toString());
        txtUf.setText(jTable1.getValueAt(linhaSelecionada, 17).toString());

        AtivarBotao(false, false, false, true, true, true);
        AtivarCampos(/*false, false,*/false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);


    }//GEN-LAST:event_jTable1MouseClicked
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="METODO ATIVAR CAMPOS">
    public void AtivarCampos(/*boolean a, boolean b, */boolean c, boolean d, boolean e, boolean f,
            boolean g, boolean h, boolean i, boolean j, boolean k, boolean l, boolean m, boolean n,
            boolean o, boolean p, boolean q) {

        //rbCpf.setEnabled(a);
        //rbCnpj.setEnabled(b);
        txtCpfCnpj.setEnabled(c);
        txtNomeEmpresa.setEnabled(d);
        txtFantasia.setEnabled(e);
        txtRamo.setEnabled(f);
        txtRepresentante.setEnabled(g);
        txtContatoFixo.setEnabled(h);
        txtContatoCel.setEnabled(i);
        txtEmailRepresentante.setEnabled(j);
        txtCep.setEnabled(k);
        txtLogradouro.setEnabled(l);
        txtBairro.setEnabled(m);
        txtNumero.setEnabled(n);
        txtComplemento.setEnabled(o);
        txtCidade.setEnabled(p);
        txtUf.setEnabled(q);

    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="METODO ATIVAR BOTOES ">
    public void AtivarBotao(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {

        btnAdicionar.setEnabled(a);
        btnGravar.setEnabled(b);
        btnApagar.setEnabled(c);
        btnAlterar.setEnabled(d);
        btnPesquisar.setEnabled(e);
        btnCancelar.setEnabled(f);
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="METODA LIMPAR CAMPOS">
    public void Limpar() {

        rbCpf.setSelected(false);
        rbCnpj.setSelected(false);
        txtCpfCnpj.setText("");
        txtNomeEmpresa.setText("");
        txtFantasia.setText("");
        txtRamo.setText("");
        txtRepresentante.setText("");
        txtContatoFixo.setText("");
        txtContatoCel.setText("");
        txtEmailRepresentante.setText("");
        txtCep.setText("");
        txtLogradouro.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        txtUf.setText("");
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="METODO CAMPOS VAZIOS"> 
    public boolean VerificarCamops() {
        if (txtCpfCnpj.getText().equals("")) {
            a = true;
        }
        if (txtNomeEmpresa.getText().equals("")) {
            a = true;
        }
        if (txtFantasia.getText().equals("")) {
            a = true;
        }
        if (txtRamo.getText().equals("")) {
            a = true;
        }
        if (txtRepresentante.getText().equals("")) {
            a = true;
        }
        if (txtContatoFixo.getText().equals("") && txtContatoCel.getText().equals("")) {
            a = true;
        }
        if (txtCep.getText().equals("")) {
            a = true;
        }
        if (txtLogradouro.getText().equals("")) {
            a = true;
        }
        if (txtBairro.getText().equals("")) {
            a = true;
        }
        if (txtNumero.getText().equals("")) {
            a = true;
        }
        if (txtCidade.getText().equals("")) {

        }
        if (txtUf.getText().equals("")) {
            a = true;
        }
        return a;
    }
    //</editor-fold>

    /* 
    public void CpfCnpj(int a) {
        int b = a;
        switch (b) {
            case 0:
                rbCpf.setSelected(true);
                rbCnpj.setSelected(false);
                break;
            case 1:
                rbCpf.setSelected(false);
                rbCnpj.setSelected(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERRO");
                break;
        }

    }*/
    // <editor-fold defaultstate="collapsed" desc="METODO PREENCHER TABELA">
    public void preencherTabela(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Id", "Cpf/Cnpj", "nomeEmpresa", "nomeFantasia", "ramo", "representante", "contatoFixo",
            "ContatoCel", "emailRep", "FKendereco",
            "idEndereço", "Cep", "bairro", "logradouro", "complemento", "numero", "cidade", "estado"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                dados.add(new Object[]{dao.resultSet.getString("idfornecedor"), dao.resultSet.getString("cnpjCpf"), dao.resultSet.getString("nomeEmpresa"), dao.resultSet.getString("nomeFantasia"),
                    dao.resultSet.getString("ramo"), dao.resultSet.getString("representante"), dao.resultSet.getString("contatoFixo"), dao.resultSet.getString("ContatoCel"),
                    dao.resultSet.getString("emailRep"), dao.resultSet.getString("FKendereco"), dao.resultSet.getString("idendereco"),
                    dao.resultSet.getString("cep"), dao.resultSet.getString("bairro"), dao.resultSet.getString("logradouro"),
                    dao.resultSet.getString("complemento"), dao.resultSet.getString("numero"), dao.resultSet.getString("cidade"),
                    dao.resultSet.getString("estado")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Ñ DEU");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jTable1.setModel(model);

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(250);  // define o tamanho das colunas e se será redimensionado ou não
        jTable1.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(5).setResizable(false);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(6).setResizable(false);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(7).setResizable(false);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(8).setResizable(false);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(9).setResizable(false);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(10).setResizable(false);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(11).setResizable(false);
        jTable1.getColumnModel().getColumn(12).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(12).setResizable(false);
        jTable1.getColumnModel().getColumn(13).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(13).setResizable(false);
        jTable1.getColumnModel().getColumn(14).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(14).setResizable(false);
        jTable1.getColumnModel().getColumn(15).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(15).setResizable(false);
        jTable1.getColumnModel().getColumn(16).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(16).setResizable(false);
        jTable1.getColumnModel().getColumn(17).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(17).setResizable(false);

        jTable1.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Java Projects - Do not modify"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpEmpresa;
    private javax.swing.JPanel jpEndereco;
    private javax.swing.JPanel jpFornecedor;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblComple;
    private javax.swing.JLabel lblFantasia;
    private javax.swing.JLabel lblFixo;
    private javax.swing.JLabel lblIdFornecedor;
    private javax.swing.JLabel lblIdendereco;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblRamo;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblTipoCod;
    private javax.swing.JLabel lblUf;
    private javax.swing.JLabel lblemail;
    private javax.swing.JRadioButton rbCnpj;
    private javax.swing.JRadioButton rbCpf;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtContatoCel;
    private javax.swing.JTextField txtContatoFixo;
    private javax.swing.JTextField txtCpfCnpj;
    private javax.swing.JTextField txtEmailRepresentante;
    private javax.swing.JTextField txtFantasia;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRamo;
    private javax.swing.JTextField txtRepresentante;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
