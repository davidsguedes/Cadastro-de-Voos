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

import Model.Aeroporto;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class AeroportoDAO {
    
    private static AeroportoDAO instance = new AeroportoDAO();

    public static AeroportoDAO getInstance() {
        return instance;

    }
    
     public Aeroporto selectAeroporto(Integer idAeroporto) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Aeroporto aeroporto = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM Aeroporto where aeroId = '"+ idAeroporto + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aeroporto = new Aeroporto();
                aeroporto.setIdAeroporto(rs.getInt("idAeroporto"));
                aeroporto.setAercod(rs.getString("aercod"));
                aeroporto.setAerSigla(rs.getString("aerSigla"));
                aeroporto.setAerlocalizacao(rs.getString("aerlocalizacao"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return aeroporto;
    }
     
     public List<Aeroporto> listarAeroporto() {
    	 Connection conn = null;
    	 String sql = "SELECT * FROM Aeroporto";
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Aeroporto> listarAeroporto = new ArrayList<Aeroporto>();

            while (rs.next()) {
                Aeroporto aeroporto = new Aeroporto();
                aeroporto.setIdAeroporto(rs.getInt("idAeroporto"));
                aeroporto.setAercod(rs.getString("aercod"));
                aeroporto.setAerSigla(rs.getString("aerSigla"));
                aeroporto.setAerlocalizacao(rs.getString("aerlocalizacao"));
                listarAeroporto.add(aeroporto);
            }
            stmt.close();
            return listarAeroporto;

        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(Aeroporto aeroporto) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
		String sql = "INSERT INTO Aeroporto (aerCod, aerSigla, aerlocalizacao) VALUES"
                        + "('" + aeroporto.getAercod() + "','"
                    + aeroporto.getAerSigla()+ "','"
                    + aeroporto.getAerlocalizacao()+ "')";
		st.execute(sql);
            success = true;
            
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
                
    }
    
}
