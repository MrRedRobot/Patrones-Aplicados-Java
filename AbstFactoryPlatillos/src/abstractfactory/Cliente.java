package abstractfactory;

import Abstract.FabricaAbstracta;
import Abstract.PlatilloAbstracto;
import Abstract.PostreAbstracto;
import Clases.FabricaEstandar;
import Clases.FabricaLight;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DAv_O
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FabricaAbstracta fabrica;
        boolean cerrar = false;

        Vector<PlatilloAbstracto> platillosListos = new Vector<PlatilloAbstracto>();
        Vector<PostreAbstracto> postresListos = new Vector<PostreAbstracto>();

        while (cerrar == false) {
            
            System.out.println("-------------------------");
            System.out.println("BIENVENIDO AL RESTAURANTE");
            System.out.println("_________________________");
            

            String orden = JOptionPane.showInputDialog(null, "Orden: (1)Platillo (2)Postre: ");
            String nombre = JOptionPane.showInputDialog(null, "Nombre Del Plato: ");
            String tipo = JOptionPane.showInputDialog(null, "Tipo De Preparacion: (1)Normal (2)Light :");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad: # "));

            switch (tipo) {
                case "1":

                    fabrica = new FabricaEstandar();

                    if ("1".equals(orden)) {
                        while (cantidad > 0) {
                            platillosListos.addElement(fabrica.crearPlatillo(nombre));
                            System.out.println("Platillo Listo: " + nombre);
                            cantidad--;

                        }
                    }
                    if ("2".equals(orden)) {
                        while (cantidad > 0) {
                            postresListos.addElement(fabrica.crearPostre(nombre));
                            System.out.println("Postre Listo: " + nombre);
                            cantidad--;
                        }
                    }

                    break;

                case "2":

                    fabrica = new FabricaLight();

                    if ("1".equals(orden)) {
                        while (cantidad > 0) {
                            platillosListos.addElement(fabrica.crearPlatillo(nombre));
                            System.out.println("Platillo Listo: " + nombre+"-Light");
                            cantidad--;
                        }
                    }
                    if ("2".equals(orden)) {
                        while (cantidad > 0) {
                            postresListos.addElement(fabrica.crearPostre(nombre));
                            System.out.println("Postre Listo: " + nombre+"-Light");
                            cantidad--;
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion NO Valida...");
                    break;
            }
            
            String exit = JOptionPane.showInputDialog("Nueva Orden: (1)SI (2)NO");
            cerrar = !"1".equals(exit);
        }
    }
}
