package Persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Operador;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class OperadorDAO {

    private static OperadorDAO instance = new OperadorDAO();
    private Connection conn;

    public static OperadorDAO getInstance() {
        return instance;

    }

    public Operador selectOperador(Integer idOperador) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Operador operador = new Operador();
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM OPERADOR where idOperador = '"+ idOperador + "'";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
            	operador.setIdOperador(rs.getInt("idOperador"));
            	operador.setNomeOperador(rs.getString("nomeOperador"));
            	operador.setPermissaoOperador(rs.getString("permissaoOperador"));
            	operador.setNivelOperador(rs.getString("nivelOperador"));
            	operador.setDiasUteisTrabalhados(rs.getInt("diasUteisTrabalhados"));
            	operador.setValorDiaTrabalhado(rs.getDouble("valorDiaTrabalhado"));
            	operador.setValorValeTransporteDia(rs.getDouble("valorValeTransporteDia"));
            	
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return operador;
    }

    public List<Operador> listarOperador() { // listar operador action
        String sql = "SELECT * FROM OPERADOR";
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Operador operador = new Operador();

            List<Operador> listarOperador = new ArrayList<Operador>();

            while (rs.next()) {
            	operador.setIdOperador(rs.getInt("idOperador"));
            	operador.setNomeOperador(rs.getString("nomeOperador"));
            	operador.setPermissaoOperador(rs.getString("permissaoOperador"));
            	operador.setNivelOperador(rs.getString("nivelOperador"));
            	operador.setDiasUteisTrabalhados(rs.getInt("diasUteisTrabalhados"));
            	operador.setValorDiaTrabalhado(rs.getDouble("valorDiaTrabalhado"));
            	operador.setValorValeTransporteDia(rs.getDouble("valorValeTransporteDia"));
            	listarOperador.add(operador);
            }
            stmt.close();
            return listarOperador;

        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public boolean inserirOperador(Operador operador) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "insert into OPERADOR (nomeOperador, permissaoOperador, nivelOperador, diasUteisTrabalhados, valorDiaTrabalhado, valorValeTransporteDia) values"
                    + "('" + operador.getNomeOperador() + "','"
                    + operador.getPermissaoOperador() + "','"
                    + operador.getNivelOperador() + "','"
                    + operador.getDiasUteisTrabalhados() + "','"
                    + operador.getValorDiaTrabalhado() + "','"
                    + operador.getValorValeTransporteDia() + "')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }

    public boolean removerOperador(Operador operador) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean atualizarOperador(Operador operador) {
        // TODO Auto-generated method stub
        return false;
    }
}
