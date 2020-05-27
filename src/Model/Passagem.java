/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Memento.PassagemMemento;
import Observer.Observer;
import State.PassagemSituacao;

/**
 *
 * @author Guedes
 */
public class Passagem {

    private int idPassagem;
    private String numeroPassagem;
    private double valorPassagem;
    private PassagemSituacao situacao;

    private Observer clientes = null;

    public Passagem() {
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
     * @return the numeroPassagem
     */
    public String getNumeroPassagem() {
        return numeroPassagem;
    }

    /**
     * @param numeroPassagem the numeroPassagem to set
     */
    public void setNumeroPassagem(String numeroPassagem) {
        this.numeroPassagem = numeroPassagem;
    }

    /**
     * @return the valorPassagem
     */
    public double getValorPassagem() {
        return valorPassagem;
    }

    /**
     * @param valorPassagem the valorPassagem to set
     */
    public double setValorPassagem(double valorPassagem) {
        return this.valorPassagem = valorPassagem;
    }

    /**
     * @return the situacao
     */
    public PassagemSituacao getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(PassagemSituacao situacao) {
        this.situacao = situacao;
    }

    public String diponibilizar() {
        return situacao.disponivel(this);
    }

    public PassagemMemento saveToMemento() {
        return new PassagemMemento(situacao);
    }

    public void restoreFromMemento(PassagemMemento memento) {
        situacao = memento.getSituacaoSalva();
    }

    public void notificarPassagem(Passagem passagem) {
        getClientes().update(passagem);
    }

    /**
     * @return the clientes
     */
    public Observer getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(Observer clientes) {
        this.clientes = clientes;
    }

}
