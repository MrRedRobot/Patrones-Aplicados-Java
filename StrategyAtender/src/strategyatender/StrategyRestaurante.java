package strategyatender;

import javax.swing.JOptionPane;
import strategyficha.Restaurante;

/**
 *
 * @author dav_o
 */
public class StrategyRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante();

        String estrategia;
        int nMesas = 0, nBanquetes = 0, nClientes;
        boolean salir = false;

        System.out.println("-------------------------");
        System.out.println("BIENVENIDO AL RESTAURANTE");
        System.out.println("_________________________");

        while (salir == false) {

            estrategia = JOptionPane.showInputDialog(null, "Lugar De Ubicacion:\n"
                    + "(1)Mesa\n"
                    + "(2)Banquete (Max 5 Platillos Diferentes) \n"
                    + "(3)Salir");

            nClientes = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad De Personas: "));

            switch (estrategia) {

                case "1":

                    restaurante.asignarLugar("M", nMesas, nClientes);
                    restaurante.atenderCliente("M", nMesas);
                    nMesas++;
                    break;

                case "2":

                    restaurante.asignarLugar("B", nBanquetes , nClientes);
                    restaurante.atenderCliente("B", nBanquetes);
                    nBanquetes++;

                    break;

                case "3":

                    salir = true;

                    break;

                default:

                    System.out.println("Opcion NO VALIDA");

                    break;

            }

        }

    }
}
