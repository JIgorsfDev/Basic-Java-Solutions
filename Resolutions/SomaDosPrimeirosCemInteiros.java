//imprime o somatorio dos 100 primeiros inteiros

public class SomaDosCemPrimeirosInteiros {
    public static void main(String[] args){
        int i, soma = 0;
        
        for(i = 1; i <= 100; i++)
            soma += i;
        
        System.out.println("Soma: " + soma);
    }
}
