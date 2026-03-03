import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Random ran = new Random();
        int n;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("numeros.txt"))){
            int aleatorio=(int)(Math.random()*10000);
            for (int i =0; i<aleatorio ;i++){
                n=ran.nextInt(10000)+1;
                writer.write(n + " ");
                writer.newLine();
            }
        }catch(Exception e){
            System.out.println("error" + e.getMessage());
        }

    }
}
