/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import State.VooEstado;

/**
 *
 * @author leoniralves
 */
public class StateFactoryVoo {
    
    public static VooEstado create(String nameState) {
        String nameClass = "State.Voo"+nameState;
        Object obj = null;
        
        try {
            Class referenceClass = Class.forName(nameClass);
            obj = referenceClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            return null;
        }
        
        if (!(obj instanceof VooEstado)) {
            return null;
        }
        
        return (VooEstado) obj;
    }
}
