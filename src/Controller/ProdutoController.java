package Controller;

import Models.DAO;
import java.util.Date;
import javax.swing.JOptionPane;

public class ProdutoController {

    public String salvarProduto(String nomeProduto, String descricao, String armazemLocal,
            String tipoProduto, String totalImposto, String icms, String iss,
            String ipi, String fkFornecedorProduto,
            String dataCompra, String qtdEstoque, String qtdInicial, String valorCusto, String valorVenda,
            int situacaoProduto, String marca, String lote, String lp, String idl) {

        DAO dao = new DAO();

        dao.produto.setNomeProduto(nomeProduto);
        
        dao.produto.setDescricao(descricao);
        dao.produto.setArmazemLocal(armazemLocal);
        dao.produto.setTipoProduto(tipoProduto);
        
        
        String data10 = dataCompra;
        String data1 = data10.replaceAll("/", "");
        String data2 = data1.substring(0, 2);
        String data3 = data1.substring(2, 4);
        String data4 = data1.substring(4, 8);
        String dataC = data4 + "-" + data3 + "-" + data2;

      

        dao.lote.setDataCompra(dataC);
        dao.lote.setQuantidade(qtdEstoque);
        dao.lote.setQuantidadeInicial(qtdInicial);
        dao.lote.setValorCusto(valorCusto);
        dao.lote.setValorVenda(valorVenda);
        dao.lote.setSituacaoProduto(situacaoProduto);
        dao.lote.setMarca(marca);
        dao.lote.setLote(lote);
        dao.lote.setIpi(ipi);
        dao.lote.setIcms(icms);
        dao.lote.setIss(iss);
        dao.lote.setTotalImposto(totalImposto);
        dao.lote.setFkFornecedor(fkFornecedorProduto);
        dao.produto.setLpp(lp);
        dao.lote.setIdLote(idl);
        

        JOptionPane.showMessageDialog(null, dao.atualizarProduto(DAO.INCLUSAOPRODUTO));
        String msgInclusao = "";
        return msgInclusao;
    }

    public String alterarProduto(String idProduto, String nomeProduto, String descricao, String armazemLocal,
            String tipoProduto) {

        DAO dao = new DAO();
        dao.produto.setIdProduto(idProduto);
        dao.produto.setNomeProduto(nomeProduto);
        dao.produto.setDescricao(descricao);
        dao.produto.setArmazemLocal(armazemLocal);
        dao.produto.setTipoProduto(tipoProduto);

        
        String msgInclusao = "";
        JOptionPane.showMessageDialog(null, dao.atualizarProduto(DAO.ALTERACAOPRODUTO));
        return msgInclusao;
    }
}
