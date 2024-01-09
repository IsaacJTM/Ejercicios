package Ejercicio1;

public class Sueldo {
    public int horasTrabajadas;
    final int pago = 40;



    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if(horasTrabajadas>0){
            this.horasTrabajadas = horasTrabajadas;
        }else {
            System.out.println("Horas menor a cero");
        }
    }
    public int sueldoTotal(int horasTrabajadas){
        int sueldo = 0;
        if(horasTrabajadas<40){
            sueldo = horasTrabajadas*pago;
        }else if(horasTrabajadas<49){
            sueldo = pago*(40+(horasTrabajadas-40)*2);
        }else{
            sueldo = pago*(40+(8*2)+((horasTrabajadas-48)*3));
        }

        return sueldo;
    }


}
