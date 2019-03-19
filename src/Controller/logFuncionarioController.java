package Controller;

import Models.DAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class logFuncionarioController {

    public String salvarFuncionario(String nomeFuncionario, String cpfFuncionario,
            String rgFuncionario, String telFuncionario, String celFuncionario, String emailFuncionario,
            String dataNascFuncionario, String CodFuncionario, String cep, String bairro, String logradouro,
            String complemento, String numero, String cidade, String estado, String loginUsuario,
            int perfilUsuario, String SenhaUsuario, String confirmacaoSenhaUsuario, int situacao) {

        DAO dao = new DAO();
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        dao.funcionario.setCodigoFuncionario(CodFuncionario);

        String data10 = dataNascFuncionario;
        String data1 = data10.replaceAll("/", "");
        String data2 = data1.substring(0, 2);
        String data3 = data1.substring(2, 4);
        String data4 = data1.substring(4, 8);
        String dataC = data4 + "-" + data3 + "-" + data2;

        dao.funcionario.setDataNascFuncionario(dataC);

        dao.endereco.setCep(cep);
        dao.endereco.setBairro(bairro);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setNumero(numero);
        dao.endereco.setCidade(cidade);
        dao.endereco.setEstado(estado);

        dao.usuario.setLoginUsuario(loginUsuario);
        dao.usuario.setPerfilUsuario(perfilUsuario);
        dao.usuario.setSenhaUsuario(SenhaUsuario);
        dao.usuario.setConfirmacaoSenhaUsuario(confirmacaoSenhaUsuario);
        dao.usuario.setSituacao(situacao);

       String msgInclusao = dao.atualizarFuncionarioUsuario(DAO.INCLUSAOFUNCIONARIO);
        // String msgInclusao = dao.atualizarFuncionarioUsuario(DAO.INCLUSAOFUNCIONARIO);
       
        return msgInclusao;
    }

    public String alterarFuncionario(String IdFuncionario, String nomeFuncionario, String cpfFuncionario,
            String rgFuncionario, String telFuncionario, String celFuncionario, String emailFuncionario,
            String dataNascFuncionario, String CodFuncionario,String cep, String bairro, String logradouro,
            String complemento, String numero, String cidade, String estado,
            String loginUsuario, int perfilUsuario, String SenhaUsuario, String confirmacaoSenhaUsuario, int situacao) {
        DAO dao = new DAO();
        
        dao.funcionario.setIdFuncionario(IdFuncionario);
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        
        String data10 = dataNascFuncionario;
        String data1 = data10.replaceAll("/", "");
        String data2 = data1.substring(0, 2);
        String data3 = data1.substring(2, 4);
        String data4 = data1.substring(4, 8);
        String dataC = data4 + "-" + data2 + "-" + data3;

        dao.funcionario.setDataNascFuncionario(dataC);
        dao.funcionario.setCodigoFuncionario(CodFuncionario);
        
        dao.endereco.setCep(cep);
        dao.endereco.setBairro(bairro);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setNumero(numero);
        dao.endereco.setCidade(cidade);
        dao.endereco.setEstado(estado);

        dao.usuario.setLoginUsuario(loginUsuario);
        dao.usuario.setPerfilUsuario(perfilUsuario);
        dao.usuario.setSenhaUsuario(SenhaUsuario);
        dao.usuario.setConfirmacaoSenhaUsuario(confirmacaoSenhaUsuario);
        dao.usuario.setSituacao(situacao);

        //JOptionPane.showMessageDialog(null,dao.atualizarFuncionarioUsuario(DAO.ALTERACAOFUNCIONARIO));
        String msgInclusao = dao.atualizarFuncionarioUsuario(DAO.ALTERACAOFUNCIONARIO);
        //String msgInclusao = "";
        return msgInclusao;
    }

    public boolean logarBD() {
        DAO dao = new DAO();
        boolean resp = dao.bd.getConnection();
        return resp;

    }

}
