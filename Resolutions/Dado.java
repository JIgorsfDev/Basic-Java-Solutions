//simula a rotação de um dado com 6 faces (de 1 a 6)

import java.util.Random;

public class Dado {
    public static void main(String[] args){
        int valor;
        Random r = new Random();
        
        valor = r.nextInt(6);
        
        if(valor == 0)
        System.out.println("Rolagem: " + (valor + 1));
        
        else
        System.out.println("Rolagem: " + valor);
    }
}
