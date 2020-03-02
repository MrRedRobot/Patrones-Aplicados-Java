package proxy;

/**
 *
 * @author dav_o
 */
public class Cocina implements ProveerPlatillos {

    private String[] platillos = {"lomo de cerdo", "chuletas de cerdo", "carne a la plancha", "carne asada",
        "bandeja 2 carnes", "bandeja 3 carnes", "pollo asado", "pollo a la plancha",
        "pastel de chocolate", "helado"};

    public Cocina() {
    }

    @Override
    public String solicitar(String platillo) {
        return ("Preparando: " + platillo);
    }

    @Override
    public void platillosDisponibles() {        
        System.out.println("MENU RESTAURANTE...");
        for (int x = 0; x < platillos.length; x++) {
            System.out.println("(" + (x + 1) + ") " + platillos[x]);
        }
    }
}
