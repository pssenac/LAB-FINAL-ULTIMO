package Models;

public class Lote {

    /**
     * @return the situacaoProduto
     */
    public int getSituacaoProduto() {
        return situacaoProduto;
    }

    /**
     * @param situacaoProduto the situacaoProduto to set
     */
    public void setSituacaoProduto(int situacaoProduto) {
        this.situacaoProduto = situacaoProduto;
    }

    /**
     * @return the quantidadeInicial
     */
    public String getQuantidadeInicial() {
        return quantidadeInicial;
    }

    /**
     * @param quantidadeInicial the quantidadeInicial to set
     */
    public void setQuantidadeInicial(String quantidadeInicial) {
        this.quantidadeInicial = quantidadeInicial;
    }

    private String idLote;
    private String dataCompra;
    private String quantidade, quantidadeInicial;
    private String qtdInicial;
    private String valorCusto;
    private String valorVenda;
    private int situacaoProduto;
    private String marca;
    private String lote;
    private String idProduto;
    private String icms, iss, ipi, totalImposto, fkFornecedor;
    
    /**
     * @return the qtdInicial
     */
    public String getQtdInicial() {
        return qtdInicial;
    }

    /**
     * @param qtdInicial the qtdInicial to set
     */
    public void setQtdInicial(String qtdInicial) {
        this.qtdInicial = qtdInicial;
    }

    /**
     * @return the icms
     */
    public String getIcms() {
        return icms;
    }

    /**
     * @param icms the icms to set
     */
    public void setIcms(String icms) {
        this.icms = icms;
    }

    /**
     * @return the iss
     */
    public String getIss() {
        return iss;
    }

    /**
     * @param iss the iss to set
     */
    public void setIss(String iss) {
        this.iss = iss;
    }

    /**
     * @return the ipi
     */
    public String getIpi() {
        return ipi;
    }

    /**
     * @param ipi the ipi to set
     */
    public void setIpi(String ipi) {
        this.ipi = ipi;
    }

    /**
     * @return the totalImposto
     */
    public String getTotalImposto() {
        return totalImposto;
    }

    /**
     * @param totalImposto the totalImposto to set
     */
    public void setTotalImposto(String totalImposto) {
        this.totalImposto = totalImposto;
    }

    /**
     * @return the fkFornecedor
     */
    public String getFkFornecedor() {
        return fkFornecedor;
    }

    /**
     * @param fkFornecedor the fkFornecedor to set
     */
    public void setFkFornecedor(String fkFornecedor) {
        this.fkFornecedor = fkFornecedor;
    }

    /**
     * @return the idLote
     */
    public String getIdLote() {
        return idLote;
    }

    /**
     * @param idLote the idLote to set
     */
    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorCusto
     */
    public String getValorCusto() {
        return valorCusto;
    }

    /**
     * @param valorCusto the valorCusto to set
     */
    public void setValorCusto(String valorCusto) {
        this.valorCusto = valorCusto;
    }

    /**
     * @return the valorVenda
     */
    public String getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the lote
     */
    public String getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(String lote) {
        this.lote = lote;
    }

    /**
     * @return the idProduto
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

}
