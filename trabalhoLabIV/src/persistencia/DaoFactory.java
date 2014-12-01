package persistencia;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistencia.dao.ClienteDao;
import persistencia.dao.PassagemDao;
import persistencia.dao.VooDao;



public class DaoFactory {
	private final Session session;
	private Transaction transaction;

	public DaoFactory() {
		if (hasTransaction()) {
			session = null;
			stopTransaction();
		} else {
			session = HibernateConexao.getSession();
		}
	}

	public void beginTransaction() {
		this.transaction = this.session.beginTransaction();
	}
	
	public void commit() {
		this.transaction.commit();
		this.transaction = null;
	}

	public boolean hasTransaction() {
		return this.transaction != null;
	}

	public void rollBack() {
		this.transaction.rollback();
		this.transaction = null;
	}

	public void stopTransaction() {
		this.transaction = null;
	}

	public void close() {
		this.session.close();
	}

	public void clear() {
		this.session.clear();
	}

	public ClienteDao getClienteDao() {
		return new ClienteDao(this.session);
	}

	public PassagemDao getPassagemDao(){
		return new PassagemDao(this.session);
	}

	public VooDao getVooDao(){
		return new VooDao(this.session); 
	}

}
