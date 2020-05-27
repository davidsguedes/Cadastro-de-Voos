package Action;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Aeronave;
import Model.Aeroporto;
import Model.Itinerario;
import Persistence.AeronaveDAO;
import Persistence.AeroportoDAO;
import Persistence.ItinerarioDAO;

public class ListarItinerarioAeronaveAeroportoVooAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		List<Aeroporto> aeroportos = AeroportoDAO.getInstance().listarAeroporto();
		List<Itinerario> itinerarios = ItinerarioDAO.getInstance().listarItinerario();
		List<Aeronave> aeronaves = AeronaveDAO.getInstance().listarAeronave();
		
		
		request.setAttribute("aeroportos", aeroportos);
		request.setAttribute("itinerarios", itinerarios);
		request.setAttribute("aeronaves", aeronaves);
		
		
		
		
		 try {
				request.getRequestDispatcher("vooCadastrar.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException ex) {
	                Logger.getLogger(ListarEmpresaAeronaveAction.class.getName()).log(Level.SEVERE, null, ex);
	            }
		
	}
	
	

}
