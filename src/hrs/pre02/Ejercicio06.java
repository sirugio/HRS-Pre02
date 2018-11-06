package hrs.pre02;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] agrs) {
        int num, total, contador;
        total = 0;
        contador = 0;

        Scanner sc = new Scanner(System.in);
        /*
        do {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            
            total = total + num;
            contador++;
        } while (total <= 77);
        */
        
        while (total <= 77) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            
            total = total + num;
            contador++;
        }

        System.out.println("La suma total es " + total);
        System.out.println("Has introducido " + contador + " numeros");
    }
}
