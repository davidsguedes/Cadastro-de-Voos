package Persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Factory.StateFactoryVoo;
import Model.Voo;
import State.VooEstado;

import com.mysql.jdbc.Connection;

/**
 *
 * @author leoniralves
 */
public class VooDAO {
    private static VooDAO instance = new VooDAO();

    private VooDAO() {}

    public static VooDAO getInstance() {
        return instance;
    }
    
    public boolean insert (Voo voo) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "insert into VOO (codigoVoo, idItinerario, aeroId, idAeroporto) values"
                    + "('"+voo.getCodigoVoo()+"','"+
                    voo.getIdItinerario()+"','"+
                    voo.getAeroId()+"','"+
                    voo.getIdAeroporto()+"')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }
    
    public List<Voo> selectVoos () {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Voo voo = null;
        List<Voo> voos = new ArrayList<Voo>();
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM VOO";
            result = st.executeQuery(sql);
            while (result.next()) {
                voo = new Voo();
                voo.setIdVoo(result.getInt("idVoo"));
                voo.setCodigoVoo(result.getString("codigoVoo"));
                voo.setIdItinerario(result.getInt("idItinerario"));
                voo.setAeroId(result.getInt("aeroId"));
                voo.setIdAeroporto(result.getInt("idAeroporto"));
                voo.setEstado(StateFactoryVoo.create(result.getString("estadoVoo")));
                voos.add(voo);
            }
        } catch (ClassNotFoundException | SQLException e){
            
        }
        return voos;
    }
    
    public Voo selectVoo (Integer idVoo) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Voo voo = null;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM VOO where idvoo = '"+idVoo+"'";
            result = st.executeQuery(sql);
            while (result.next()) {
            	voo = new Voo();
                voo.setIdVoo(result.getInt("idVoo"));
                voo.setCodigoVoo(result.getString("codigoVoo"));
                voo.setIdItinerario(result.getInt("idItinerario"));
                voo.setAeroId(result.getInt("aeroId"));
                voo.setIdAeroporto(result.getInt("idAeroporto"));
                voo.setEstado(StateFactoryVoo.create(result.getString("estadoVoo")));
            }
            
        } catch ( ClassNotFoundException | SQLException e) {
            
        }
        
        return voo;
    }
    
    public boolean update(Voo voo) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        VooEstado state = null;
        boolean status = false;
        
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "update VOO set estadoVoo = '"+voo.getNomeEstado()+"' where codigoVoo = '"+voo.getCodigoVoo()+"'";
            status = st.execute(sql);
        } catch (Exception e) {
            return status;
        }
        
        return status;
    }
}
