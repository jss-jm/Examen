package datosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JMMV_UsuarioDAO {

    //instanciar conexión
    private JMMV_Conexion conexion;

    //constructor para iniciar la conexión
    public JMMV_UsuarioDAO() {

        conexion = new JMMV_Conexion();

    }

    //método para verificar credenciales en login
    public String JMMV_VerificarLogin(String user, String pass) {
        
        //variable String para retornar el rol del usuario
        String JMMV_nombreRolUsuario = null;

        String sql = "SELECT r.JMMV_roles_nombre AS rol_usuario, u.JMMV_usuarios_nom_usuario AS nombre_usuario\n"
                + "FROM JMMV_usuarios u\n"
                + "JOIN JMMV_roles r ON u.JMMV_usuarios_id_rol = r.JMMV_roles_id_rol\n"
                + "WHERE u.JMMV_usuarios_nom_usuario = ? AND u.JMMV_usuarios_contrasena = ?";

        try (Connection conn = conexion.JMMV_Conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user);
            stmt.setString(2, pass);

            try (ResultSet rs = stmt.executeQuery();) {

                if (rs.next()) {

                    JMMV_nombreRolUsuario = rs.getString("rol_usuario");

                }

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());

        }
        
        System.out.println("Test JM | UsuarioDAO | rol de usuario: "+JMMV_nombreRolUsuario);
        
        return JMMV_nombreRolUsuario;

    }
    
    //método para listar todos los clientes
    

}