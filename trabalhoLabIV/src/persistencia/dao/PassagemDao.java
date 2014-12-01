package persistencia.dao;

import java.util.List;

import modelo.entidade.Passagem;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class PassagemDao {
	
	Session session;
	
	
	public PassagemDao(Session session){
		
	}
	
	public List<Passagem> listarPassagemOrdenada(String ordem) {
		return this.session.createCriteria(Passagem.class).addOrder(Order.asc("numeroPassagem")).list();
	}
	
	public boolean adicionarPassagem(Passagem passagem) {
		try {
			this.session.save(passagem);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean removerpassagem(Passagem passagem) {
		try {
			this.session.delete(passagem);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean atualizarPassagem(Passagem passagem) {
		try {
			this.session.merge(passagem);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public void destruirPassagem(Passagem passagem) {
		session.evict(passagem);
	}

}
