package module_1_java;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("--------------");
        int j = 10;
        while (j > 0) {
            System.out.println("j = " + j);
            j -= 2;
        }
        System.out.println("--------------");
        int k = 10;
        while (k > 0) {
            System.out.println("k = " + k);
            k -= 4;
        }
    }
}
