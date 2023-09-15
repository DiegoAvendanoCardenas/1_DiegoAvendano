
package PaquetePrincipal;
import Paquete1.clase1;
import Paquete1.clase2;

import Paquete2.clase3;
import Paquete2.clase4;


public class Main {
    public static void main(String[] args) {
        clase1 objC01 = new clase1();
        clase2 objC02 = new clase2();
        clase3 objC03 = new clase3();
        clase4 objC04 = new clase4();
       
        
       //Paquete 01
       
       objC02.b = "hola";
       
       //Paquete 02
       objC03.a = "hola 2";
       
       
       
        
        
    }
}
