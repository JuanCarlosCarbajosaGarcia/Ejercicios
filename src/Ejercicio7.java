import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("tamaño del array: ");
        int n=sc.nextInt();

        int[] numeros = new int[n];
        int suma=0;

        for(int i=0;i<n;i++){
            numeros[i]=rand.nextInt(100)+1;
            suma+=numeros[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(numeros[i] + " ");
        }

        double media= suma / n;
        System.out.println();
        System.out.println("media: " + media);

        int nMayores=0;

        for(int i=0;i<n;i++){
            if(numeros[i]>media){
                nMayores++;
            }
        }
        System.out.println("numeros mayores" + nMayores);
    }
}
