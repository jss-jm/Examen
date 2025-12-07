package controlador;

import datosDAO.JMMV_ReservaDAO;
import java.util.List;
import logica.JMMV_Reserva;



public class JMMV_ControladorReserva {
    
    private JMMV_ReservaDAO reservaDAO = new JMMV_ReservaDAO();

    public JMMV_ControladorReserva() {
    }
    
    public List<JMMV_Reserva> JMMV_ObtenerTodasLasReservasActivas() {

        List<JMMV_Reserva> listaReservas = reservaDAO.JMMV_ObtenerTodasLasReservasActivas();
        
        return listaReservas;
    }
    
    public boolean JMMV_AgregarReserva(JMMV_Reserva reserva){
        
        return reservaDAO.JMMV_AgregarReserva(reserva);
        
    }
    
    public boolean JMMV_ActualizarReserva(JMMV_Reserva reserva){
        
        return reservaDAO.JMMV_ActualizarReserva(reserva);
        
    }
    
    public boolean JMMV_EliminarReserva(int idReserva){
        
        return reservaDAO.JMMV_EliminarReserva(idReserva);
        
    }

}
