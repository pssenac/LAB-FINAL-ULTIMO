/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.ModeloTabela;
import Models.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ListasVendas_Compras_Ordem extends javax.swing.JInternalFrame {

    int aux;
    String sql = "";
    private PreparedStatement statement;
    private ResultSet resultSet;
    public DAO DAO;
    public ClienteController cli;

    public ListasVendas_Compras_Ordem() {
        initComponents();

        cli = new ClienteController();
        if (!cli.logarBD()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }

        DAO = new DAO();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JTable();
        BtnPDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisLista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbLv = new javax.swing.JCheckBox();
        cbOs = new javax.swing.JCheckBox();
        cbLc = new javax.swing.JCheckBox();
        txtData1 = new javax.swing.JFormattedTextField();
        txtData2 = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("RELATÓRIOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lista.png"))); // NOI18N

        jLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jLista);

        BtnPDF.setText("PDF");
        BtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPDFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Inicio");

        jLabel2.setText("Fim");

        btnPesquisLista.setText("pesquisa");
        btnPesquisLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisListaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Gerar PDF: ");

        cbLv.setText("Lista Vendas");
        cbLv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLvActionPerformed(evt);
            }
        });

        cbOs.setText("Listar Ordem de Serviço");
        cbOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOsActionPerformed(evt);
            }
        });

        cbLc.setText("Listar Compras");
        cbLc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLcActionPerformed(evt);
            }
        });

        try {
            txtData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtData2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbLv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisLista)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPDF))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOs)
                                .addGap(63, 63, 63)
                                .addComponent(cbLc)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLv)
                    .addComponent(cbOs)
                    .addComponent(cbLc))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnPesquisLista)
                    .addComponent(BtnPDF)
                    .addComponent(jLabel3)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(436, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOsActionPerformed
        if (cbOs.isSelected()) {
            cbLv.setSelected(false);
            cbLc.setSelected(false);
            aux = 3;
        }

    }//GEN-LAST:event_cbOsActionPerformed

    private void cbLvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLvActionPerformed
        if (cbLv.isSelected()) {
            cbOs.setSelected(false);
            cbLc.setSelected(false);
            aux = 1;
        }
    }//GEN-LAST:event_cbLvActionPerformed

    private void cbLcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLcActionPerformed
        if (cbLc.isSelected()) {
            cbOs.setSelected(false);
            cbLv.setSelected(false);
            aux = 2;
        }
    }//GEN-LAST:event_cbLcActionPerformed

    private void btnPesquisListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisListaActionPerformed
        switch (aux) {
            case 1:

                LimparTabela();
                txtData2.grabFocus();

                String frm = "  /  /    ";

                if (txtData2.getText().equals(frm)) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;

                    sql = "SELECT * FROM vendas inner join lotevendas on FKvendas = codVenda "
                            + "inner join lote on FKlote = idLote inner join produtos on FKprodutos = idprodutos "
                            + "where dataVenda = '" + data1 + "'";
                    preencherTabela1(sql);

                } else if (!txtData1.getText().equals(frm) && !frm.equals(txtData2.getText())) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;

                    String D = txtData2.getText().substring(0, 2);
                    String E = txtData2.getText().substring(3, 5);
                    String F = txtData2.getText().substring(6, 10);
                    String data2 = F + "-" + E + "-" + D;

                    String sql = "SELECT * FROM `lotevendas` INNER JOIN vendas on codVenda = FKvendas INNER JOIN lote on idLote = "
                            + "FKlote INNER join produtos on idprodutos = FKprodutos WHERE dataVenda BETWEEN '" + data1 + "' and '" + data2 + "'";

                    preencherTabela1(sql);

                }

                break;

            case 2:

              
                String frm1 = "  /  /    ";

                if (txtData2.getText().equals(frm1)) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;
                    JOptionPane.showMessageDialog(null, data1);

                    sql = "select * from lote inner join produtos on idprodutos = FKprodutos "
                            + "inner join fornecedor on idFornecedor = FKfornecedor "
                            + "where dataCompra = '" + data1 + "'";
                    preencherTabela2(sql);

                } else if (!txtData1.getText().equals(frm1) && !frm1.equals(txtData2.getText())) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;

                    String D = txtData2.getText().substring(0, 2);
                    String E = txtData2.getText().substring(3, 5);
                    String F = txtData2.getText().substring(6, 10);
                    String data2 = F + "-" + E + "-" + D;

                    String sql = "select * from lote inner join produtos on idprodutos = FKprodutos "
                            + "inner join fornecedor on idFornecedor = FKfornecedor WHERE dataCompra "
                            + "BETWEEN '" + data1 + "' and '" + data2 + "'";

                    preencherTabela2(sql);

                }
                break;

            case 3:

                
                String frm2 = "  /  /    ";

                if (txtData2.getText().equals(frm2)) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;

                    
                    
                    
                  
                    sql = "select * from ordemservico inner join cliente on idcliente "
                            + "= FKcliente inner join funcionario on idFuncionario = "
                            + "FKfuncionario where dataSolitacao = '" + data1 + "'";
                    preencherTabela3(sql);

                } else if (!txtData1.getText().equals(frm2) && !frm2.equals(txtData2.getText())) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;
                    JOptionPane.showMessageDialog(null, data1);

                    String D = txtData2.getText().substring(0, 2);
                    String E = txtData2.getText().substring(3, 5);
                    String F = txtData2.getText().substring(6, 10);
                    String data2 = F + "-" + E + "-" + D;
                    JOptionPane.showMessageDialog(null, data2);

                    String sql = "select * from ordemservico inner join cliente on "
                            + "idcliente = FKcliente inner join funcionario on idFuncionario "
                            + "= FKfuncionario WHERE dataSolitacao BETWEEN '" + data1 + "' and '" + data2 + "'";

                    preencherTabela3(sql);
                    break;
                }

        }
    }//GEN-LAST:event_btnPesquisListaActionPerformed

    private void BtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPDFActionPerformed
        switch (aux) {
            case 1:
                try {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;
                    String frm = "  /  /    ";

                    if (txtData2.getText().equals(frm)) {

                        DAO.executaSQL("select * from vendas inner join lotevendas on FKvendas = codVenda inner join lote on FKlote = idLote inner join produtos on FKprodutos = idprodutos WHERE dataVenda ='" + data1 + "'");
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(DAO.resultSet);
                        JasperPrint jpPrint = JasperFillManager.fillReport("C:/Users/06729598107/Desktop/LAB-FINAL-ULTIMO-master/src/relatorios/RelatoriosVendas.jasper", new HashMap(), relatResul);
                        JasperViewer jv = new JasperViewer(jpPrint, false);

                        jv.setVisible(true);

                    } else if (!txtData1.getText().equals(frm) && !frm.equals(txtData2.getText())) {

                        String J = txtData1.getText().substring(0, 2);
                        String Q = txtData1.getText().substring(3, 5);
                        String P = txtData1.getText().substring(6, 10);
                        String dt1 = P + "-" + Q + "-" + J;

                        String D = txtData2.getText().substring(0, 2);
                        String E = txtData2.getText().substring(3, 5);
                        String F = txtData2.getText().substring(6, 10);
                        String data2 = F + "-" + E + "-" + D;

                        DAO.executaSQL("select * from vendas inner join lotevendas on FKvendas = codVenda inner join lote on FKlote = idLote inner join produtos on FKprodutos = idprodutos WHERE dataVenda BETWEEN '" + dt1 + "' and '" + data2 + "'");
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(DAO.resultSet);
                        JasperPrint jpPrint = JasperFillManager.fillReport("C:/Users/06729598107/Desktop/LAB-FINAL-ULTIMO-master/src/relatorios/RelatoriosVendas.jasper", new HashMap(), relatResul);
                        JasperViewer jv = new JasperViewer(jpPrint, false);

                        jv.setVisible(true);

                    }

                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);

                }

                break;
            case 2:
                try {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;
                    String frm2 = "  /  /    ";

                    if (txtData2.getText().equals(frm2)) {

                        DAO.executaSQL("select * from lote inner join produtos on idprodutos = FKprodutos inner join fornecedor on idFornecedor = FKfornecedor WHERE dataCompra ='" + data1 + "'");
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(DAO.resultSet);
                        JasperPrint jpPrint = JasperFillManager.fillReport("C:/Users/06729598107/Desktop/LAB-FINAL-ULTIMO-master/src/relatorios/RelatorioCompras.jasper", new HashMap(), relatResul);
                        JasperViewer jv = new JasperViewer(jpPrint, false);

                        jv.setVisible(true);

                    } else if (!txtData1.getText().equals(frm2) && !frm2.equals(txtData2.getText())) {

                        String J = txtData1.getText().substring(0, 2);
                        String Q = txtData1.getText().substring(3, 5);
                        String P = txtData1.getText().substring(6, 10);
                        String dt1 = P + "-" + Q + "-" + J;

                        String D = txtData2.getText().substring(0, 2);
                        String E = txtData2.getText().substring(3, 5);
                        String F = txtData2.getText().substring(6, 10);
                        String data2 = F + "-" + E + "-" + D;

                        DAO.executaSQL("select * from lote inner join produtos on idprodutos = FKprodutos inner join fornecedor on idFornecedor = FKfornecedor WHERE dataCompra BETWEEN '" + dt1 + "' and '" + data2 + "'");
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(DAO.resultSet);
                        JasperPrint jpPrint = JasperFillManager.fillReport("C:/Users/06729598107/Desktop/LAB-FINAL-ULTIMO-master/src/relatorios/RelatorioCompras.jasper", new HashMap(), relatResul);
                        JasperViewer jv = new JasperViewer(jpPrint, false);

                        jv.setVisible(true);

                    }

                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
                }
                break;

            case 3:

               int linhaSelecionada = jLista.getSelectedRow();  // pega a linha selecionada
               String os = jLista.getValueAt(linhaSelecionada, 0).toString();
               
               try {

                   

                        DAO.executaSQL("select * from ordemservico inner join cliente on idcliente = FKcliente inner join funcionario on idFuncionario = FKfuncionario WHERE idServico = '" + os + "'");
                        JRResultSetDataSource relatResul = new JRResultSetDataSource(DAO.resultSet);
                        JasperPrint jpPrint = JasperFillManager.fillReport("C:/Users/06729598107/Desktop/LAB-FINAL-ULTIMO-master/src/relatorios/RelatorioOrdemdeServico.jasper", new HashMap(), relatResul);
                        JasperViewer jv = new JasperViewer(jpPrint, false);

                        jv.setVisible(true);

                   

                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
                }
               
               
      
                break;

        }

    }//GEN-LAST:event_BtnPDFActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO APAGAR DATA">     
    private void txtData2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtData2FocusLost
       txtData2.setFocusLostBehavior(JFormattedTextField.COMMIT);
    }//GEN-LAST:event_txtData2FocusLost
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA LISTAR VENDAS">
    public void preencherTabela1(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"cod", "dataVenda", "nomeProduto", "qtd", "valorParcial", "coVenda"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {

                String A = dao.resultSet.getString("dataVenda").substring(0, 4);
                String B = dao.resultSet.getString("dataVenda").substring(5, 7);
                String C = dao.resultSet.getString("dataVenda").substring(8, 10);
                String dataC = C + "/" + B + "/" + A;

                dados.add(new Object[]{dao.resultSet.getString("codVenda"), dataC, dao.resultSet.getString("nomeProduto"),
                    dao.resultSet.getString("qtd"), dao.resultSet.getString("valorParcial"), dao.resultSet.getString("codigoVenda")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATA NAO ENCONTRADA");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(350);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(0);
        jLista.getColumnModel().getColumn(5).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA ORDEM DE SERVICO">
    public void preencherTabela3(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"IdServico", "dataSolitacao", "dataEntrega", "descricao", "valorServico", "nomeCliente", "celular",
            "tecnico"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                 String A = dao.resultSet.getString("dataSolitacao").substring(0, 4);
                 String B = dao.resultSet.getString("dataSolitacao").substring(5, 7);
                 String C = dao.resultSet.getString("dataSolitacao").substring(8, 10);
                 String dataE = C + "/" + B + "/" + A;
                 
                 String D = dao.resultSet.getString("dataEntrega").substring(0, 4);
                 String E = dao.resultSet.getString("dataEntrega").substring(5, 7);
                 String F = dao.resultSet.getString("dataEntrega").substring(8, 10);
                 String dataF = F + "/" + E + "/" + D;
                
                
                dados.add(new Object[]{dao.resultSet.getString("IdServico"), dataE, 
                    dataF,dao.resultSet.getString("descricao"), dao.resultSet.getString("valorServico"),
                    dao.resultSet.getString("nomeCliente"), dao.resultSet.getString("celular"), dao.resultSet.getString("nomeFuncionarios")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "DATA NAO ENCONTRADA");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(150);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(110);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(5).setResizable(false);
        jLista.getColumnModel().getColumn(6).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(6).setResizable(false);
        jLista.getColumnModel().getColumn(7).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(7).setResizable(false);
       

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA LISTAR COMPRAS">
    public void preencherTabela2(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"idLote", "dataCompra", "nomeProduto", "descricao", "fornecedor", "qtdEstoque", "valorCusto", "marca"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                String A = dao.resultSet.getString("dataCompra").substring(0, 4);
                String B = dao.resultSet.getString("dataCompra").substring(5, 7);
                String C = dao.resultSet.getString("dataCompra").substring(8, 10);
                String dataD = C + "/" + B + "/" + A;

                dados.add(new Object[]{ dao.resultSet.getString("idLote"),dataD, dao.resultSet.getString("nomeProduto"), dao.resultSet.getString("descricao"),
                    dao.resultSet.getString("nomeEmpresa"), dao.resultSet.getString("qtdEstoque"), dao.resultSet.getString("valorCusto"),
                    dao.resultSet.getString("marca")});
            
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DATA NAO ENCONTRADA");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(100);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(5).setResizable(false);
        jLista.getColumnModel().getColumn(6).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(6).setResizable(false);
        jLista.getColumnModel().getColumn(7).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(7).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR LISTAR VENDAS">
    public void LimparTabela() {

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"cod", "dataVenda", "nomeProduto", "qtd", "valorParcial", "codVenda"};

        dados.add(new Object[]{"", "", "", "", "", ""});
        dados.removeAll(dados);

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(350);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(0);
        jLista.getColumnModel().getColumn(5).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR LISTAR COMPRAS">
    public void LimparTabela2() {

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"dataCompra", "nomeProduto", "descricao", "nomeEmpresa", "qtdEstoque", "valorCusto", "marca"};

        dados.add(new Object[]{"", "", "", "", "", "", "", ""});
        dados.removeAll(dados);

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(110);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(5).setResizable(false);
        jLista.getColumnModel().getColumn(6).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(6).setResizable(false);
        jLista.getColumnModel().getColumn(7).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(7).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO LIMPAR TABELA ORDEM DE SERVICO">
    public void LimparTabela3() {

        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"IdServico", "dataSolitacao", "dataEntrega", "tipoServico", "descricao", "valorTotal", "nomeCliente", "cpf",
            "telefone"};

        dados.add(new Object[]{"", "", "", "", "", "", "", "", ""});
        dados.removeAll(dados);
        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(110);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(5).setResizable(false);
        jLista.getColumnModel().getColumn(6).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(6).setResizable(false);
        jLista.getColumnModel().getColumn(7).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(7).setResizable(false);
        jLista.getColumnModel().getColumn(8).setPreferredWidth(150);
        jLista.getColumnModel().getColumn(8).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPDF;
    private javax.swing.JButton btnPesquisLista;
    private javax.swing.JCheckBox cbLc;
    private javax.swing.JCheckBox cbLv;
    private javax.swing.JCheckBox cbOs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtData1;
    private javax.swing.JFormattedTextField txtData2;
    // End of variables declaration//GEN-END:variables
}
