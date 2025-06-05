//essa classe recebe uma frase e uma palavra, devolvendo quantas vezes a palavra desejada aparece na frase:

import java.util.Scanner;

public class ContadorPalavra {
    public static void main(String[] args){
        int contador = 0;
        String frase;
        String comp;
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite uma frase: ");
            frase = sc.nextLine();
            
            System.out.print("Escolha uma palavra da frase: ");
            comp = sc.nextLine();       
     
            String[] palavras = frase.split(" ");
            
            for(int i = 0; i < palavras.length; i++){
                if(comp.equals(palavras[i]))
                    contador++;
            }
            
            if(contador != 0)
                System.out.println("A Palavra " + comp + " aparece " + contador + " vezes");
            else
                System.out.println("A Palavra não aparece na frase!"); 
            
        } catch (Exception erro) {
            System.out.println("Erro: " + erro.toString());
        } finally {
            sc.close();
        }
    }
}
