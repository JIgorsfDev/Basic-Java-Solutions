//Essa classe, usando JOptionPane, le 4 valores, apos isso, imprime o somatorio destes, a media deste somatorio, e o resto desse somatorio por cada um dos valores digitados
import javax.swing.JOptionPane;

public class Somatorio {
    public static void main(String[] args){
        int v1, v2, v3, v4, media = 0, somatorio = 0;
        String s;
        
        s = JOptionPane.showInputDialog("Informe um valor: ");
        v1 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Informe outro valor: ");
        v2 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Informe outro valor: ");
        v3 = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Informe outro valor: ");
        v4 = Integer.parseInt(s);
        
        media = (v1 + v2 + v3 + v4) / 4;
        somatorio = v1 + v2 + v3 + v4;
        
        JOptionPane.showMessageDialog(null, "Media: " + media + "\n Somatorio: " + somatorio + "\n Somatorio % " + v1 + ": " + (somatorio % v1) + "\n Somatorio % " + v2 + ": " + (somatorio % 2) + "\n Somatorio % " + v3 + ": " + (somatorio % v3) + "\n Somatorio % " + v4  + ": " + (somatorio % 4));
    }
}
