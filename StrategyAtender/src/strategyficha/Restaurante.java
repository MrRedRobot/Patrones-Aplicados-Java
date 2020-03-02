package strategyficha;

import javax.swing.JOptionPane;

/**
 *
 * @author dav_o
 */
public class Restaurante {

    public AtenderStrategy[] mesas;
    public AtenderStrategy[] banquetes;
    public int nMesas = 0;
    public int nBanquetes = 0;

    public Restaurante() {
        mesas = new MesaStrategy[10];
        banquetes = new BanqueteStrategy[10];
    }

    public void atenderCliente(String tipo, int numeroLugar) {

        if (null != tipo) switch (tipo) {
            case "B":
                banquetes[numeroLugar].tomarPedido();
                break;
            case "M":
                mesas[numeroLugar].tomarPedido();
                break;
        }
    }

    public void asignarLugar(String tipo, int posicion, int nClientes) {

        if (tipo == "B") {

            if (nBanquetes < 10) {
                banquetes[nBanquetes] = new BanqueteStrategy(nClientes);
                banquetes[nBanquetes].asignarLugar(posicion);
                nBanquetes++;
            } else {
                JOptionPane.showMessageDialog(null, "LUGARES PARA BANQUETE LLENOS...");
            }

        } else if (tipo == "M") {
            if (nMesas < 10) {
                mesas[nMesas] = new MesaStrategy(nClientes);
                mesas[nMesas].asignarLugar(posicion);
                nMesas++;
            } else {
                JOptionPane.showMessageDialog(null, "MESAS LLENAS...");
            }
        }
    }
    

}
