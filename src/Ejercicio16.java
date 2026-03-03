import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        ArrayList<Integer> nume = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner lis = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la lista");
        int lista = lis.nextInt();
        int n;

        while (nume.size() < lista){
            System.out.print("numero: ");
            n = sc.nextInt();
            nume.add(n);
        }

        System.out.println("lista antes de ordenar: ");
        System.out.println(nume);

        System.out.println("lista ordenar: ");
        Collections.sort(nume);
        System.out.println(nume);
    }
}
