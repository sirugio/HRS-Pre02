
package hrs.pre02;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main (String[] agrs) {
        Scanner in = new Scanner (System.in);
        int mes;
        System.out.print("Introduzca un mes en formato numérico del 1 al 12: ");
        mes = in.nextInt();
        if ((mes < 1) || (mes > 12)) {
            System.out.println("El número introducido no es correcto.");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28 días.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 30 días.");
        } else
            System.out.println("El mes tiene 31 días.");
    }    
}
