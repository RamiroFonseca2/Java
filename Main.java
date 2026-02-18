package C;

public class Main {
    public static void main(String[] args){
        Persona piloto = new Piloto("CarlosSainz", "España", 5,22 );
        Persona ingeniero = new Ingeniero("charly", "Urugayo", 22,"mecanico",21);
        Persona directorCarrera = new DirectorCarrera("roberto","paraguayo",23,10);
        Vehiculo autoCarrera = new AutoDeCarreras(200,55,"listo", 100, 0);
        Vehiculo autoSeguridad = new AutoSeguridad(60,911,"En proceso",100, 0);

//----Interacciones----

        piloto.interactuarCon(ingeniero);
        ingeniero.interactuarCon(piloto);
        piloto.interactuarCon(directorCarrera);
        directorCarrera.interactuarCon(ingeniero);


//-------Persona-----
        piloto.llamadoApista();
        piloto.realizarAccion();

        ingeniero.llamadoApista();
        ingeniero.realizarAccion();

        directorCarrera.llamadoApista();
        directorCarrera.realizarAccion();
//-------Fin Persona-----
//-------Vehiculo------
        autoCarrera.chekeoGeneral();
        autoCarrera.realizarAccionAuto();

        autoSeguridad.chekeoGeneral();
        autoSeguridad.realizarAccionAuto();

//---------Final Obejtos 1-------
        autoCarrera.realizarAccionAuto();
        autoCarrera.realizarAccionAuto();
        autoCarrera.realizarAccionAuto();
        autoCarrera.realizarAccionAuto();

    }



}