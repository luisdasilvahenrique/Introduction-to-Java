package Module_1_java;

public class Continue_and_break {
    public static void main(String[] args) {
        // Continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----");

        // Break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("-----");
        int a = 0;
        do {
            System.out.println("a: " + a);
            a++;
            if (a == 3) {
                break;
            }
        } while (a < 10);
    }
}
