package logica;



public class JMMV_Administrador extends JMMV_Usuario{

    private int JMMV_Administrador_idAdministrador;

    public JMMV_Administrador(int JMMV_Administrador_idAdministrador, int JMMV_idUsuario, String JMMV_nomUsuario, String JMMV_contrasena, String JMMV_correo, int JMMV_rol) {
        super(JMMV_idUsuario, JMMV_nomUsuario, JMMV_contrasena, JMMV_correo, JMMV_rol);
        this.JMMV_Administrador_idAdministrador = JMMV_Administrador_idAdministrador;
    }

    public int getJMMV_Administrador_idAdministrador() {
        return JMMV_Administrador_idAdministrador;
    }

    public void setJMMV_Administrador_idAdministrador(int JMMV_Administrador_idAdministrador) {
        this.JMMV_Administrador_idAdministrador = JMMV_Administrador_idAdministrador;
    }    
    
}