import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static double AreaCirculo(int radio){
        return (double) Math.round(Math.PI*Math.pow(radio,2*100.0))/100.0;
    }

    public static double Temperatura(double tempe){
        return tempe*9/5 + 32;
    }
    public static double VolumenEsfera(double radioEsf){
        return (double) Math.round((Math.PI*Math.pow(radioEsf,3)*4/3)*100.0)/100.0;
    }
    public static double Operaciones(double num1, double num2){
        Scanner xc= new Scanner(System.in);
        System.out.println("Escoja una operación (1 a 4)");
        System.out.println("    1. Suma");
        System.out.println("    2. Resta");
        System.out.println("    3. Multiplicación");
        System.out.println("    4. División");
        System.out.print("Tu opción es: ");
        int respOperacion = xc.nextInt();
        double result = 0;

        if(respOperacion == 1){
            result = num1 + num2;
        }else if (respOperacion == 2){
            result = num1 - num2;
        }else if (respOperacion == 3){
            result = num1*num2;
        }else if (respOperacion == 4){
            result = Math.round(num1/num2*100.0)/100.0;
        }else{
            System.out.println("Se escogio otra opción");
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        boolean respuesta;
        do{
            System.out.println("Escoja una de las siguientes opciones");
            System.out.println("    1. Área de un Circulo");
            System.out.println("    2. Conversión de Temperaturas");
            System.out.println("    3. Volumen de una esfera");
            System.out.println("    4. Operaciones matemáticas");
            System.out.println("    5. Conversión de Moneda");
            System.out.print("Tu opción es: ");
            int opcion =  sc.nextInt();
            double resultado;
            respuesta = true;

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el rádio del círculo: ");
                    int valor = sc.nextInt();
                    resultado = AreaCirculo(valor);
                    System.out.print("El área del circulo es: "+ resultado );
                    break;
                case 2:
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    double temperatura = sc.nextDouble();
                    resultado = Temperatura(temperatura);
                    System.out.print("la temperatura en grados Fahrenheit es: "+resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el radio de la esfera: ");
                    double RadioEsferea = sc.nextDouble();
                    resultado = VolumenEsfera(RadioEsferea);
                    System.out.print("El volumen de la esfera es : "+ resultado);
                    break;
                case 4:
                    System.out.println("Ingrese dos números para la operación");
                    System.out.print("Ingrese el número 1: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingrese el número 2: ");
                    double num2= sc.nextDouble();
                    resultado = Operaciones(num1, num2);
                    System.out.print("El resultado de la operación es: "+ resultado);
                    break;
                case 5:
                    System.out.println("Ingresa el tipo de Moneda que tienes (1 o 2)");
                    System.out.println("    1 --> S./ Soles");
                    System.out.println("    2 --> S./ Dólares");
                    System.out.print("Opción: ");
                    int TipoMoneda = sc.nextInt();
                    System.out.println("Ingresa la cantidad de Dinero que dispone: ");
                    double CantidadDinero = sc.nextDouble();
                    final double TipoCambio= 3.75;
                    resultado = 0;
                    if(TipoMoneda == 1){
                        resultado = CantidadDinero*TipoCambio;
                    }else if(TipoMoneda == 2){
                        resultado  = CantidadDinero/TipoCambio;
                    }else{
                        System.out.println("Marco una opción inválida");
                    }
                    System.out.print("El resultado de la operación es: "+ resultado);
                    break;
                default:
                    System.out.println("Marco una opción inválida");
                    respuesta = false;

            }

        }while ( respuesta == false);

    }
}