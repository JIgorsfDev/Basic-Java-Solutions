//a classe a seguir realiza o cálculo de IMC (Índice de massa corporal) com o peso e altura informados pelo úsuario, informando a classificação deste IMC

import javax.swing.JOptionPane;

public class Imc {
    public static void main(String[] args) {
        double peso, altura, imc;
        String s;
        
        s = JOptionPane.showInputDialog("Informe seu peso: ");
        peso = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Informe sua altura: ");
        altura = Double.parseDouble(s);
        
        imc = peso / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "IMC: " + imc);
        
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Peso abaixo do normal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Em Pré-obesidade");
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Em Obesidade de classe I");
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Em Obesidade de classe II (Obesidade Severa)");
        } else {
            JOptionPane.showMessageDialog(null, "Em Obesidade de classe III (Obesidade Mórbida)");
        }
    }
}
