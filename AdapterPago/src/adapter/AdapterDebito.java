package adapter;

/**
 *
 * @author dav_o
 */
public class AdapterDebito extends PagoCuenta {

    private final PagoTDebito tDebito;

    public AdapterDebito(double saldo) {
        super();
        tDebito = new PagoTDebito(saldo);
    }

    @Override
    public double totalizar(Cuenta cuenta) {
        double total = 0;
        for (int i = 0; i < cuenta.articulos.length; i++) {
            total = total + (cuenta.precios[i]);
        }

        if (tDebito.validarPago(total) == true) {

            total = total + (total * 0.03);
        } else {
            total = 0;
        }
        return total;
    }

    @Override
    public void cobrar(double totalizado, int cuotas) {
        tDebito.aprobarCobro(totalizado, cuotas);
    }

    @Override
    public double getEstado() {
        return tDebito.getSaldo();    
    }

}
