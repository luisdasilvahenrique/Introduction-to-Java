package Module_3_java.Statics;

 public class Static_methods {
    protected static int count = 0;
    public void Static(){
        count++;
    }
    public static String message(){
        return ("What´s your name?");
    }
    public static void message_two(){
        System.out.println("Testando metodo void");
    }
}
