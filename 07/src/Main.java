// ler matriz 3x2 e a funcao vai somar os elementos da linha e devolver a soma

import java.util.Scanner;


class Main{
    public static float somaLinha(float matriz[][], int linha){
            float soma = 0;
            
            for(int l = 0; l < 3; l++){
                for(int c = 0; c < 2; c++){
                        if(l == linha){
                            soma += matriz[l][c];
                        }
                }
            }
    return soma;
    }
    
    public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             float matriz[][] = new float[3][2];
             for(int l = 0; l < 3; l++){
                 for(int c = 0; c < 2; c++){
                        float numero = input.nextFloat();
                        matriz[l][c] = numero;
                 }
             }
            int linha  = input.nextInt();

             float soma = somaLinha(matriz, linha);
             // impressão:
             System.out.println("Matriz:");
             for(int l = 0; l < 3; l++){
                 for(int c = 0; c < 2; c++){
                        System.out.print(matriz[l][c] + " ");
                 }System.out.println();
             }
             System.out.printf("\nSoma dos elementos da linha %d:",linha);
             System.out.print("\n"+soma);
    }
}