package hrs.pre02;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int i;
        double num;
        double suma;
        double media;
        
        suma = 0;

        for (i = 0; i < 5; i++) {
            System.out.print("Introduzca un número: ");
            num = in.nextDouble();
            
            suma += num;
        }
        
        media = suma / 5;
        
        System.out.println("La media es " + media);
        
        //System.out.println("Los número introducidos son: " + num);
    }
}
