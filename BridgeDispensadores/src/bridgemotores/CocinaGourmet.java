package bridgemotores;

/**
 *
 * @author And_O
 */
public class CocinaGourmet extends Cocina{

    public CocinaGourmet() {
        super();
    }

    @Override
    public void recargarMaquinas(double cantidad) {
        this.maquinaCafe.recargarMaquina(cantidad);   
        this.maquinaGaseosa.recargarMaquina(cantidad); 
        this.maquinaHelado.recargarMaquina(cantidad); 
        
    }
        
}
