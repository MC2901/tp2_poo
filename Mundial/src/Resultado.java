public class Resultado {
    private int golesLocal;
    private int golesVisitante;

    public boolean siGanoLocal(){return golesLocal>golesVisitante;}

    public boolean siEsEmpate(){
        return golesLocal == golesVisitante;
}
    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

}
