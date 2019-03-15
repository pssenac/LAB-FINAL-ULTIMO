package Models;

public class Fornecedor {

    /**
     * @return the fkEnderecoFornecedor
     */
    public String getFkEnderecoFornecedor() {
        return fkEnderecoFornecedor;
    }

    /**
     * @param fkEnderecoFornecedor the fkEnderecoFornecedor to set
     */
    public void setFkEnderecoFornecedor(String fkEnderecoFornecedor) {
        this.fkEnderecoFornecedor = fkEnderecoFornecedor;
    }

    /**
     * @return the IdFornecedor
     */
    public String getIdFornecedor() {
        return IdFornecedor;
    }

    /**
     * @param IdFornecedor the IdFornecedor to set
     */
    public void setIdFornecedor(String IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    /**
     * @return the cnpjcpfFornecedor
     */
    public String getCnpjcpfFornecedor() {
        return cnpjcpfFornecedor;
    }

    /**
     * @param cnpjcpfFornecedor the cnpjcpfFornecedor to set
     */
    public void setCnpjcpfFornecedor(String cnpjcpfFornecedor) {
        this.cnpjcpfFornecedor = cnpjcpfFornecedor;
    }

    /**
     * @return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the ramo
     */
    public String getRamo() {
        return ramo;
    }

    /**
     * @param ramo the ramo to set
     */
    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    /**
     * @return the nomeRepresentante
     */
    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    /**
     * @param nomeRepresentante the nomeRepresentante to set
     */
    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    /**
     * @return the emailRepresentante
     */
    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    /**
     * @param emailRepresentante the emailRepresentante to set
     */
    public void setEmailRepresentante(String emailRepresentante) {
        this.emailRepresentante = emailRepresentante;
    }

    /**
     * @return the contatoFixo
     */
    public String getContatoFixo() {
        return contatoFixo;
    }

    /**
     * @param contatoFixo the contatoFixo to set
     */
    public void setContatoFixo(String contatoFixo) {
        this.contatoFixo = contatoFixo;
    }

    /**
     * @return the contatoCel
     */
    public String getContatoCel() {
        return contatoCel;
    }

    /**
     * @param contatoCel the contatoCel to set
     */
    public void setContatoCel(String contatoCel) {
        this.contatoCel = contatoCel;
    }

   

    @Override
    public String toString() {
        return getNomeEmpresa(); //To change body of generated methods, choose Tools | Templates.
    }

    
    private String IdFornecedor;
    private String cnpjcpfFornecedor;
    private String nomeEmpresa;
    private String nomeFantasia;
    private String ramo;
    private String nomeRepresentante;
    private String emailRepresentante;
    private String contatoFixo;
    private String contatoCel;
    private String fkEnderecoFornecedor;
}
