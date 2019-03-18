package Models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class VendaCarrinho {

    /**
     * @return the dinheiro
     */
    public String getDinheiro() {
        return dinheiro;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * @return the cartao
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartao to set
     */
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    /**
     * @return the troco
     */
    public String getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(String troco) {
        this.troco = troco;
    }

    /**
     * @return the idVenda
     */
    public String getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
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
     * @return the tipoPagamento
     */
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /**
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

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
     * @return the FKfuncionario
     */
    public String getFKfuncionario() {
        return FKfuncionario;
    }

    /**
     * @param FKfuncionario the FKfuncionario to set
     */
    public void setFKfuncionario(String FKfuncionario) {
        this.FKfuncionario = FKfuncionario;
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

    /**
     * @return the codFuncionário
     */
    public String getCodFuncionário() {
        return codFuncionário;
    }

    /**
     * @param codFuncionário the codFuncionário to set
     */
    public void setCodFuncionário(String codFuncionário) {
        this.codFuncionário = codFuncionário;
    }
    
   private String idVenda,desconto, tipoPagamento, dataVenda, observacao, estorno, icms , iss, ipi, FKfuncionario, codVenda, codFuncionário, valorTotal,
           dinheiro, cartao,troco; 

    /**
     * @return the valorTotal
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}
