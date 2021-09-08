import java.util.Scanner;

// os vetores em java suportam apenas variaveis do mesmo tipo
// os vetores vão de 0 a [tamanho - 1]


//1 declaracao: float vetor [];
//2 reserva de espaco na memória com o tamanho: vetor = new float[5];
//armazenamento = vetor[0]= 1;

// receber 5 valores em um vetor, e se seu index for impar, aumentar em 5%, do contrário, aumentar em 2%.

class Main{
    public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
            int vetor[];  // declaração
            int vetor2[];
            
            
            vetor = new int[5]; // alocação de memória
            vetor2 = new int[5];
            
            for(int i = 0; i < 5; i++){
                int numero = input.nextInt(); 
                
                vetor2[i] = numero;
                 if(i%2==0){
                        vetor[i] = ((numero * 2) / 100) + numero;
                }else{
                        vetor[i] += ((numero * 5)/ 100) + numero;
                    }
                }input.close();
            
            // impressão
             System.out.print("Vetor inicial: ");
            for(int i = 0; i < vetor.length; i++){
                System.out.print(vetor2[i] + " ");
            }
        
            System.out.print("\n\nVetor resultante: ");
            for(int i = 0; i < vetor.length; i++){
                System.out.print(vetor[i] + " ");
            }
           
    
}
}