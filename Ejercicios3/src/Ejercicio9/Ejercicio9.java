package Ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escriba un número entero: ");
        int num = sc.nextInt();
        int [] array=new int[num];
        for(int i=0; i<num; i++){
            array[i] = (int) (Math.random()*100 + 1);
        }
        for(int valor:array){
            System.out.print(valor+" ");
        }
        System.out.println(" ");
        for(int i=(num-1); i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
}
