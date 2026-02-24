import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int formula = 0;

        System.out.println("Ingrese el numero: ");
        int numero = sc.nextInt();

        if (numero != 0){
            for (int i = 1; i <= numero; i++) {
                suma+=i;
            }
            System.out.println("Sumando: " + suma);

            formula = numero * (numero + 1) / 2;
            System.out.println("Formula: " + formula);
        }else {
            System.out.println("el numero deve ser mayor que 0");
        }
    }
}
