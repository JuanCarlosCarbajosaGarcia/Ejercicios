import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array: ");
        int n=sc.nextInt();

        double[] nota = new double[n];

        for (int i =0;i<n;i++){
            System.out.println("notas: ");
            nota[i] = sc.nextDouble();
        }

        int suma=0;
        for (int i =0;i<n;i++){
            suma+=media+suma/n;
        }
        System.out.println("media: " + media);

        double min=Double.MIN_VALUE;
        for (int i =0;i<n;i++){
            if (nota[i]<min){
                min=nota[i];
            }
        }

        double max=Double.MAX_VALUE;
        for (int i =0;i<n;i++){
            if (nota[i]<max){
                max=nota[i];
            }
        }

        for (int i =0;i< nota.length; i++){
            if (nota[i]>=5){
                apro++;
            }
        }
        System.out.println(apro + " " + n);

        double porcen = (double)(apro*100/n);
        System.out.println("aprobados: " + porcen + "%");
    }
}
