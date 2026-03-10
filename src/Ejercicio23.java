import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double resultado=0;
        boolean calcular = true;

        while (calcular==true){
            try {
                System.out.println("Ingresa el valor de a: ");
                a = sc.nextInt();
                System.out.println("Ingresa el valor de b: ");
                b = sc.nextInt();
                resultado= a /b;
                calcular=false;
            }catch(ArithmeticException e) {
                System.out.println("Error operacion no valida");
                sc.nextLine();
            }
        }
        System.out.println("resultado es: " + resultado);
        sc.close();
    }
}
