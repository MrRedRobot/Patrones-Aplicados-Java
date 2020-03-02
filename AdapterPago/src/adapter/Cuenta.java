package adapter;

/**
 *
 * @author DAv_O
 */
public class Cuenta {
    
    public String[] articulos;
    public double[] precios;

    public Cuenta(String[] articulos, double[] precios) {
        this.articulos = articulos;
        this.precios = precios;
    }

    public String[] getArticulos() {
        return articulos;
    }

    public void setArticulos(String[] articulos) {
        this.articulos = articulos;
    }

    public double[] getPrecios() {
        return precios;
    }

    public void setPrecios(double[] precios) {
        this.precios = precios;
    }
    
    public void imprimirCuenta(){
         for (int i = 0; i < articulos.length; i++) {
             System.out.println(articulos[i]+" ... "+precios[i]);
         }
        
    }
    
    
    
}
