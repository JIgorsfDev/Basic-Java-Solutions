//recebe uma frase e imprime ela de forma crescente e decrescente, em um padrão "Onda"

import javax.swing.JOptionPane;

public class FraseOndular {
    public static void main(String[] args){
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        String resultado = "Frase informada: " + frase + "\n\n"; //para imprimir a mensagem acima da parte "em onda", o \n\n serve pra capturar esse padrão

        for (int i = 1; i <= frase.length(); i++) {
            resultado += frase.substring(0, i) + "\n";
        }

        for (int i = frase.length() - 1; i >= 1; i--) {
            resultado += frase.substring(0, i) + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
