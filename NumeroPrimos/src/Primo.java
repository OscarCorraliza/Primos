import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Entre cuantos hilos quiere hacer el proceso?");
        int numeroHilos = teclado.nextInt();

        int incrementoBucle = 100000/numeroHilos;
        int principio = 0;
        int fin = incrementoBucle;

        for (int x = 1; x<=numeroHilos; x++){
            Hilo hilo = new Hilo(principio, fin);
            hilo.start();

            principio = incrementoBucle * x;
            fin = principio + incrementoBucle;
        }
    }
}
