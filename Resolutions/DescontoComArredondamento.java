//Recebe um valor e um percentual de desconto, devolvendo o novo valor (após o desconto) com arredondamento.

import javax.swing.JOptionPane;
public class DescontoComArredondamento {
    public static void main(String[] args){
        double preco;
        double percentual;
        
        String s = JOptionPane.showInputDialog("Informe o preço do produto: ");
        preco = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Informe o percentual de desconto (ex: 10 para 10%): ");
        percentual = Double.parseDouble(s);
        
        preco -= (preco * (percentual/100));
        
        JOptionPane.showMessageDialog(null, "Novo preço: R$ " + Math.round(preco));
    }
}
