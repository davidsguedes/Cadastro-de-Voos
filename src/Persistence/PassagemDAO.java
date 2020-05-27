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

import Factory.StateFactoryPassagem;
import Model.Passagem;
import State.PassagemSituacao;

import com.mysql.jdbc.Connection;

/**
 *
 * @author david.guedes
 */
public class PassagemDAO {

    private static PassagemDAO instance = new PassagemDAO();
 

    private PassagemDAO() {
    }

    public static PassagemDAO getInstance() {
        return instance;
    }

    public boolean insert(Passagem passagem) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "insert into PASSAGEM (numeroPassagem, valorPassagem, passagemSituacao) values"
                    + "('" + passagem.getNumeroPassagem()+ "','"
                    + passagem.getValorPassagem() + "','"
                    + passagem.getSituacao().getEstado() + "')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }

        public List<Passagem> ListarPassagens() {
        String sql = "SELECT * FROM PASSAGEM";
        
        try {
            Connection conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
        List<Passagem> passagens = new ArrayList<Passagem>();

                        
            while (rs.next()) {
                Passagem passagem = new Passagem();
                passagem.setIdPassagem(rs.getInt("idPassagem"));
                passagem.setNumeroPassagem(rs.getString("numeroPassagem"));
                passagem.setValorPassagem(rs.getDouble("valorPassagem"));
                passagem.setSituacao(StateFactoryPassagem.create(rs.getString("passagemSituacao")));
                passagens.add(passagem);
            }
            stmt.close();
            return passagens;
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
        
    public List<Passagem> ListarPassagensIndisponiveis() {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Passagem passagem = null;
        List<Passagem> passagens = new ArrayList<Passagem>();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM PASSAGEM where passagemSituacao = 'Indisponivel'";
            result = st.executeQuery(sql);            
            while (result.next()) {
                passagem = new Passagem();
                passagem.setIdPassagem(result.getInt("idPassagem"));
                passagem.setNumeroPassagem(result.getString("numeroPassagem"));
                passagem.setValorPassagem(result.getDouble("valorPassagem"));
                passagem.setSituacao(StateFactoryPassagem.create(result.getString("passagemSituacao")));
                passagens.add(passagem);
            }
        } catch (ClassNotFoundException | SQLException e) {

        }
        return passagens;
    }
    
    public Passagem selectPassagensIndisponiveis(Integer idPassagem) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Passagem passagem = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM PASSAGEM where passagemSituacao = '"+idPassagem+"'";
            result = st.executeQuery(sql);
            while (result.next()) {
                passagem = new Passagem();
                passagem.setIdPassagem(result.getInt("idPassagem"));
                passagem.setNumeroPassagem(result.getString("numeroPassagem"));
                passagem.setValorPassagem(result.getDouble("valorPassagem"));
                passagem.setSituacao(StateFactoryPassagem.create(result.getString("passagemSituacao")));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return passagem;
    }

    public Passagem selectPassagem(Integer idPassagem) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Passagem passagem = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();

            sql = "SELECT * FROM PASSAGEM where idPassagem = '" + idPassagem + "'";
            result = st.executeQuery(sql);
            while (result.next()) {
                passagem = new Passagem();
                passagem.setIdPassagem(result.getInt("idPassagem"));
                passagem.setNumeroPassagem(result.getString("numeroPassagem"));
                passagem.setValorPassagem(result.getDouble("valorPassagem"));
                passagem.setSituacao(StateFactoryPassagem.create(result.getString("passagemSituacao")));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return passagem;
    }

    public boolean update(Passagem passagem) {
         Connection conn = null;
        Statement st = null;
        String sql = null;
        PassagemSituacao situacao = null;
        boolean status = false;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "update PASSAGEM set situacaoPassagem = '"+passagem.getSituacao()+"' where numeroPassagem = '"+passagem.getNumeroPassagem()+"'";
            status = st.execute(sql);
        } catch (Exception e) {
            return status;
        }
        
        return status;
    }

}
