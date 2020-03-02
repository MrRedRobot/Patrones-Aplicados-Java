package Clases;

import Abstract.FabricaAbstracta;
import Abstract.PlatilloAbstracto;
import Abstract.PostreAbstracto;

/**
 *
 * @author DAv_O
 */
public class FabricaEstandar extends FabricaAbstracta {

    @Override
    public PlatilloAbstracto crearPlatillo(String nombre) {
        return new PlatilloEstandar(nombre);
    }

    @Override
    public PostreAbstracto crearPostre(String nombre) {
        return new PostreEstandar(nombre);
    }

}
