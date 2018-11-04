
package hrs.pre02;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main (String[] agrs) {
        int num, i, factorial;
        factorial = 1;
        Scanner in = new Scanner (System.in);
        
        System.out.print("Introduzca un numero:");
        num = in.nextInt();
        for (i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial del número " + num + " es " + factorial);
}
}