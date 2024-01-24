package Module_1_java;

public class Functions_Java {
    public static void main(String[] args) {
        new Functions_Java().print(); // chamando a função print

        new Functions_Java().print("Luís"); // chamando a função print com parâmetros

        String x = new Functions_Java().finish(); // chamando a função finish
        System.out.println(x);

        String i = new Functions_Java().start("da corrida"); // chamando a função start com parâmetros
        System.out.println(i);
    }

    // With return - return type, name, parameters
    String finish() { // função com retorno e sem parâmetros
        return "Fim";
    }

    String start(String text) { // função com retorno e com parâmetros
        return "Início " + text;
    }

    // No return - void, name, parameters
    void print() { // função sem retorno e sem parâmetros
        System.out.println("Hello World");
    }

    void print(String text) { // função sem retorno e com parâmetros
        System.out.println("Olá " + text + "!");
    }
}



