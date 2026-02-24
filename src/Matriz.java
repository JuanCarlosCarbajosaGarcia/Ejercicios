public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {{8,2,3},{3,5,8},{1,2,3}};
        int suma = 0;

        for(int i = 0; i <= matriz.length-1; i++){
            for(int j = 0; j <= matriz[i].length-1; j++){
                if (i==j){
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("la suma es: " + suma);
    }
}
