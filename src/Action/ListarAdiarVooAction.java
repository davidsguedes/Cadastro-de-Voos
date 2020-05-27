/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import java.io.IOException;
import java.util.List;

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
public class ListarAdiarVooAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<Voo> voos = VooDAO.getInstance().selectVoos();
            request.setAttribute("voos", voos);
            RequestDispatcher view = request.getRequestDispatcher("/voosAdiar.jsp");
            view.forward(request, response);
        } catch (ServletException | IOException e) {
        }
    }
    
}
