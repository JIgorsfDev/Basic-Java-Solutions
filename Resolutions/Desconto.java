//Recebe um valor e o código de um produto, com isso, é aplicado um desconto baseado no código informado
//observação, o nome "Salário" se mostra diferente ao propósito do código, tal confusão ocorreu por um erro de interpretação meu.

import javax.swing.JOptionPane;

public class Desconto {
    public static void main(String[] args){
        float salario;
        int codigo;
        String s;
        
        s = JOptionPane.showInputDialog("Informe o preço: ");
        salario = Float.parseFloat(s);
        
        s = JOptionPane.showInputDialog("Informe o seu código: ");
        codigo = Integer.parseInt(s);
        
        switch(codigo){
            case 1 : JOptionPane.showMessageDialog(null, "Novo valor: R$ " + (salario - salario * 0.05)); break;
            case 2 : JOptionPane.showMessageDialog(null, "Novo valor: R$ " + (salario - salario * 0.10)); break;
            case 3 : JOptionPane.showMessageDialog(null,"Novo valor: R$ " + (salario - salario * 0.20)); break;
            case 4 : JOptionPane.showMessageDialog(null, "Novo valor: R$ " + (salario - salario * 0.50)); break;
            default: JOptionPane.showMessageDialog(null, "Código inválido!"); break;
        }
    }
}
