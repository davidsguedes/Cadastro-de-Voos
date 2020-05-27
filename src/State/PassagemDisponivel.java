/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Model.Passagem;
import Persistence.PassagemDAO;

/**
 *
 * @author Guedes
 */
public class PassagemDisponivel implements PassagemSituacao{

    @Override
    public String disponivel(Passagem passagem) {
        return "A passagem já se encontra disponível";
    }

    @Override
    public String indisponivel(Passagem passagem) {
        passagem.setSituacao(new PassagemIndisponivel());
        boolean status = PassagemDAO.getInstance().update(passagem);
        return "Passagem indisponivel!";
    }

    @Override
    public String getEstado() {
        return "Disponivel";
    }
    
    
    
}
