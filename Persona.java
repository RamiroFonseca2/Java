package C;

public abstract class Persona {
    protected String nombre;
    protected String nacionalidad;
    protected int edad;

    public Persona(String nombre, String nacionalidad, int edad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.edad=edad;
    }

    public void llamadoApista(){
        System.out.println("Por favor las personas "+ nombre+" de "+nacionalidad+" aproximarse a pista");
    }

    public abstract void realizarAccion();

    public abstract void interactuarCon(Persona otraPersona);

    public abstract void recibirIndicacionesDe(Ingeniero p);
    public abstract void recibirIndicacionesDe(Piloto i);
    public abstract void recibirIndicacionesDe(DirectorCarrera d);
}
