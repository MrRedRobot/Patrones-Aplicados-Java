package adapter;

/**
 *
 * @author dav_o
 */
public class AdapterCredito extends PagoCuenta {

    private final PagoTCredito tCredito;

    public AdapterCredito(double saldo) {
        super();
        tCredito = new PagoTCredito(saldo);
    }

    @Override
    public double totalizar(Cuenta cuenta) {
        double total = 0;
        for(int i=0; i<cuenta.articulos.length; i++ ){
            total=total+(cuenta.precios[i]);
        }
        
        if(tCredito.validarPago(total)==true){
            
            total=total+(total*0.05);            
        }else{
            total=0;        
        }      
        return total;
    }

    @Override
    public void cobrar(double totalizado,int cuotas) {        
        tCredito.aprobarCobro(totalizado,cuotas);               
    }

    @Override
    public double getEstado() {
        return tCredito.getSaldo();
    }

}
