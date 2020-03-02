package adapter;

/**
 *
 * @author dav_o
 */
public class PagoEfectivo extends PagoCuenta {

    public double efectivo;

    public PagoEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    @Override
    public double totalizar(Cuenta cuenta) {
        double total = 0;
        for (int i = 0; i < cuenta.articulos.length; i++) {
            total = total + (cuenta.precios[i]);
        }
        return total;
    }

    @Override
    public void cobrar(double totalizado, int cuotas) {
        if (efectivo >= totalizado) {
            setEfectivo((efectivo - totalizado) / cuotas);
        }
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getEfectivo() {
        return efectivo;
    }

    @Override
    public double getEstado() {
        return getEfectivo();
    }

}
