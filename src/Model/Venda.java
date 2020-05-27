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
public class Venda {

    private int idPassagem;
    private int idVoo;
    private int idCliente;
    private double valorVenda;
    private String promocaoSelecionada;
    
    public Cliente cliente = new Cliente();
    private Passagem passagem = new Passagem();
    private Voo voo = new Voo();

    
    public int getIdPassagem() {
        return idPassagem;
    }

    
    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }

   
    public int getIdVoo() {
        return idVoo;
    }

    
    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

   
    public int getIdCliente() {
        return idCliente;
    }

 
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    public Voo getVoo() {
        return voo;
    }

    
    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

   
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public Passagem getPassagem() {
        return passagem;
    }

    
    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

   
    public double getValorVenda() {
        return valorVenda;
    }

   //mudei aqui para testar.
    public double setValorVenda(double valorVenda) {
        return this.valorVenda = valorVenda;
    }
    
    

    public String getPromocaoSelecionada() {
		return promocaoSelecionada;
	}


	public void setPromocaoSelecionada(String promocaoSelecionada) {
		this.promocaoSelecionada = promocaoSelecionada;
	}


	@Override
    public String toString() {
        return "Venda realizada com Sucesso!";
    }

}
