package Ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        System.out.println("-------------");
        for(int i=1; i<=n; i++){
            for(int ii=0; ii<i;ii++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
