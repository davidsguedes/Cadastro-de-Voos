/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aeronave;
import Model.Aeroporto;
import Model.Itinerario;
import Model.Voo;
import Persistence.AeronaveDAO;
import Persistence.AeroportoDAO;
import Persistence.ItinerarioDAO;
import Persistence.VooDAO;

/**
 *
 * @author david.guedes
 */
public class GravarVooAction implements Action{


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response){
        
        String codigoVoo = request.getParameter("codigoVoo");
        int idAeroporto = Integer.parseInt(request.getParameter("selectAeroportos"));
        int idItinerario = Integer.parseInt(request.getParameter("selectItinerarios"));
        int aeroId = Integer.parseInt(request.getParameter("selectAeronaves"));
        
        
        Boolean success = false;
        Voo voo = new Voo();
        Aeroporto aeroporto = (Aeroporto) AeroportoDAO.getInstance().selectAeroporto(idAeroporto);
        Itinerario itinerario = (Itinerario) ItinerarioDAO.getInstance().selectItinerario(idItinerario);
        Aeronave aeronave = (Aeronave) AeronaveDAO.getInstance().selectAeronave(aeroId);
        
        voo.setCodigoVoo(codigoVoo);
        voo.setIdAeroporto(idAeroporto);
        voo.setIdItinerario(idItinerario);
        voo.setAeroId(aeroId);  
        
        
        try {
            success = VooDAO.getInstance().insert(voo);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            }
            else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
    }
    
    
    
}
