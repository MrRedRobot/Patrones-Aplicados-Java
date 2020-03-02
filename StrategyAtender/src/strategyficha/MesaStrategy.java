package strategyficha;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public class MesaStrategy implements AtenderStrategy {

    private int cantidadClientes;
    private Vector<String> pedido = new Vector<String>();
    public int numPlatillos=0;
    public int numMesa;

    public MesaStrategy(int numeroClientes) {
        this.cantidadClientes = numeroClientes;
    }

    @Override
    public void tomarPedido() {
        String platillo;
        boolean terminado = false;
        String opcion;
        while (terminado == false) {
            try {
                opcion = JOptionPane.showInputDialog(null, "(1)Pedir Producto "
                        + "\n(2)Pedido Terminado");

                switch (opcion) {

                    case "1":
                        platillo = JOptionPane.showInputDialog(null, "Digite Su Pedido: ");
                        pedido.addElement(platillo);
                        System.out.println(platillo);
                        numPlatillos++;
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

    @Override
    public void asignarLugar(int nLugar) {
        this.numMesa = nLugar;
    }

    @Override
    public Vector<String> getPedido() {
        return pedido;
    }

}
