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

import Model.Passagem;
import Persistence.PassagemDAO;

/**
 *
 * @author david.guedes
 */
public class AtualizarPassagemAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        int idPassagem = Integer.parseInt(request.getParameter("selectPassagens"));
        
        Passagem passagem = PassagemDAO.getInstance().selectPassagensIndisponiveis(idPassagem);
        passagem.diponibilizar();
        RequestDispatcher view = request.getRequestDispatcher("/registroSucesso.jsp");
        
        try{
            view.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(AtualizarPassagemAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AtualizarPassagemAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     
    
}
