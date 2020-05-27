/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author david.guedes
 */
public class Aeronave {
    
    private int idEmpresa;  
    
    private int aeroId;
    private String aeroCod;
    private int aeroCapacidade;
    private String aeroModelo;
    private Empresa empresa = new Empresa();
    
    
    
    public int getAeroId() {
        return aeroId;
    }

    /**
     * @param aeroId the aeroId to set
     */
    public void setAeroId(int aeroId) {
        this.aeroId = aeroId;
    }

    /**
     * @return the aeroCod
     */
    public String getAeroCod() {
        return aeroCod;
    }

    /**
     * @param aeroCod the aeroCod to set
     */
    public void setAeroCod(String aeroCod) {
        this.aeroCod = aeroCod;
    }

    /**
     * @return the aeroCapacidade
     */
    public int getAeroCapacidade() {
        return aeroCapacidade;
    }

    /**
     * @param aeroCapacidade the aeroCapacidade to set
     */
    public void setAeroCapacidade(int aeroCapacidade) {
        this.aeroCapacidade = aeroCapacidade;
    }

    /**
     * @return the aeroModelo
     */
    public String getAeroModelo() {
        return aeroModelo;
    }

    /**
     * @param aeroModelo the aeroModelo to set
     */
    public void setAeroModelo(String aeroModelo) {
        this.aeroModelo = aeroModelo;
    }

    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    
    
    

    
}
