package Module_3_java;

public class Multiple_Instances {
    public static void main(String[] args) {
        // Multiple instances
        Attributes_and_Methods attri_and_method1 = new Attributes_and_Methods();
        Attributes_and_Methods attri_and_method2 = new Attributes_and_Methods();
        Attributes_and_Methods attri_and_method3 = new Attributes_and_Methods();

        System.out.println(attri_and_method1.name);
        System.out.println(attri_and_method2.name);
        System.out.println(attri_and_method3.name);
    }
}
