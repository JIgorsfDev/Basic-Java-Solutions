//Imprime o produto dos impares entre 1 e 15

public class ProdutoImpares {
   public static void main(String[] args){
       int i, produto = 1;
       
       for(i = 1; i <= 15; i++){
           if(i % 2 == 1)
               produto *= i;
       }
       System.out.println("Resultado: " + produto);
   }
} 
