import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese el numbre del fichero: ");
        String archivo = sc.nextLine();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            String linea = lector.readLine();

            while (linea!=null){
                System.out.println(linea);
                contador++;

                linea = lector.readLine();
            }

            System.out.println("el fichero contiene: "+contador+" lineas");
        }catch (Exception e){
            System.out.println("error al leer: "+e.getMessage());
        }
    }
}
