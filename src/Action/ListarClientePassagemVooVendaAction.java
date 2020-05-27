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

import Model.Cliente;
import Model.Passagem;
import Model.Voo;
import Persistence.ClienteDAO;
import Persistence.PassagemDAO;
import Persistence.VooDAO;

/**
 *
 * @author david.guedes
 */
public class ListarClientePassagemVooVendaAction implements Action{

    @Override
	public void execute(HttpServletRequest request, HttpServletResponse response){
         
    	List<Voo> voos = VooDAO.getInstance().selectVoos();
		List<Cliente> clientes = ClienteDAO.getInstance().listarCliente();
        List<Passagem> passagens = PassagemDAO.getInstance().ListarPassagens();
		
                try {
            request.setAttribute("voos", voos);
			request.setAttribute("clientes", clientes);
            request.setAttribute("passagens", passagens);
                        
            RequestDispatcher view = request.getRequestDispatcher("VendaConfirmar.jsp");
            view.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException ex) {
            Logger.getLogger(ListarClientePassagemVooVendaAction.class.getName()).log(Level.SEVERE, null, ex);
        }

	}
    
}
