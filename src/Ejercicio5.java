import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bien = "contra";
        String contra;
        int intentos = 0;

        while(intentos!=3){

            System.out.println("ingrese la contraseña:");
            contra = sc.nextLine();
            if (contra.equals(bien)) {
                System.out.println("contraseña correcta");
                break;
            }else {
                System.out.println("contraseña incorrecta");
                intentos ++;
            }
        }
        if (intentos==3){
            System.out.println("acceso denegado");
            System.exit(0);
        }
    }
}