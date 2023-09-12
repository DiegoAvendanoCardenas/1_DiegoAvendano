
package Operacion;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        int  a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int  b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        S07_calculadora1 objCalculadora = new S07_calculadora1();
    
        
        objCalculadora.sumar(a, b);
        objCalculadora.resta(a, b);
        objCalculadora.multiplicacion(a, b);
        objCalculadora.divicion(a, b);
    }
}
