package Module_3_java.Interface;

public class Computer implements Machine, Teste {

    @Override
    public void start() {
        System.out.println("Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }

    @Override
    public void teste() {
        System.out.println("Computador realizando teste...");
    }
}
