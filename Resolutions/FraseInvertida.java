//recebe uma frase e a imprime ao contrário

import java.util.Scanner;

public class FraseInvertida {
    public static void main(String[] args){
        String frase;
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite uma frase: ");
            frase = sc.nextLine();
            
            int quantidade = frase.length();
            
            for(int i = quantidade - 1; i >= 0; i--){
                System.out.print(frase.charAt(i));
            }
        } catch(Exception erro){
            System.out.println("Erro: " + erro.toString());
        } finally {
            System.out.println("\n");
            sc.close();
        }
    }
}
