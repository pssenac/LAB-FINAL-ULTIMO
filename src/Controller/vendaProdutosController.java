package Controller;

import Models.DAO;
import Models.Venda;
import Models.VendaCarrinho;
import Models.VendaProdutos;
import javax.swing.JOptionPane;

public class vendaProdutosController {

    public void salvarVenda(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k) {
        DAO dao = new DAO();

        dao.VendaCarrinho.setDesconto(a);
        dao.VendaCarrinho.setTipoPagamento(b);
        dao.VendaCarrinho.setDataVenda(c);
        dao.VendaCarrinho.setObservacao(d);
        dao.VendaCarrinho.setEstorno(e);
        dao.VendaCarrinho.setIcms(f);
        dao.VendaCarrinho.setIss(g);
        dao.VendaCarrinho.setIpi(h);
        dao.VendaCarrinho.setFKfuncionario(i);
        dao.VendaCarrinho.setCodVenda(j);
        dao.VendaCarrinho.setCodFuncionário(k);

       dao.Atualizarvendas(DAO.INCLUSAOVENDA);
    }

    public void salvarLoteVenda(String a2, String b, String c, String d, String e) {
        DAO dao = new DAO();
        dao.vendaProdutos.setFkLoteVendas(a2);
        dao.vendaProdutos.setQtd(b);
        dao.vendaProdutos.setDescontoItemVendProduto(c);
        dao.vendaProdutos.setValorParcialVendProduto(d);
        dao.vendaProdutos.setCodVenda(e);

        JOptionPane.showMessageDialog(null, dao.Atualizarvendas(DAO.INCLUSAOVENDAPRODUTO));
    }

    public VendaProdutos preencherCarrinho(String id, String b, String c, String d, String e) {

        DAO dao = new DAO();
        dao.vendaProdutos.setFkLoteVendas(id);
        dao.vendaProdutos.setQtd(b);
        dao.vendaProdutos.setDescontoItemVendProduto(c);
        dao.vendaProdutos.setValorParcialVendProduto(d);
        dao.vendaProdutos.setCodVenda(e);

        return dao.vendaProdutos;
    }

    public Venda preencherArray(String a, String b, String c, String d, String e, String f, String g, String h, String j) {

        DAO dao = new DAO();
        
        dao.venda.setA(a);
        dao.venda.setB(b);
        dao.venda.setC(c);
        dao.venda.setE(e);
        dao.venda.setF(f);
        dao.venda.setH(h);
        dao.venda.setH(h);
        dao.venda.setJ(j);
        
        return dao.venda;
    }
    
    public Venda preencherArray2(String a, String b, String c, String d, String e, String f, String g, String h, String j) {

        DAO dao = new DAO();
        
        dao.venda.setA(a);
        dao.venda.setB(b);
        dao.venda.setC(c);
        dao.venda.setE(e);
        dao.venda.setF(f);
        dao.venda.setG(g);
        dao.venda.setH(h);
        dao.venda.setJ(j);
        dao.venda.setD(d);
        
        return dao.venda;
    }

}
