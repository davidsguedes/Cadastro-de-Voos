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
public class Empresa {
    
    private int idEmpresa;
    private String empCod;
    private String empNome;
    private String empRazaoSocial;
    private int empCnpj;

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
     * @return the empCod
     */
    public String getEmpCod() {
        return empCod;
    }

    /**
     * @param empCod the empCod to set
     */
    public void setEmpCod(String empCod) {
        this.empCod = empCod;
    }

    /**
     * @return the empRazaoSocial
     */
    public String getEmpRazaoSocial() {
        return empRazaoSocial;
    }

    /**
     * @param empRazaoSocial the empRazaoSocial to set
     */
    public void setEmpRazaoSocial(String empRazaoSocial) {
        this.empRazaoSocial = empRazaoSocial;
    }

    /**
     * @return the empCnpj
     */
    public int getEmpCnpj() {
        return empCnpj;
    }

    /**
     * @param empCnpj the empCnpj to set
     */
    public void setEmpCnpj(int empCnpj) {
        this.empCnpj = empCnpj;
    }

    /**
     * @return the empNome
     */
    public String getEmpNome() {
        return empNome;
    }

    /**
     * @param empNome the empNome to set
     */
    public void setEmpNome(String empNome) {
        this.empNome = empNome;
    }
    
    
}
