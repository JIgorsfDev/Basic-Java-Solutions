//calculadora em que você escolhe a operação por um caractere

import javax.swing.JOptionPane;

public class CalculadoraPorOpcao {
    public static void main(String[] args){
        
        String s = JOptionPane.showInputDialog("A - Soma \nB - Subtração \nC - Multiplicação \nD- Divisão \nInforme uma opção: ");
        char opcao;
        opcao = s.charAt(0); //pega o caractere informado
        
        opcao = Character.toUpperCase(opcao); //transforma em maiúsculo
        
        s = JOptionPane.showInputDialog("Informe um valor: ");
        int v1 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Informe outro valor: ");
        int v2 = Integer.parseInt(s);
        
        int resultado = 0;
        
        switch(opcao){
            case 'A' : resultado = v1 + v2; break;
            case 'B' : resultado = v1 -  v2; break;
            case 'C' : resultado = v1 * v2; break;
            case 'D' : if(v2 == 0){ JOptionPane.showMessageDialog(null, "Divisão impossível!"); System.exit(0);}
                       else resultado = v1 / v2;
                           break;
            default : JOptionPane.showMessageDialog(null, "Opção inválida!"); System.exit(0); break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}

