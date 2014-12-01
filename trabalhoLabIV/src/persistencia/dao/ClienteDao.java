package persistencia.dao;

import java.util.List;
import modelo.entidade.Cliente;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import persistencia.HibernateConexao;

public class ClienteDao {
	
	private Session session;

	public ClienteDao(Session session) {
		// TODO Auto-generated constructor stub
	}

	public List<Cliente> buscarCliente(Cliente u)
	{
		Criteria criteriosListar = HibernateConexao.getSession().createCriteria(Cliente.class);
		criteriosListar.add(Restrictions.eq("login" , u.getLogin()));
		criteriosListar.add(Restrictions.eq("senha" , u.getSenha()));
		List<Cliente> listaClientes = criteriosListar.list();
		return listaClientes;
		
	}
	
	public boolean adicionarCliente(Cliente cliente) {
		try {
			this.session.save(cliente);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean removerCliente(Cliente cliente) {
		try {
			this.session.delete(cliente);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean atualizarCliente(Cliente cliente) {
		try {
			this.session.merge(cliente);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
}
