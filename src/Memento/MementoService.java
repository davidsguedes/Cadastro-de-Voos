package Memento;

import java.util.ArrayList;
import java.util.List;

import Model.Passagem;

public class MementoService {
	
	private static MementoService instance = new MementoService();
	
	public static MementoService getInstance() {
		return (MementoService) instance;

	}
	
	private List<PassagemMemento> situacaoPassagem = new ArrayList<PassagemMemento>();
	
	private Passagem passagem = new Passagem();
	
	public boolean salvarSituacao(Passagem passagem){
		
		situacaoPassagem.add(passagem.saveToMemento());
		this.passagem = passagem;
		return true;
	}
	
	public Passagem restauraSituacao(){	
		passagem.restoreFromMemento(situacaoPassagem.get(0));
		return passagem;
	}
	
	public boolean limparSituacoes() {
		situacaoPassagem.clear();
		return true;
	}

	public List<PassagemMemento> getSituacoesPassagem() {
		return situacaoPassagem;
	}

	public void setSituacoesPassagem(List<PassagemMemento> situacoesPassagem) {
		this.situacaoPassagem = situacoesPassagem;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	
	
	
}	
