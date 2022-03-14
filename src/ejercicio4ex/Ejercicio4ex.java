package ejercicio4ex;

import entidad.Nif;
import servicio.NifServicio;


public class Ejercicio4ex {

    public static void main(String[] args) {
        
        NifServicio ns = new NifServicio();
        Nif n1 = ns.crearNif();
      
        ns.mostrar(n1);
    }
}
