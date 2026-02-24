public class Ejercicio1 {
    public static void main(String[] args) {
        int contador = 0;

        for (int i = 1; i <= 200; i++){
            if ((i%3==0)||(i%5==0)){
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("has encontrado " + contador + " numeros");
    }
}