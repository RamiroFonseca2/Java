package C;

public class Ingeniero extends Persona {
    private String rol;
    private int Nestrategia;

    public Ingeniero(String nombre,String nacionalidad, int edad, String rol, int Nestrategia){
        super(nombre,nacionalidad,edad);
        this.rol=rol;
        this.Nestrategia=Nestrategia;
    }

    public void ajustarEstrategia(){
        System.out.println("Se esta ajustando la estrategia...");
    }

    public void interactuarCon(){

    }

    @Override
    public void realizarAccion(){
        ajustarEstrategia();
    }

    @Override
    public void interactuarCon(Persona otraPersona) {
        otraPersona.recibirIndicacionesDe(this);
    }
    @Override
    public void recibirIndicacionesDe(Ingeniero i){
        System.out.println("El Ingeniero"+nombre + " recibe indicaciones del ingeniero "+ i.nombre);
    }
    @Override
    public void recibirIndicacionesDe(Piloto p){
        System.out.println("El Ingeniero"+nombre + " recibe indicaciones del Piloto "+ p.nombre);
    }
    @Override
    public void recibirIndicacionesDe(DirectorCarrera d) {
        System.out.println("El Ingeniero" + nombre + " recibe indicaciones del Director " + d.nombre);
    }
}