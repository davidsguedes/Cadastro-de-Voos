/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.entidade.Voo;
import persistencia.DaoFactory;
import persistencia.dao.VooDao;

/**
 *
 * @author david.guedes
 */
public class GravarVooAction extends HttpServlet{
	
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

		Voo voo = new Voo();
		voo.setCodigoVoo((request.getParameter("codigoVoo").trim()));
		voo.setDataVoo(request.getParameter("dataVoo").trim());
		voo.setHoraVoo(request.getParameter("horaVoo").trim());
		voo.setAeroportoOrigem(request.getParameter("aeroportoOrigem").trim());
		voo.setAeroportoDestino(request.getParameter("aeroportoDestino").trim());

		VooDao vooDao = factory.getVooDao();

		factory.beginTransaction();

		if (vooDao.adicionarVoo(voo)) {
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
