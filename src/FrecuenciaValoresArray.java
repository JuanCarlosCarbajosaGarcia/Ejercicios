import java.util.ArrayList;
import java.util.Scanner;

public class FrecuenciaValoresArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> frecuencia = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int tamano = 9;

        for (int i = 0; i <= tamano; i++) {
            numeros.add(i);
        }

        System.out.print("numero a revisar: ");
        int n = sc.nextInt();

        if (numeros.contains(n)) {
            System.out.println("numero: " + numeros.get(n));
        }
    }
}
