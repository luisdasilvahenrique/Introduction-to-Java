package Module_3_java;

public class Get_and_Set_Client {
    public static void main(String[] args) {
        Base_Client client = new Base_Client();
        client.name = "John";
        System.out.println("O nome informado é: "+ client.name + " e salário de "+ client.salary + " reais");

        client.setYear(2021);

        System.out.println("O ano informado é: "+ client.getYear());
    }
}
