package C;

public class AutoSeguridad extends Vehiculo {

    public AutoSeguridad(int velocidad, int numero, String estado,int combustible, int desgasteNeumatico){
        super(velocidad,numero, estado,combustible,desgasteNeumatico);
    }

    public void llamadoAuxilio(){
        System.out.println("Enviando auto para socorro...");
    }

    @Override
    public void realizarAccionAuto() {
        llamadoAuxilio();
    }
}
