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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Empresa;
import Persistence.EmpresaDAO;

/**
 *
 * @author Guedes
 */
public class ListarEmpresaAeronaveAction implements Action{
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
        List<Empresa> empresas = EmpresaDAO.getInstance().listarEmpresa();
        
		 request.setAttribute("empresas", empresas);
		 try {
			request.getRequestDispatcher("AeronaveCadastrar.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException ex) {
                Logger.getLogger(ListarEmpresaAeronaveAction.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
