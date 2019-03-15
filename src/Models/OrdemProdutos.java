
package Models;


public class OrdemProdutos {
      private String FKordemServico, FKlote, qtd, desconto, valorParcial, codigoOrdem;

    /**
     * @return the FKordemServico
     */
    public String getFKordemServico() {
        return FKordemServico;
    }

    /**
     * @param FKordemServico the FKordemServico to set
     */
    public void setFKordemServico(String FKordemServico) {
        this.FKordemServico = FKordemServico;
    }

    /**
     * @return the FKlote
     */
    public String getFKlote() {
        return FKlote;
    }

    /**
     * @param FKlote the FKlote to set
     */
    public void setFKlote(String FKlote) {
        this.FKlote = FKlote;
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
     * @return the desconto
     */
    public String getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorParcial
     */
    public String getValorParcial() {
        return valorParcial;
    }

    /**
     * @param valorParcial the valorParcial to set
     */
    public void setValorParcial(String valorParcial) {
        this.valorParcial = valorParcial;
    }

    /**
     * @return the codigoOrdem
     */
    public String getCodigoOrdem() {
        return codigoOrdem;
    }

    /**
     * @param codigoOrdem the codigoOrdem to set
     */
    public void setCodigoOrdem(String codigoOrdem) {
        this.codigoOrdem = codigoOrdem;
    }

    
}
