/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aeroporto;
import Persistence.AeroportoDAO;

/**
 *
 * @author Guedes
 */
public class GravarAeroportoAction implements Action{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        
        String aercod = request.getParameter("aercod");
        String aerSigla = request.getParameter("aerSigla");
        String aerlocalizacao = request.getParameter("aerlocalizacao");
        Boolean success = false;
        
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.setAercod(aercod);
        aeroporto.setAerSigla(aerSigla);
        aeroporto.setAerlocalizacao(aerlocalizacao);
        
         try {
            success = AeroportoDAO.getInstance().insert(aeroporto);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
        
    }
    
    
    
}
