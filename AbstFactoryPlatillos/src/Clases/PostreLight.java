package Clases;

import Abstract.PostreAbstracto;

/**
 *
 * @author DAv_O
 */
public class PostreLight extends PostreAbstracto {

    public PostreLight(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
