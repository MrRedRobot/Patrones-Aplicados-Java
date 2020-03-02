package proxy;

/**
 *
 * @author dav_o
 */
public class MenuProxy implements ProveerPlatillos {

    public Cocina cocina;

    private String[] platillosDelDia = {"chuletas de cerdo", "carne asada",
        "bandeja 2 carnes", "pollo a la plancha", "helado"};
    
    public String[] platillosCocina = {"lomo de cerdo", "chuletas de cerdo", "carne a la plancha", "carne asada",
        "bandeja 2 carnes", "bandeja 3 carnes", "pollo asado", "pollo a la plancha",
        "pastel de chocolate", "helado"};

    public MenuProxy() {
        cocina = null;
    }

    public String solicitar(String pedido) {
        String platillo;

        if (isStored(pedido) == true) {
            if (cocina == null) {
                cocina = new Cocina();
            }
            platillo = cocina.solicitar(pedido);

        } else {
            platillo = ("Platillo NO Disponible El Dia De Hoy.");
        }
        return platillo;
    }

    public boolean isStored(String game) {
        boolean resultado = false;
        for (int x = 0; x < platillosDelDia.length; x++) {

            if (game.equals(platillosDelDia[x])) {
                resultado = true;
            }
        }
        return resultado;
    }

    @Override
    public void platillosDisponibles() {
        for (int x = 0; x < platillosDelDia.length; x++) {
            System.out.println("(" + (x + 1) + ") " + platillosDelDia[x]);
        }
    }
    
}
