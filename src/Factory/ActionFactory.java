/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import Action.Action;


public class ActionFactory {
    
    public static Action create(String nameAction) {
        String nameClass = "Action."+nameAction+"Action";
        Action object = null;
        Object newObj = null;
        Class referenceClass = null;
        
        try {
            referenceClass = Class.forName(nameClass) ;
            newObj = referenceClass.newInstance();
        } catch (Exception e) {
            return null;
        }
        
        if(!(newObj instanceof Action)) {
            return null;
        }
        object = (Action) newObj;
        return object;
    }
}
