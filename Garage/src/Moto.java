public class Moto extends Vehiculo{
    public int cilindrada;

    public Moto(String marca, double km, int ruedasACambiar, int cilindrada) {
        super(marca, km, ruedasACambiar);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
