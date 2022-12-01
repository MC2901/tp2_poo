import java.lang.reflect.Array;
import java.util.ArrayList;

public class EtapaMundial {
   private String descripcionEtapa;
   private ArrayList<Partido> listaDePartidos;
   private ArrayList<Equipo>equiposQuePasan;

    public EtapaMundial(){
        this.listaDePartidos = new ArrayList<Partido>();
        this.equiposQuePasan = new ArrayList<Equipo>();
    }

    public ArrayList<Partido> agregarPartido (Partido listaDePartidos){
        this.listaDePartidos.add(listaDePartidos);
        return this.listaDePartidos;
    }

    public ArrayList<Equipo> getEquiposQuePasan() {
        for (int i = 0; i < listaDePartidos.size() ; i++) {
            if (getListaDePartidos().get(i).getResultado().siGanoLocal()){
                this.equiposQuePasan.add(getListaDePartidos().get(i).getLocal());
            }else this.equiposQuePasan.add(getListaDePartidos().get(i).getVisitante());
        }
        return equiposQuePasan;
    }

    public void setEquiposQuePasan(ArrayList<Equipo> equiposQuePasan) {
        this.equiposQuePasan = equiposQuePasan;
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getListaDePartidos() {
        return listaDePartidos;
    }

    public void setListaDePartidos(ArrayList<Partido> listaDePartidos) {
        this.listaDePartidos = listaDePartidos;
    }
}
