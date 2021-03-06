package View;

import Controller.logFuncionarioController;
import Models.DAO;
import Models.TabelaModelo;
import Models.ValidarCPF;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TelaFuncionario extends javax.swing.JInternalFrame {

    private PreparedStatement statement;
    private ResultSet resultSet;
    public DAO DAO;
    String sqlTabela = null;
    String sqlTabela2 = null;
    String text = "";
    public logFuncionarioController fc;
    boolean a, txt;

    int vd = 0;

    public TelaFuncionario() {
        initComponents();
        DAO = new DAO();
        fc = new logFuncionarioController();
        if (!fc.logarBD()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }

        sqlTabela = "select * from funcionario inner join endereco on FKendereco = idendereco inner join usuario on FKfuncionario = idfuncionario";
        sqlTabela2 = "select * from usuario inner join funcionario on FKfuncionario = idfuncionario inner join endereco on idendereco = FKendereco ";
        carregarTabela();
        atualizarCampos();
        //preencherTabelaFuncionario(sqlTabela);
        habilitaCampos(true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false);

        habilitabotoes(true, false, false, false, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblIdFuncionario = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtRgFuncionario = new javax.swing.JFormattedTextField();
        txtDataNasc = new javax.swing.JFormattedTextField();
        txtTelFuncionario = new javax.swing.JFormattedTextField();
        txtCelFuncionario = new javax.swing.JFormattedTextField();
        lblFuncionario = new javax.swing.JLabel();
        lblexistecpf = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCodFuncionario = new javax.swing.JLabel();
        txtCpfFuncionario = new javax.swing.JTextField();
        btnPesquisarFuncionario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtLogradouroFuncionario = new javax.swing.JTextField();
        txtComplementoFuncionario = new javax.swing.JTextField();
        txtCidadeFuncionario = new javax.swing.JTextField();
        txtEstadoFuncionario = new javax.swing.JTextField();
        txtCepFuncionario = new javax.swing.JFormattedTextField();
        txtBairroFuncionario = new javax.swing.JTextField();
        txtNumeroFuncionario = new javax.swing.JTextField();
        lblexistecep = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUsuarioFuncionario = new javax.swing.JTextField();
        txtSenhaFuncionario = new javax.swing.JPasswordField();
        txtConfirmacaoSenha = new javax.swing.JPasswordField();
        cbPerfilFuncionario = new javax.swing.JComboBox<>();
        lblexisteusuario = new javax.swing.JLabel();
        lblSenhaConfirm = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbSituaçãoFuncionário = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFuncionario = new javax.swing.JTable();
        btnNovoFuncionario = new javax.swing.JButton();
        btnGravarFuncionario = new javax.swing.JButton();
        btnLimparFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnCancelarFuncionario = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setClosable(true);
        setTitle("CADASTRO DE FUNCIONÁRIOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Group-icon.png"))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Id :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("RG :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("CPF :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Telefone :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Celular :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("E-mail :");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Data Nasc :");

        lblIdFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        try {
            txtRgFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("****-****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFuncionario.setText(".");

        lblexistecpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblexistecpf.setForeground(new java.awt.Color(255, 0, 0));
        lblexistecpf.setText(".");

        jLabel21.setText("Código :");

        lblCodFuncionario.setForeground(new java.awt.Color(255, 0, 0));

        txtCpfFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfFuncionarioKeyTyped(evt);
            }
        });

        btnPesquisarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisa3.png"))); // NOI18N
        btnPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(lblexistecpf, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeFuncionario))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarFuncionario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFuncionario))
                    .addComponent(lblIdFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblexistecpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(txtRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtTelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("CEP :");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Logradouro :");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Bairro :");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Número :");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Complemento :");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Cidade :");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Estado :");

        try {
            txtCepFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblexistecep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblexistecep.setForeground(new java.awt.Color(255, 0, 0));
        lblexistecep.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLogradouroFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplementoFuncionario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblexistecep, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCepFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexistecep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLogradouroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtBairroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtComplementoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtCidadeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Usuário :");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Senha :");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Confirmar Senha :");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Perfil :");

        cbPerfilFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionário", "Gerente" }));

        lblexisteusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblexisteusuario.setForeground(new java.awt.Color(255, 0, 0));
        lblexisteusuario.setText(".");

        lblSenhaConfirm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblSenhaConfirm.setForeground(new java.awt.Color(255, 0, 0));
        lblSenhaConfirm.setText(".");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Situação :");

        cbSituaçãoFuncionário.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblexisteusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(103, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSenhaConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtConfirmacaoSenha))
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(cbPerfilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(4, 4, 4)
                        .addComponent(cbSituaçãoFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUsuarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexisteusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbPerfilFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSenhaConfirm))
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbSituaçãoFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jFuncionario);

        btnNovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar_Cliente.png"))); // NOI18N
        btnNovoFuncionario.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNovoFuncionario.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNovoFuncionario.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnGravarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.png"))); // NOI18N
        btnGravarFuncionario.setMaximumSize(new java.awt.Dimension(50, 50));
        btnGravarFuncionario.setMinimumSize(new java.awt.Dimension(50, 50));
        btnGravarFuncionario.setPreferredSize(new java.awt.Dimension(50, 50));
        btnGravarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarFuncionarioActionPerformed(evt);
            }
        });

        btnLimparFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apagar.png"))); // NOI18N
        btnLimparFuncionario.setMaximumSize(new java.awt.Dimension(50, 50));
        btnLimparFuncionario.setMinimumSize(new java.awt.Dimension(50, 50));
        btnLimparFuncionario.setPreferredSize(new java.awt.Dimension(50, 50));
        btnLimparFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparFuncionarioActionPerformed(evt);
            }
        });

        btnAlterarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnAlterarFuncionario.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAlterarFuncionario.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAlterarFuncionario.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnCancelarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete03.png"))); // NOI18N
        btnCancelarFuncionario.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCancelarFuncionario.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCancelarFuncionario.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGravarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimparFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGravarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(294, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc=" BOTÃO NOVO ">
    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        btnNovoFuncionario.setEnabled(false);
        btnGravarFuncionario.setEnabled(true);
        btnLimparFuncionario.setEnabled(true);
        btnAlterarFuncionario.setEnabled(false);
        btnCancelarFuncionario.setEnabled(true);
        btnPesquisarFuncionario.setEnabled(false);
        vd = 1;

        habilitaCampos(true, true, true, true, true, true, true, true, true,
                true, true, true, true, true, true, true, true, true, true);

        limparCampos();
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTÃO ALTERAR ">
    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        habilitaCampos(true, true, true, true, true, true, true, true, true,
                true, true, true, true, true, true, true, true, true, true);
        lblexistecep.setText("");
        lblexistecpf.setText("");
        lblexisteusuario.setText("");

        vd = 2;

        habilitabotoes(false, true, false, false, true);
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTÃO GRAVAR ">
    private void btnGravarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarFuncionarioActionPerformed

        ValidarCPF valCpf = new ValidarCPF() {
        };
        if (valCpf.validaCPF(txtCpfFuncionario.getText()) == true) {
            // jLabelValCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/102.png")));
            DAO dao = new DAO();
            dao.bd.getConnection();
            String buscaCpf = txtCpfFuncionario.getText();
            PreparedStatement sta;
            try {
                sta = dao.bd.connection.prepareStatement("select * from cliente where cpf = ? limit 1");
                sta.setString(1, buscaCpf);
                ResultSet rs = sta.executeQuery();
                while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "CPF já cadastrado anteriormente!");
                    txtCpfFuncionario.setText("");
                    txtCpfFuncionario.grabFocus();
                }
            } catch (SQLException ex) {
            }
        }

        boolean cf = DAO.cslcpf(txtCpfFuncionario.getText());
        boolean cuser = DAO.csluser(txtUsuarioFuncionario.getText());

        lblexistecep.setText("");
        lblexistecpf.setText("");
        lblexisteusuario.setText("");
        lblSenhaConfirm.setText("");

        if (cf == true) {
            pesquisaCpf(cf);

        } else if (cuser == true) {
            pesquisaUser(cuser);
        }
        String sh = txtSenhaFuncionario.getText();
        String csh = txtConfirmacaoSenha.getText();

        if (!sh.equals(csh)) {
            lblSenhaConfirm.setText("Senha diferente");
            txtConfirmacaoSenha.requestFocus();
            return;
        }

        switch (vd) {

            case 1:
                VerificarCodigo();

                logFuncionarioController lg = new logFuncionarioController();
                if (VerificarCamposVazios() == true) {
                    JOptionPane.showMessageDialog(null, "Campos obrigatórios estão vazios!");
                    a = false;
                }

                if (cf != true && cuser != true && VerificarCamposVazios() != true) {

                    lg.salvarFuncionario(txtNomeFuncionario.getText(), txtCpfFuncionario.getText(),
                            txtRgFuncionario.getText(), txtTelFuncionario.getText(), txtCelFuncionario.getText(),
                            txtEmailFuncionario.getText(), txtDataNasc.getText(), lblCodFuncionario.getText(), txtCepFuncionario.getText(), txtBairroFuncionario.getText(),
                            txtLogradouroFuncionario.getText(), txtComplementoFuncionario.getText(), txtNumeroFuncionario.getText(),
                            txtCidadeFuncionario.getText(), txtEstadoFuncionario.getText(), txtUsuarioFuncionario.getText(), cbPerfilFuncionario.getSelectedIndex(), txtSenhaFuncionario.getText(),
                            txtConfirmacaoSenha.getText(), cbSituaçãoFuncionário.getSelectedIndex());
                    habilitaCampos(false, false, false, false, false, false, false, false, false,
                            false, false, false, false, false, false, false, false, false, false);

                    habilitabotoes(true, false, false, false, false);
                    JOptionPane.showMessageDialog(null, "Operação Realizada Com Sucesso!");

                    lblexistecep.setText("");
                    lblexistecpf.setText("");
                    lblexisteusuario.setText("");

                    limparCampos();
                    vd = 0;
                }

                break;

            case 2:
                logFuncionarioController lg2 = new logFuncionarioController();

                lg2.alterarFuncionario(lblFuncionario.getText(), txtNomeFuncionario.getText(), txtCpfFuncionario.getText(),
                        txtRgFuncionario.getText(), txtTelFuncionario.getText(), txtCelFuncionario.getText(), txtEmailFuncionario.getText(),
                        txtDataNasc.getText(), lblCodFuncionario.getText(), txtCepFuncionario.getText(), txtBairroFuncionario.getText(),
                        txtLogradouroFuncionario.getText(), txtComplementoFuncionario.getText(), txtNumeroFuncionario.getText(),
                        txtCidadeFuncionario.getText(), txtEstadoFuncionario.getText(), txtUsuarioFuncionario.getText(),
                        cbPerfilFuncionario.getSelectedIndex(), txtSenhaFuncionario.getText(), txtConfirmacaoSenha.getText(), cbSituaçãoFuncionário.getSelectedIndex());
                habilitaCampos(false, false, false, false, false, false, false, false, false,
                        false, false, false, false, false, false, false, false, false, false);
                lblexistecep.setText("");
                lblexistecpf.setText("");
                lblexisteusuario.setText("");

                habilitabotoes(true, false, false, false, false);
                JOptionPane.showMessageDialog(null, "Operação Realizada Com Sucesso!");

                limparCampos();
                vd = 0;
                break;

        }

        preencherTabelaFuncionario(sqlTabela);


    }//GEN-LAST:event_btnGravarFuncionarioActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" PESQUISA CPF ">
    public void pesquisaCpf(boolean cpf) {
        if (cpf == true) {
            lblexistecpf.setText("CPF cadastrado");

        } else {
            lblexistecpf.setText("");
        }
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" PESQUISA CEP ">
    public void pesquisaCep(boolean cep) {
        if (cep == true) {
            lblexistecep.setText("CEP cadastrado");
        } else {
            lblexistecep.setText("");
        }

    }
    //</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" PESQUISA USUARIO ">
    public void pesquisaUser(boolean user) {
        if (user == true) {
            lblexisteusuario.setText("Usuario cadastrado");
        } else {
            lblexisteusuario.setText("");
        }

    }
    //</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" METODO SELECAO LINHA FUNCIONARIO E BAIRRO ">
    private void jFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFuncionarioMouseClicked

        int linhaSelecionada = jFuncionario.getSelectedRow();  // pega a linha selecionada

        lblFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 0).toString());
        txtNomeFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 1).toString());
        txtCpfFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 2).toString());
        txtRgFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 3).toString());
        txtTelFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 4).toString());
        txtCelFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 5).toString());
        txtEmailFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 6).toString());

        String dataCompra = jFuncionario.getValueAt(linhaSelecionada, 7).toString();
        String data = dataCompra;
        String data1 = data.replaceAll("-", "");
        String data2 = data1.substring(0, 2);
        String data3 = data1.substring(2, 4);
        String data4 = data1.substring(4, 8);
        String dataC = data4 + data2 + data3;
        txtDataNasc.setText(dataC);
        lblCodFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 8).toString());
        txtCepFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 9).toString());
        txtBairroFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 10).toString());
        txtLogradouroFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 11).toString());
        txtComplementoFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 12).toString());
        txtNumeroFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 13).toString());
        txtCidadeFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 14).toString());
        txtEstadoFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 15).toString());

        txtUsuarioFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 16).toString());
        String t = jFuncionario.getValueAt(linhaSelecionada, 17).toString();
        if ("1".equals(t)) {
            cbPerfilFuncionario.setSelectedItem("Gerente");
        } else {
            cbPerfilFuncionario.setSelectedItem("Funcionário");
        }
        txtSenhaFuncionario.setText(jFuncionario.getValueAt(linhaSelecionada, 18).toString());
        txtConfirmacaoSenha.setText(jFuncionario.getValueAt(linhaSelecionada, 19).toString());
        cbSituaçãoFuncionário.setSelectedItem(jFuncionario.getValueAt(linhaSelecionada, 20).toString());
         String t2 = jFuncionario.getValueAt(linhaSelecionada, 20).toString();
         if ("0".equals(t2)) {
            cbSituaçãoFuncionário.setSelectedItem("Ativo");
        } else {
            cbSituaçãoFuncionário.setSelectedItem("Inativo");
        }

        habilitaCampos(false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false);
        habilitabotoes(false, false, true, false, true);
        btnPesquisarFuncionario.setEnabled(false);

    }//GEN-LAST:event_jFuncionarioMouseClicked
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTAO CANCELAR ">
    private void btnCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFuncionarioActionPerformed
        carregarTabela();
        atualizarCampos();

        habilitabotoes(true, false, false, false, false);
        habilitaCampos(true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false);
        limparCampos();
        btnPesquisarFuncionario.setEnabled(true);

    }//GEN-LAST:event_btnCancelarFuncionarioActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTAO LIMPAR ">
    private void btnLimparFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFuncionarioActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparFuncionarioActionPerformed

    private void txtCpfFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfFuncionarioKeyTyped
        if (txtCpfFuncionario.getText().length() > 10 && !(evt.getKeyChar() == KeyEvent.VK_DELETE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else {
            char input = evt.getKeyChar();
            if ((input < '0' || input > '9') && input != '\b') {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Caractere inválido");
            }
        }
    }//GEN-LAST:event_txtCpfFuncionarioKeyTyped
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" BOTAO PESQUISAR FUNCIONARIO ">
    private void btnPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFuncionarioActionPerformed
        String sql = "select * from funcionario inner join endereco on FKendereco = idendereco inner join usuario on "
                + "FKfuncionario = idfuncionario where nomeFuncionarios like '%" + txtNomeFuncionario.getText() + "%'";
        preencherTabelaFuncionario(sql);
    }//GEN-LAST:event_btnPesquisarFuncionarioActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" METODO BOTAO ">
    private void habilitabotoes(boolean addFnc, boolean gravaFnc, boolean alterarFnc,
            boolean limparFnc, boolean cancelarFnc) {

        btnNovoFuncionario.setEnabled(addFnc);
        btnGravarFuncionario.setEnabled(gravaFnc);
        btnAlterarFuncionario.setEnabled(alterarFnc);
        btnLimparFuncionario.setEnabled(limparFnc);
        btnCancelarFuncionario.setEnabled(cancelarFnc);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CAMPO ">
    public void habilitaCampos(boolean nomeFcn, boolean rgFcn, boolean cpfFcn, boolean dataNascFcn,
            boolean telFcn, boolean celFcn, boolean emailFcn, boolean cepFcn, boolean logradouroFcn,
            boolean bairroFcn, boolean numeroFcn, boolean complementoFcn, boolean CidadeFcn, boolean estadoFcn,
            boolean usuarioFcn, boolean SenhaFcn, boolean ConfirmSenhaFcn, boolean perfilFcn, boolean situacao) {

        // FUNCIONARIO 
        txtNomeFuncionario.setEnabled(nomeFcn);
        txtRgFuncionario.setEnabled(rgFcn);
        txtCpfFuncionario.setEnabled(cpfFcn);
        txtDataNasc.setEnabled(dataNascFcn);
        txtTelFuncionario.setEnabled(telFcn);
        txtCelFuncionario.setEnabled(celFcn);
        txtEmailFuncionario.setEnabled(emailFcn);

        // ENDERECO
        txtCepFuncionario.setEnabled(cepFcn);
        txtLogradouroFuncionario.setEnabled(logradouroFcn);
        txtBairroFuncionario.setEnabled(bairroFcn);
        txtNumeroFuncionario.setEnabled(numeroFcn);
        txtComplementoFuncionario.setEnabled(complementoFcn);
        txtCidadeFuncionario.setEnabled(CidadeFcn);
        txtEstadoFuncionario.setEnabled(estadoFcn);

        // USUARIO
        txtUsuarioFuncionario.setEnabled(usuarioFcn);
        txtSenhaFuncionario.setEnabled(SenhaFcn);
        txtConfirmacaoSenha.setEnabled(ConfirmSenhaFcn);
        cbPerfilFuncionario.setEnabled(perfilFcn);
        cbSituaçãoFuncionário.setEnabled(situacao);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CAMPOS VAZIOS ">
    public boolean VerificarCamposVazios() {
        if (txtNomeFuncionario.getText().equals("")) {
            a = true;
        }
        if (txtCpfFuncionario.getText().equals("")) {
            a = true;
        }
        if (txtRgFuncionario.getText().equals("")) {
            a = true;
        }
        if (txtTelFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtDataNasc.getText().equals("")) {
            a = true;
        }

        if (txtCepFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtLogradouroFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtBairroFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtEstadoFuncionario.getText().equals("")) {
            a = true;
        }
        if (txtCidadeFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtNumeroFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtUsuarioFuncionario.getText().equals("")) {
            a = true;
        }

        if (txtSenhaFuncionario.getText().equals("")) {
            a = true;
        }

        return a;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR CAMPOS ">    
    public void atualizarCampos() {
        try {
            if (resultSet.isAfterLast()) {
                resultSet.last();
            }
            if (resultSet.isBeforeFirst()) {
                resultSet.first();
            }

            lblFuncionario.setText(resultSet.getString("idfuncionario"));
            txtNomeFuncionario.setText(resultSet.getString("nomeFuncionario"));
            txtCpfFuncionario.setText(resultSet.getString("cpf"));
            txtRgFuncionario.setText(resultSet.getString("rg"));
            txtTelFuncionario.setText(resultSet.getString("telefone"));
            txtCelFuncionario.setText(resultSet.getString("celular"));
            txtEmailFuncionario.setText(resultSet.getString("email"));
            lblCodFuncionario.setText(resultSet.getString("codigoFuncionarios"));

            String dataCompra = resultSet.getString("dataNascimento");
            String data = dataCompra;
            String data1 = data.replaceAll("-", "");
            String data2 = data1.substring(0, 2);
            String data3 = data1.substring(2, 4);
            String data4 = data1.substring(4, 8);
            String dataC = data4 + data2 + data3;
            txtDataNasc.setText(dataC);

            txtCepFuncionario.setText(resultSet.getString("cep"));
            txtBairroFuncionario.setText(resultSet.getString("bairro"));
            txtLogradouroFuncionario.setText(resultSet.getString("logradouro"));
            txtComplementoFuncionario.setText(resultSet.getString("complemento"));
            txtNumeroFuncionario.setText(resultSet.getString("numero"));
            txtCidadeFuncionario.setText(resultSet.getString("cidade"));
            txtEstadoFuncionario.setText(resultSet.getString("estado"));

            txtUsuarioFuncionario.setText(resultSet.getString("login"));
            cbPerfilFuncionario.setSelectedItem(resultSet.getString("perfil"));
            txtSenhaFuncionario.setText(resultSet.getString("senha"));
            txtConfirmacaoSenha.setText(resultSet.getString("confiSenha"));

        } catch (SQLException erro) {
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR CAMPOS ">
    public void limparCampos() {
        lblFuncionario.setText("");
        txtNomeFuncionario.setText("");
        txtRgFuncionario.setText("");
        txtCpfFuncionario.setText("");
        txtDataNasc.setText("");
        txtTelFuncionario.setText("");
        txtCelFuncionario.setText("");
        txtEmailFuncionario.setText("");
        txtCepFuncionario.setText("");
        txtLogradouroFuncionario.setText("");
        txtBairroFuncionario.setText("");
        txtNumeroFuncionario.setText("");
        txtComplementoFuncionario.setText("");
        txtCidadeFuncionario.setText("");
        txtEstadoFuncionario.setText("");

        txtUsuarioFuncionario.setText("");
        txtSenhaFuncionario.setText("");
        txtConfirmacaoSenha.setText("");
        lblexistecep.setText("");
        lblexistecpf.setText("");
        lblexisteusuario.setText("");
        cbPerfilFuncionario.setSelectedIndex(-1);
        cbSituaçãoFuncionário.setSelectedIndex(-1);
        lblCodFuncionario.setText("");

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO CARREGAR TABELA ">
    public void carregarTabela() {
        String sql = "select * from funcionario inner join endereco on FKendereco = idendereco inner join usuario on FKfuncionario = idfuncionario";
        try {
            statement = DAO.bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro! " + erro.toString());
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA FUNCIONARIO E BAIRRO">
    public void preencherTabelaFuncionario(String SQL) {

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"idFuncionario", "nomeFuncionario", "cpf", "rg",
            "telefone", "celular", "email", "dataNascimento", "codigoFuncionarios", "cep", "bairro", "logradouro",
            "complemento", "numero", "cidade", "estado", "", "", "", "", ""};

        DAO.executaSQL(SQL);

        try {
            DAO.resultSet.first();
            do {
                dados.add(new Object[]{DAO.resultSet.getString("idFuncionario"), DAO.resultSet.getString("nomeFuncionarios"), DAO.resultSet.getString("cpf"),
                    DAO.resultSet.getString("rg"), DAO.resultSet.getString("telefone"), DAO.resultSet.getString("celular"),
                    DAO.resultSet.getString("email"), DAO.resultSet.getString("dataNascimento"), DAO.resultSet.getString("codigoFuncionarios"), DAO.resultSet.getString("cep"),
                    DAO.resultSet.getString("Bairro"), DAO.resultSet.getString("logradouro"), DAO.resultSet.getString("complemento"),
                    DAO.resultSet.getString("numero"), DAO.resultSet.getString("cidade"), DAO.resultSet.getString("estado"),
                    DAO.resultSet.getString("login"), DAO.resultSet.getString("perfil"), DAO.resultSet.getString("senha"),
                    DAO.resultSet.getString("confiSenha"), DAO.resultSet.getString("situacao")});

            } while (DAO.resultSet.next());
        } catch (SQLException ex) {
        }

        TabelaModelo modelo = new TabelaModelo(dados, colunas);
        jFuncionario.setModel(modelo); // recebe o modelo criado
        jFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);
        jFuncionario.getColumnModel().getColumn(0).setResizable(false);
        jFuncionario.getColumnModel().getColumn(1).setPreferredWidth(250);  // define o tamanho das colunas e se será redimensionado ou não
        jFuncionario.getColumnModel().getColumn(1).setResizable(true);  // não permite alterar o tamanho da coluna
        jFuncionario.getColumnModel().getColumn(2).setPreferredWidth(70);
        jFuncionario.getColumnModel().getColumn(2).setResizable(false);
        jFuncionario.getColumnModel().getColumn(3).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(3).setResizable(false);
        jFuncionario.getColumnModel().getColumn(4).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(4).setResizable(false);
        jFuncionario.getColumnModel().getColumn(5).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(5).setResizable(false);
        jFuncionario.getColumnModel().getColumn(6).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(6).setResizable(false);
        jFuncionario.getColumnModel().getColumn(7).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(7).setResizable(false);
        jFuncionario.getColumnModel().getColumn(8).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(8).setResizable(false);
        jFuncionario.getColumnModel().getColumn(9).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(9).setResizable(false);
        jFuncionario.getColumnModel().getColumn(10).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(10).setResizable(false);

        jFuncionario.getColumnModel().getColumn(11).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(11).setResizable(false);
        jFuncionario.getColumnModel().getColumn(12).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(12).setResizable(false);
        jFuncionario.getColumnModel().getColumn(13).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(13).setResizable(false);
        jFuncionario.getColumnModel().getColumn(14).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(14).setResizable(false);
        jFuncionario.getColumnModel().getColumn(15).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(15).setResizable(false);
        jFuncionario.getColumnModel().getColumn(16).setPreferredWidth(120);
        jFuncionario.getColumnModel().getColumn(16).setResizable(false);
        jFuncionario.getColumnModel().getColumn(17).setMinWidth(0);
        jFuncionario.getColumnModel().getColumn(17).setMaxWidth(0);
        jFuncionario.getColumnModel().getColumn(17).setResizable(false);
        jFuncionario.getColumnModel().getColumn(18).setMinWidth(0);
        jFuncionario.getColumnModel().getColumn(18).setMaxWidth(0);
        jFuncionario.getColumnModel().getColumn(18).setResizable(false);
        jFuncionario.getColumnModel().getColumn(19).setMinWidth(0);
        jFuncionario.getColumnModel().getColumn(19).setMaxWidth(0);
        jFuncionario.getColumnModel().getColumn(19).setResizable(false);
        jFuncionario.getColumnModel().getColumn(20).setMinWidth(0);
        jFuncionario.getColumnModel().getColumn(20).setMaxWidth(0);
        jFuncionario.getColumnModel().getColumn(20).setResizable(false);

        jFuncionario.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jFuncionario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jFuncionario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA USUARIO">
    /* public void preencherTabelaUsuario(String SQL) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"idUsuário", "Login", "Perfil", "Senha",
            "CofirmaçaoSenha", "idfuncionario", "nomeFuncionario", "cpf", "rg",
            "telefone", "celular", "email", "dataNascimento", "cep", "bairro",
            "logradouro", "complemento", "numero", "cidade", "estado"};

        DAO.executaSQL(SQL);

        try {
            DAO.resultSet.first();
            do {
                dados.add(new Object[]{DAO.resultSet.getString("idUsuario"), DAO.resultSet.getString("login"), DAO.resultSet.getString("perfil"), DAO.resultSet.getString("senha"),
                    DAO.resultSet.getString("confiSenha"), DAO.resultSet.getString("idfuncionario"), DAO.resultSet.getString("nomeFuncionario"),
                    DAO.resultSet.getString("cpf"), DAO.resultSet.getString("rg"), DAO.resultSet.getString("telefone"), DAO.resultSet.getString("celular"),
                    DAO.resultSet.getString("email"), DAO.resultSet.getString("dataNascimento"), DAO.resultSet.getString("cep"),
                    DAO.resultSet.getString("bairro"), DAO.resultSet.getString("logradouro"), DAO.resultSet.getString("complemento"),
                    DAO.resultSet.getString("numero"), DAO.resultSet.getString("cidade"), DAO.resultSet.getString("estado")});
            } while (DAO.resultSet.next());
        } catch (SQLException ex) {
        }

        TabelaModelo modelo = new TabelaModelo(dados, colunas);
        jUsuario.setModel(modelo); // recebe o modelo criado
        jUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
        jUsuario.getColumnModel().getColumn(0).setResizable(false);
        jUsuario.getColumnModel().getColumn(1).setPreferredWidth(250);  // define o tamanho das colunas e se será redimensionado ou não
        jUsuario.getColumnModel().getColumn(1).setResizable(true);  // não permite alterar o tamanho da coluna
        jUsuario.getColumnModel().getColumn(2).setPreferredWidth(70);
        jUsuario.getColumnModel().getColumn(2).setResizable(false);
        jUsuario.getColumnModel().getColumn(3).setPreferredWidth(120);
        jUsuario.getColumnModel().getColumn(3).setResizable(false);
        jUsuario.getColumnModel().getColumn(4).setPreferredWidth(250);
        jUsuario.getColumnModel().getColumn(4).setResizable(false);
        jUsuario.getColumnModel().getColumn(5).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(5).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(5).setResizable(false);
        jUsuario.getColumnModel().getColumn(6).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(6).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(6).setResizable(false);
        jUsuario.getColumnModel().getColumn(7).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(7).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(7).setResizable(false);
        jUsuario.getColumnModel().getColumn(8).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(8).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(8).setResizable(false);
        jUsuario.getColumnModel().getColumn(9).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(9).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(9).setResizable(false);
        jUsuario.getColumnModel().getColumn(10).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(10).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(10).setResizable(false);
        jUsuario.getColumnModel().getColumn(11).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(11).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(11).setResizable(false);
        jUsuario.getColumnModel().getColumn(12).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(12).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(12).setResizable(false);
        jUsuario.getColumnModel().getColumn(13).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(13).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(13).setResizable(false);
        jUsuario.getColumnModel().getColumn(14).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(14).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(14).setResizable(false);
        jUsuario.getColumnModel().getColumn(15).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(15).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(15).setResizable(false);
        jUsuario.getColumnModel().getColumn(16).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(16).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(16).setResizable(false);
        jUsuario.getColumnModel().getColumn(17).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(17).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(17).setResizable(false);
        jUsuario.getColumnModel().getColumn(18).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(18).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(18).setResizable(false);
        jUsuario.getColumnModel().getColumn(19).setMinWidth(0);
        jUsuario.getColumnModel().getColumn(19).setMaxWidth(0);
        jUsuario.getColumnModel().getColumn(19).setResizable(false);

        jUsuario.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jUsuario.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela

    }
    //</editor-fold>
     */
    //<editor-fold defaultstate="collapsed" desc=" CODIGO FUNCIONÁRIO">
    public String GerarCodigo() {
        Random cod = new Random();
        int num = 0;
        do {
            num = cod.nextInt(9999);
        } while (num < 1000);
        return Integer.toString(num);
    }

    public String VerificarCodigo() {
        DAO dao = new DAO();
        text = GerarCodigo();

        try {
            while (txt = false) {
                dao.executaSQL("select * from vendas where codigoVenda = " + text);
                txt = dao.resultSet.first();
            }
            lblCodFuncionario.setText(text);
            txt = false;
            return text;
        } catch (SQLException erro) {

            return "";
        }
    }

    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnCancelarFuncionario;
    private javax.swing.JButton btnGravarFuncionario;
    private javax.swing.JButton btnLimparFuncionario;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnPesquisarFuncionario;
    private javax.swing.JComboBox<String> cbPerfilFuncionario;
    private javax.swing.JComboBox<String> cbSituaçãoFuncionário;
    private javax.swing.JTable jFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblCodFuncionario;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblSenhaConfirm;
    private javax.swing.JLabel lblexistecep;
    private javax.swing.JLabel lblexistecpf;
    private javax.swing.JLabel lblexisteusuario;
    private javax.swing.JTextField txtBairroFuncionario;
    private javax.swing.JFormattedTextField txtCelFuncionario;
    private javax.swing.JFormattedTextField txtCepFuncionario;
    private javax.swing.JTextField txtCidadeFuncionario;
    private javax.swing.JTextField txtComplementoFuncionario;
    private javax.swing.JPasswordField txtConfirmacaoSenha;
    private javax.swing.JTextField txtCpfFuncionario;
    private javax.swing.JFormattedTextField txtDataNasc;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEstadoFuncionario;
    private javax.swing.JTextField txtLogradouroFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNumeroFuncionario;
    private javax.swing.JFormattedTextField txtRgFuncionario;
    private javax.swing.JPasswordField txtSenhaFuncionario;
    private javax.swing.JFormattedTextField txtTelFuncionario;
    private javax.swing.JTextField txtUsuarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
