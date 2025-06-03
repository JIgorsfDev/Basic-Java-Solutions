//essa classe le 2 valores, informados pelo usuário, e immprime as quatro operações básicas envolvendo eles

import javax.swing.JOptionPane;

public class OperacoesMatematicas {
    public static void main(String[] args){
        int v1, v2, soma, subt, mult, div;
        String s;
        
        s = JOptionPane.showInputDialog("Informe o valor 1: ");
        v1 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Informe o valor2: ");
        v2 = Integer.parseInt(s);
        
        soma = v1 + v2;
        subt = v1 - v2;
        mult = v1 * v2;
        div = v1 / v2;
        
        JOptionPane.showMessageDialog(null, "Soma: " + soma + "\n Substração: " + subt + "\n Multiplicação: " + mult + "\n Divisão: " + div);
    }
}
