package Module_3_java.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        polimorfismo(b);
        System.out.println(b.name);
    }

    private static void polimorfismo(Base a) {
        a.name = "João";
    }

}
