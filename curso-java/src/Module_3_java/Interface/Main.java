package Module_3_java.Interface;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.stop();
        computer.teste();

        int x = Teste.x;
        int y = Machine.y;
        System.out.println(x+ " " +y);
    }
}
