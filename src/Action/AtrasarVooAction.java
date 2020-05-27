/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Voo;
import Persistence.VooDAO;

/**
 *
 * @author Guedes
 */
public class AtrasarVooAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        int idVoo = Integer.parseInt(request.getParameter("selectVoos"));
        
        Voo voo = VooDAO.getInstance().selectVoo(idVoo);
        String resultado = voo.atrasar();
        
        request.setAttribute("msg", resultado);
        RequestDispatcher view = request.getRequestDispatcher("/voosResultado.jsp");
        try {
            view.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(AtrasarVooAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AtrasarVooAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
