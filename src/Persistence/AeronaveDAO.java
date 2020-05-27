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

import Model.Aeronave;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class AeronaveDAO {
    
    private static AeronaveDAO instance = new AeronaveDAO();
    private Connection conn;

    public static AeronaveDAO getInstance() {
        return instance;

    }
    
     public Aeronave selectAeronave(Integer aeroId) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Aeronave aeronave = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM Aeronave where aeroId = '"+ aeroId + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                aeronave = new Aeronave();
                aeronave.setAeroId(rs.getInt("aeroId"));
                aeronave.setAeroCod(rs.getString("aeroCod"));
                aeronave.setAeroCapacidade(rs.getInt("aeroCapacidade"));
                aeronave.setAeroModelo(rs.getString("aeroModelo"));
                aeronave.setIdEmpresa(rs.getInt("idEmpresa"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return aeronave;
    }
     
     public List<Aeronave> listarAeronave() {
        String sql = "SELECT * FROM AERONAVE";
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Aeronave> listarAeronave = new ArrayList<Aeronave>();

            while (rs.next()) {
                Aeronave aeronave = new Aeronave();
                aeronave.setAeroId(rs.getInt("aeroId"));
                aeronave.setAeroCod(rs.getString("aeroCod"));
                aeronave.setAeroCapacidade(rs.getInt("aeroCapacidade"));
                aeronave.setAeroModelo(rs.getString("aeroModelo"));
                aeronave.setIdEmpresa(rs.getInt("idEmpresa"));
                listarAeronave.add(aeronave);
            }
            stmt.close();
            return listarAeronave;

        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(Aeronave aeronave) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;      
		try {
                    conn = DatabaseLocator.getInstance().getConnection();
                    st = conn.createStatement();
                    String sql = "INSERT INTO AERONAVE (aeroCod, aeroCapacidade, aeroModelo,idEmpresa) VALUES"
                    	+ "('" + aeronave.getAeroCod() + "','"
                        + aeronave.getAeroCapacidade() + "','"
                        + aeronave.getAeroModelo() + "','"
                        + aeronave.getIdEmpresa() + "')";
                    st.execute(sql);
                success = true;  
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
                
    }
    
    
    
    
   
    
}
