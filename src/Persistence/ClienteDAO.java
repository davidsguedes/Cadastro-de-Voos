package Persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

import com.mysql.jdbc.Connection;

/**
 *
 * @author Guedes
 */
public class ClienteDAO {

    private static ClienteDAO instance = new ClienteDAO();
    private Connection conn;

    public static ClienteDAO getInstance() {
        return instance;

    }

    public Cliente selectCliente(Integer idCliente) {
        Connection conn = null;
        Statement st = null;
        String sql = null;
        ResultSet result = null;
        Cliente cliente = null;

        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            sql = "SELECT * FROM CLIENTE where idcliente = '"+ idCliente + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setPais(rs.getString("pais"));
            }

        } catch (ClassNotFoundException | SQLException e) {

        }

        return cliente;
    }

    public List<Cliente> listarCliente() { // listar cliente action
        String sql = "SELECT * FROM CLIENTE";
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            List<Cliente> listarCliente = new ArrayList<Cliente>();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setIdade(rs.getInt("idade"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setPais(rs.getString("pais"));
                listarCliente.add(cliente);
            }
            stmt.close();
            return listarCliente;

        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    public boolean inserirCliente(Cliente cliente) {
        Connection conn = null;
        Statement st = null;
        boolean success = false;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            String sql = "insert into CLIENTE (nome, idade, cpf, email, telefone, cidade,estado, pais) values"
                    + "('" + cliente.getNome() + "','"
                    + cliente.getIdade() + "','"
                    + cliente.getCpf() + "','"
                    + cliente.getEmail() + "','"
                    + cliente.getTelefone() + "','"
                    + cliente.getCidade() + "','"
                    + cliente.getEstado() + "','"
                    + cliente.getPais() + "')";
            st.execute(sql);
            success = true;
        } catch (Exception e) {
            success = false;
            return success;
        }
        return success;
    }

    public boolean removerCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean atualizarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        return false;
    }
}
