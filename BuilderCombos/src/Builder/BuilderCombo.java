package Builder;

/**
 *
 * @author DAv_O
 */
public abstract class BuilderCombo {
    
    public Combo combo;

    public Combo getCombo() {
        return combo;
    }
    
    public void generarCombo(){
        combo = new Combo();
    }
    
    public abstract void buildPlatoPrincipal();    
    public abstract void buildAcompañamiento();    
    public abstract void buildBebida();    
    public abstract void buildPostre();
    
}
