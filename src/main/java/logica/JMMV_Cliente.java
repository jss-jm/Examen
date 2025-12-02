package logica;



public class JMMV_Cliente extends JMMV_Usuario{
    
    private int JMMV_Cliente_idCliente;
    private int JMMV_Cliente_run;
    private String JMMV_Cliente_nombres;
    private String JMMV_Cliente_apellidoPaterno;
    private String JMMV_Cliente_apellidoMaterno;
    private String JMMV_Cliente_comuna;
    private String JMMV_Cliente_calle;
    private int JMMV_Cliente_numCalle;
    private int JMMV_Cliente_telefono;
    private boolean JMMV_Cliente_estaActivo;

    public JMMV_Cliente(int JMMV_Cliente_idCliente, int JMMV_Cliente_run, String JMMV_Cliente_nombres, String JMMV_Cliente_apellidoPaterno, String JMMV_Cliente_apellidoMaterno, String JMMV_Cliente_comuna, String JMMV_Cliente_calle, int JMMV_Cliente_numCalle, int JMMV_Cliente_telefono, boolean JMMV_Cliente_estaActivo, int JMMV_idUsuario, String JMMV_nomUsuario, String JMMV_contrasena, String JMMV_correo, int JMMV_rol) {
        super(JMMV_idUsuario, JMMV_nomUsuario, JMMV_contrasena, JMMV_correo, JMMV_rol);
        this.JMMV_Cliente_idCliente = JMMV_Cliente_idCliente;
        this.JMMV_Cliente_run = JMMV_Cliente_run;
        this.JMMV_Cliente_nombres = JMMV_Cliente_nombres;
        this.JMMV_Cliente_apellidoPaterno = JMMV_Cliente_apellidoPaterno;
        this.JMMV_Cliente_apellidoMaterno = JMMV_Cliente_apellidoMaterno;
        this.JMMV_Cliente_comuna = JMMV_Cliente_comuna;
        this.JMMV_Cliente_calle = JMMV_Cliente_calle;
        this.JMMV_Cliente_numCalle = JMMV_Cliente_numCalle;
        this.JMMV_Cliente_telefono = JMMV_Cliente_telefono;
        this.JMMV_Cliente_estaActivo = JMMV_Cliente_estaActivo;
    }

    public int getJMMV_Cliente_idCliente() {
        return JMMV_Cliente_idCliente;
    }

    public void setJMMV_Cliente_idCliente(int JMMV_Cliente_idCliente) {
        this.JMMV_Cliente_idCliente = JMMV_Cliente_idCliente;
    }

    public int getJMMV_Cliente_run() {
        return JMMV_Cliente_run;
    }

    public void setJMMV_Cliente_run(int JMMV_Cliente_run) {
        this.JMMV_Cliente_run = JMMV_Cliente_run;
    }

    public String getJMMV_Cliente_nombres() {
        return JMMV_Cliente_nombres;
    }

    public void setJMMV_Cliente_nombres(String JMMV_Cliente_nombres) {
        this.JMMV_Cliente_nombres = JMMV_Cliente_nombres;
    }

    public String getJMMV_Cliente_apellidoPaterno() {
        return JMMV_Cliente_apellidoPaterno;
    }

    public void setJMMV_Cliente_apellidoPaterno(String JMMV_Cliente_apellidoPaterno) {
        this.JMMV_Cliente_apellidoPaterno = JMMV_Cliente_apellidoPaterno;
    }

    public String getJMMV_Cliente_apellidoMaterno() {
        return JMMV_Cliente_apellidoMaterno;
    }

    public void setJMMV_Cliente_apellidoMaterno(String JMMV_Cliente_apellidoMaterno) {
        this.JMMV_Cliente_apellidoMaterno = JMMV_Cliente_apellidoMaterno;
    }

    public String getJMMV_Cliente_comuna() {
        return JMMV_Cliente_comuna;
    }

    public void setJMMV_Cliente_comuna(String JMMV_Cliente_comuna) {
        this.JMMV_Cliente_comuna = JMMV_Cliente_comuna;
    }

    public String getJMMV_Cliente_calle() {
        return JMMV_Cliente_calle;
    }

    public void setJMMV_Cliente_calle(String JMMV_Cliente_calle) {
        this.JMMV_Cliente_calle = JMMV_Cliente_calle;
    }

    public int getJMMV_Cliente_numCalle() {
        return JMMV_Cliente_numCalle;
    }

    public void setJMMV_Cliente_numCalle(int JMMV_Cliente_numCalle) {
        this.JMMV_Cliente_numCalle = JMMV_Cliente_numCalle;
    }

    public int getJMMV_Cliente_telefono() {
        return JMMV_Cliente_telefono;
    }

    public void setJMMV_Cliente_telefono(int JMMV_Cliente_telefono) {
        this.JMMV_Cliente_telefono = JMMV_Cliente_telefono;
    }

    public boolean isJMMV_Cliente_estaActivo() {
        return JMMV_Cliente_estaActivo;
    }

    public void setJMMV_Cliente_estaActivo(boolean JMMV_Cliente_estaActivo) {
        this.JMMV_Cliente_estaActivo = JMMV_Cliente_estaActivo;
    }
    
    
}