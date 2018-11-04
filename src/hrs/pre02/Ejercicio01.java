
package hrs.pre02;
import java.util.Scanner;
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int edad;
        
        System.out.print("Hola, introduce tu edad: ");
        edad = in.nextInt();
        if ((edad < 0) || (edad > 120)) {
            System.out.print("Error.");
            } else if (edad < 18) {
                System.out.println("Eres menor de edad.");
            } else
                System.out.println("Eres mayor de edad");
    }
}

