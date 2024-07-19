package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import models.Cliente;

public class ClienteDAO implements IClienteDAO {

	@Override
	public Integer cadastrar(Cliente cliente) throws Exception {
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			
			String sql = "insert into tb_cliente (nome, codigo) values (?, ?)";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCodigo());
			
			return ps.executeUpdate();
			
		}
		
		catch(Exception e) {
			throw e;
			
		}
		
		finally {
			if(ps != null && !ps.isClosed()) {
				ps.close();
			}
			
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
			
		}
	}

	@Override
	public Integer exlcuir(String codigo) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
		
			connection = ConnectionFactory.getConnection();
			
			String sql = "delete from tb_cliente where codigo = ?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, codigo);
			
			return ps.executeUpdate();
		}
		
		catch(Exception e) {
			throw e;
			
		}
		
		finally {
			if(ps != null && !ps.isClosed()) {
				ps.close();
			}
			
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
			
		}
	}

	@Override
	public Integer atualizar(Cliente cliente) throws Exception {

		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			
			String sql = "update tb_cliente set nome = ? where codigo = ?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCodigo());
			
			return ps.executeUpdate();
			
		}
		
		catch(Exception e) {
			throw e;
			
		}
		
		finally {
			if(ps != null && !ps.isClosed()) {
				ps.close();
			}
			
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
			
		}
	}

	@Override
	public Cliente consultar(String codigo) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		
		try {
		
			connection = ConnectionFactory.getConnection();
			
			String sql = "select * from tb_cliente where codigo = ?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, codigo);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setCodigo(rs.getString("codigo"));
				cliente.setNome(rs.getString("nome"));
				
			}
			
			return cliente;
		}
		
		catch(Exception e) {
			throw e;
			
		}
		
		finally {
			if(ps != null && !ps.isClosed()) {
				ps.close();
			}
			
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
			
		}
	}

	@Override
	public List<Cliente> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Cliente> lista = new ArrayList<>();
		
		try {
	
			connection = ConnectionFactory.getConnection();
			
			String sql = "select * from tb_cliente";
			
			ps = connection.prepareStatement(sql);
		
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("id"));
				cliente.setCodigo(rs.getString("codigo"));
				cliente.setNome(rs.getString("nome"));
				
				lista.add(cliente);
			}
			
			return lista;
		}
		
		catch(Exception e) {
			throw e;
			
		}
		
		finally {
			if(ps != null && !ps.isClosed()) {
				ps.close();
			}
			
			if(connection != null && !connection.isClosed()) {
				connection.close();
			}
			
		}
	}

}
