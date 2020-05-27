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
public class PassagemIndisponivel implements PassagemSituacao {

    @Override
    public String disponivel(Passagem passagem) {
        passagem.setSituacao(new PassagemDisponivel());
        passagem.notificarPassagem(passagem);
        boolean status = PassagemDAO.getInstance().update(passagem);
        return "Passagem disponivel";
    }

    @Override
    public String indisponivel(Passagem passagem) {
        return "A passagem já se encontra indisponível";
    }

    @Override
    public String getEstado() {
        return "Indisponivel";
    }

}
