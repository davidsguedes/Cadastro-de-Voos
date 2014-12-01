package controle;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.entidade.Cliente;
import persistencia.DaoFactory;
import persistencia.dao.ClienteDao;


public class GravarClienteAction extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proccessRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proccessRequest(request, response);
	}

	protected void proccessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sessao = request.getSession(true);

		DaoFactory factory = (DaoFactory) sessao.getAttribute("factory");

		Cliente cliente = new Cliente();
		cliente.setId((Integer.parseInt(request.getParameter("id").trim())));
		cliente.setCpf(request.getParameter("cpf").trim());
		cliente.setNome(request.getParameter("nome").trim());
		cliente.setLogin(request.getParameter("login").trim());
		cliente.setSenha(request.getParameter("senha").trim());

		ClienteDao clienteDao = factory.getClienteDao();

		factory.beginTransaction();

		if (clienteDao.adicionarCliente(cliente)) {
			request.setAttribute("retorno", "1");
			request.setAttribute("mensagem", "Cliente cadastrado com sucesso.");
			factory.commit();
		}

		else {
			request.setAttribute("retorno", "0");
			request.setAttribute("mensagem", "Ocorreu um erro ao tentar cadastrar o cliente.");
			if (factory.hasTransaction()) {
				factory.stopTransaction();
			}
		}

	}
}
