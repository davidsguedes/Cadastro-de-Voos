package persistencia.dao;

import java.util.List;

import modelo.entidade.Passagem;
import modelo.entidade.Voo;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class VooDao {

	private Session session;

	public VooDao(Session session){

	}

	public List<Passagem> listarVooOrdenado(String ordem) {
		return this.session.createCriteria(Passagem.class).addOrder(Order.asc("dataVoo")).list();
	}

	public boolean adicionarVoo(Voo voo) {
		try {
			this.session.save(voo);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean removerVoo(Voo voo) {
		try {
			this.session.delete(voo);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean atualizarVoo(Voo voo) {
		try {
			this.session.merge(voo);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
