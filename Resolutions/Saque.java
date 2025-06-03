//Essa classe simula uma conta bancária com saldo zero, e realiza as operações de deposito e saque 

import java.util.Scanner;

public class Saque {
    public static void main(String[] args){
        double saldo_atual = 0, valor_deposito, valor_saque;
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.print("Informe o valor de deposito: ");
            valor_deposito = s.nextDouble();
            saldo_atual += valor_deposito;
            System.out.println("Saldo após deposito: " + saldo_atual);
            
            System.out.print("Informe o valor do saque: ");
            valor_saque = s.nextDouble();
            saldo_atual -= valor_saque;
            System.out.println("Saldo após o saque: " + saldo_atual);
        }
        catch(NumberFormatException erro){
            System.out.println("Houve um erro na conversão!" + erro.toString());
        }
    }
}
