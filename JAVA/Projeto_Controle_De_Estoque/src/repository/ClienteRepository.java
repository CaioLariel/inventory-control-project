package repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;

public class ClienteRepository {
    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(cpf, nome, data_nascimento) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
    
        try {
            ps = MySQLDatabaseConnection.getConexao().prepareStatement(sql);
            ps.setLong(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getData_nascimento());
            ps.execute();
            ps.close();
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
