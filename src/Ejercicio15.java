import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner lis = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la lista");
        int lista = lis.nextInt();
        int n;

        System.out.println("introduce numeros: ");
        while (num.size() < lista){
            n = sc.nextInt();
            num.add(n);
        }

        System.out.println("lista original: ");
        System.out.println(num);

        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()){
            if(iterator.next() <0){
                iterator.remove();
           }
        }

        System.out.println("lista final: ");
        for(int i=0;i<num.size();i++){
            System.out.println(" " +  num.get(i));
        }
    }
}
