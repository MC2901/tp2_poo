public class Apertura {
    public double precioRuedas;
    public int capMax;
    boolean siEstaAbierto;

    Apertura(double precioRuedas, int capMax, boolean siEstaAbierto){
        this.precioRuedas = precioRuedas;
        this.capMax = capMax;
        this.siEstaAbierto = siEstaAbierto;
    }

    public double getPrecioRuedas() {
        return precioRuedas;
    }

    public void setPrecioRuedas(double precioRuedas) {
        this.precioRuedas = precioRuedas;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public boolean isSiEstaAbierto() {
        return siEstaAbierto;
    }

    public void setSiEstaAbierto(boolean siEstaAbierto) {
        this.siEstaAbierto = siEstaAbierto;
    }
}
