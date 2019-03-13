
package Controller;

import Models.DAO;
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
            String m, String n, String o, String p, String q, String r) {
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

        JOptionPane.showMessageDialog(null, dao.Atualizarvendas(DAO.INCLUSAOVENDA));
    }

    public void salvarLoteVenda(String a, String b, String c, String d, String e) {
        DAO dao = new DAO();
        dao.vendaProdutos.setFkLoteVendas(a);
        dao.vendaProdutos.setQtd(b);
        dao.vendaProdutos.setDescontoItemVendProduto(c);
        dao.vendaProdutos.setValorParcialVendProduto(d);
        dao.vendaProdutos.setCodVenda(e);

        JOptionPane.showMessageDialog(null, dao.Atualizarvendas(DAO.INCLUSAOVENDAPRODUTO));
    }

    public String pesquisarCliente(String cpf) {
        String aux="";
        DAO dao = new DAO();      
        aux = dao.PesquisaCliente(cpf);
        
        return aux;
    }
}
