//essa classe le os valores de largura e comprimento informados pelo usuário e cálcula sua área

import javax.swing.JOptionPane;

public class Lote {
    public static void main(String[] args){
        double largura, comprimento, area;
        String s;
        
        s = JOptionPane.showInputDialog("Informe a largura: ");
        largura = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Informe o comprimento: ");
        comprimento = Double.parseDouble(s);
        
        area = largura * comprimento;
        
        JOptionPane.showMessageDialog(null, "A Area é de: " + area + " m");
    }
}
