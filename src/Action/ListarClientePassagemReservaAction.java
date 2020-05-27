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
import Persistence.ClienteDAO;
import Persistence.PassagemDAO;

/**
 *
 * @author Guedes
 */
public class ListarClientePassagemReservaAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        List<Cliente> clientes = ClienteDAO.getInstance().listarCliente();
        List<Passagem> passagens = PassagemDAO.getInstance().ListarPassagens();

        try {
            request.setAttribute("clientes", clientes);
            request.setAttribute("passagens", passagens);

            RequestDispatcher view = request.getRequestDispatcher("ReservaConfirmar.jsp");
            view.forward(request, response);

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(ListarClientePassagemReservaAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
