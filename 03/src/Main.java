// ler números e imprimir na ordem crescente
import java.util.Scanner;
import java.util.Arrays;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int vetor[], vetor2[];
        int limite = input.nextInt();
        
        vetor = new int[limite];
        vetor2 = new int[limite];
        
        for(int i = 0; i < limite; i++){
                int numero = input.nextInt();
                
                vetor[i] = numero;
                vetor2[i] = numero;
               }input.close();
          
         Arrays.sort(vetor2);
          
          
          // impressão
          System.out.print("Numeros informados: ");
          for(int i = 0; i < vetor.length; i++){
                   System.out.print(vetor[i] + ", ");
          }
          System.out.println();
                    System.out.println();

          System.out.print("Numeros em ordem crescente: ");
          for(int i = 0; i < vetor.length; i++){
                   System.out.print(vetor2[i] + ", ");
          }
    }
}                
