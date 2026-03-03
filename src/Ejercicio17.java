import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        ArrayList<String> nomb = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner lis = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la lista");
        int list = lis.nextInt();
        String nom;

        while (nomb.size() < list){
            System.out.print("Introduce nombre: ");
            nom = sc.nextLine();
            nomb.add(nom);
        }

        System.out.print("introducir nombre a buscar: ");
        sc.nextLine();
        String buscar = sc.nextLine();

        if (nomb.contains(buscar)){
            System.out.println("el nombre existe");
            for (int i=0; i<nomb.size();i++){
                if (nomb.get(i).equals(buscar)){
                    System.out.println("posicion " + i + " " + nomb.get(i));
                }
            }
        }
    }
}
