package dao;

import javax.swing.table.DefaultTableModel;

public class ClienteDAO {

    //metodo de pesquisa utilizado para garantir que não tenham dois clientes com o mesmo cpf
    public static boolean pesquisaDeCpf(String cpfConsulta, DefaultTableModel tabela) {
        
        boolean clienteExiste = false;
        
        int numeroDeLinhas = tabela.getRowCount();
        
        //caso o número de linhas seja igual a 0, o programa ja retorna a inexistencia do cliente
        if(numeroDeLinhas == 0){
            return clienteExiste;
        }
        
        //for que verifica se existe um cliente com este cpf
        for(int i = 0; i < numeroDeLinhas; i++ ){
            //resgatando o cpf da tabela de clientes
            String cpfTabela = tabela.getValueAt(i, 1).toString();
            
            //caso o cpf da tabela seja igual ao cpf inserido o cliente existe e é retornado true
            if(cpfTabela.equals(cpfConsulta)){
                
                clienteExiste = true;
                return clienteExiste;
            
            }
        }
       return clienteExiste;
    }
    
}
