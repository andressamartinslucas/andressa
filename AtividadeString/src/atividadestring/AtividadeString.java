package atividadestring;

import javax.swing.JOptionPane;

public class AtividadeString {

    public static void main(String[] args) {
        String x, escalacao = " Júlio César, D.Alves, D.Luiz, T.Silva, Maxwell, L.Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk ";
        int n_caracteres;
        
        n_caracteres = escalacao.length();
        System.out.println("Número de Caracteres:" + n_caracteres);
        
        escalacao = escalacao.replace ("Fred", "Jô");
        if(escalacao.contains("Ronaldinho")){
            System.out.println("SIM");
        } else{
            System.out.println("Não"); 
        }
        x = escalacao.trim ();
        
        System.out.println(x);
        
        String lista [] = escalacao.split (",");
        
        JOptionPane.showMessageDialog(null,  
         "\n1. " + lista [0] 
        +"\n2. " + lista [1]
        +"\n3. " + lista [2]
        +"\n4. " + lista [3]
        +"\n5. " + lista [4]
        +"\n6. " + lista [5]
        +"\n7. " + lista [6]
        +"\n8. " + lista [7]
        +"\n9. " + lista [8]
        +"\n10. " + lista [9]
        +"\n11. " + lista [10]);
        
        
        
    }
   
}