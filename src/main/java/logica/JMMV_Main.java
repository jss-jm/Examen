package logica;

import GUI.JMMV_Login;

import datosDAO.JMMV_UsuarioDAO;
import datosDAO.JMMV_Conexion;


public class JMMV_Main {
    
    public static void main(String[] args) {
        
        //abrir vista de login
        JMMV_Login login = new JMMV_Login();
        login.setTitle("Iniciar sesión");
        login.setLocationRelativeTo(null);
        login.setResizable(false);
        login.setVisible(true);
        
    }
}
