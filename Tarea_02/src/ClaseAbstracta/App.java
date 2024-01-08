package ClaseAbstracta;

public class App {
    public static void main(String[] args) {

        Circulo c1=new Circulo("Azul",3);
        c1.area();
        c1.perimetro();
        c1.imprimir();

        System.out.println("-------------------");
        Cuadrado cuadrado1 = new Cuadrado("Morado",4);
        cuadrado1.area();
        cuadrado1.perimetro();
        cuadrado1.imprimir();
    }
}
