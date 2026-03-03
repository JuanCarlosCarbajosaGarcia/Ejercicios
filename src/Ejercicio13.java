import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random ramd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el tamaño:");
        sc.nextLine();
        int tam = sc.nextInt();

        int[][] mat= new int[tam][tam];

        int id=0;
        int jd=0;
        while (id<tam){
            jd=0;
            while(jd<tam){
                System.out.println(mat[id][jd]+" ");
                jd++;
            }
            System.out.println();
            id++;
        }


        System.out.println("introduce el contenido de la matriz:");
        for (int im = 0; im < tam; im++) {
            for (int jm = 0; jm < tam; jm++) {
                System.out.println("posicion [" + im + "][" + jm + "]");
                mat[im][jm]=ramd.nextInt(100)+1;
            }
            System.out.println();
        }

        System.out.println("matriz creada");
        for (int im = 0; im < tam; im++) {
            for (int jm = 0; jm < tam; jm++) {
                System.out.println(mat[im][jm]+" ");
            }
            System.out.println();
        }
        boolean esSimetrico = true;

        for (int im=0;im<tam && esSimetrico;im++){
            for (int jm=0;jm<tam;jm++){
                if (mat[im][jm]!=mat[jm][im]){
                    esSimetrico=false;
                }
            }
        }

        if (esSimetrico){
            System.out.println("el contenido de la matriz es simetrico");
        }else {
            System.out.println("el contenido de la matriz no es simetrico");
        }
    }
}
