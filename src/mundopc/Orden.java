package mundopc;

/**
 *
 * @author Christian
 */
public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 3;
    
    public Orden(){
        this.computadoras= new Computadora[Orden.MAX_COMPUTADORAS];
        this.idOrden = ++Orden.contadorOrdenes;
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.computadoras[Orden.MAX_COMPUTADORAS-1] != null){
            System.out.println("Ya no se pueden agregar mas computadoras a la orden");
        }else{
            this.computadoras[Orden.contadorComputadoras++]=computadora;
        }
        
    }
    
    public void mostarOrden(){
        for(int i = 0; i<Orden.contadorComputadoras; i++){
            System.out.println(computadoras[i].toString());
        }
    }
}
