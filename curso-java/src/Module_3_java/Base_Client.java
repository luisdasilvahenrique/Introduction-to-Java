package Module_3_java;

public class Base_Client {
    String name;
    private int year;
    protected float salary= 1000;

    //get and set
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}

//public -> Não há restrição de acesso
//private -> Restrito ao escopo da classe
//protected -> Restrito ao escopo da classe e das subclasses