// funcao que recebe um numero inteiro e retorna se é primo ou nao
import java.util.Scanner;


class Main{
    
 public static String primo(int numero){
        int contador = 0;
        
        for(int i = 1; i <= numero; i++){
            if(numero % i == 0){
                    contador += 1;
            }
        }
        if(contador > 2){
            return "nao e primo";
        }return "primo";
}   
    
    
    
    public static void main(String[] args){
            Scanner  input = new Scanner(System.in);
            
            int numero = input.nextInt();
            System.out.println(primo(numero));
    }
}
