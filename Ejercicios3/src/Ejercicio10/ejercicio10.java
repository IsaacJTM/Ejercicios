package Ejercicio10;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int numAleatorio = (int) (Math.random()*100 + 1);
        int contador = 0;
        System.out.println(numAleatorio+"\n");
        while(true){
            System.out.print("Ingrese su número: ");
            int num = sc.nextInt();
            contador++;
            if(num<numAleatorio){
                System.out.println("\"Número demasiado bajo, intenta nuevamente\"");
                /*contador++;*/
            }else if(num>numAleatorio){
                System.out.println("\"Número demasiado alto, intenta nuevamente\"");
               /* contador++  */ ;
            }else if(num == numAleatorio){
                /*contador++;*/
                System.out.print("==> ¡Felicitaciones! ¡Haz adivinado el número!  " );
                System.out.println("Número de intentos: "+ contador);
                break;
            }
        }
    }
}
