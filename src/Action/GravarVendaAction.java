/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cliente;
import Model.DescontosVenda;
import Model.Passagem;
import Model.Venda;
import Model.Voo;
import Persistence.ClienteDAO;
import Persistence.PassagemDAO;
import Persistence.VendaDAO;
import Persistence.VooDAO;

/**
 *
 * @author Guedes
 */
public class GravarVendaAction implements Action {


    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        int idVoo = Integer.parseInt(request.getParameter("selectVoos"));
        int idCliente = Integer.parseInt(request.getParameter("selectClientes"));
        int idPassagem = Integer.parseInt(request.getParameter("selectPassagens"));
        String promocaoSelecionada = request.getParameter("promocaoSelecionada");
        boolean success = false;

        try {
            Venda venda = new Venda();
            DescontosVenda descontoVenda = new DescontosVenda();
            Cliente cliente = (Cliente) ClienteDAO.getInstance().selectCliente(idCliente);
            Voo voo = (Voo) VooDAO.getInstance().selectVoo(idVoo);
            Passagem passagem = (Passagem) PassagemDAO.getInstance().selectPassagem(idPassagem);

            venda.setIdCliente(idCliente);
            venda.setIdVoo(idVoo);
            venda.setIdPassagem(idPassagem);
            venda.setPromocaoSelecionada(promocaoSelecionada);
            
            
            venda.setValorVenda(descontoVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente));
            success = VendaDAO.getInstance().insert(venda);
           
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (IOException ex) {
            Logger.getLogger(GravarVendaAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
