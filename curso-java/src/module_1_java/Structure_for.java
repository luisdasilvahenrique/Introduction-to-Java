package module_1_java;

import javax.swing.*;

public class Structure_for {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("i = %d\n", i);
        }
        System.out.println("--------------");
        for (int j = 10; j > 0; j-=2){
            System.out.println("j = " + j);
            //mostre um painel com o resultado na tela
            JOptionPane.showMessageDialog(null, "j = " + j);

        }
    }
}
