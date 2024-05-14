package dao;

import javax.swing.table.DefaultTableModel;

public class ClienteDAO {

    public static boolean pesquisaDeCpf(String cpfConsulta, DefaultTableModel tabela) {
        
        boolean clienteExiste = false;
        
        int numeroDeLinhas = tabela.getRowCount();
        
        if(numeroDeLinhas == 0){
            return clienteExiste;
        }
        
        for(int i = 0; i < numeroDeLinhas; i++ ){
            String cpfTabela = tabela.getValueAt(i, 1).toString();
            
            if(cpfTabela.equals(cpfConsulta)){
                
                clienteExiste = true;
                return clienteExiste;
            
            }
        }
       return clienteExiste;
    }
    
}
