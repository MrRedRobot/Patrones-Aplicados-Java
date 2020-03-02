package Clases;

import Abstract.PostreAbstracto;

/**
 *
 * @author DAv_O
 */
public class PostreEstandar extends PostreAbstracto {

    public PostreEstandar(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
