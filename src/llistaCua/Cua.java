package llistaCua;

import javax.swing.JOptionPane;

public class Cua {

    private NodeIntCua iniciCua, finalCua;
    private int t;
    private String cua = "";

    public Cua() {
        iniciCua = null;
        finalCua = null;
    }

    //Mètode per a saber si la cua està buida
    public boolean CuaBuida() {
        return iniciCua == null;
    }

    //Mètode per a entrar a la cua
    public void EntrarCua(int valor) {
        NodeIntCua nou_node = new NodeIntCua();
        nou_node.informacio = valor;
        nou_node.seguent = null;

        if (CuaBuida()) {
            iniciCua = nou_node;
            //En aquest cas l'inici i el final de la cua és el primer i únic, ja ques'acava de crear el primer
            finalCua = iniciCua;
        } else {
            finalCua.seguent = nou_node;
            finalCua = nou_node;
        }
    }

    //Mètode per a extreure de la cua
    public int Extreure() {
        if (!CuaBuida()) {
            int aux = iniciCua.informacio;

            if (iniciCua == finalCua) {
                finalCua.seguent = null;
                iniciCua.seguent = null;
            } else {
                iniciCua = iniciCua.seguent;

            }
            return aux;

        } else {
            return Integer.MAX_VALUE;
        }
    }

    //Mètode per a mostrar el contingut de la cua
    public void MostrarCua() {
        NodeIntCua recorregut = iniciCua;
        String cuaInvertida = "";

        while (recorregut != null) {
            cua += recorregut.informacio + " ";
            recorregut = recorregut.seguent;
        }

        String cadena[] = cua.split(" ");

        for (int i = cadena.length - 1; i >= 0; i--) {
            cuaInvertida += " " + cadena[i];
        }

        JOptionPane.showMessageDialog(null, cuaInvertida);
        cua = "";
    }

    public void Eliminar1() {
        if (!CuaBuida()) {
            int temporal = iniciCua.informacio;

            if (iniciCua == finalCua) {
                iniciCua.seguent = null;
                finalCua.seguent = null;
            } else {
                iniciCua = iniciCua.seguent;
            }

            JOptionPane.showMessageDialog(null, "El valor eliminat ha sigut: " + temporal);
        } else {
            JOptionPane.showMessageDialog(null, "La cua està buida.");
        }
    }
    
    public void EliminarTotaCua(){
        while(!CuaBuida()){
            Extreure();
        }
        JOptionPane.showMessageDialog(null, "S'ha borrat tota la cua correctament");
    }
    
    
}
