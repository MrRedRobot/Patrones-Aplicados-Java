package bridgemotores;

/**
 *
 * @author And_O
 */
public class DispensadorHelado implements MaquinaDispensadora {

    public double disponible;

    @Override
    public void recargarMaquina(double cantidad) {
        setDisponible(disponible + cantidad);
    }

    @Override
    public String prepararProducto(String tipo) {
        return tipo;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

}
