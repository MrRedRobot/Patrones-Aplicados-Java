package bridgemotores;

/**
 *
 * @author And_O
 */
public class CocinaExpress extends Cocina{

    public CocinaExpress() {
        super();
    }

    @Override
    public void recargarMaquinas(double cantidad) {
        this.maquinaCafe.recargarMaquina(cantidad);
        this.maquinaGaseosa.recargarMaquina(cantidad);
        this.maquinaHelado.recargarMaquina(cantidad); 
        
    }
    
}
