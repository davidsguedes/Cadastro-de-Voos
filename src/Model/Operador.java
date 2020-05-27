package Model;


public class Operador {
	

	private String nomeOperador;
	private String permissaoOperador;
	private String nivelOperador;
	private int diasUteisTrabalhados;
	private double valorDiaTrabalhado;
	private double valorValeTransporteDia;
	
	public Operador() {
		
	}
	
	public Operador(String nomeOperador,
			String permissaoOperador, String nivelOperador,
			int diasUteisTrabalhados, double valorDiaTrabalhado,
			double valorValeTransporteDia) {
		
		super();
		this.nomeOperador = nomeOperador;
		this.permissaoOperador = permissaoOperador;
		this.nivelOperador = nivelOperador;
		this.diasUteisTrabalhados = diasUteisTrabalhados;
		this.valorDiaTrabalhado = valorDiaTrabalhado;
		this.valorValeTransporteDia = valorValeTransporteDia;
	}
	
	
	private int idOperador;
	public int getIdOperador() {
		return idOperador;
	}
	public void setIdOperador(int idOperador) {
		this.idOperador = idOperador;
	}
	public String getNomeOperador() {
		return nomeOperador;
	}
	public void setNomeOperador(String nomeOperador) {
		this.nomeOperador = nomeOperador;
	}
	public String getPermissaoOperador() {
		return permissaoOperador;
	}
	public void setPermissaoOperador(String permissaoOperador) {
		this.permissaoOperador = permissaoOperador;
	}
	public String getNivelOperador() {
		return nivelOperador;
	}
	public void setNivelOperador(String nivelOperador) {
		this.nivelOperador = nivelOperador;
	}
	public int getDiasUteisTrabalhados() {
		return diasUteisTrabalhados;
	}
	public void setDiasUteisTrabalhados(int diasUteisTrabalhados) {
		this.diasUteisTrabalhados = diasUteisTrabalhados;
	}
	public double getValorDiaTrabalhado() {
		return valorDiaTrabalhado;
	}
	public void setValorDiaTrabalhado(double valorDiaTrabalhado) {
		this.valorDiaTrabalhado = valorDiaTrabalhado;
	}
	public double getValorValeTransporteDia() {
		return valorValeTransporteDia;
	}
	public void setValorValeTransporteDia(double valorValeTransporteDia) {
		this.valorValeTransporteDia = valorValeTransporteDia;
	}
	
	
	public double calcularSalario(double salarioMes){
		
		salarioMes = diasUteisTrabalhados * valorDiaTrabalhado;
		
		return salarioMes;
	}
	
	public double calcularValeTransporte (double valeTransporteMes){
		
		valeTransporteMes = valorValeTransporteDia * diasUteisTrabalhados;
		
		return valeTransporteMes;
	}

}
