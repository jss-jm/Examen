package controlador;

import datosDAO.JMMV_BicicletaDAO;
import logica.JMMV_Bicicleta;
import java.util.List;



public class JMMV_ControladorBicicleta {

    
    private JMMV_BicicletaDAO bicicletaDAO = new JMMV_BicicletaDAO();
    

    public JMMV_ControladorBicicleta() {

    }

    public List<JMMV_Bicicleta> JMMV_ObtenerTodasLasBicicletasActivas(){
        
        List<JMMV_Bicicleta> listaBicicletas = bicicletaDAO.JMMV_ObtenerTodasLasBicicletasActivas();
        
        return listaBicicletas;
        
    }
    
    public boolean JMMV_AgregarBicicleta(JMMV_Bicicleta bicicleta){
        
        return bicicletaDAO.JMMV_AgregarBicicleta(bicicleta);        
        
    }
    
    public boolean JMMV_ActualizarBicicleta(JMMV_Bicicleta bicicleta){
        
        return bicicletaDAO.JMMV_ActualizarBicicleta(bicicleta);
        
    }
    
    public boolean JMMV_EliminarBicicleta(String nombreBicicleta){
        
        return bicicletaDAO.JMMV_EliminarBicicleta(nombreBicicleta);
        
    }
    
    //para combobox
    public List<String> JMMV_ObtenerTiposDeBicicletaActivos(){
        
        List<String> tipos = bicicletaDAO.JMMV_ObtenerTiposDeBicicletaActivos();
        
        return tipos;
    }
}
