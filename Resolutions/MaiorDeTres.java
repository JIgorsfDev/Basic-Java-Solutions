//essa classe recebe 3 valores informados pelo usuário e devolve o maior entre eles

import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args){
        int v1, v2, v3, maior = 0;
        
        Scanner sc = new Scanner(System.in);
        
        try{
        System.out.println("Informe um valor: ");
        v1 = sc.nextInt();
        System.out.println("Informe outro valor: ");
        v2 = sc.nextInt();
        System.out.println("Informe mais um valor: ");
        v3 = sc.nextInt();
        
        if(v1 >= v2){
            maior = v1;
        
         }else if(v1 < v2){
            maior = v2;
         }
        
        if(maior <= v3)
            maior = v3;
        
        System.out.println("O maior é: " + maior);
        }
        
        catch(NumberFormatException erro){
            System.out.println("Erro na conversão de dados!" + erro.toString());
        }
    }
}
