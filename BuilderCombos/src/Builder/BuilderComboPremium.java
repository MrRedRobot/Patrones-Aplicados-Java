package Builder;

/**
 *
 * @author DAv_O
 */
public class BuilderComboPremium extends BuilderCombo{

    @Override
    public void buildPlatoPrincipal() {
        PlatoPrincipal platoPrincipal = new PlatoPrincipal();
        platoPrincipal.setNombre("Bandeja 3 Carnes");
        platoPrincipal.setTamaño("Medio");
        combo.setPlatoPrincipal(platoPrincipal);
    }

    @Override
    public void buildAcompañamiento() {
        Acompañamiento acompañamiento = new Acompañamiento();
        acompañamiento.setNombre("Ensalada Al Gusto");
        acompañamiento.setTamaño("Medio");
        combo.setAcompañamiento(acompañamiento);
    }

    @Override
    public void buildBebida() {
        Bebida bebida = new Bebida();
        bebida.setTamaño("Grande");
        bebida.setNombre("Jugo Al Gusto");  
        combo.setBebida(bebida);
    }

    @Override
    public void buildPostre() {
        Postre postre = new Postre();
        postre.setNombre("Torta Del Dia");  
        postre.setTamaño("Medio");
        combo.setPostre(postre);
    }    
}
