package persistencia;

import modelo.entidade.Cliente;
import modelo.entidade.Passagem;
import modelo.entidade.Voo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateConexao {
	private static SessionFactory factory;
	static {
//		Properties config = new Properties();
		String username = "root";
		String password = "";
		String local = "localhost";
		
		Configuration conf = new Configuration();
		//ConfiguraÃ§Ã£oo do Banco de Dados
		
		conf.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		conf.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		conf.setProperty("hibernate.connection.url", "jdbc:mysql://" + local + ":3306/trabalhoLabIV?autoReconnect=true");
		conf.setProperty("hibernate.connection.username", username);
		conf.setProperty("hibernate.connection.password", password);
		conf.setProperty("hibernate.default_schema", "trabalhoLabIV");
		conf.setProperty("hibernate.hbm2ddl.auto", "update");
		
		//Configurações de Debug
		conf.setProperty("hibernate.show_sql", "true");
		conf.setProperty("hibernate.use_sql_comment", "false");
		conf.setProperty("hibernate.generate_statistics", "false");
		conf.setProperty("format_sql", "false");
		
		//Mapeando as classes anotadas
		conf.addAnnotatedClass(Cliente.class);// mudei aqui para ele verificar o mapeamento na classe
		conf.addAnnotatedClass(Passagem.class);
		conf.addAnnotatedClass(Voo.class);
		
		// mudei a forma de instanciar o SessionFactory pq estou usando o hibernate 4
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
		factory = conf.buildSessionFactory(builder.build());
	}
	
	public static Session getSession(){
		return factory.openSession();
	}
}
