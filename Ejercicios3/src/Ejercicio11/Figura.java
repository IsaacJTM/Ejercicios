package Ejercicio11;

public class Figura {
    private String color;
    private boolean colorRelleno;

    public Figura(String color, boolean colorRelleno){
        this.color = color;
        this.colorRelleno = colorRelleno;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public boolean getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(boolean colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public void Area(){};
    public void Perimetro(){}

    public void  Color() {
        System.out.println("Su color: "+color+"\nTiene relleno: "+ colorRelleno);
    }

}
