package Module_3_java;

public class Main_builders {
    public static void main(String[] args) {
        new builders("Luis");
        builders c = new builders();
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.salary);
    }
}
