package Module_2_java;

public class Throw{
    float division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return (float) a / b;
        }
    }
    public static void main(String[] args) {
        Throw obj = new Throw();
        try {
            System.out.println(obj.division(14, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
