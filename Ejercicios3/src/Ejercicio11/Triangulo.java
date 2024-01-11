package Ejercicio11;

public class Triangulo extends Figura{
    private float lado_a;
    private float lado_b;
    private float lado_c;

    public Triangulo(String color, boolean colorRelleno, float lado_a, float lado_b, float lado_c) {
        super(color, colorRelleno);
        this.lado_a = lado_a;
        this.lado_b = lado_b;
        this.lado_c = lado_c;
    }

    public float getLado_a() {
        return lado_a;
    }

    public void setLado_a(float lado_a) {
        this.lado_a = lado_a;
    }

    public float getLado_b() {
        return lado_b;
    }

    public void setLado_b(float lado_b) {
        this.lado_b = lado_b;
    }

    public float getLado_c() {
        return lado_c;
    }

    public void setLado_c(float lado_c) {
        this.lado_c = lado_c;
    }

    @Override
    public void Area() {
        System.out.println((lado_a+lado_b+lado_c)/2);
    }

    @Override
    public void Perimetro() {
        System.out.println(lado_a+lado_b+lado_c);
    }


}
