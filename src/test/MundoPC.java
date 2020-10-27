package test;
import mundopc.*;
/**
 *
 * @author Christian
 */
public class MundoPC {
    public static void main(String[] args) {
       Raton raton1 = new Raton("USB", "Razer"); 
       Raton raton2 = new Raton("USB", "Micronics"); 
       Raton raton3 = new Raton("USB", "IntenseDevice");
       
       Teclado teclado1 = new Teclado("USB", "Micronics");
       Teclado teclado2 = new Teclado("USB", "Mecanico");
       Teclado teclado3 = new Teclado("USB", "Razer");
       
       Monitor monitor1 = new Monitor("ViewSonic", 21);
       Monitor monitor2 = new Monitor("LG", 25);
       Monitor monitor3 = new Monitor("Samsung", 19);
       
       Computadora computadora1 = new Computadora("Computadora de Neisy", monitor1, teclado1, raton1);
       Computadora computadora2 = new Computadora("Computadora de Christian", monitor2, teclado2, raton2);
       Computadora computadora3 = new Computadora("Computadora de Frank", monitor3, teclado3, raton3);
       
       Orden orden1 = new Orden();
       orden1.agregarComputadora(computadora1);
       orden1.agregarComputadora(computadora2);
       orden1.agregarComputadora(computadora3);
       
       orden1.mostarOrden();
        
        
    }
}
