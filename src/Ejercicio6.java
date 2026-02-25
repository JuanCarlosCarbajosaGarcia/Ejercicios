import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n╔════════════════════════════");
            System.out.println("║             MENÚ           ");
            System.out.println("╠════════════════════════════");
            System.out.println("║1.numeros del 1 al 10       ");
            System.out.println("║2.numeros pares del 1 al 20 ");
            System.out.println("║3.salir                     ");
            System.out.println("║escriva una opcion:         ");
            System.out.println("╚════════════════════════════");
            String opc= sc.nextLine();

            switch (opc) {
                case "1":
                    System.out.println("\n╔════════════════════════════");
                    System.out.println("║            Numeros         ");
                    System.out.println("╠════════════════════════════");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("║" + i);
                    }
                    System.out.println("╚════════════════════════════");
                    break;
                case "2":
                    System.out.println("\n╔════════════════════════════");
                    System.out.println("║            Pares           ");
                    System.out.println("╠════════════════════════════");
                    for(int i=2; i<=20;i+=2){
                        System.out.println("║" + i);
                    }
                    System.out.println("╚════════════════════════════");
                    break;
                case "3":
                    System.out.println("adios");
                    salir=true;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        sc.close();
    }
}
