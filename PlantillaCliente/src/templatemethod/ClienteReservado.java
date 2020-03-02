package templatemethod;

import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public class ClienteReservado extends Cliente {

    @Override
    protected void tomarDatos() {
        this.dato1 = JOptionPane.showInputDialog(null, "Nombre: ");
        this.dato2 = JOptionPane.showInputDialog(null, "Fecha Reserva: ");
        this.dato3 = JOptionPane.showInputDialog(null, "Tipo Reserva: ");
    }
}
