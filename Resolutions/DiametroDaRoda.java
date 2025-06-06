//essa classe recebe o diametro de uma roda e o numero de giros feitos por essa roda, assim, calculando a distância aproximada percorrida por ela

import javax.swing.JOptionPane;

public class DiametroDaRoda {
    public static void main(String[] args){
        int num_voltas;
        double diam_roda, pi = 3.1416, c;
        String s;
        
        try {
            s = JOptionPane.showInputDialog("Informe o número de voltas que a roda deu: ");
            num_voltas = Integer.parseInt(s);

            s = JOptionPane.showInputDialog("Informe o diametro da roda em metros: ");
            diam_roda = Double.parseDouble(s);

            c = pi * diam_roda / 2;

            JOptionPane.showMessageDialog(null, "Número de voltas: " + num_voltas + "\nComprimento da roda: " + c + " metros\nDistância percorrida: " + Math.round(num_voltas * c) + " metros");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.toString());
        }
    }
}
