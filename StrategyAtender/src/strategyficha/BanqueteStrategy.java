package strategyficha;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public class BanqueteStrategy implements AtenderStrategy {

    private int cantidadClientes;
    private Vector<String> pedido = new Vector<String>();
    public int maxPlatillos = 5;
    public int numBanquete;

    public BanqueteStrategy(int numeroClientes) {
        this.cantidadClientes = numeroClientes;
    }

    @Override
    public void tomarPedido() {
        String platillo;
        for (int p = 0; p < maxPlatillos; p++) {
            platillo = JOptionPane.showInputDialog(null, "Platillo Seleccionado: ");
            pedido.addElement(platillo);
            System.out.println(platillo);            
        }
    }

    @Override
    public void asignarLugar(int nLugar) {
        this.numBanquete = nLugar;
    }

    @Override
    public Vector<String> getPedido() {
        return pedido;
    }

}
