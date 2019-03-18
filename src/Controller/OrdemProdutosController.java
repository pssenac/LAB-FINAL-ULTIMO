package Controller;

import Models.DAO;
import Models.OrdemProdutos;
import Models.Venda;
import javax.swing.JOptionPane;

public class OrdemProdutosController {

    public Venda preencherCarrinho(String a, String b, String c, String d, String e, String f, String g, String h) {
        DAO dao = new DAO();

        dao.venda.setA(a);
        dao.venda.setB(b);
        dao.venda.setC(c);
        dao.venda.setD(d);
        dao.venda.setE(e);
        dao.venda.setF(f);
        dao.venda.setG(g);
        dao.venda.setH(h);

        return dao.venda;
    }

    public void salvarOrdemServico(String a, String b, String c, String d, String e,
            String f, String g, String h, String i, String j, String k, String l,
            String m, String n, String o, String p, String q, String r,String s, String t, String u ,String v) {
        DAO dao = new DAO();

        dao.ordemservico.setTipoServico(a);
        dao.ordemservico.setValorServico(b);
        dao.ordemservico.setDataEntrega(c);
        dao.ordemservico.setDataSolitacao(d);
        dao.ordemservico.setPrioridade(e);
        dao.ordemservico.setDescricao(f);
        dao.ordemservico.setTipoPagamento(g);
        dao.ordemservico.setCodigoFuncionario(h);
        dao.ordemservico.setIcms(i);
        dao.ordemservico.setIss(j);
        dao.ordemservico.setIpi(k);
        dao.ordemservico.setValorTotal(l);
        dao.ordemservico.setCpfCliente(m);
        dao.ordemservico.setCodigoOrdem(n);
        dao.ordemservico.setFKcliente(o);
        dao.ordemservico.setFKfuncionario(p);
        dao.ordemservico.setObservacao(q);
        dao.ordemservico.setEstorno(r);
        dao.ordemservico.setDesconto(s);
        dao.ordemservico.setDinheiro(t);
        dao.ordemservico.setCartao(u);
        dao.ordemservico.setTroco(v);

        dao.AtualizarOrdemServico(DAO.INCLUSAOORDEMSERVICO);
    }

    public void salvarLoteOrdem(String a, String b, String c, String d, String e) {
        DAO dao = new DAO();
       dao.ordemProdutos.setFKlote(a);
        dao.ordemProdutos.setQtd(b);
        dao.ordemProdutos.setDesconto(c);
        dao.ordemProdutos.setValorParcial(d);
        dao.ordemProdutos.setCodigoOrdem(e);

        JOptionPane.showMessageDialog(null, dao.AtualizarOrdemServico(DAO.INCLUSAOORDEMPRODUTO));
    }

    public String pesquisarCliente(String cpf) {
        String aux = "";
        DAO dao = new DAO();
        aux = dao.PesquisaCliente(cpf);

        return aux;
    }

    public String pesquisarCliente2(String cpf) {
        String aux = "", aux2 = "", a = "";
        DAO dao = new DAO();
        aux = dao.PesquisaCliente2(cpf);
        aux2 = dao.PesquisaCliente3(cpf);

        if (aux2 == "") {
            a = aux;
        } else {
            a = aux2;
        }

        return a;
    }

    public OrdemProdutos preencherCarrinhoOrdem(String id, String b, String c, String d, String e) {

        DAO dao = new DAO();
        dao.ordemProdutos.setFKlote(id);
        dao.ordemProdutos.setQtd(b);
        dao.ordemProdutos.setDesconto(c);
        dao.ordemProdutos.setValorParcial(d);
        dao.ordemProdutos.setCodigoOrdem(e);

        return dao.ordemProdutos;
    }
}
