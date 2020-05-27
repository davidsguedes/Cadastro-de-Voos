/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Guedes
 */
public class Itinerario {
    
    private int idItinerario;
    private String itiCod;
    private String itiOrigem;
    private String itiDestino;

    /**
     * @return the idItinerario
     */
    public int getIdItinerario() {
        return idItinerario;
    }

    /**
     * @param idItinerario the idItinerario to set
     */
    public void setIdItinerario(int idItinerario) {
        this.idItinerario = idItinerario;
    }

    /**
     * @return the itiCod
     */
    public String getItiCod() {
        return itiCod;
    }

    /**
     * @param itiCod the itiCod to set
     */
    public void setItiCod(String itiCod) {
        this.itiCod = itiCod;
    }

    /**
     * @return the itiOrigem
     */
    public String getItiOrigem() {
        return itiOrigem;
    }

    /**
     * @param itiOrigem the itiOrigem to set
     */
    public void setItiOrigem(String itiOrigem) {
        this.itiOrigem = itiOrigem;
    }

    /**
     * @return the itiDestino
     */
    public String getItiDestino() {
        return itiDestino;
    }

    /**
     * @param itiDestino the itiDestino to set
     */
    public void setItiDestino(String itiDestino) {
        this.itiDestino = itiDestino;
    }
    
    
}
