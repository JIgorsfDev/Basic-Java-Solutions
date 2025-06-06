//Recebe a dimensão de um dos lados de uma caixa d'agua e devolve o volume dela

import java.util.Scanner;

public class CaixaDagua {
    public static void main(String[] args){
        double lado, volume;
        Scanner sc = new Scanner (System.in);
        
        try{
            System.out.print("Informe a dimensão do lado: ");
            lado = sc.nextDouble();
            
            volume = Math.pow(lado, 3);
            
            System.out.println("Volume = " + Math.round(volume) + " m³");
            
        }
        catch(Exception erro){
            System.out.println("Erro: " + erro.toString());
        }
        
        sc.close();
    } 
}
