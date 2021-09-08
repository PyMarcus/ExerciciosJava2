// procedimento que recebe 3 números e devolve o triplo deles
import java.util.Scanner;

   
class Main{
    
     public static void triplo(int numero, int numero2, int numero3){
       
        System.out.println(numero * 3);
        System.out.println(numero2 * 3);
        System.out.println(numero3 * 3);
    }
    
    
    
    public static  void main(String[] args){
            Scanner input = new Scanner(System.in);
            int numero = input.nextInt();
            int numero2 = input.nextInt();
            int numero3 = input.nextInt();
            triplo(numero, numero2, numero3);
            }
    
}