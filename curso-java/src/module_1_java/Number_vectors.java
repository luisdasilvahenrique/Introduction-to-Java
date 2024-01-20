package module_1_java;

public class Number_vectors {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
