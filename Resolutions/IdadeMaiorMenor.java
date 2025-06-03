//a classe a seguir recebe 4 idades, informadas pelo usuário, e diz qual delas é a maior e a menor

import javax.swing.JOptionPane;

public class Idade {
   public static void main(String[] args){
       int i1, i2, i3, i4, maior, menor;
       String s;
       
       s = JOptionPane.showInputDialog("Informe uma idade: ");
       i1 = Integer.parseInt(s);
       
       s = JOptionPane.showInputDialog("Informe outra idade: ");
       i2 = Integer.parseInt(s);
          
       s = JOptionPane.showInputDialog("Informe outra idade: ");
       i3 = Integer.parseInt(s);
          
       s = JOptionPane.showInputDialog("Informe outra idade: ");
       i4 = Integer.parseInt(s);
       
       if(i1 > i2 && i1 != i2){
           maior = i1;
           menor = i2;
       }else if(i1 < i2 && i1 != i2){
           maior = i2;
           menor = i1;
       }
       else{
           maior = i1;
           menor = i2;
       }
       if(i3 < menor){
           menor = i3;
       }else if(i3 > maior){
           maior = i3;
       }
       if(i4 < menor){
           menor = i4;
       }else if(i4 > maior){
           maior = i4;
       }
       
       JOptionPane.showMessageDialog(null, "Idades fornecidas: \n" + i1 + ", " + i2 + ", " + i3 + ", " + i4 + "\n A maior idade é: " + maior + "\n A menor idade é: " + menor);
   }
}
