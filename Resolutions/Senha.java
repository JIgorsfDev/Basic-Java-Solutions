//essa classe compara 2 Strings, uma sendo a senha fixa "admin" e outra sendo uma inserida pelo usuário, este, tem 3 chances de acertar a senha

import javax.swing.JOptionPane;

public class Senha {
    public static void main(String [] args){
        String senha = "admin";
        String s;
        int contador = 0;
        
        while(contador != 3){
        s = JOptionPane.showInputDialog("Informe a senha: ");
        
        if(senha.equals(s)){
            JOptionPane.showMessageDialog(null, "Senha Correta! Liberando Acesso...");
            System.exit(0);   
         }
        
        else{
            if(contador < 2){
            JOptionPane.showMessageDialog(null, "Senha Incorreta! Você possui mais " + (2 - contador) + " chances!");
            }else if(contador == 2)
            JOptionPane.showMessageDialog(null, "Senha Incorreta! Você NÃO possui mais chances!");  
            }
            contador++;
        }
        
        if(contador == 3){
            JOptionPane.showMessageDialog(null, "LIMITE DE TENTATIVAS ATINGIDO! ACESSO BLOQUEADO!");
            System.exit(0);
        }
        }
    }

