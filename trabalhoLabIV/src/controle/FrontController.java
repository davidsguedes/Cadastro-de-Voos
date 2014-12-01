package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidade.Cliente;
import persistencia.DaoFactory;
import persistencia.dao.ClienteDao;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	Cliente clienteLogado = new Cliente();
    	clienteLogado.setLogin(request.getParameter("login"));
    	clienteLogado.setSenha(request.getParameter("senha"));

    	
    	DaoFactory daoFactory = new DaoFactory();
    	ClienteDao clienteDao = daoFactory.getClienteDao();
    	List<Cliente> listarTodos = clienteDao.buscarCliente(clienteLogado);
    	
    	if(listarTodos.size() == 0)
    	{
    		response.sendRedirect("paginas/erroLogin.html");
    	}
    	
    	/*else if (tipo cliente)*/
		response.sendRedirect("paginas/inicio.jsp");
    	
    /*	else
    		tipo administrador
    		response.sendRedirect("paginas/inicioAdministrador.jsp");*/

    	
	}

	
	

}
