package C;

public class AutoDeCarreras extends Vehiculo {

    public AutoDeCarreras(int velocidad, int numero, String estado, int combustible, int desgasteNeumatico) {
        super(velocidad, numero, estado, combustible, desgasteNeumatico);
        this.combustible = 100;
        this.desgasteNeumatico = 0;
    }

    public void pitCall() {
        System.out.println("️Llamado a BOXES!");
        System.out.println("Entrando a pits...");

        combustible = 100;
        desgasteNeumatico = 0;

        System.out.println("Repostaje completo.");
        System.out.println("Neumaticos nuevos.");
    }


    public void acelerar() {
        consumirCombustible(15);
        desgastarNeumaticos(20);
        verificarEstado();
        velocidad += 50;
        System.out.println("El auto #" + numero + " acelera a " + velocidad + " km/h.");
    }

    private void consumirCombustible(int cantidad) {
        combustible -= cantidad;
        if (combustible < 0) {
            combustible = 0;
        }
        System.out.println("Combustible actual: " + combustible + "L");
    }

    private void desgastarNeumaticos(int cantidad) {
        desgasteNeumatico += cantidad;
        if (desgasteNeumatico > 100) {
            desgasteNeumatico = 100;
        }
        System.out.println("Desgaste neumaticos: " + desgasteNeumatico + "%");
    }

    private void verificarEstado() {
        if (combustible < 20 || desgasteNeumatico > 80) {
            pitCall();
        }
    }

    @Override
    public void realizarAccionAuto() {
        acelerar();
    }
}

