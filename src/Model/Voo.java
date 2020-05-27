/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import State.VooConfirmado;
import State.VooEstado;

/**
 *
 * @author david.guedes
 */
public class Voo {
    
    private int idItinerario;
    private int aeroId;
    private int idAeroporto;
    
    private int idVoo;
    private String codigoVoo;
    private VooEstado estado;
    private Itinerario itinerario = new Itinerario();
    private Aeronave aerovane = new Aeronave();
    //private Empresa empresa = new Empresa();
    private Aeroporto aeroporto = new Aeroporto();

    
    public Voo(){
        this.estado = new VooConfirmado();
    }

   
    public int getIdVoo() {
        return idVoo;
    }

   
    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

   
    public String getCodigoVoo() {
        return codigoVoo;
    }

   
    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

   
    public Itinerario getItinerario() {
        return itinerario;
    }

    
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

   
    public Aeronave getAerovane() {
        return aerovane;
    }

   
    public void setAerovane(Aeronave aerovane) {
        this.aerovane = aerovane;
    }

   
    public VooEstado getEstado() {
        return estado;
    }

    
    public void setEstado(VooEstado estado) {
        this.estado = estado;
    }
    
    public String getNomeEstado() {
        return this.estado.getEstado();
    }

    public String cancelar() {
        return estado.cancelado(this);
    }

    public String adiar() {
        return estado.adiado(this);
    }

    public String atrasar() {
        return estado.atrasado(this);
    }

    public String confirmar() {
        return estado.confirmado(this);
    }

    
    public int getIdItinerario() {
        return idItinerario;
    }

    
    public void setIdItinerario(int idItinerario) {
        this.idItinerario = idItinerario;
    }

   
    public int getAeroId() {
        return aeroId;
    }

   
    public void setAeroId(int aeroId) {
        this.aeroId = aeroId;
    }

   
//    public int getIdEmpresa() {
//        return idEmpresa;
//    }
//
//  
//    public void setIdEmpresa(int idEmpresa) {
//        this.idEmpresa = idEmpresa;
//    }


	public int getIdAeroporto() {
		return idAeroporto;
	}


	public void setIdAeroporto(int idAeroporto) {
		this.idAeroporto = idAeroporto;
	}


	public Aeroporto getAeroporto() {
		return aeroporto;
	}


	public void setAeroporto(Aeroporto aeroporto) {
		this.aeroporto = aeroporto;
	}
    
    

}
