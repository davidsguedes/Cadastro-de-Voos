/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cliente;
import Model.Passagem;
import Model.Reserva;
import Persistence.ClienteDAO;
import Persistence.PassagemDAO;
import Persistence.ReservaDAO;

/**
 *
 * @author Guedes
 */
public class GravarReservaAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        boolean success = false;
        int idCliente = Integer.parseInt(request.getParameter("selectClientes"));
        int idPassagem = Integer.parseInt(request.getParameter("selectPassagens"));
        
        
        try {
            Reserva reserva = new Reserva();
            Cliente cliente = (Cliente) ClienteDAO.getInstance().selectCliente(idCliente);
            Passagem passagem = (Passagem) PassagemDAO.getInstance().selectPassagem(idPassagem);

            reserva.setIdCliente(idCliente);
            reserva.setIdPassagem(idPassagem);
            
            success = ReservaDAO.getInstance().insert(reserva);
            
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (IOException ex) {
            Logger.getLogger(GravarVendaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception e) {
        }
    }
    
    
    
}
