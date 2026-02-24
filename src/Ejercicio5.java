import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bien = "contra";
        String contra;
        boolean correcto = false;
        int maxintentos = 3;
        int contador = 0;

        while((contador<maxintentos) && (!correcto)) {

            System.out.println("intentos restantes: " + (maxintentos-contador));
            System.out.println("ingrese la contraseña:");
            contra = sc.nextLine();
            if (contra.equals(bien)) {
                System.out.println("contraseña correcta");
                correcto = true;
            }else {
                System.out.println("contraseña incorrecta");
                contador ++;
            }
        }
        if (contador == maxintentos) {
            System.out.println("acceso denegado intentos agotados");
        }else {
            System.out.println("acceso permitido");
        }
        sc.close();
    }
}