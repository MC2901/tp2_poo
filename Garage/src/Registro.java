public class Registro extends Vehiculo{
 public String nombre;
 public String apellido;
 public int dni;

public Registro(String nombre, String apellido, int dni,String marca, double km, int ruedasACambiar){
    super(marca, km, ruedasACambiar);
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
