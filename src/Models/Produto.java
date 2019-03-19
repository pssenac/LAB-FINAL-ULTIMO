package Models;

import java.util.Date;

public class Produto {

    /**
     * @return the Lpp
     */
    public String getLpp() {
        return Lpp;
    }

    /**
     * @param Lpp the Lpp to set
     */
    public void setLpp(String Lpp) {
        this.Lpp = Lpp;
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

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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
     * @return the armazemLocal
     */
    public String getArmazemLocal() {
        return armazemLocal;
    }

    /**
     * @param armazemLocal the armazemLocal to set
     */
    public void setArmazemLocal(String armazemLocal) {
        this.armazemLocal = armazemLocal;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    private String idProduto;
    private String nomeProduto;
    private String descricao;
    private String armazemLocal;
    private String tipoProduto;
    private String Lpp;


}
