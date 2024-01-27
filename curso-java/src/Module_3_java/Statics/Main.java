package Module_3_java.Statics;

public class Main {
    public static void main(String[] args) {
        System.out.println(Static_methods.count);
        for (int i = 0; i < 10; i++) {
            Static_methods.count++;
        }
        System.out.println(Static_methods.count);
        new Static_methods();
        new Static_methods();
        new Static_methods();
        System.out.println(Static_methods.count);

        System.out.println(Static_methods.message());
        Static_methods.message_two();
    }
}
