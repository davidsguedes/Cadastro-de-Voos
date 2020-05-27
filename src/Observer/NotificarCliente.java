package Observer;

import java.util.List;

import Model.Passagem;
import Model.Reserva;
import Persistence.ReservaDAO;



public class NotificarCliente implements Observer {

    /**
     *
     * @param passagem
     */
    @Override
	public void update(Passagem passagem) {
		List<Reserva> reservas = ReservaDAO.getInstance().listarReservaPassagem(passagem);
		if (reservas.size() >= 1) {
			for (Reserva reserva : reservas) {
				System.out.println("Prezado cliente '"+reserva.getCliente().getNome()+"' a passagem '"+reserva.getPassagem().getNumeroPassagem()+"' está disponível");
			}
		}
	}

}
