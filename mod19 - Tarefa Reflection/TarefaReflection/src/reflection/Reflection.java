package reflection;

import anotacao.Tabela;

public class Reflection {

	public static void main(String[] args) {
		
		Class<Tabela> tabela = Tabela.class;
		String nome = tabela.getName();
		System.out.println(nome);
	}

}
