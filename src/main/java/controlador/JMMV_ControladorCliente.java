package controlador;

import datosDAO.JMMV_ClienteDAO;
import java.util.List;
import logica.JMMV_Cliente;



public class JMMV_ControladorCliente {
    
    private JMMV_ClienteDAO clienteDAO = new JMMV_ClienteDAO();

    public JMMV_ControladorCliente() {
    }
    
    public List<JMMV_Cliente> JMMV_ObtenerTodosLosClientesActivos() {

        List<JMMV_Cliente> listaClientes = clienteDAO.JMMV_ObtenerTodosLosClientesActivos();
        
        return listaClientes;
    }
    
    public boolean JMMV_AgregarCliente(JMMV_Cliente cliente){
        
        return clienteDAO.JMMV_AgregarCliente(cliente);
        
    }
    
    public boolean JMMV_ActualizarCliente(JMMV_Cliente cliente) {
        
        return clienteDAO.JMMV_ActualizarCliente(cliente);
        
    }
    
    public boolean JMMV_EliminarCliente(int idCliente){
        
        return clienteDAO.JMMV_EliminarCliente(idCliente);
        
    }
    
    public List<JMMV_Cliente> JMMV_BuscarCliente (String nombres, String apellidoPaterno){
        
        List<JMMV_Cliente> listaClientesEncontrados = clienteDAO.JMMV_BuscarCliente(nombres, apellidoPaterno);
        
        return listaClientesEncontrados;
            
    }
    
    public List<String> JMMV_ObtenerNombresCompletosClientesActivos() {

        List<String> listaNombresCompletos = clienteDAO.JMMV_ObtenerNombresCompletosClientesActivos();
        
        return listaNombresCompletos;
        
    }
    
    //para combobox
    public List<String> JMMV_ObtenerComunasActivas() {
        
        List<String> comunas = clienteDAO.JMMV_ObtenerComunasActivas();
        
        return comunas;
        
    }
        
    
    

}
