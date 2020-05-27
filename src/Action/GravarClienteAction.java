/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cliente;
import Persistence.ClienteDAO;

/**
 *
 * @author Guedes
 */
public class GravarClienteAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response){

        String nome = request.getParameter("nome");
        int idade = Integer.parseInt(request.getParameter("idade"));
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String pais = request.getParameter("pais");
        Boolean success = false;

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setIdade(idade);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        cliente.setPais(pais);
        

        try {
            success = ClienteDAO.getInstance().inserirCliente(cliente);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
    }

}
