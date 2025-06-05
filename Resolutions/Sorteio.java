//O usuário tem de adivinhar o valor sorteado aleatoriamente pelo sistema

import javax.swing.JOptionPane;

public class Sorteio {
    public static void main(String[] args){
        int valor = -1;
        String s;
        int aleatorio = (int)(Math.random() * 10);
        
        do{
            s = JOptionPane.showInputDialog("ADIVINHE O VALOR! ESTÁ ENTRE 0 E 9: ");
            
            if(s == null){
                JOptionPane.showMessageDialog(null, "Jogo cancelado.");
                return;
            }
            
            try{
                
            valor = Integer.parseInt(s);
                
            if(valor == aleatorio)
                JOptionPane.showMessageDialog(null, "ACERTOU! O VALOR ERA :  " + aleatorio + " !");
            
            else
                JOptionPane.showMessageDialog(null, "ERROU! Tente novamente!");
            }
            
            catch(NumberFormatException error){
                JOptionPane.showMessageDialog(null, "Valor inválido." + error.toString());
            }
            
        }while(valor != aleatorio);
    }
}
