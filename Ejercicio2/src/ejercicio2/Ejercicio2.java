
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    
    private static double iva(double num){
        return num*1.21;
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        double precio;
        
        System.out.println("Introduce un precio:");
            precio = tec.nextInt();
            
        System.out.println("El precio introducido con iva es: " + iva(precio));
    }
    
}
