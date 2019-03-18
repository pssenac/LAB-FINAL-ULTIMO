
package Models;

import java.util.Date;


public class OrdemServiço {

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
    
  private String idServico, tipoServico, valorServico, dataEntrega, dataSolitacao,
           prioridade, descricao, tipoPagamento, codigoFuncionario, icms, iss, ipi, 
           valorTotal, cpfCliente, codigoOrdem, FKcliente, FKfuncionario, observacao, estorno, desconto, dinheiro, cartao, troco;

    /**
     * @return the idServico
     */
    public String getIdServico() {
        return idServico;
    }

    /**
     * @param idServico the idServico to set
     */
    public void setIdServico(String idServico) {
        this.idServico = idServico;
    }

    /**
     * @return the tipoServico
     */
    public String getTipoServico() {
        return tipoServico;
    }

    /**
     * @param tipoServico the tipoServico to set
     */
    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    /**
     * @return the valorServico
     */
    public String getValorServico() {
        return valorServico;
    }

    /**
     * @param valorServico the valorServico to set
     */
    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the dataSolitacao
     */
    public String getDataSolitacao() {
        return dataSolitacao;
    }

    /**
     * @param dataSolitacao the dataSolitacao to set
     */
    public void setDataSolitacao(String dataSolitacao) {
        this.dataSolitacao = dataSolitacao;
    }

    /**
     * @return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
     * @return the codigoFuncionario
     */
    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     * @param codigoFuncionario the codigoFuncionario to set
     */
    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
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

    /**
     * @return the cpfCliente
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * @param cpfCliente the cpfCliente to set
     */
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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

    /**
     * @return the FKcliente
     */
    public String getFKcliente() {
        return FKcliente;
    }

    /**
     * @param FKcliente the FKcliente to set
     */
    public void setFKcliente(String FKcliente) {
        this.FKcliente = FKcliente;
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
           
   

    
            
    
}
