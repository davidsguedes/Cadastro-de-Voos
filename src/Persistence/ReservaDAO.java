/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Cliente;
import Model.Passagem;
import Model.Reserva;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class ReservaDAO {

    private static ReservaDAO instance = new ReservaDAO();
    
    private ReservaDAO() {
    	
    }

    public static ReservaDAO getInstance() {
        return instance;
    }

    public boolean insert(Reserva reserva) {

        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
        String sql = "INSERT INTO RESERVA (idCliente, idPassagem) VALUES"
                     + "('" + reserva.getIdCliente()+ "','"
                    + reserva.getIdPassagem() + "')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }
    
    public List listarReservaPassagem(Passagem passagem) {
    	 Connection conn = null;

		String sql = "SELECT * FROM RESERVA R INNER JOIN CLIENTE C ON C.IDCLIENTE = R.IDCLIENTE "
				+ "WHERE R.IDPASSAGEM ="+passagem.getIdPassagem();
		try {
			conn = DatabaseLocator.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(sql);

			List<Reserva> listarReserva = new ArrayList<Reserva>();

			while (rs.next()) {
				Reserva reserva = new Reserva();
				Passagem p = new Passagem();
				Cliente c = new Cliente();
				reserva.setPassagem(p);
				reserva.setCliente(c);
				reserva.setIdReserva(rs.getInt("r.idreserva"));
				reserva.getPassagem().setIdPassagem(rs.getInt("r.idPassagem"));
				reserva.getCliente().setIdCliente(rs.getInt("r.idCliente"));
				reserva.getCliente().setNome(rs.getString("c.nome"));
				listarReserva.add(reserva);
			}
			stmt.close();
			return listarReserva;

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
