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

import Model.Passagem;
import Persistence.PassagemDAO;

/**
 *
 * @author david.guedes
 */
public class ListarDisponibilizarPassagemAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        try {
            List<Passagem> passagens = PassagemDAO.getInstance().ListarPassagensIndisponiveis();
            request.setAttribute("passagens", passagens);
            RequestDispatcher view = request.getRequestDispatcher("/PassagensDisponibilizar.jsp");
            view.forward(request, response);
        } catch (ServletException | IOException e) {
        }
    }

    
}
