package Builder;

/**
 *
 * @author DAv_O
 */
public class DirectorCocina {

    private BuilderCombo builderCombo;

    public void prepararCombo() {
        builderCombo.generarCombo();
        builderCombo.buildPlatoPrincipal();
        builderCombo.buildAcompañamiento();
        builderCombo.buildBebida();
        builderCombo.buildPostre();
    }

    public void setBuilderCombo(BuilderCombo builderCombo) {
        this.builderCombo = builderCombo;
    }

    public Combo getCombo() {
        return builderCombo.getCombo();
    }

}
