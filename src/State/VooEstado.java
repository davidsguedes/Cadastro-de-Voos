/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import Model.Voo;

/**
 *
 * @author Guedes
 */
public interface VooEstado {
    
    public String confirmado (Voo voo);
    
    public String adiado (Voo voo);
    
    public String atrasado (Voo voo);
    
    public String cancelado (Voo voo);

    public String getEstado();
    
    
    
}
