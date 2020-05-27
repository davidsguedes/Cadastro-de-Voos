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

import Model.Itinerario;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class ItinerarioDAO {
    
    private static ItinerarioDAO instance = new ItinerarioDAO();
    private Connection conn;

    public static ItinerarioDAO getInstance() {
        return instance;

    }

    public Itinerario selectItinerario(Integer idItinerario) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Itinerario itinerario = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM Itinerario where ididItinerario = '"+ idItinerario + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                itinerario = new Itinerario();
                itinerario.setIdItinerario(rs.getInt("idItinerario"));
                itinerario.setItiCod(rs.getString("itiCod"));
                itinerario.setItiOrigem(rs.getString("itiOrigem"));
                itinerario.setItiDestino(rs.getString("itiDestino"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return itinerario;
    }

    public List<Itinerario> listarItinerario() {
        String sql = "SELECT * FROM Itinerario";
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Itinerario> listarItinerario = new ArrayList<Itinerario>();

            while (rs.next()) {
                Itinerario itinerario = new Itinerario();
                itinerario.setIdItinerario(rs.getInt("idItinerario"));
                itinerario.setItiCod(rs.getString("itiCod"));
                itinerario.setItiOrigem(rs.getString("itiOrigem"));
                itinerario.setItiDestino(rs.getString("itiDestino"));
                listarItinerario.add(itinerario);
            }
            stmt.close();
            return listarItinerario;

        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public boolean inserirItinerario(Itinerario itinerario) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "insert into ITINERARIO (ITICOD, ITIORIGEM, ITIDESTINO) values"
                    + "('" + itinerario.getItiCod() + "','"
                    + itinerario.getItiOrigem() + "','"
                    + itinerario.getItiDestino() + "')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }
    
}
