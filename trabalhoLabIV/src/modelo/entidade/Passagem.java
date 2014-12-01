package modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "passagem", schema = "bancoEmpresa")
@PrimaryKeyJoinColumn(name = "idPassagem")

public class Passagem {
	
	private int idPassagem; 
    private String numeroPassagem;
    private double valorPassagem;
    
	public int getIdPassagem() {
		return idPassagem;
	}
	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}
	public String getNumeroPassagem() {
		return numeroPassagem;
	}
	public void setNumeroPassagem(String numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}
	public double getValorPassagem() {
		return valorPassagem;
	}
	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}    

}
