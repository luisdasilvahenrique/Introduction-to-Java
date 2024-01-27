package Module_3_java.Heranca;

public class Funcionario {
    public String name;
    protected int age;
    protected float salary;
    protected float bonus;

    protected float horaExtra(int hora_e, int feriado){
        return (hora_e * 1.5f) + (feriado * 2.0f);
    }
}
