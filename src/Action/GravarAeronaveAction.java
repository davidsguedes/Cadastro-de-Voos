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

import Model.Aeronave;
import Model.Empresa;
import Persistence.AeronaveDAO;
import Persistence.EmpresaDAO;

/**
 *
 * @author Guedes
 */
public class GravarAeronaveAction implements Action{
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response){

        String aeroCod = request.getParameter("aeroCod");
        int aeroCapacidade = Integer.parseInt(request.getParameter("aeroCapacidade"));
        String aeroModelo = request.getParameter("aeroModelo");
        int idEmpresa = Integer.parseInt(request.getParameter("selectEmpresas"));
        Boolean success = false;
        
        try{
            Aeronave aeronave = new Aeronave();
            Empresa empresa = (Empresa) EmpresaDAO.getInstance().selectEmpresa(idEmpresa);
            
            aeronave.setAeroCod(aeroCod);
            aeronave.setAeroCapacidade(aeroCapacidade);
            aeronave.setAeroModelo(aeroModelo);
            aeronave.setIdEmpresa(idEmpresa);
            success = AeronaveDAO.getInstance().insert(aeronave);
            
            if (success) {
                response.sendRedirect("registroSucesso.jsp");
            } else {
                response.sendRedirect("registroErro.jsp");
            }
        } catch (IOException ex) {
            Logger.getLogger(GravarAeronaveAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
    }
    
    
    
}
