package C;

public class Piloto extends Persona {
    private int experiencia;

    public Piloto(String nombre, String nacionalidad, int experiencia, int edad){
        super(nombre,nacionalidad,edad);
        this.experiencia = experiencia;
    }

    public void conducir(){
        System.out.println( nombre  + " esta conduciendo el auto");
    }

    @Override
    public void realizarAccion() {
        conducir();
    }
    @Override
    public void interactuarCon(Persona otraPersona) {
        otraPersona.recibirIndicacionesDe(this);
    }
    @Override
    public void recibirIndicacionesDe(Ingeniero i){
        System.out.println("El piloto"+nombre + " recibe indicaciones del ingeniero "+ i.nombre);
    }
    @Override
    public void recibirIndicacionesDe(Piloto p){
        System.out.println("El piloto"+nombre + " recibe indicaciones del Piloto "+ p.nombre);
    }
    @Override
    public void recibirIndicacionesDe(DirectorCarrera d){
        System.out.println("El piloto"+nombre + " recibe indicaciones del ingeniero "+ d.nombre);
    }
}