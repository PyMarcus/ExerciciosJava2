// retornar se o número é um palindromo
import java.util.Scanner;


class Main{
    
        public static boolean istPalindromo(int[] numero){
                   int percorre = 0;
                   int contador = 0;
                   int vetor2[] = new  int[numero.length];
                
                   for(int j = (numero.length - 1); j >= 0; j--){
                        vetor2[percorre] = numero[j];
                        percorre ++;
                   }
                   
                   for(int g = 0; g < numero.length; g++){
                            if(numero[g] == vetor2[g]){
                                contador ++;
                            }                            
                    }                   
            return contador == numero.length;
        }
        
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                int vetor[];
                
                int limite = input.nextInt();
                
                vetor = new int[limite];
                
                for(int i = 0; i < limite; i++){
                        int numeros = input.nextInt();
                        vetor[i] = numeros;
                }input.close();
                System.out.println(istPalindromo(vetor));
        }
}
