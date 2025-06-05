//essa classe recebe uma frase e a imprime sem vogais

import java.util.Scanner;

public class FraseSemVogais {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine();
            
            for (int i = 0; i < frase.length(); i++) {
                char comp = frase.charAt(i);
                
                if (comp == 'A' || comp == 'E' || comp == 'I' || comp == 'O' || comp == 'U' ||
                    comp == 'a' || comp == 'e' || comp == 'i' || comp == 'o' || comp == 'u') {
                    continue; 
                }
                
                System.out.print(comp);
            }
            System.out.println(" ");
        } catch (Exception erro) {
            System.out.println("Erro." + erro.toString());
        } finally {
            sc.close();
        }
    }
}

