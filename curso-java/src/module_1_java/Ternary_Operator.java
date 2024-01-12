package module_1_java;

public class Ternary_Operator {
    String MaiorIdade(int idade){
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
    public static void main(String[] args) {
        int age = 15;
        new Ternary_Operator().MaiorIdade(age);
        System.out.println("A pessoa é: "+ new Ternary_Operator().MaiorIdade(age));
    }
}
