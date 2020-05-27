/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Model.Voo;
import Persistence.VooDAO;

/**
 *
 * @author Guedes
 */
public class VooCadastrado implements VooEstado{

    @Override
    public String getEstado() {
        return "Cadastrado";
    }
    
    @Override
    public String confirmado(Voo voo) {
        voo.setEstado(new VooConfirmado());
        boolean status = VooDAO.getInstance().update(voo);
        return "V�o Confirmado!";
    }

    @Override
    public String adiado(Voo voo) {
        voo.setEstado(new VooAdiado());
        boolean status = VooDAO.getInstance().update(voo);
        return "V�o Adiado!";
    }

    @Override
    public String atrasado(Voo voo) {
        voo.setEstado(new VooAtrasado());
        boolean status = VooDAO.getInstance().update(voo);
        return "V�o Atrasado!";
    }

    @Override
    public String cancelado(Voo voo) {
        voo.setEstado(new VooCancelado());
        boolean status = VooDAO.getInstance().update(voo);
        return "V�o Cancelado!";
    }

     
    
    
}
