
package Models;


public class Usuario {
    
    private String idUsuario;
    private String loginUsuario;
    private int perfilUsuario;
    private String SenhaUsuario;
    private String confirmacaoSenhaUsuario;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public int getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(int perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }

    public String getSenhaUsuario() {
        return SenhaUsuario;
    }

    public void setSenhaUsuario(String SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }

    public String getConfirmacaoSenhaUsuario() {
        return confirmacaoSenhaUsuario;
    }

    public void setConfirmacaoSenhaUsuario(String confirmacaoSenhaUsuario) {
        this.confirmacaoSenhaUsuario = confirmacaoSenhaUsuario;
    }

   
   

    

}
