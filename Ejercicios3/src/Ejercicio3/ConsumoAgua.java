package Ejercicio3;
import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {
        //Consumo de agua potable
        Scanner sc=new Scanner(System.in);
        final int costoFijo = 10;
        int consumoAgua;
        float pago;
        while(true){
        try{
            System.out.println("Ingrese su consumo de agua de este mes: ");
            consumoAgua = sc.nextInt();
            if(consumoAgua<50){
                pago = costoFijo;
            }else if(consumoAgua<201){
                pago = (float) 0.5*(consumoAgua-50) + costoFijo;
            }else{
                pago = (float) 1.5*(consumoAgua-200) + (float) 0.5*(consumoAgua-50)+costoFijo;
            }
            System.out.print("El pago es: $"+pago);
            System.out.println("--------------");

            }catch (Exception e){
                System.out.println("Lo ingresa no esta permitido");
                break;
            }
        }

    }

}
