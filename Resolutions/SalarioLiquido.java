//imprime o salário bruto, desconto do INSS e do IR e o salário liquído;

import javax.swing.JOptionPane;

public class SalarioLiquido {
    public static void main(String[] args){
        double salario_hora, salario_bruto, salario_liquido, INSS, IR;
        int horas_trabalhadas, dependentes;
        
        String s = JOptionPane.showInputDialog("Informe o nº de horas trabalhadas: ");
        horas_trabalhadas = Integer.parseInt(s);
        
        s = JOptionPane.showInputDialog("Informe o seu salário hora: ");
        salario_hora = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Informe o nº de dependentes: ");
        dependentes = Integer.parseInt(s);
        
        salario_bruto = horas_trabalhadas * salario_hora + (50 * dependentes);
        
        if(salario_bruto <= 1000)
            INSS = salario_bruto * 0.085;
            
        else
            INSS = salario_bruto * 0.09;
        
        if(salario_bruto <= 500)
            IR = 0;
        
        else if(salario_bruto > 500 && salario_bruto <= 1000)
        IR = salario_bruto * 0.05;
        
        else
        IR = salario_bruto * 0.07;
        
        salario_liquido = salario_bruto - INSS - IR;
        
        JOptionPane.showMessageDialog(null, "Salario Bruto: " + salario_bruto + " R$");
        JOptionPane.showMessageDialog(null, "INSS: " + INSS + " R$");
        JOptionPane.showMessageDialog(null, "IR: " + IR + " R$");
        JOptionPane.showMessageDialog(null, "Salario Líquido: " + salario_liquido + " R$");
    }
}
