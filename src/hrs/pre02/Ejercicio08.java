package hrs.pre02;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aleatorio = (int) Math.round(Math.random() * 100);
        int introducido;
        //int aleatorio2 = (int) (Math.random() * 100);

        do {
            System.out.print("Introduzca un número entre 0 y 100: ");
            introducido = in.nextInt();
            
            if (introducido < aleatorio) {
                System.out.println("El número que buscamos es mayor que " + introducido);
            } else
                System.out.println("El número que buscamos es menor que " + introducido);
        } while (introducido != aleatorio);
        
        System.out.println("Bien hecho, el número es: " + aleatorio);
    }
}

