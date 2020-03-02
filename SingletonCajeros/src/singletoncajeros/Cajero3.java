package singletoncajeros;

/**
 *
 * @author dav_o
 */
public class Cajero3 implements Cajero {

    public boolean libre;
    public String nSerie;
    public static Cajero3 instance;
    public Cliente cliente;

    private Cajero3(String nSerie) {
        this.nSerie = nSerie;
    }

    public static Cajero3 getSingletonInstance(String nSerie) {
        if (instance == null) {
            instance = new Cajero3(nSerie);
        }
        return instance;
    }

    @Override
    public void atender(Cliente cliente) {

        if (libre == true) {
            this.cliente = cliente;
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
    public void setLibre(boolean ocupado) {
        this.libre = ocupado;
    }

}
