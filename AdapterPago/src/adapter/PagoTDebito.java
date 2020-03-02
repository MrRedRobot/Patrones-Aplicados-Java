package adapter;

/**
 *
 * @author dav_o
 */
public class PagoTDebito {

    private double saldo;

    public PagoTDebito(double saldo) {
        this.saldo = saldo;
    }

    public boolean validarPago(Double total) {
        boolean valido = false;

        if (saldo > (total + (total * 0.03))) {
            valido = true;
        }

        return valido;
    }

    public void aprobarCobro(Double totalizado, int cuotas) {
        setSaldo(saldo - totalizado);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
