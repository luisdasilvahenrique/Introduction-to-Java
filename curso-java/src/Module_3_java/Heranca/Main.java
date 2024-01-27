package Module_3_java.Heranca;

public class Main {
    public static void main(String[] args) {
        Operario op = new Operario();
        op.name = "João";
        op.salary = 1000.0f;
        op.age = 20;
        op.bonus = 300f;
        op.horaExtra(5, 2);
        System.out.println("O ganho mensal do "+ op.name +" é de R$ "+ op.salary +" e seu bônus é de R$"+ (op.salary+op.bonus+ op.horaExtra(5,2))+".");
    }
}
