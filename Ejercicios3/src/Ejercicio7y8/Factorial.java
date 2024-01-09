package Ejercicio7y8;

import java.util.Scanner;

public class Factorial {
      static int operacion = 1;
      static void resolverFactorial(int num){
        for(int i=1; i<=num;i++){
            operacion = operacion*i;
        }
          System.out.println("Resolución " + operacion);
      }

      static void valorMasGrande(int[] array, int num){
          int mayor = array[0];;
          for(int i=1; i<num;i++){
              if(mayor<array[i]){
                  mayor = array[i];
              }
          }
          System.out.println("el número mayor es: "+mayor);
      }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Ingrese un número : ");
         int num = sc.nextInt();

//       resolverFactorial(num);
        System.out.println("Escriba los valores del array");
         int[] array = new int[num];
            for(int i=0; i<num;i++){
                int numeros = sc.nextInt();
                array[i] = numeros;
            }
         valorMasGrande(array, num);
    }
}
