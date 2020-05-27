/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Factory.StateFactoryPassagem;
import Model.Passagem;
import Persistence.PassagemDAO;
import State.PassagemSituacao;

/**
 *
 * @author david.guedes
 */
public class GravarPassagemAction implements Action{

     @Override
     public void execute(HttpServletRequest request, HttpServletResponse response) {
       
        String  numeroPassagem = request.getParameter("numeroPassagem");
        String valorPassagem = request.getParameter("valorPassagem");
        PassagemSituacao passagemSituacao = StateFactoryPassagem.create(request.getParameter("situacaoSelecionada"));
        Boolean success = false;
        
        Passagem passagem = new Passagem();
        passagem.setNumeroPassagem(numeroPassagem);
        passagem.setValorPassagem(Double.parseDouble(valorPassagem));
        passagem.setSituacao(passagemSituacao);
        
        try {
            success = PassagemDAO.getInstance().insert(passagem);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            }
            else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
    }
    
}
