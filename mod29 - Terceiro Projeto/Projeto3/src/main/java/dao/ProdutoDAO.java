package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import models.Produto;

public class ProdutoDAO implements IProdutoDAO{

	@Override
	public Integer cadastrar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			
			String sql = "insert into tb_produto (nome, codigo, valor) values (?, ?, ?)";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getCodigo());
			ps.setFloat(3, produto.getValor());
			
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
			
			String sql = "delete from tb_produto where codigo = ?";
			
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
	public Integer atualizar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			
			String sql = "update tb_produto set nome = ? where codigo = ?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getCodigo());
			
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
	public Produto consultar(String codigo) throws Exception {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Produto produto= null;
		
		try {
		
			connection = ConnectionFactory.getConnection();
			
			String sql = "select * from tb_produto where codigo = ?";
			
			ps = connection.prepareStatement(sql);
			
			ps.setString(1, codigo);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setCodigo(rs.getString("codigo"));
				produto.setNome(rs.getString("nome"));
				produto.setValor(rs.getFloat("valor"));
				
			}
			
			return produto;
			
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
	public List<Produto> buscarTodos() throws Exception {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Produto> lista = new ArrayList<>();
		
		try {
	
			connection = ConnectionFactory.getConnection();
			
			String sql = "select * from tb_produto";
			
			ps = connection.prepareStatement(sql);
		
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Produto produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setCodigo(rs.getString("codigo"));
				produto.setNome(rs.getString("nome"));
				produto.setValor(rs.getFloat("valor"));
				
				lista.add(produto);
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
			
		}	}

	
}
