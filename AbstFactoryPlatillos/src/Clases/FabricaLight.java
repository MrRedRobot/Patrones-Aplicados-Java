package Clases;

import Abstract.FabricaAbstracta;
import Abstract.PlatilloAbstracto;
import Abstract.PostreAbstracto;

/**
 *
 * @author DAv_O
 */
public class FabricaLight extends FabricaAbstracta{

    @Override
    public PlatilloAbstracto crearPlatillo(String nombre) {
        return new PlatilloLight(nombre);
    }

    @Override
    public PostreAbstracto crearPostre(String nombre) {
        return new PostreLight(nombre);
    }
    
}
