import Module_3_java.Attributes_and_Methods;

public class Main {
    public static void main(String[] args) {
        Attributes_and_Methods attri_and_Metho = new Attributes_and_Methods();
        System.out.println("O seu nome é: " + attri_and_Metho.name);
        System.out.println("A sua idade é: " + attri_and_Metho.age  + " anos");
        System.out.println("----------------------------------");
        attri_and_Metho.speak();
    }
}