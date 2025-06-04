//essa classe recebe o preço de um protudo e, a partir do código dele, executa um aumento específico

import javax.swing.JOptionPane;

public class Aumento {
    public static void main(String[] agrs){
        double preco;
        int codigo;
        
        String s = JOptionPane.showInputDialog("Informe o preço do protudo: ");
        preco = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Informe o código do produto: ");
        codigo = Integer.parseInt(s);
        
        switch(codigo){
            case 1 : preco += (preco * 0.15); break;
            case 3 : preco += (preco * 0.20); break;
            case 4 : preco += (preco * 0.35); break;
            case 8 : preco += (preco * 0.40); break;
            default: JOptionPane.showMessageDialog(null, "Código inválido!"); System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "Novo valor: " + preco + " R$");
    }
}
