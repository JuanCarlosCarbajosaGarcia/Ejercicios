import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean fina=false;

        while (!fina){

            System.out.println("Introduce el nombre(fin para terminar): ");
            String name = sc.nextLine();

            if (name.equals("fin")){
                fina=true;
            }else {
                nombres.add(name);
            }
        }
        for (int i=0; i < nombres.size(); i++){
            System.out.println((i+1) + " " + nombres.get(i));
        }
    }
}
