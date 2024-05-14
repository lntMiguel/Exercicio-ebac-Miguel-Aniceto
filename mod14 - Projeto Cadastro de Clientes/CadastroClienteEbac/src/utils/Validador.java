
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
    
    public ArrayList<String> mensagensErro = new ArrayList<>();
    
    
    public void validarNumero(JTextField txt){
    
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
        
        tel.setBackground(Color.WHITE);
        if("(  )     -    ".equals(tel.getText())){
             this.mensagensErro.add("Digite um telefone");
             tel.setBackground(Color.red);
        }
    }
     
    public void validarTexto(JTextField txt){
     
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
     
         this.mensagensErro.clear();
     }
     
     /**@deprecated substituida por {@link #getMensagensErro()}
      * Método para exibir mensagens de erro na tela com JOptionPane
      */
     public void ExibirMensagensErro(){
         
        String errosFormulario = "";
        for (String msg : this.mensagensErro) {
            errosFormulario += msg + "\n";
        }
        
        if(!errosFormulario.equals("")){
            JOptionPane.showMessageDialog(null, errosFormulario);
            this.limparMensagens();
        }     

     }
     
     /**
      * Resgata todos os erros gerados em uma única String
      * @return 
      */
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


