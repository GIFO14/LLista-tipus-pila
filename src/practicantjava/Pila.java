package practicantjava;

import javax.swing.JOptionPane;

public class Pila {

    private Node UltimValorIntroduit;
    int mida = 0;
    String llista = "";

    public Pila() {
        UltimValorIntroduit = null;
        mida = 0;
    }

    //Mètode per mirar si la pila està buida
    public boolean PilaBuida() {
        return UltimValorIntroduit == null;
    }

    //Mètode per a introduir un node a la pila
    public void IntroduirNode(int node) {
        Node nou_node = new Node(node);
        nou_node.seguent = UltimValorIntroduit;
        UltimValorIntroduit = nou_node;
        mida++;
    }

    //Mètode per a Eliminar un node
    public int EliminarNode() {
        int auxiliar = UltimValorIntroduit.informacio;
        UltimValorIntroduit = UltimValorIntroduit.seguent;
        mida--;
        return auxiliar;
    }

    //Mètode per a conèixer quin és l'últim valor ingressat
    public int MostrarUltimValorIntroduit() {
        return UltimValorIntroduit.informacio;
    }

    //Mètode per a mmostrar mida  de la pila
    public int MidaPila() {
        return mida;
    }

    //Mètode per a buidar la pila
    public void BuidarPila() {
        while (!PilaBuida()) {
            EliminarNode();
        }
    }

    //Mètode per a mostrar contingut de la pila
    public void MostrarValors() {
        Node recorregut = UltimValorIntroduit;

        while (recorregut != null) {
            llista += recorregut.informacio + "\n";
            recorregut = recorregut.seguent;

        }
        JOptionPane.showMessageDialog(null, llista);
        llista = "";
    }

}
