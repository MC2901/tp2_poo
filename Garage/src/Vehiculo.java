public class Vehiculo{
    public String marca;
    public double km;
    public int ruedasACambiar;


 public Vehiculo(String marca, double km, int ruedasACambiar){
     this.marca = marca;
    this.km = km;
    this.ruedasACambiar = ruedasACambiar;
}


    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getRuedasACambiar() {
        return ruedasACambiar;
    }

    public void setRuedasACambiar(int ruedasACambiar) {
        this.ruedasACambiar = ruedasACambiar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
