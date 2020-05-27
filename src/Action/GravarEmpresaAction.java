/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Empresa;
import Persistence.EmpresaDAO;

/**
 *
 * @author Guedes
 */
public class GravarEmpresaAction implements Action{
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response){

        String codigo = request.getParameter("EMPCOD");
        String nome = request.getParameter("empNome");
        String razaoSocial = request.getParameter("EMPRAZAOSOCIAL");
        int cnpj = Integer.parseInt(request.getParameter("EMPCNPJ"));
        Boolean success = false;

        Empresa empresa = new Empresa();
        empresa.setEmpCod(codigo);
        empresa.setEmpNome(nome);
        empresa.setEmpRazaoSocial(razaoSocial);
        empresa.setEmpCnpj(cnpj);
        

        try {
            success = EmpresaDAO.getInstance().insert(empresa);
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (Exception e) {
        }
    }
    
}
