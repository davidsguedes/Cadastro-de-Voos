/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Itinerario;
import Persistence.ItinerarioDAO;

/**
 *
 * @author Guedes
 */
public class GravarItinearioAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        String itiCod = request.getParameter("itiCod");
        String itiOrigem = request.getParameter("itiOrigem");
        String itiDestino = request.getParameter("itiDestino");
        Boolean success = false;
        
        Itinerario itinerario = new Itinerario();
        itinerario.setItiCod(itiCod);
        itinerario.setItiOrigem(itiOrigem);
        itinerario.setItiDestino(itiDestino);
        
         try {
            success = ItinerarioDAO.getInstance().inserirItinerario(itinerario);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
    }
    
    
    
}
