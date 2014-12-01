
package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.entidade.Passagem;
import persistencia.DaoFactory;
import persistencia.dao.PassagemDao;

public class GravarPassagemAction extends HttpServlet{

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

		Passagem passagem = new Passagem();
		passagem.setIdPassagem(Integer.parseInt(request.getParameter("idpassagem").trim()));
		passagem.setNumeroPassagem(request.getParameter("numeroPassagem").trim());
		passagem.setValorPassagem(Double.parseDouble(request.getParameter("valorPassagem").trim()));

		PassagemDao passagemDao = factory.getPassagemDao();

		factory.beginTransaction();

		if (passagemDao.adicionarPassagem(passagem)) {
			request.setAttribute("retorno", "1");
			request.setAttribute("mensagem", "Passagem cadastrada com sucesso.");
			factory.commit();
		}
		
		else {
			request.setAttribute("retorno", "0");
			request.setAttribute("mensagem", "Ocorreu um erro ao tentar cadastrar a passagem.");
			if (factory.hasTransaction()) {
				factory.stopTransaction();
			}
		}
		
		passagemDao.destruirPassagem(passagem);

		RequestDispatcher rd = request.getRequestDispatcher("sistema/inserirAlterarDepartamentoForm.jsp?acao=inserir");
		rd.forward(request, response);

	}}
