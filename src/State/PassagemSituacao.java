/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Model.Passagem;

/**
 *
 * @author Guedes
 */
public interface PassagemSituacao {
    
    public String disponivel (Passagem passagem);
    
    public String indisponivel (Passagem passagem);
    
    public String getEstado();
    
}
