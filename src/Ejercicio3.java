import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisores = 0;
        int formula = 0;

        System.out.println("Ingrese el numero: ");
        int numero = sc.nextInt();

        if (numero != 0){
            for (int i = 1; i <= numero; i++){
                for (int j = 2; j <= (i/2); j++){
                    if (i % j == 0){
                        divisores++;
                    }
                }
            }
        }
        if (divisores == 0){
            System.out.println("El numero " + numero + " es primo");
        }else  {
            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
