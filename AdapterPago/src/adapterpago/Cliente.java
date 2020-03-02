package adapterpago;

import adapter.AdapterCredito;
import adapter.AdapterDebito;
import adapter.Cuenta;
import adapter.PagoCuenta;
import adapter.PagoEfectivo;
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

        PagoCuenta pagoCuenta;
        Cuenta cuenta;
        int opcion, cantidad, cuotas;
        String producto, productos[];
        int salir = 0;
        double total, precio, precios[], saldo = 0;

        while (salir != 1) {

            System.out.println("-------------------------");
            System.out.println("BIENVENIDO AL RESTAURANTE");
            System.out.println("_________________________");

            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Pago De Cuenta \n"
                    + "Digite cantidad de productos: \n"));

            productos = new String[cantidad];
            precios = new double[cantidad];

            for (int i = 0; i < cantidad; i++) {
                producto = JOptionPane.showInputDialog(null, "Nombre Del Producto: ");
                precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Precio: "));

                productos[i] = producto;
                precios[i] = precio;

            }

            cuenta = new Cuenta(productos, precios);
            boolean cancelado = false;
            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo DE Pago: " + "\n"
                        + "1.Efectivo" + "\n"
                        + "2.Tarjeta De Credito" + "\n"
                        + "3.Tarjeta Debito" + "\n"
                        + "4.Salir" + "\n"));

                switch (opcion) {
                    case 1:
                        try {
                            saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Efectivo: "));
                            pagoCuenta = new PagoEfectivo(saldo);
                            total = pagoCuenta.totalizar(cuenta);
                            pagoCuenta.cobrar(total, 1);
                            cuenta.imprimirCuenta();
                            cancelado = true;
                            System.out.println("Efectivo:" + saldo);
                            System.out.println("Cambio:" + pagoCuenta.getEstado());
                        } catch (Error e) {
                            JOptionPane.showMessageDialog(null, "Intentelo De Nuevo... Error:" + e);
                            cancelado = false;
                        }

                        break;
                    case 2:
                        try {
                            saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Saldo: "));
                            pagoCuenta = new AdapterCredito(saldo);
                            total = pagoCuenta.totalizar(cuenta);
                            cuotas = Integer.parseInt(JOptionPane.showInputDialog(null, "# Cuotas: "));
                            pagoCuenta.cobrar(total, cuotas);
                            cuenta.imprimirCuenta();
                            cancelado = true;
                            System.out.println("Nuevo Saldo:" + pagoCuenta.getEstado());
                        } catch (Error e) {
                            JOptionPane.showMessageDialog(null, "Intentelo De Nuevo... Error:" + e);
                            cancelado = false;
                        }

                        break;
                    case 3:
                        try {
                            saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Saldo: "));
                            pagoCuenta = new AdapterDebito(saldo);
                            total = pagoCuenta.totalizar(cuenta);
                            pagoCuenta.cobrar(total, 1);
                            cuenta.imprimirCuenta();
                            cancelado = true;
                            System.out.println("Nuevo Saldo:" + pagoCuenta.getEstado());
                        } catch (Error e) {
                            JOptionPane.showMessageDialog(null, "Intentelo De Nuevo... Error:" + e);
                            cancelado = false;
                        }
                        break;
                    case 4:
                        salir = 1;
                        break;

                }
            } while (cancelado == false);
        }
    }

}
