package Builder;

/**
 *
 * @author DAv_O
 */
public class BuilderComboInfantil extends BuilderCombo {

    @Override
    public void buildPlatoPrincipal() {
        PlatoPrincipal platoP = new PlatoPrincipal();
        platoP.setNombre("Hamburguesa Al Gusto");
        platoP.setTamaño("mediano");
        combo.setPlatoPrincipal(platoP);
    }

    @Override
    public void buildAcompañamiento() {
        Acompañamiento acompañamiento = new Acompañamiento();
        acompañamiento.setNombre("Nuggets De Pollo");
        acompañamiento.setTamaño("Medio");
        combo.setAcompañamiento(acompañamiento);
    }

    @Override
    public void buildBebida() {
        Bebida bebida = new Bebida();
        bebida.setNombre("Coca-Cola");
        bebida.setTamaño("Pequeño");
        combo.setBebida(bebida);
    }

    @Override
    public void buildPostre() {
        Postre postre = new Postre();
        postre.setNombre("Helado De La Casa");
        postre.setTamaño("Grande");
        combo.setPostre(postre);
    }
}
