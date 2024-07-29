package dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Produto;
import domain.ItemVenda;

public class ItemVendaFactory {

	public static ItemVenda convert(ResultSet rs) throws SQLException {
		Produto prod = ProdutoFactory.convert(rs);
		ItemVenda prodQ = new ItemVenda();
		prodQ.setProduto(prod);
		prodQ.setId(rs.getLong("ID"));
		prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
		prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		return prodQ;
	}
}