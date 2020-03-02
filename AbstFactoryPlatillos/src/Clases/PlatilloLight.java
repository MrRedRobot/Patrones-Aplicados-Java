package Clases;

import Abstract.PlatilloAbstracto;

/**
 *
 * @author DAv_O
 */
public class PlatilloLight extends PlatilloAbstracto {

    public PlatilloLight(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
