//usando bufferedReader, essa classe cálcula a área de um triângulo

import java.io.*;

public class Triangulo {
 public static void main(String [] agrs){
      double base, altura, area;
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      
      try{
      System.out.print("Informe o valor da base: ");
      base = Double.parseDouble(r.readLine());
      
      System.out.print("Informe a altura: ");
      altura = Double.parseDouble(r.readLine());
      
      area = (base * altura) / 2;
      
      System.out.println("A área do triângulo é: "  + area);
      }
      catch(IOException erro){
          System.out.println("Houve um erro na leitura dos dados!" + erro.toString());
      }
      catch(NumberFormatException erro){
          System.out.println("Houve um erro na conversão dos dados!" + erro.toString());
      }
 }    
}

