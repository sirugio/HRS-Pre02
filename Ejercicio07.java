package hrs.pre02;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        int num, cociente, resto;

        do {
            System.out.print("Introduzca un número positivo: ");
            num = in.nextInt();
            
            if (num < 0) {
                System.out.println("El numero tiene que ser positivo");
            }
        } while (num < 0);

        cociente = 0;
        resto = num;

        while (resto >= 3) {
            resto -= 3;
            cociente++;
        }

        System.out.println(num + " entre 3: cociente: " + cociente + ", resto: " + resto);
    }
}
