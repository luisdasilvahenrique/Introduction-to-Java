package Module_1_java;

public class vectors_letters_and_names {
    public static void main(String[] args) {
        String[] names = {"Juan", "Pedro", "Maria", "Jose", "Luis", "Ana", "Luisa", "Carlos", "Jorge", "Javier"};
        char[] letters = {'J', 'P', 'M', 'J', 'L', 'A', 'L', 'C', 'J', 'J'};
        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'J') {
                count++;
            }
        }

        System.out.println("The number of names that start with the letter J is: " + count);

        System.out.println("-------------------------------------");

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > 5) {
                System.out.println(names[i]);
            }
        }
    }
}
