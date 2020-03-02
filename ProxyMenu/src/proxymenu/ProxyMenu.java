package proxymenu;

import javax.swing.JOptionPane;
import proxy.MenuProxy;
import proxy.ProveerPlatillos;

/**
 *
 * @author DAv_O
 */
public class ProxyMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProveerPlatillos menu = new MenuProxy();
        String opcion, pedido;
        boolean salir = false;
        
        String[] platillosCocina = {"lomo de cerdo", "chuletas de cerdo", "carne a la plancha", "carne asada",
        "bandeja 2 carnes", "bandeja 3 carnes", "pollo asado", "pollo a la plancha",
        "pastel de chocolate", "helado"};

        System.out.println("-------------------------");
        System.out.println("BIENVENIDO AL RESTAURANTE");
        System.out.println("_________________________");
        
        System.out.println(".....  MENU  .....");
        for (int x = 0; x < platillosCocina.length; x++) {
            System.out.println("(" + (x + 1) + ") " + platillosCocina[x]);
        }
        System.out.println("_________________________");

        while (salir == false) {

            opcion = JOptionPane.showInputDialog(null, "(1) Solicitar Platillo: \n"
                    + "(2) Menu Del Dia \n"
                    + "(3) Salir");
            try {
                switch (opcion) {

                    case "1":
                        pedido = JOptionPane.showInputDialog(null, "Digite El Nombre Del Platillo");
                        System.out.println(menu.solicitar(pedido));
                        System.out.println("_________________________");
                        break;

                    case "2":
                        System.out.println(".... Menu Del Dia ....");
                        menu.platillosDisponibles();
                        System.out.println("_________________________");
                        break;

                    case "3":
                        salir = true;
                        break;

                    default:
                        System.out.println("Opcion NO VALIDA");
                        break;
                }
                
            } catch (NumberFormatException ex) {
                System.out.println("No Es Un Valor Valido");
            }
        }
    }
}
