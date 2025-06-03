//essa classe recebe 3 valores e 3 quantidades, após isso, o valor "Vn" é multiplicado pela sua quantidade Respectiva "Qm"

import java.io.*;

public class Formula {
    public static void main(String[] args){
        int v1, q1, v2, q2, v3, q3, res;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Informe o primeiro valor: ");
            v1 = Integer.parseInt(r.readLine());
            
            System.out.print("Informe a quantidade: ");
            q1 = Integer.parseInt(r.readLine());
            
            System.out.print("Informe o segundo valor: ");
            v2 = Integer.parseInt(r.readLine());
            
            System.out.print("Informe a quantidade: ");
            q2 = Integer.parseInt(r.readLine());
            
            System.out.print("Informe o terceiro valor: ");
            v3 = Integer.parseInt(r.readLine());
            
            System.out.print("Informe a quantidade: ");
            q3 = Integer.parseInt(r.readLine());
            
            res = (v1 * q1) + (v2 * q2) + (v3 * q3);
            System.out.println("Resultado: " + res);
        }
        catch(IOException erro){
            System.out.println("Houve erro na leitura dos dados!" + erro.toString());
        }
        catch(NumberFormatException erro){
            System.out.println("Houve erro na conversão!" + erro.toString());
        }
    }
}
