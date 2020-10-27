package mundopc;

/**
 *
 * @author Christian
 */
public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(", tipoEntrada=").append(this.getTipoEntrada());
        sb.append(", marca=").append(this.getMarca());
        sb.append('}');
        return sb.toString();
    }
    
    
}
