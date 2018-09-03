package llistaPila;

public class PilaExercici2 {

    private NodeCharPila UltimCharIntroduit;

    public PilaExercici2() {
        UltimCharIntroduit = null;
    }

    //Mètode per a introduir caràcter dins la pila
    public void Introduir(char caracter) {
        NodeCharPila nou_node = new NodeCharPila(caracter);
        nou_node.informacio = caracter;

        if (UltimCharIntroduit == null) {
            nou_node.seguent = null;
            UltimCharIntroduit = nou_node;

        } else {
            nou_node.seguent = UltimCharIntroduit;
            UltimCharIntroduit = nou_node;
        }

    }

    //Mètode per a extreure de la pila
    public char Extrure() {
        if (UltimCharIntroduit != null) {

            char aux = UltimCharIntroduit.informacio;
            UltimCharIntroduit = UltimCharIntroduit.seguent;
            return aux;

        } else {
            return Character.MAX_VALUE;
        }

    }

    public boolean PilaBuida() {
        return UltimCharIntroduit == null;
    }
}
