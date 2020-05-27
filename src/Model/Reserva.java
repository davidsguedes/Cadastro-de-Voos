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
public class Reserva {
    
    private int idReserva;
    private int idCliente;
    private int idPassagem;
    private Cliente cliente = new Cliente();
    private Passagem passagem = new Passagem();

     /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    
    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idPassagem
     */
    public int getIdPassagem() {
        return idPassagem;
    }

    /**
     * @param idPassagem the idPassagem to set
     */
    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the passagem
     */
    public Passagem getPassagem() {
        return passagem;
    }

    /**
     * @param passagem the passagem to set
     */
    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }
    
    public String toString() {
        return "Reserva realizada com Sucesso!";
    }

}
