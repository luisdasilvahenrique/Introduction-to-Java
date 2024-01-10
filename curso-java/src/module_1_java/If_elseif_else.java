package module_1_java;

public class If_elseif_else {
    public static void main(String[] args) {
        new If_elseif_else().media(7);
    }

    void media(int media){
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >= 6){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
