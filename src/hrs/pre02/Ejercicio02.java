package hrs.pre02;
import java.util.Scanner;
public class Ejercicio02 {
    public static void main (String[] agrs){
    Scanner in = new Scanner (System.in);
    int num;
        System.out.print("Esriba un número: ");
        num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else
            System.out.println("El número " + num + " es impar.");    
    }
}