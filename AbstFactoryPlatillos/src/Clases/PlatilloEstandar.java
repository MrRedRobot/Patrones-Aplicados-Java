package Clases;

import Abstract.PlatilloAbstracto;

/**
 *
 * @author DAv_O
 */
public class PlatilloEstandar extends PlatilloAbstracto {

    public PlatilloEstandar(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
