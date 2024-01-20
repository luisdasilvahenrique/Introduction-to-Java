package Module_2_java;

import java.util.Scanner;

public class Data_vectors_ready {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the length of the vector: ");

        int[] vector = new int[scanner.nextInt()];
        System.out.print("Insert the values of the vector: ");
        for (int i = 0; i < vector.length; i++){
            vector[i] = scanner.nextInt();
        }
        System.out.println("The vector is: ");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i]+ " ");
        }
        scanner.close();
    }
}
