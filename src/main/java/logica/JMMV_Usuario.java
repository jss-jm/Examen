package logica;



public abstract class JMMV_Usuario {
    
    private int JMMV_Usuario_idUsuario;
    private String JMMV_Usuario_nomUsuario;
    private String JMMV_Usuario_contrasena;
    private String JMMV_Usuario_correo;
    private int JMMV_Usuario_rol;

    public JMMV_Usuario(int JMMV_idUsuario, String JMMV_nomUsuario, String JMMV_contrasena, String JMMV_correo, int JMMV_rol) {
        this.JMMV_Usuario_idUsuario = JMMV_idUsuario;
        this.JMMV_Usuario_nomUsuario = JMMV_nomUsuario;
        this.JMMV_Usuario_contrasena = JMMV_contrasena;
        this.JMMV_Usuario_correo = JMMV_correo;
        this.JMMV_Usuario_rol = JMMV_rol;
    }

    public int getJMMV_Usuario_idUsuario() {
        return JMMV_Usuario_idUsuario;
    }

    public void setJMMV_Usuario_idUsuario(int JMMV_Usuario_idUsuario) {
        this.JMMV_Usuario_idUsuario = JMMV_Usuario_idUsuario;
    }

    public String getJMMV_Usuario_nomUsuario() {
        return JMMV_Usuario_nomUsuario;
    }

    public void setJMMV_Usuario_nomUsuario(String JMMV_Usuario_nomUsuario) {
        this.JMMV_Usuario_nomUsuario = JMMV_Usuario_nomUsuario;
    }

    public String getJMMV_Usuario_contrasena() {
        return JMMV_Usuario_contrasena;
    }

    public void setJMMV_Usuario_contrasena(String JMMV_Usuario_contrasena) {
        this.JMMV_Usuario_contrasena = JMMV_Usuario_contrasena;
    }

    public String getJMMV_Usuario_correo() {
        return JMMV_Usuario_correo;
    }

    public void setJMMV_Usuario_correo(String JMMV_Usuario_correo) {
        this.JMMV_Usuario_correo = JMMV_Usuario_correo;
    }

    public int getJMMV_Usuario_rol() {
        return JMMV_Usuario_rol;
    }

    public void setJMMV_Usuario_rol(int JMMV_Usuario_rol) {
        this.JMMV_Usuario_rol = JMMV_Usuario_rol;
    }   
    

}