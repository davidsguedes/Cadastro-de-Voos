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

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Operador;
import Persistence.OperadorDAO;

/**
 *
 * @author Guedes
 */
public class ListarOperadorAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		List<Operador> operadores = OperadorDAO.getInstance().listarOperador();
		request.setAttribute("operadores", operadores);
		
		 try {
			
			RequestDispatcher view = request.getRequestDispatcher("exibirBeneficiosOperador.jsp");
			view.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException ex) {
                Logger.getLogger(ListarOperadorAction.class.getName()).log(Level.SEVERE, null, ex);
            }	
		
	}

}