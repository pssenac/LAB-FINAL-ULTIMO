package Models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAO {

    public Cliente cliente;
    public Funcionario funcionario;
    public Usuario usuario;
    public Fornecedor fornecedor;
    public Produto produto;
    public Venda venda;
    public VendaProdutos vendaProdutos;
    public OrdemServiço ordemservico;
    public OrdemProdutos ordemProdutos;
    public Endereco endereco;
    public Lote lote;
    public VendaCarrinho VendaCarrinho;

    public ConexaoBD bd;
    private PreparedStatement statement;
    public Statement stm;
    public ResultSet resultSet;
    private String men, sql;
    public String Acesso;
    public String Perfil;
    public String Situacao;

    public static final byte INCLUSAOCLIENTE = 1;
    public static final byte ALTERACAOCLIENTE = 2;
    public static final byte INCLUSAOFUNCIONARIO = 3;
    public static final byte ALTERACAOFUNCIONARIO = 4;
    public static final byte EXCLUSAOUSUARIO = 7;
    public static final byte INCLUSAOFORNECEDOR = 8;
    public static final byte ALTERACAOFORNECEDOR = 9;
    public static final byte INCLUSAOPRODUTO = 10;
    public static final byte ALTERACAOPRODUTO = 11;
    public static final byte INCLUSAOVENDA = 12;
    public static final byte ALTERACAOVENDA = 13;
    public static final byte INCLUSAOVENDAPRODUTO = 14;
    public static final byte ALTERACAOVENDAPRODUTO = 15;
    public static final byte INCLUSAOORDEMSERVICO = 16;
    public static final byte ALTERACAOORDEMSERVICO = 17;
    public static final byte INCLUSAOORDEMPRODUTO = 18;
    public static final byte ALTERACAOORDEMPRODUTO = 19;
    public static final byte INCLUSAOENDERECO = 20;
    public static final byte ALTERACAOENDERECO = 21;

    //<editor-fold defaultstate="collapsed" desc=" METODO DAO "> 
    public DAO() {
        bd = new ConexaoBD();
        cliente = new Cliente();
        funcionario = new Funcionario();
        usuario = new Usuario();
        fornecedor = new Fornecedor();
        produto = new Produto();
        venda = new Venda();
        vendaProdutos = new VendaProdutos();
        ordemservico = new OrdemServiço();
        ordemProdutos = new OrdemProdutos();
        endereco = new Endereco();
        lote = new Lote();
        VendaCarrinho = new VendaCarrinho();

        if (!bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" EXECUTAR SQL "> 
    public void executaSQL(String sql) {
        try {
            boolean resp;
            resp = bd.getConnection();
            if (resp == true) {
                // tipo case sensitive e pode percorrer tanto do início para o fim quanto do fim para o início
                stm = bd.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                resultSet = stm.executeQuery(sql);

            } else {
                JOptionPane.showMessageDialog(null, "Não conectou.");
            }
        } catch (SQLException erro) {
        }
    }

    public String buscarFuncionario(String cod) {
        String resultado = "";
        try {
            sql = "select * from funcionario where codigoFuncionarios = ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cod);
            ResultSet fk = statement.executeQuery();
            if (fk.next()) {
                resultado = fk.getString("idFuncionario");
                return resultado;

            } else {
                JOptionPane.showMessageDialog(null, "O codigo de Funcionario informado não existe");
                resultado = ";";
                return resultado;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);

        }
        return resultado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR CLIENTE ">
    public void carregarTabela() {
        String sql = "select * from cliente";
        try {
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    public String atualizarCliente(int operacao) {
        String FK;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // CLIENTE 
                case INCLUSAOCLIENTE:

                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    ResultSet fk = statement.executeQuery();
                    if (fk.next()) {
                        fk.getString("idendereco");

                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();

                    }

                    String x = fk.getString("idendereco");

                    sql = "insert into cliente (nomeCliente, cpf, rg, telefone, celular, email,FKendereco) values(?,?,?,?,?,?,?)";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.setString(7, x);
                    statement.executeUpdate();
                    statement.close();
                    break;

                case ALTERACAOCLIENTE:
                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    fk = statement.executeQuery();
                    if (fk.next()) {
                        FK = fk.getString("idendereco");

                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();
                        FK = fk.getString("idendereco");

                    }

                    sql = "update Cliente set nomeCliente = ?, cpf = ?, rg = ?,"
                            + " telefone = ?,celular = ?,email = ?, FKendereco = ? where idcliente = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.setString(7, FK);
                    statement.setString(8, cliente.getIdCliente());

                    statement.executeUpdate();
                    statement.close();
                    break;

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;

    }

//PESQUISA CPF CLIENTE
    public boolean clicpf(String cpf) {
        boolean autenticado = false;

        try {

            sql = "select * from cliente where cpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("cpf");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }

    public String BuscarIdcli(String cpf) {
        String aux = "";
        try {
            sql = "select * from cliente where cpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet nome = statement.executeQuery();
            nome.next();
            aux = nome.getString("idcliente");
            return aux;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return aux;

    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR FORNECEDOR ">
    public void carregarTabela2() {
        String sql = "select * from fornecedor";
        try {
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    public String atualizarFornecedor(int operacao) {
        int FK;
        String FKE;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // FORNECEDOR 
                case INCLUSAOFORNECEDOR:

                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    ResultSet fk = statement.executeQuery();
                    if (fk.next()) {
                        FK = fk.getInt("idendereco");

                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();

                        FK = fk.getInt("idendereco");

                    }

                    String x = Integer.toString(FK);

                    sql = "insert into fornecedor values(null,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, fornecedor.getCnpjcpfFornecedor());
                    statement.setString(2, fornecedor.getNomeEmpresa());
                    statement.setString(3, fornecedor.getNomeFantasia());
                    statement.setString(4, fornecedor.getRamo());
                    statement.setString(5, fornecedor.getNomeRepresentante());
                    statement.setString(6, fornecedor.getContatoFixo());
                    statement.setString(7, fornecedor.getContatoCel());
                    statement.setString(8, fornecedor.getEmailRepresentante());
                    statement.setInt(9, FK);

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOFORNECEDOR:
                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    fk = statement.executeQuery();
                    fk.first();
                    if (fk.next()) {
                        FKE = fk.getString("idendereco");

                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();
                        FKE = fk.getString("idendereco");

                    }

                    sql = "update fornecedor set cnpjCpf = ?, nomeEmpresa = ?, nomeFantasia = ?, ramo = ?,"
                            + " representante = ?, contatoFixo  = ?, contatoCel  = ?,emailRep = ?, FKendereco = ? where idfornecedor = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, fornecedor.getCnpjcpfFornecedor());
                    statement.setString(2, fornecedor.getNomeEmpresa());
                    statement.setString(3, fornecedor.getNomeFantasia());
                    statement.setString(4, fornecedor.getRamo());
                    statement.setString(5, fornecedor.getNomeRepresentante());
                    statement.setString(6, fornecedor.getContatoFixo());
                    statement.setString(7, fornecedor.getContatoCel());
                    statement.setString(8, fornecedor.getEmailRepresentante());
                    statement.setString(9, FKE);
                    statement.setString(10, fornecedor.getIdFornecedor());
                    statement.executeUpdate();
                    statement.close();
                    break;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
    }

    //PESQUISA CNPJ FORNECEDOR
    public boolean pesquisaCnpj(String cnpj) {
        boolean autenticado = false;

        try {

            sql = "select * from fornecedor where cnpjCpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cnpj);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }

//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR FUNCIONARIO E USUARIO">
    public String atualizarFuncionarioUsuario(int operacao) {
        String FK, FK2;
        try {
            switch (operacao) {

                // ENDERECO
                case INCLUSAOFUNCIONARIO:

                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    ResultSet fk = statement.executeQuery();
                    if (fk.next()) {
                        fk.getString("idendereco");

                    } else {

                        sql = "insert into endereco values(null,?,?,?,?,?,?,?)";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select* from endereco where cep =? and logradouro =? and numero =?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();
                        /*
                    ResultSet fk = statement.executeQuery();
                    fk.next();
                    String FKend = fk.getString("idendereco");*/
                    }
                    // FUNCIONARIO
                    String FKend = fk.getString("idendereco");

                    sql = "insert into funcionario values(null,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getNomeFuncionario());
                    statement.setString(2, funcionario.getCpfFuncionario());
                    statement.setString(3, funcionario.getRgFuncionario());
                    statement.setString(4, funcionario.getTelFuncionario());
                    statement.setString(5, funcionario.getCelFuncionario());
                    statement.setString(6, funcionario.getEmailFuncionario());
                    statement.setString(7, funcionario.getDataNascFuncionario());
                    statement.setString(8, funcionario.getCodigoFuncionario());
                    statement.setString(9, FKend);
                    statement.executeUpdate();

                    sql = "select* from funcionario where cpf =? and rg =?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getCpfFuncionario());
                    statement.setString(2, funcionario.getRgFuncionario());
                    ResultSet fk2 = statement.executeQuery();
                    fk2.next();
                    String FKfcn = fk2.getString("idfuncionario");

                    // USUARIO
                    sql = "insert into usuario values(null,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getLoginUsuario());
                    statement.setInt(2, usuario.getPerfilUsuario());
                    statement.setString(3, usuario.getSenhaUsuario());
                    statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                    statement.setInt(5, usuario.getSituacao());
                    statement.setString(6, FKfcn);
                    statement.executeUpdate();
                    statement.close();

                    break;

                case ALTERACAOFUNCIONARIO:

                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    fk = statement.executeQuery();
                    if (fk.next()) {
                        FK = fk.getString("idendereco");
                      
                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();
                        FK = fk.getString("idendereco");

                    }
                    /*
                    sql = "SELECT idfuncionario FROM funcionario INNER JOIN endereco ON "
                            + "endereco.idendereco = funcionario.FKendereco INNER JOIN usuario ON "
                            + "usuario.idUsuario = usuario.FKfuncionario WHERE cpf =? and rg =? ";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getCpfFuncionario());
                    statement.setString(2, funcionario.getRgFuncionario());
                    ResultSet cv = statement.executeQuery();
                    cv.next();
                    String cvf = cv.getString("idfuncionario");
                     */
                    
                    sql = "update funcionario set  nomeFuncionarios = ?,  cpf = ?, rg = ?, telefone = ?,"
                            + "  celular = ?,  email = ?,  dataNascimento = ?, FKendereco = ? where idfuncionario = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getNomeFuncionario());
                    statement.setString(2, funcionario.getCpfFuncionario());
                    statement.setString(3, funcionario.getRgFuncionario());
                    statement.setString(4, funcionario.getTelFuncionario());
                    statement.setString(5, funcionario.getCelFuncionario());
                    statement.setString(6, funcionario.getEmailFuncionario());
                    statement.setString(7, funcionario.getDataNascFuncionario());
                    statement.setString(8, FK);
                    statement.setString(9, funcionario.getIdFuncionario());
                    statement.executeUpdate();

                    /* sql = "update endereco set cep  = ?, bairro = ?, logradouro = ?, complemento = ?,"
                            + "  numero = ?,  cidade = ?,  estado = ?  where idendereco = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, cvf);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());
                    statement.executeUpdate();*/
                   
                    sql = "select idUsuario from usuario inner join funcionario on FKfuncionario = idFuncionario where FKfuncionario = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                  
                    statement.setString(1, funcionario.getIdFuncionario());
                    fk = statement.executeQuery();
                    fk.next();
                    FK2 = fk.getString("idUsuario");
                    
                    
                    sql = "UPDATE usuario SET login = ?, perfil = ?, senha = ?, confiSenha = ?, situacao = ? WHERE idUsuario = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getLoginUsuario());
                    statement.setInt(2, usuario.getPerfilUsuario());
                    statement.setString(3, usuario.getSenhaUsuario());
                    statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                    statement.setInt(5, usuario.getSituacao());
                    statement.setString(6, FK2);
                    statement.executeUpdate();

                    statement.close();

                    break;

                /* case EXCLUSAOUSUARIO:
                    sql = "delete from usuario where  = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getIdUsuario());
                    statement.executeUpdate();
                    statement.close();
                    break;
                 */
                default:
                    men = "Falha na operação!";
                    break;
            }
        } catch (SQLException erro) {
            men = "Falha na operação: \n" + erro.toString();
        }
        return men;
    }

    // PESQUISAR  CEP FUNCIONARIO
    public boolean cslEndereco(String cep) {
        boolean autenticado = false;

        try {

            sql = "select * from endereco where cep= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cep);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("cep");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }

    //PESQUISA CPF FUNCIONARIO
    public boolean cslcpf(String cpf) {
        boolean autenticado = false;

        try {

            sql = "select * from funcionario where cpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("cpf");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }

    //PESQUISA USUARIO FUNCIONARIO
    public boolean csluser(String login) {
        boolean autenticado = false;

        try {

            sql = "select * from usuario where login= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, login);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("login");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR PRODUTO ">
    public String atualizarProduto(int operacao) {
        int FK;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // Produto
                case INCLUSAOPRODUTO:

                    sql = "insert into produtos values(null,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, produto.getNomeProduto());
                    statement.setString(2, produto.getDescricao());
                    statement.setString(3, produto.getArmazemLocal());
                    statement.setString(4, produto.getTipoProduto());
                    statement.executeUpdate();
                    sql = "SELECT idprodutos FROM produtos ORDER BY idprodutos DESC LIMIT 1";
                    statement = bd.connection.prepareStatement(sql);

                    ResultSet fk = statement.executeQuery();
                    while (fk.next()) {
                        FK = fk.getInt("idprodutos");
                        sql = "insert into lote values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, lote.getDataCompra());
                        statement.setString(2, lote.getQuantidade());
                        statement.setString(3, lote.getQuantidadeInicial());
                        statement.setString(4, lote.getValorCusto());
                        statement.setString(5, lote.getValorVenda());
                        statement.setInt(6, lote.getSituacaoProduto());
                        statement.setString(7, lote.getMarca());
                        statement.setString(8, lote.getLote());
                        statement.setInt(9, fk.getInt("idprodutos"));
                        statement.setString(10, lote.getIcms());
                        statement.setString(11, lote.getIss());
                        statement.setString(12, lote.getIpi());
                        statement.setString(13, lote.getTotalImposto());
                        statement.setString(14, lote.getFkFornecedor());
                        statement.executeUpdate();
                    }

                    statement.close();
                    break;
                case ALTERACAOPRODUTO:

          
                    sql = "update produtos set nomeProduto = ?, descricao = ?, armazemLocal = ?, tipoProduto = ? where idprodutos = ?";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, produto.getNomeProduto());
                    statement.setString(2, produto.getDescricao());
                    statement.setString(3, produto.getArmazemLocal());
                    statement.setString(4, produto.getTipoProduto());
                    statement.setString(5, produto.getIdProduto());
                    statement.executeUpdate();
                    break;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
    }

    public List<Fornecedor> read() {
        men = "operação realizada com sucesso";
        String sql = "SELECT * FROM fornecedor";
        List<Fornecedor> nomeFor = new ArrayList<>();
        try {
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Fornecedor nomeFornecedor = new Fornecedor();
                nomeFornecedor.setIdFornecedor(resultSet.getString("idfornecedor"));
                nomeFornecedor.setNomeEmpresa(resultSet.getString("nomeEmpresa"));
                nomeFor.add(nomeFornecedor);
                statement.close();
            }

        } catch (SQLException erro) {
            men = "Falha na operação: \n" + erro.toString();

        }
        return nomeFor;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR VENDAS ">
    public int PesquisaEstoque(String CodVend) {
        String fk;
        men = "Operação realizada com sucesso!";
        try {
            String sql = "select * from lote where FKprodutos = ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, CodVend);
            resultSet = statement.executeQuery();
            resultSet.next();
            resultSet.getString("qtdEstoque");
            return resultSet.getInt(3);
        } catch (SQLException erro) {

        }
        return 0;
    }

    public String Atualizarvendas(int operacao) {
        int FK;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // Produto
                case INCLUSAOVENDA:
                    sql = "insert into vendas values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, VendaCarrinho.getDesconto());
                    statement.setString(2, VendaCarrinho.getTipoPagamento());
                    statement.setString(3, VendaCarrinho.getDataVenda());
                    statement.setString(4, VendaCarrinho.getObservacao());
                    statement.setString(5, VendaCarrinho.getEstorno());
                    statement.setString(6, VendaCarrinho.getIcms());
                    statement.setString(7, VendaCarrinho.getIss());
                    statement.setString(8, VendaCarrinho.getIpi());
                    statement.setString(9, VendaCarrinho.getFKfuncionario());
                    statement.setString(10, VendaCarrinho.getCodVenda());
                    statement.setString(11, VendaCarrinho.getCodFuncionário());
                    statement.setString(12, VendaCarrinho.getValorTotal());
                    statement.setString(13, VendaCarrinho.getDinheiro());
                    statement.setString(14, VendaCarrinho.getCartao());
                    statement.setString(15, VendaCarrinho.getTroco());
                    statement.executeUpdate();
                    statement.close();

                    break;

                // Inserção VendaProduto
                case INCLUSAOVENDAPRODUTO:

                    sql = "select * from vendas order by codVenda desc limit 1";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    ResultSet fk = statement.executeQuery();
                    fk.next();

                    sql = "insert into lotevendas values (?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, vendaProdutos.getFkLoteVendas());
                    statement.setString(2, fk.getString("codVenda"));
                    statement.setString(3, vendaProdutos.getQtd());
                    statement.setString(4, vendaProdutos.getDescontoItemVendProduto());
                    statement.setString(5, vendaProdutos.getValorParcialVendProduto());
                    statement.setString(6, vendaProdutos.getCodVenda());
                    statement.executeUpdate();
                    statement.close();

                    sql = "update lote set qtdEstoque = qtdEstoque - ? where idLote = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, vendaProdutos.getQtd());
                    statement.setString(2, vendaProdutos.getFkLoteVendas());
                    statement.executeUpdate();
                    statement.close();

                    break;

                case ALTERACAOVENDA:

                    break;

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR ">
/*
    public String atualizar(int operacao) {
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // CLIENTE 
                case 1:
                    sql = "insert into Cliente values(null,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.executeUpdate();
                    statement.close();
                    break;

                case ALTERACAOCLIENTE:
                    sql = "update Cliente set   = ?,  = ?,   = ?,"
                            + "   = ?,   = ?,   = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, cliente.getIdCliente());
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.executeUpdate();
                    statement.close();
                    break;

                // FORNECEDOR
                // PROODUTO
                // VENDA
                // VENDA PRODUTO
                case INCLUSAOVENDAPRODUTO:
                    sql = "insert into VendaProduto values(?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, vendaProdutos.getFkProdutoVendProduto());
                    statement.setInt(2, vendaProdutos.getFkVendaVendProduto());
                    statement.setInt(3, vendaProdutos.getQtdItensVendProduto());
                    statement.setDouble(4, vendaProdutos.getDescontoItemVendProduto());
                    statement.setDouble(5, vendaProdutos.getValorParcialVendProduto());
                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOVENDAPRODUTO:
                    sql = "update VendaProduto set   = ?,  = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, vendaProdutos.getFkProdutoVendProduto());
                    statement.setInt(2, vendaProdutos.getFkVendaVendProduto());
                    statement.setInt(3, vendaProdutos.getQtdItensVendProduto());
                    statement.setDouble(4, vendaProdutos.getDescontoItemVendProduto());
                    statement.setDouble(5, vendaProdutos.getValorParcialVendProduto());

                    statement.executeUpdate();
                    statement.close();
                    break;

                // ORDEM SERVICO
                case INCLUSAOORDEMSERVICO:
                    sql = "insert into OrdemServico  values(null,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, ordemservico.getTipoServico());
                    statement.setDouble(2, ordemservico.getValorServico());
                    statement.setDate(3, (Date) ordemservico.getDataEntregaServico());
                    statement.setDate(4, (Date) ordemservico.getDataSolicitacaoServico());
                    statement.setInt(5, ordemservico.getPrioridadeServico());
                    statement.setString(6, ordemservico.getDescricaoServico());
                    statement.setString(7, ordemservico.getRespTecnicoServico());
                    statement.setString(8, ordemservico.getObservacaoServico());
                    statement.setInt(9, ordemservico.getFkclienteServico());
                    statement.setInt(10, ordemservico.getFkfuncioanrioServico());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOORDEMSERVICO:
                    sql = "update OrdemServico set   = ?,  = ?,  = ?,  = ?,  = ?,"
                            + "   = ?,   = ?,   = ?, = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(11, ordemservico.getIdServico());
                    statement.setString(1, ordemservico.getTipoServico());
                    statement.setDouble(2, ordemservico.getValorServico());
                    statement.setDate(3, (Date) ordemservico.getDataEntregaServico());
                    statement.setDate(4, (Date) ordemservico.getDataSolicitacaoServico());
                    statement.setInt(5, ordemservico.getPrioridadeServico());
                    statement.setString(6, ordemservico.getDescricaoServico());
                    statement.setString(7, ordemservico.getRespTecnicoServico());
                    statement.setString(8, ordemservico.getObservacaoServico());
                    statement.setInt(9, ordemservico.getFkclienteServico());
                    statement.setInt(10, ordemservico.getFkfuncioanrioServico());
                    statement.executeUpdate();
                    statement.close();
                    break;

                // ORDEM PRODUTO
                case INCLUSAOORDEMPRODUTO:
                    sql = "insert into OrdemProdutos values(?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, ordemProdutos.getFkOrdemServicoOrdProdutos());
                    statement.setInt(2, ordemProdutos.getFkprodutosOrdProdutos());
                    statement.setInt(3, ordemProdutos.getQtdProdutoOrdProdutos());
                    statement.setDouble(4, ordemProdutos.getValorParcialOrdProdutos());
                    statement.setDouble(5, ordemProdutos.getDescontoParcialOrdProdutos());

                    statement.executeUpdate();
                    statement.close();

                    break;
                case ALTERACAOORDEMPRODUTO:
                    sql = "update OrdemProdutos set   = ?,  = ?, = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, ordemProdutos.getFkOrdemServicoOrdProdutos());
                    statement.setInt(2, ordemProdutos.getFkprodutosOrdProdutos());
                    statement.setInt(3, ordemProdutos.getQtdProdutoOrdProdutos());
                    statement.setDouble(4, ordemProdutos.getValorParcialOrdProdutos());
                    statement.setDouble(5, ordemProdutos.getDescontoParcialOrdProdutos());

                    statement.executeUpdate();
                    statement.close();
                    break;

                // ENDERECO
                case INCLUSAOENDERECO:
                    sql = "insert into endereco values(null,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOENDERECO:
                    sql = "update endereco set   = ?,  = ?, = ?, = ?,"
                            + "   = ?,   = ?,   = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, endereco.getCep());
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());

                    statement.executeUpdate();
                    statement.close();
                    break;

                default:
                    men = "Falha na operação!";
                    break;
            }
        } catch (SQLException erro) {
            men = "Falha na operação: \n" + erro.toString();
        }
        return men;
    }*/
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" METODO LOGAR USUARIO">
    public boolean LogarUsuario(String login, String Senha) {
        boolean autenticado = false;

        try {

            sql = "select * from usuario where login= ? and senha=?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, login);
            statement.setString(2, Senha);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {

                Perfil = rs.getString("perfil");
                Situacao = rs.getString("situacao");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" METODO ORDEM DE SERVIÇO">
    public String AtualizarOrdemServico(int operacao) {
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // Produto
                case INCLUSAOORDEMSERVICO:

                    sql = "insert into ordemservico values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, ordemservico.getTipoServico());
                    statement.setString(2, ordemservico.getValorServico());
                    statement.setString(3, ordemservico.getDataEntrega());
                    statement.setString(4, ordemservico.getDataSolitacao());
                    statement.setString(5, ordemservico.getPrioridade());
                    statement.setString(6, ordemservico.getDescricao());
                    statement.setString(7, ordemservico.getTipoPagamento());
                    statement.setString(8, ordemservico.getCodigoFuncionario());
                    statement.setString(9, ordemservico.getIcms());
                    statement.setString(10, ordemservico.getIss());
                    statement.setString(11, ordemservico.getIpi());
                    statement.setString(12, ordemservico.getValorTotal());
                    statement.setString(13, ordemservico.getCpfCliente());
                    statement.setString(14, ordemservico.getCodigoOrdem());
                    statement.setString(15, ordemservico.getFKcliente());
                    statement.setString(16, ordemservico.getFKfuncionario());
                    statement.setString(17, ordemservico.getObservacao());
                    statement.setString(18, ordemservico.getEstorno());
                    statement.setString(19, ordemservico.getDesconto());
                    statement.setString(20, ordemservico.getDinheiro());
                    statement.setString(21, ordemservico.getCartao());
                    statement.setString(22, ordemservico.getTroco());
                    
                    statement.executeUpdate();
                    statement.close();

                    break;

                // Inserção VendaProduto
                case INCLUSAOORDEMPRODUTO:

                    sql = "select * from ordemservico order by IdServico desc limit 1";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    ResultSet fk = statement.executeQuery();
                    fk.next();

                    sql = "insert into ordemlote values (?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, fk.getString("IdServico"));
                    statement.setString(2, ordemProdutos.getFKlote());
                    statement.setString(3, ordemProdutos.getQtd());
                    statement.setString(4, ordemProdutos.getDesconto());
                    statement.setString(5, ordemProdutos.getValorParcial());
                    statement.setString(6, ordemProdutos.getCodigoOrdem());
                    statement.executeUpdate();
                    statement.close();

                    break;

                case ALTERACAOVENDA:

                    break;

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
    }

    public String PesquisaCliente(String cpf) {
        String aux = "";
        try {
            sql = "select * from cliente where cpf = ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet nome = statement.executeQuery();
            if(nome.next()){
            
            return nome.getString("nomeCliente");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return aux;
    }

    public String PesquisaCliente2(String cpf) {
        String aux = "";
        try {
            sql = "select * from cliente where cpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet nome = statement.executeQuery();
            nome.next();
            aux = nome.getString("telefone");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return aux;
    }

    public String PesquisaCliente3(String cpf) {
        String aux = "";
        try {
            sql = "select * from cliente where cpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet nome = statement.executeQuery();
            nome.next();
            aux = nome.getString("celular");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return aux;
    }

    //</editor-fold>
}
