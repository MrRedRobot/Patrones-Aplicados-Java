package templatemethod;

import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public class ClienteLocal extends Cliente {

    @Override
    protected void tomarDatos() {
        this.dato1 = JOptionPane.showInputDialog(null, "Nombre: ");
        this.dato2 = JOptionPane.showInputDialog(null, "Mesa: ");
        this.dato3 = JOptionPane.showInputDialog(null, "Mesero: ");
    }
}
