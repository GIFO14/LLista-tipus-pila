package llistaCua;

import javax.swing.JOptionPane;

public class MainClass {

    public static void main(String[] args) {

        int opcio = 0, node_informacio = 0;
        Cua cua = new Cua();

        do {
            try {
                opcio = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú d'opcions\n1. Introduir un node\n2. Extrure un node\n3. Mostrar contingut de la cua\n4. Eliminar node\n5. Eliminar tota la cua\n6. Sortir del programa\n\n"));

                switch (opcio) {
                    case 1:
                        node_informacio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introdueix un valor: "));
                        cua.EntrarCua(node_informacio);
                        break;
                    case 2:
                        if (cua.CuaBuida()) {
                            JOptionPane.showMessageDialog(null, "La cua està buida.");
                        } else {
                            JOptionPane.showInputDialog(null, " El valor extret ha sigut: " + cua.Extreure());
                        }

                        break;
                    case 3:
                        if (cua.CuaBuida()) {
                            JOptionPane.showMessageDialog(null, "La cua està buida.");
                        } else {
                            cua.MostrarCua();
                        }
                        break;
                    case 4:
                        cua.Eliminar1();
                        break;
                    case 5:
                        cua.EliminarTotaCua();
                        break;
                    case 6:
                        opcio=6;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Has introduït una opció incorrecte, torna a intentar-ho.");
                        break;
                }

            } catch (NumberFormatException e) {

            }

        } while (opcio != 6);
    }
}
