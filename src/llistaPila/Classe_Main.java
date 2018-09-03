package llistaPila;

import javax.swing.JOptionPane;

public class Classe_Main {

    public static void main(String[] args) {
        int opcio = 0, node = 0;
        Pila pila = new Pila();

        do {
            try {

                opcio = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\nMissatge\n 1. Introduir node\n 2. Eliminar un node\n 3.La pila està buida?\n 4.Quin és l'ultim valor introduit a la pila?\n 5.Cuantos nodos tiene la pila?\n 6.Buidar pila\n 7.Mostrar contingut de la pila\n 8.Sortir\n\n"));

                switch (opcio) {
                    case 1:
                        node=Integer.parseInt(JOptionPane.showInputDialog(null, "Siusplau, introdueix el valor a guardar al node: "));
                        pila.IntroduirNode(node);
                        break;
                    case 2:
                        if (!pila.PilaBuida()) {
                            JOptionPane.showMessageDialog(null, "S'ha eliminat un node amb el valor: "+pila.EliminarNode());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila està buida");
                        }
                        
                        break;
                    case 3:
                        if(pila.PilaBuida()){
                            JOptionPane.showMessageDialog(null, "La pila està buida");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no està buida");
                        }
                        
                        break;
                    case 4:
                        if(!pila.PilaBuida()){
                            JOptionPane.showMessageDialog(null, "L'ultim valor introduit és: "
                            + pila.MostrarUltimValorIntroduit());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila està buida");
                        }
                        
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila conté: "+pila.MidaPila()+" nodes.");
                        
                        break;
                    case 6:
                        if(!pila.PilaBuida()){
                            pila.BuidarPila();
                            JOptionPane.showMessageDialog(null, "La pila s'ha buidat");
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no es pot buidar, ja que està buida");
                        }
                        
                        break;
                    case 7:
                        if(!pila.PilaBuida()){
                            pila.MostrarValors();
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila està buida");
                        }
                        break;
                    case 8:
                        opcio = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opció incorrecta");
                        break;

                }

            } catch (NumberFormatException e) {

            }

        } while (opcio != 8);
    }

}
