/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Voo;
import Persistence.VooDAO;

/**
 *
 * @author david.guedes
 */
public class ListarVooAction implements Action{
    
    @Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		List<Voo> voos;
		voos = VooDAO.getInstance().selectVoos();
		 request.setAttribute("voos", voos);
		 try {
			request.getRequestDispatcher("vendaConfirmar.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException ex) {
                Logger.getLogger(ListarClienteAction.class.getName()).log(Level.SEVERE, null, ex);
            }	
		
	}
    
}
