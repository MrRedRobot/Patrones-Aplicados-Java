package adapter;

/**
 *
 * @author dav_o
 */
public class PagoTCredito {

    public double saldo;

    public PagoTCredito(double saldo) {
        this.saldo = saldo;
    }

    public boolean validarPago(Double total) {
        boolean valido = false;

        if (saldo > (total + (total * 0.05))) {
            valido = true;
        }
        return valido;
    }

    public void aprobarCobro(Double cobro, int cuotas) {
        setSaldo(saldo - (saldo / cuotas));
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
