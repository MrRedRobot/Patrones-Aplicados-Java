package singletoncajeros;

/**
 *
 * @author dav_o
 */
public class Restaurante {

    private Cajero1 cajero1;
    private Cajero2 cajero2;
    private Cajero3 cajero3;
    public boolean abierto;

    public Restaurante() {
        this.cajero1 = Cajero1.getSingletonInstance("1");
        this.cajero2 = Cajero2.getSingletonInstance("2");
        this.cajero3 = Cajero3.getSingletonInstance("3");

    }

    public void abrir() {
        abierto = true;
        cajero1.liberar();
        cajero2.liberar();
        cajero3.liberar();
    }

    public void cerrar() {
        abierto = false;
    }

    public Cajero asignarCajero(Cajero cajero) {
        return cajero;
    }

    public int atenderCliente(Cliente cliente) {

        int cajero=0;
        if (cajero1.getSingletonInstance("1").isLibre() == true) {

            cajero1.getSingletonInstance("1").atender(cliente);
            cajero1.getSingletonInstance("1").setLibre(false);
            cajero = 1;

        } else if (cajero2.getSingletonInstance("2").isLibre() == true) {

            cajero2.getSingletonInstance("2").atender(cliente);
            cajero2.getSingletonInstance("2").setLibre(false);
            cajero = 2;

        } else if (cajero3.getSingletonInstance("3").isLibre() == true) {

            cajero3.getSingletonInstance("3").atender(cliente);
            cajero3.getSingletonInstance("3").setLibre(false);
            cajero = 3;

        } else if (abierto = true) {
            System.out.println("Cajeros Ocupados INTENTE LIBERAR ALGUNO...");
        }
        System.out.println(".........................");
        return cajero;
    }

    public void liberarCajero(int num) {
        if (num == 1) {
            cajero1.liberar();
        } else if (num == 2) {
            cajero2.liberar();
        } else if (num == 3) {
            cajero3.liberar();
        } else {
            System.out.println("Cajero No Existe");
        }

    }

    public Cajero1 getCajero1() {
        return cajero1;
    }

    public Cajero2 getCajero2() {
        return cajero2;
    }

    public Cajero3 getCajero3() {
        return cajero3;
    }

}
