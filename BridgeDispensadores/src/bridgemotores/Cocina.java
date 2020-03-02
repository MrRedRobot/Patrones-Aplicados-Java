package bridgemotores;

/**
 *
 * @author And_O
 */
public abstract class Cocina {

    protected MaquinaDispensadora maquinaCafe;
    protected MaquinaDispensadora maquinaGaseosa;
    protected MaquinaDispensadora maquinaHelado;

    public Cocina() {
        maquinaCafe = new DispensadorCafe();
        maquinaGaseosa = new DispensadorGaseosa();
        maquinaHelado = new DispensadorHelado();
    }

    public void prepararCafe(String tipo) {
        maquinaCafe.prepararProducto(tipo);
    }

    public void prepararGaseosa(String tipo) {
        maquinaGaseosa.prepararProducto(tipo);
    }

    public void prepararHelado(String sabor) {
        maquinaHelado.prepararProducto(sabor);
    }

    public abstract void recargarMaquinas(double cantidad);

}
