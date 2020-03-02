package singletoncajeros;

import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public class SingletonCajeros {

    public static void main(String[] args) {

        Restaurante restaurantePrueba = new Restaurante();
        restaurantePrueba.abrir();
        Cliente cliente;

        String opcion;
        int num;

        while (restaurantePrueba.abierto == true) {

            System.out.println("-------------------------");
            System.out.println("BIENVENIDO AL RESTAURANTE");
            System.out.println("_________________________");

            System.out.println("...CAJEROS DISPONIBLES...");
            System.out.println("......................");
            System.out.println("Cajero1: " + restaurantePrueba.getCajero1().isLibre());
            System.out.println("Cajero2: " + restaurantePrueba.getCajero2().isLibre());
            System.out.println("Cajero3: " + restaurantePrueba.getCajero3().isLibre());
            System.out.println("......................");
            opcion = JOptionPane.showInputDialog(null, "Digite Una Opcion:\n(1)NuevoCliente \n(2)LiberarCajero \n(3)Salir");
            try {
                switch (opcion) {

                    case "1":

                        String nombre = JOptionPane.showInputDialog(null, "Nombre Cliente: ");
                        cliente = new Cliente(nombre);
                        String orden = JOptionPane.showInputDialog(null, "Orden: ");                        
                        cliente.setPedido(orden);
                        System.out.println("Atendiendo...Cajero#"+restaurantePrueba.atenderCliente(cliente));
                        System.out.println("Cliente: "+nombre+"");
                        System.out.println("Orden: "+orden+"");
                        

                        break;

                    case "2":

                        try {
                            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Liberar Cajero #: "));
                            restaurantePrueba.liberarCajero(num);
                            System.out.println("Cajero #" + num + "Liberado...");

                        } catch (NumberFormatException ex) {
                            System.out.println("No Es Un Valor Valido");
                        }

                        break;

                    case "3":

                        restaurantePrueba.cerrar();

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
