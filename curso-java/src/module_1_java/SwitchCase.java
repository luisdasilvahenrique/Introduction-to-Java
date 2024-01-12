package module_1_java;

public class SwitchCase {
    public static void main(String[] args) {
        String cargo = "Trainee";
        switch (cargo){
            case "Gerente":
                System.out.println("O salário é de R$ 10.000,00");
                break;
            case "Supervisor":
                System.out.println("O salário é de R$ 8.000,00");
                break;
            case "Atendente":
                System.out.println("O salário é de R$ 5.000,00");
                break;
            default:
                System.out.println("Cargo não encontrado");
        }
    }
}
