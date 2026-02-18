package C;

public abstract class Vehiculo {
    protected int velocidad;
    protected int numero;
    protected String estado;
    protected int combustible;
    protected int desgasteNeumatico;

    public Vehiculo(int velocidad, int numero, String estado , int combustible, int desgasteNeumatico) {
        this.velocidad=velocidad;
        this.numero=numero;
        this.estado=estado;
        this.combustible = combustible;
        this.desgasteNeumatico = desgasteNeumatico;

    }
    public void chekeoGeneral(){
        System.out.println("Sistemas funcionando correctamente");
    }
    public abstract void realizarAccionAuto();
}
