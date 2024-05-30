package app;

import br.com.mycompany.dao.FerrariMapDAO;
import br.com.mycompany.dao.GenericDAO;
import br.com.mycompany.dao.HondaMapDAO;
import br.com.mycompany.dao.IFerrariDAO;
import br.com.mycompany.dao.IHondaDAO;
import br.com.mycompany.generic.models.Ferrari;
import br.com.mycompany.generic.models.Honda;

public class Demo {

	private static IFerrariDAO iFerrariDAO;
	private static IHondaDAO iHondaDAO;
	
	public static void main(String[] args) {
		iFerrariDAO = new FerrariMapDAO();
		iHondaDAO = new HondaMapDAO();
		
		Ferrari ferrari = new Ferrari("Ferrari1", "ABC-1111", 2);
		Ferrari ferrari2 = new Ferrari("Ferrari2", "ABC-1111", 4);

		
		
		Boolean isCadastrado = iFerrariDAO.cadastrar(ferrari);
		Boolean isCadastrado2 = iFerrariDAO.cadastrar(ferrari2);
		
		if (isCadastrado) {
			System.out.println("Carro Cadastrado");
		}
		
		else {
			System.out.println("Placa já Cadastrada");
		}

		if (isCadastrado2) {
			System.out.println("Carro Cadastrado");
		}
		
		else {
			System.out.println("Placa já Cadastrada");
		}
		
		Honda honda = new Honda("Honda1", "ABC-1111", 2);
		Honda honda2 = new Honda("Honda2", "ABC-1111", 4);
		
		Boolean isCadastradoHonda = iHondaDAO.cadastrar(honda);
		Boolean isCadastradoHonda2 = iHondaDAO.cadastrar(honda2);
		
		if (isCadastradoHonda) {
			System.out.println("Carro honda Cadastrado");
		}
		
		else {
			System.out.println("Placa honda já Cadastrada");
		}

		if (isCadastradoHonda2) {
			System.out.println("Carro honda Cadastrado");
		}
		
		else {
			System.out.println("Placa honda já Cadastrada");
		}
	}

}
