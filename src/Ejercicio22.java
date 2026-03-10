import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            System.out.print("ingrese un numero entero: ");
            int numero;
            try {
                numero = sc.nextInt();
                if (numero>0) {
                    System.out.println(numero + " es valido");
                    valido = true;
                }else  {
                    System.out.println(numero + " no es valido");
                }
            }catch (InputMismatchException e){
                System.out.println("numero invalido intente de nuevo");
                sc.nextLine();
            }
        }
        sc.close();
        System.out.println("gracias por su colaboracion ");
    }
}
