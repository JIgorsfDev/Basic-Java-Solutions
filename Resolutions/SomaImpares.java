//o intuito dessa classe é simples: imprime a soma de todos os números impares, do 1 até o 499

public class SomaImpares {
    public static void main(String[] args){
        int i, soma = 0;
        
        for(i = 1; i < 500; i++){
            if(i % 2 != 0)
                soma += i;
        }
        System.out.println("Soma = " + soma);
    }
}
