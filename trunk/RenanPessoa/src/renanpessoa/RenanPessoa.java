/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package renanpessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class RenanPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa = new Pessoa(); 
        
        //tRATAR ERROS INESPERADOS 
        
        while(pessoa.getCodigo() == null)
        {
        try
        {
            //aqui estou executando 
            pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:")));
        }
        catch(Exception ex)
        {
            
            JOptionPane.showMessageDialog(null, "É NUMERO O CODIGO");
        }
        }
        
        pessoa.setNome(JOptionPane.showInputDialog("Digite o nome:")); 
        pessoa.setSexo(JOptionPane.showInputDialog("Digite o sexo:"));
        
        JOptionPane.showMessageDialog(null, pessoa.getCodigo() + "\n" + 
                                            pessoa.getNome() + "\n" + 
                                            pessoa.getSexo());
    }
    
}
