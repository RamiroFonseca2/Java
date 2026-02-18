package C;

public class DirectorCarrera extends Persona {
    int antiguedad;

    public DirectorCarrera(String nombre, String nacionalidad, int edad, int antiguedad){
        super(nombre,nacionalidad,edad);
        this.antiguedad=antiguedad;
    }
    public void moverBandera(){
        System.out.println("Bandera blanca");
    }

    @Override
    public void realizarAccion(){
        moverBandera();
    }
    @Override
    public void interactuarCon(Persona otraPersona) {
        otraPersona.recibirIndicacionesDe(this);
    }
    @Override
    public void recibirIndicacionesDe(Ingeniero i){
        System.out.println("El Director"+nombre + " recibe indicaciones del ingeniero "+ i.nombre);
    }
    @Override
    public void recibirIndicacionesDe(Piloto p){
        System.out.println("El Director"+nombre + " recibe indicaciones del Piloto "+ p.nombre);
    }
    @Override
    public void recibirIndicacionesDe(DirectorCarrera d){
        System.out.println("El Director"+nombre + " recibe indicaciones del Director "+ d.nombre);
    }
}
