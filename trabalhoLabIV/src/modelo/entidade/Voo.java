package modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "voo", schema = "bancoEmpresa")
@PrimaryKeyJoinColumn(name = "idVoo")

public class Voo {
	
	@Id
	@GeneratedValue
	private int idVoo;
    private String codigoVoo;
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private String dataVoo;
    private String horaVoo;
    //private VooEstado estado;
    
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
	public String getAeroportoOrigem() {
		return aeroportoOrigem;
	}
	public void setAeroportoOrigem(String aeroportoOrigem) {
		this.aeroportoOrigem = aeroportoOrigem;
	}
	public String getAeroportoDestino() {
		return aeroportoDestino;
	}
	public void setAeroportoDestino(String aeroportoDestino) {
		this.aeroportoDestino = aeroportoDestino;
	}
	public String getDataVoo() {
		return dataVoo;
	}
	public void setDataVoo(String dataVoo) {
		this.dataVoo = dataVoo;
	}
	public String getHoraVoo() {
		return horaVoo;
	}
	public void setHoraVoo(String horaVoo) {
		this.horaVoo = horaVoo;
	}
    
    

}
