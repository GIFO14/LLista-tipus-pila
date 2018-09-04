package Recursivitat_Factorial;

import java.util.Scanner;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

public class Recursivitat_FactorialMainClass {

    private static int check = 0, n,x=0;;
    private static String cadena = "";

    public static void Imprimir1(int n) {
        if (n > 0) {
            
            if (check == 0) {
                x = n * (n - 1);
                cadena = "\nEl nombre factorial de " + n + "= "+n+"*";
            }else{
                x = x * (n - 1);
            }
            
            n--;
            if (n!=1) {
                cadena += n + "*";
            } else {
                cadena += n+" = "+x;
            }
            
            check++;
            if (n == 1) {
                JOptionPane.showMessageDialog(null,cadena);
            }
            Imprimir1(n);
        }
    }
    
    public static int Imprimir2(int n){
        if(n>0){
            int x=n*Imprimir2(n-1);
            return  x;
        }
        return 1;
    }
    
    public static void main(String[] args) {

        n=Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscriu un nombre del qual vulguis saver el seu factorial: \n"));
        Imprimir1(n);
        /*int factorial=Imprimir2(n);
        JOptionPane.showMessageDialog(null, "El factorial de "+n+" es "+factorial);*/

    }
}
