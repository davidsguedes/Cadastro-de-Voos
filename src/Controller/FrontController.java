/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Action.Action;
import Factory.ActionFactory;
import Model.Operador;


public class FrontController extends HttpServlet {

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action;
		action = request.getParameter("action");

		Action objFactory = ActionFactory.create(action);
		if(objFactory != null) {
			objFactory.execute(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response); 
	}

	@Override
	public String getServletInfo() {
		return "Short description";
	}

	public double incluirNovoOperadorCalcularSalario(HttpServletRequest request) {

		String nomeOperador = request.getParameter("nomeOperador");
		String permissaoOperador = request.getParameter("permissaoOperador");
		String nivelOperador = request.getParameter("nivelOperador");
		int diasUteisTrabalhados = Integer.parseInt(request.getParameter("diasUteisTrabalhados"));
		double valorDiaTrabalhado = Double.parseDouble(request.getParameter("valorDiaTrabalhado"));
		double valorValeTransporteDia = Double.parseDouble(request.getParameter("valorValeTransporteDia"));
		double salarioMes = 0;

		Operador objOperador = new Operador(nomeOperador, permissaoOperador, nivelOperador, diasUteisTrabalhados, valorDiaTrabalhado, valorValeTransporteDia);
		return objOperador.calcularSalario(salarioMes);
	}

	public double incluirNovoOperadorCalcularValeTransporte(HttpServletRequest request) {

		String nomeOperador = request.getParameter("nomeOperador");
		String permissaoOperador = request.getParameter("permissaoOperador");
		String nivelOperador = request.getParameter("nivelOperador");
		int diasUteisTrabalhados = Integer.parseInt(request.getParameter("diasUteisTrabalhados"));
		double valorDiaTrabalhado = Double.parseDouble(request.getParameter("valorDiaTrabalhado"));
		double valorValeTransporteDia = Double.parseDouble(request.getParameter("valorValeTransporteDia"));
		double valeTransporteMes = 0;

		Operador objOperador = new Operador(nomeOperador, permissaoOperador, nivelOperador, diasUteisTrabalhados, valorDiaTrabalhado, valorValeTransporteDia);
		return objOperador.calcularValeTransporte(valeTransporteMes);
	}

}
