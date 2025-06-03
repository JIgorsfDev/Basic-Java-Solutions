//essa classe le as dimensões, informadas pelo usuário, de uma piscina e imprime tanto o volume quanto o preço definido pela questão (45 R$ por m3)

import java.io.*;

public class Piscina {
    public static void main(String [] args){
        double comprimento, largura, profundidade, volume = 0,preco_total = 0;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        try{
        System.out.print("Informe o comprimento: ");
        comprimento = Double.parseDouble(b.readLine());
        
        System.out.print("Informe a largura: ");
        largura = Double.parseDouble(b.readLine());
        
        System.out.print("Informe a profundidade: ");
        profundidade = Double.parseDouble(b.readLine());
        
        volume = comprimento * largura * profundidade;
        preco_total = volume * 45;
        
        System.out.println("Volume: " + volume);
        System.out.println("Valor a ser pago: " + preco_total + " m^3");
        }
        catch(IOException erro){
            System.out.println("Houve erro na entrada de dados!" + erro.toString());
        }
        catch(NumberFormatException erro){
            System.out.println("Houve erro na conversão de dados!" + erro.toString());
        }
    }
}
