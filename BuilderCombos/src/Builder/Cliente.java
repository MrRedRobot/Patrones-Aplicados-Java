package Builder;

import javax.swing.JOptionPane;

/**
 *
 * @author DAv_O
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean cerrar = false;
        String tipoCombo;
        DirectorCocina director = new DirectorCocina();
        Combo combo;

        while (cerrar == false) {
            System.out.println("-------------------------");
            System.out.println("BIENVENIDO AL RESTAURANTE");
            System.out.println("_________________________");

            tipoCombo = JOptionPane.showInputDialog(null, "Tipo De Combo: (1)Premium (2)Infantil: ");

            switch (tipoCombo) {
                case "1":

                    director.setBuilderCombo(new BuilderComboPremium());
                    director.prepararCombo();
                    combo = director.getCombo();
                    System.out.println("PREPARADO COMBO PREMIUM");
                    System.out.println("PLATO PRINCIPAL: " + (combo.getPlatoPrincipal().getNombre())
                            + "||  Tamaño: " + combo.getPlatoPrincipal().getTamaño());
                    System.out.println("ACOMPAÑAMIENTO: " + (combo.getAcompañamiento().getNombre())
                            + "||  Tamaño: " + combo.getAcompañamiento().getTamaño());
                    System.out.println("BEBIDA: " + (combo.getBebida().getNombre())
                            + "||  Tamaño: " + combo.getBebida().getTamaño());
                    System.out.println("POSTRE: " + (combo.getPostre().getNombre())
                            + "||  Tamaño: " + combo.getPostre().getTamaño());

                    break;

                case "2":

                    director.setBuilderCombo(new BuilderComboInfantil());
                    director.prepararCombo();
                    combo = director.getCombo();
                    System.out.println("PREPARADO COMBO INFANTIL");
                    System.out.println("PLATO PRINCIPAL: " + (combo.getPlatoPrincipal().getNombre())
                            + "||  Tamaño: " + combo.getPlatoPrincipal().getTamaño());
                    System.out.println("ACOMPAÑAMIENTO: " + (combo.getAcompañamiento().getNombre())
                            + "||  Tamaño: " + combo.getAcompañamiento().getTamaño());
                    System.out.println("BEBIDA: " + (combo.getBebida().getNombre())
                            + "||  Tamaño: " + combo.getBebida().getTamaño());
                    System.out.println("POSTRE: " + (combo.getPostre().getNombre())
                            + "||  Tamaño: " + combo.getPostre().getTamaño());
                    break;

                default:
                    System.out.println("Opcion NO Valida...");
                    break;
            }
            String exit = JOptionPane.showInputDialog("Nueva Orden: (1)SI (2)NO");
            cerrar = !"1".equals(exit);

        }

    }
}
