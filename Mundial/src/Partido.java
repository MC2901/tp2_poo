import java.util.Date;

public class Partido extends EtapaMundial {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    Partido(){
    }

   public Partido(Date fecha, Equipo local, Equipo visitante, Resultado resultado){
        this.setFecha(fecha);
        this.setLocal(local);
        this.setVisitante(visitante);
        this.setResultado(resultado);
    }

    public Partido(Equipo local, Equipo visitante, Date fecha){
        this.setVisitante(visitante);
        this.setLocal(local);
        this.setFecha(fecha);
        resultado = new Resultado();
        this.setResultado(resultado);
    }
        public void hacerGol (int golesLocales, int golesVisitantes){
        getResultado().setGolesVisitante(golesVisitantes);
        getResultado().setGolesLocal(golesLocales);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}
