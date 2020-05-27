/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Operador;
import Persistence.OperadorDAO;

/**
 *
 * @author Guedes
 */
public class GravarOperadorAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response){

        String nomeOperador = request.getParameter("nomeOperador");
        String permissaoOperador = request.getParameter("permissaoOperador");
        String nivelOperador = request.getParameter("nivelOperador");
        int diasUteisTrabalhados = Integer.parseInt(request.getParameter("diasUteisTrabalhados"));
        double valorDiaTrabalhado = Double.parseDouble(request.getParameter("valorDiaTrabalhado"));
        double valorValeTransporteDia = Double.parseDouble(request.getParameter("valorValeTransporteDia"));
       
        Boolean success = false;

        Operador operador = new Operador(nomeOperador, permissaoOperador, nivelOperador, diasUteisTrabalhados, valorDiaTrabalhado, valorValeTransporteDia);
        operador.setNomeOperador(nomeOperador);
        operador.setPermissaoOperador(permissaoOperador);
        operador.setNivelOperador(nivelOperador);
        operador.setDiasUteisTrabalhados(diasUteisTrabalhados);
        operador.setValorDiaTrabalhado(valorDiaTrabalhado);
        operador.setValorValeTransporteDia(valorValeTransporteDia);

        

        try {
            success = OperadorDAO.getInstance().inserirOperador(operador);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
    }

}
