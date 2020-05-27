package Memento;

import State.PassagemSituacao;

public class PassagemMemento {
	
	private PassagemSituacao situacao;
	
	public PassagemMemento(PassagemSituacao estadoSalvar){
		situacao = estadoSalvar;
	}
	
	public PassagemSituacao getSituacaoSalva() {
		return situacao;
	}
	
	@Override
	public String toString() {
		return "Situação da passagem desfeita!";
	}
}
