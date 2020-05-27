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

import Model.Empresa;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class EmpresaDAO {
    
    private static EmpresaDAO instance = new EmpresaDAO();
    private Connection conn;

    public static EmpresaDAO getInstance() {
        return instance;

    }
    
     public Empresa selectEmpresa(Integer idEmpresa) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        Empresa empresa = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM EMPRESA where idEmpresa = '"+idEmpresa+"'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                empresa = new Empresa();
                empresa.setIdEmpresa(rs.getInt("idEmpresa"));
                empresa.setEmpCod(rs.getString("empCod"));
                empresa.setEmpNome(rs.getString("empNome"));
                empresa.setEmpRazaoSocial(rs.getString("empRazaoSocial"));
                empresa.setEmpCnpj(rs.getInt("empCnpj"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return empresa;
    }
     
     public List<Empresa> listarEmpresa() {
        String sql = "SELECT * FROM EMPRESA";
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Empresa> listarEmpresa = new ArrayList<Empresa>();

            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setIdEmpresa(rs.getInt("idEmpresa"));
                empresa.setEmpCod(rs.getString("empCod"));
                empresa.setEmpNome(rs.getString("empNome"));
                empresa.setEmpRazaoSocial(rs.getString("empRazaoSocial"));
                empresa.setEmpCnpj(rs.getInt("empCnpj"));
                listarEmpresa.add(empresa);
            }
            stmt.close();
            return listarEmpresa;

        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }
    
    public boolean insert(Empresa empresa) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "insert into EMPRESA (empCod, empNome, empRazaoSocial, empCnpj) values"
                    + "('" + empresa.getEmpCod() + "','"
                    + empresa.getEmpNome() + "','"
                    + empresa.getEmpRazaoSocial() + "','"
                    + empresa.getEmpCnpj() + "')";
            st.execute(sql);
            success = true;
            
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
}
    
    public Empresa selectEmpresaComplete() {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        Empresa empresa = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM EMPRESA E join AERONAVE A where A.idEmpresa = E.aeroId";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                empresa = new Empresa();
                empresa.setIdEmpresa(rs.getInt("idEmpresa"));
                empresa.setEmpCod(rs.getString("empCod"));
                empresa.setEmpNome(rs.getString("empNome"));
                empresa.setEmpRazaoSocial(rs.getString("empRazaoSocial"));
                empresa.setEmpCnpj(rs.getInt("empCnpj"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return empresa;
    }
    
    
    
}
