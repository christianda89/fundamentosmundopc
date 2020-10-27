package mundopc;

/**
 *
 * @author Christian
 */
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(", tipoEntrada=").append(this.getTipoEntrada());
        sb.append(", marca=").append(this.getMarca());
        sb.append('}');
        return sb.toString();
    }
    
}
