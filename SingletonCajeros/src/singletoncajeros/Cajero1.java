package singletoncajeros;

/**
 *
 * @author dav_o
 */
public class Cajero1 implements Cajero{

    public boolean libre;
    public String nSerie;
    public static Cajero1 instance;
    public Cliente cliente;

    private Cajero1(String nSerie) {
        this.nSerie = nSerie;
    }

    public static Cajero1 getSingletonInstance(String nSerie) {
        if (instance == null) {
            instance = new Cajero1(nSerie);
        }
        return instance;
    }

    @Override
    public void atender(Cliente cliente) {
        
        if(libre==true){
            this.cliente=cliente;
        }        
    }
    
    @Override
    public void liberar() {
        setLibre(true);
    }

    @Override
    public boolean isLibre() {
        return libre;
    }

    @Override
    public void setLibre(boolean libre) {
        this.libre = libre;
    }
}
