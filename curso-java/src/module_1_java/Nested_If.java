package module_1_java;

public class Nested_If {
    public static void main(String[] args) {
        int age = 16;
        int weight = 90;
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You can donate blood");
            } else {
                System.out.println("You can't donate blood");
            }
        } else {
            System.out.println("You can't donate blood");
        }
    }
}
