
import java.util.Scanner;



class Main {
    public static String retornaprimo(int num){
    int contador = 0;
    for(int i = 1; i <= num; i++){
        
        if(num % i == 0) {
            contador ++;

    }if(contador > 2) {
                return "nao e primo";
    }
    }

    return "e primo";
}

    public static void main(String[] args){

        try (Scanner entrada = new Scanner(System.in)) {
            int numero = entrada.nextInt();



            System.out.println(retornaprimo(numero));
        }
    }
}