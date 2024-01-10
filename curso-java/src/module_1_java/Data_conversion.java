package module_1_java;

public class Data_conversion {
    public static void main(String[] args) {
        String number = "1234";
        System.out.println(Integer.parseInt(number));
        System.out.println(Double.parseDouble(number));
        System.out.println(Float.parseFloat(number));
        System.out.println(Long.parseLong(number));
        System.out.println(Short.parseShort(number));
        System.out.println("----------------------------");
        int number2 = 1234;
        System.out.println(Integer.toString(number2));
        System.out.println(Double.toString(number2));
        System.out.println(Float.toString(number2));
        System.out.println(Long.toString(number2));

    }
}
