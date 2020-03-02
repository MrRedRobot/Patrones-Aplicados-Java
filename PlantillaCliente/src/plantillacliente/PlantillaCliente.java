package plantillacliente;

import javax.swing.JOptionPane;
import templatemethod.Cliente;
import templatemethod.ClienteDomicilio;
import templatemethod.ClienteLocal;
import templatemethod.ClienteReservado;

/**
 *
 * @author DAv_O
 */
public class PlantillaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente;
        String opcion;
        boolean salir = false;

        System.out.println("-------------------------");
        System.out.println("BIENVENIDO AL RESTAURANTE");
        System.out.println("_________________________");

        while (salir == false) {

            opcion = JOptionPane.showInputDialog(null, "...REGISTRO DE CLIENTES..."
                    + "\n(1)Cliente Local "
                    + "\n(2)Cliente Domicilio "
                    + "\n(3)Cliente Reserva "
                    + "\n(4)Salir");
            try {
                switch (opcion) {

                    case "1":
                        cliente = new ClienteLocal();
                        cliente.atenderCliente();
                        System.out.println("_________________________");
                        break;

                    case "2":
                        cliente = new ClienteDomicilio();
                        cliente.atenderCliente();
                        System.out.println("_________________________");
                        break;

                    case "3":
                        cliente = new ClienteReservado();
                        cliente.atenderCliente();
                        System.out.println("_________________________");
                        break;

                    case "4":
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
