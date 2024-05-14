
package utils;

import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dao.ClienteDAO;
import models.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Validador {
    //arraylist que vai conter todas as mensagens de erro
    public ArrayList<String> mensagensErro = new ArrayList<>();
    
    
    public void validarNumero(JTextField txt){
    //tentativa de conversão para numero, caso não ocorra, um erro é gerado e registramos o erro para avisar ao úsuario
    //digitar apenas numeros
        try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            int valorConvertido = Integer.parseInt(txt.getText());
            txt.setBackground(Color.WHITE);
            
        }catch(NumberFormatException e){
        
            this.mensagensErro.add("Digite Apenas numeros no campo: Número");
            txt.setBackground(Color.red);
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Não são permitidos valores nulos no campo: Número");
            txt.setBackground(Color.red);
        }
    
    }
    
    public void validarCPF(JFormattedTextField cpf, DefaultTableModel tabela){
        //validação de cpf, primeiro checamos se o cpf é nulo, caso não seja, verificamos se há algum cliente cadastrado com o cpf informado
        cpf.setBackground(Color.WHITE);
        if("   .   .   -  ".equals(cpf.getText())){
             this.mensagensErro.add("Digite um CPF");
             cpf.setBackground(Color.red);
        }
        else{
            String cpfConsulta = cpf.getText();
            boolean clienteExiste = ClienteDAO.pesquisaDeCpf(cpfConsulta, tabela);
            
            if(clienteExiste){
                this.mensagensErro.add("Erro: CPF já cadastrado");
                cpf.setBackground(Color.red);
            }
        }
        
        
    }
    
    public void validarTelefone(JFormattedTextField tel){
        //verificar se o telefone é nulo
        tel.setBackground(Color.WHITE);
        if("(  )     -    ".equals(tel.getText())){
             this.mensagensErro.add("Digite um telefone");
             tel.setBackground(Color.red);
        }
    }
     
    public void validarTexto(JTextField txt){
        //validar as entradas de texto para garantir que não seja nulo
         try{
            
            //Verifico se o campo está vazio
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            txt.setBackground(Color.white);
            
        }catch(IllegalArgumentException e){
            this.mensagensErro.add("Há campos não preenchidos");
            txt.setBackground(Color.red);
        }
     
     }
     
     public void limparMensagens(){
         //limpar arraylisy com as mensagens de erro
         this.mensagensErro.clear();
     }
     
     public String getMensagensErro(){
         
        String errosFormulario = "";
        
        //Percorro o arrayList e concateno na variável errosFormulario
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            this.limparMensagens();
        }     
        
        return errosFormulario;
        
     }
     
     public boolean hasErro(){
     
         if(this.mensagensErro.size()>0){
            return true;    
         }else{
             return false;
         }
     }

    
    
}


