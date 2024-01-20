package Module_2_java;

import java.util.Scanner;

public class Data_ready {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("The name is: " + name);

        System.out.println("---------------------------------");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("The age is: " + age);
    }
}
