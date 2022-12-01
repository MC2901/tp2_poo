public class Auto extends Vehiculo{
    public int numeroDePuertas;


    public Auto(int numeroDePuertas, String marca, double km, int ruedasACambiar){
        super(marca, km, ruedasACambiar);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

}
