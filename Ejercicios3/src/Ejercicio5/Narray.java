package Ejercicio5;
import java.util.ArrayList;

import java.util.Scanner;

public class Narray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("inserte un número ");
            int num = sc.nextInt();
            int[] Arreglo = new int[num];
            for(int i=0; i<num;i++){
                Arreglo[i] = (int) (Math.random()*100 +1);
            }
            for(int i=0; i<num;i++){
                System.out.println("El elemento "+i+" es: "+Arreglo[i]);
            }

        }catch (Exception e){
            System.out.println("Ingrese un dato valido");
        }
    }
}
