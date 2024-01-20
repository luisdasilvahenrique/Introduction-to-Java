package Module_2_java;

import java.util.Scanner;

public class Data_matriz_ready {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Insert the number of columns: ");
        int columns = sc.nextInt();

        int[][] matriz = new int[rows][columns];
        System.out.println("Insert the values of the matriz: ");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j <columns; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz ready!");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j <columns; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
