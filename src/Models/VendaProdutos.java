

package Models;


public class VendaProdutos {

    /**
     * @return the estorno
     */
    public String getEstorno() {
        return estorno;
    }

    /**
     * @param estorno the estorno to set
     */
    public void setEstorno(String estorno) {
        this.estorno = estorno;
    }

  

    /**
     * @return the fkLoteVendas
     */
    public String getFkLoteVendas() {
        return fkLoteVendas;
    }

    /**
     * @param fkLoteVendas the fkLoteVendas to set
     */
    public void setFkLoteVendas(String fkLoteVendas) {
        this.fkLoteVendas = fkLoteVendas;
    }

    /**
     * @return the fkVendas
     */
    public String getFkVendas() {
        return fkVendas;
    }

    /**
     * @param fkVendas the fkVendas to set
     */
    public void setFkVendas(String fkVendas) {
        this.fkVendas = fkVendas;
    }

    /**
     * @return the qtd
     */
    public String getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the descontoItemVendProduto
     */
    public String getDescontoItemVendProduto() {
        return descontoItemVendProduto;
    }

    /**
     * @param descontoItemVendProduto the descontoItemVendProduto to set
     */
    public void setDescontoItemVendProduto(String descontoItemVendProduto) {
        this.descontoItemVendProduto = descontoItemVendProduto;
    }

    /**
     * @return the valorParcialVendProduto
     */
    public String getValorParcialVendProduto() {
        return valorParcialVendProduto;
    }

    /**
     * @param valorParcialVendProduto the valorParcialVendProduto to set
     */
    public void setValorParcialVendProduto(String valorParcialVendProduto) {
        this.valorParcialVendProduto = valorParcialVendProduto;
    }

    /**
     * @return the codVenda
     */
    public String getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

   

   
   private String fkLoteVendas;
   private String  fkVendas;
   private String  qtd;
   private String descontoItemVendProduto;
   private String  valorParcialVendProduto;
   private String codVenda;
   private String estorno;

    
   
   
   
   
   
}          