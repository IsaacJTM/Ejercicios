package Ejercicio11;

public class Principal {
    public static void main(String[] args) {
        Figura circulo = new Circulo("Blue",false,3);
        Figura rectangulo = new Rectangulo("Red",true,(float)4,(float)5);
        Figura triangulo = new Triangulo("Green",false,3,4,5 );

        circulo.Area();
        circulo.Perimetro();
        circulo.Color();
        System.out.println("------------------------------");
        rectangulo.Area();
        rectangulo.Perimetro();
        rectangulo.Color();
        System.out.println("------------------------------");
        triangulo.Area();
        triangulo.Perimetro();
        triangulo.Color();

    }
}
