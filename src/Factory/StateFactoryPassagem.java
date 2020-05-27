/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import State.PassagemSituacao;

/**
 *
 * @author Guedes
 */
public class StateFactoryPassagem {
    
     public static PassagemSituacao create(String nameState) {
        String nameClass = "State.Passagem"+nameState;
        Object obj = null;
        
        try {
            Class referenceClass = Class.forName(nameClass);
            obj = referenceClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            return null;
        }
        
        if (!(obj instanceof PassagemSituacao)) {
            return null;
        }
        
        return (PassagemSituacao) obj;
    }
    
}
