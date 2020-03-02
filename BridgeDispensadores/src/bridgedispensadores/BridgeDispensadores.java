package bridgedispensadores;

import bridgemotores.Cocina;
import bridgemotores.CocinaExpress;
import bridgemotores.CocinaGourmet;
import javax.swing.JOptionPane;

/**
 *
 * @author DAv_O
 */
public class BridgeDispensadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cocina cocina = null;
        String tipoProducto;
        int opcion, salir = 0, cantidad;

        System.out.println("-------------------------");
        System.out.println("BIENVENIDO AL RESTAURANTE");
        System.out.println("_________________________");

        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo De Cocina:" + "\n"
                    + "1.Cocina Express" + "\n"
                    + "2.Cocina Gourmet"));

            switch (opcion) {
                case 1:
                    cocina = new CocinaExpress();
                    break;
                case 2:
                    cocina = new CocinaGourmet();
                    break;

            }
        } catch (NumberFormatException ex) {
            System.out.println("Parametros No Validos!");

        }

        while (salir != 1) {
            System.out.println("-------------------------");
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Què accion desea realizar?" + "\n"
                    + "1.Preparar Cafe" + "\n"
                    + "2.Preparar Gaseosa" + "\n"
                    + "3.Preparar Helado" + "\n"
                    + "4.Recargar Maquinas" + "\n"
                    + "5.Salir" + "\n"));
            
            switch (opcion) {
                case 1:
                    tipoProducto = JOptionPane.showInputDialog(null, "Tipo de Cafe: ");
                    cocina.prepararCafe(tipoProducto);
                    System.out.println("Cafe: " + tipoProducto + "...Listo");

                    break;
                case 2:
                    tipoProducto = JOptionPane.showInputDialog(null, "Tipo de Gaseosa: ");
                    cocina.prepararGaseosa(tipoProducto);
                    System.out.println("Gaseosa: " + tipoProducto + "...Listo");

                    break;
                case 3:
                    tipoProducto = JOptionPane.showInputDialog(null, "Tipo de Helado: ");
                    cocina.prepararHelado(tipoProducto);
                    System.out.println("Helado: " + tipoProducto + "...Listo");

                    break;
                case 4:
                    System.out.println("RECARGANDO MAQUINAS DISPENSADORAS...");
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de LITROS a recargar: "));
                    cocina.recargarMaquinas(cantidad);

                    break;
                case 5:
                    salir = 1;
                    break;

            }

        }

    }

}
