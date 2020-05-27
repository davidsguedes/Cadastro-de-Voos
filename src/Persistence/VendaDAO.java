/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.sql.Statement;

import Model.Venda;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class VendaDAO {

    private static VendaDAO instance = new VendaDAO();

    private VendaDAO() {
    }

    public static VendaDAO getInstance() {
        return instance;
    }

    public boolean insert(Venda venda) {
    	Connection conn = null;
        Statement st = null;
        boolean success = false;       
        
		try {
			
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "INSERT INTO VENDA (idPassagem, idCliente, idVoo, valorVenda, promocaoSelecionada) VALUES"
								+ "('" + venda.getIdPassagem() + "','"
								+ venda.getIdCliente() + "','"
								+ venda.getIdVoo() + "','"
								+ venda.getValorVenda() +"','"
								+ venda.getPromocaoSelecionada()+"')";


			st.execute(sql);
			success = true;

		} catch (Exception e) {
            success = false;
            return success;
        }
        return success;
                
    }

    /*public List ListarPassagens() {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        List<Venda> vendas = new ArrayList<Venda>();

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM VENDA as V join CLIENTE as C on C.IDCLIENTE = V.IDCLIENTE";
            result = st.executeQuery(sql);

            while (result.next()) {
                Venda venda = new Venda();
                venda.setIdPassagem(result.getInt("p.idPassagem"));
                venda.setIdCliente(result.getInt("p.IdCliente"));
                venda.setIdVoo(result.getInt("p.IdVoo"));
                vendas.add(venda);
            }
        } catch (ClassNotFoundException | SQLException e) {

        }
        return vendas;
    }*/

    /*public boolean inserirVenda(Venda venda) throws SQLException {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            String sql = "INSERT INTO VENDA(codigoVenda , idPassagem, idCliente , idVoo) VALUES "
                    + "('" + venda.getCodigoVenda() + "','"
                    + venda.getIdPassagem() + "','"
                    + venda.getIdCliente() + "','"
                    + venda.getIdVoo() + "')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }*/
}
