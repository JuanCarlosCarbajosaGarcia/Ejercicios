import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        boolean leer = false;

        System.out.println("Ingrese el numbre del fichero: ");
        String archivo = sc.nextLine();
        leer = true;

        while (leer) {
                try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
                    String linea = lector.readLine();

                    while (linea != null) {
                        System.out.println(linea);
                        contador++;

                        linea = lector.readLine();
                    }

                    System.out.println("el fichero contiene: " + contador + " lineas");
                    leer = false;
                } catch (FileNotFoundException e) {
                    System.out.println("error el localizar el archivo: " + e.getMessage());
            } catch (Exception e) {
                    System.out.println("error" + e.getMessage());
                }
        }
    }
}
