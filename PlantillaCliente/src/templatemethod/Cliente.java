package templatemethod;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public abstract class Cliente {

    private Vector<String> platillos = new Vector<String>();
    private int articulos = 0;
    public String dato1;
    public String dato2;
    public String dato3;

    protected abstract void tomarDatos();

    public void atenderCliente() {
        tomarDatos();
        tomarPedido();
        imprimirDatos();
        imprimirPedido();
    }

    protected void tomarPedido() {
        String entrada;
        boolean terminado = false;
        String opcion;
        while (terminado == false) {
            try {
                opcion = JOptionPane.showInputDialog(null, "(1)Pedir Producto "
                        + "\n(2)Pedido Terminado");

                switch (opcion) {

                    case "1":
                        entrada = JOptionPane.showInputDialog(null, "Digite Su Pedido: ");
                        platillos.addElement(entrada);
                        articulos++;
                        break;

                    case "2":
                        terminado = true;
                        break;

                }
            } catch (NumberFormatException ex) {
                System.out.println("No Es Un Valor Valido");
            }
        }
    }

    protected void imprimirPedido() {
        for (int i = 0; i < articulos; i++) {
            System.out.println((1 + i) + ": " + platillos.get(i));
        }
    }

    protected void imprimirDatos() {
        System.out.println(dato1);
        System.out.println(dato2);
        System.out.println(dato3);        
    }

}
