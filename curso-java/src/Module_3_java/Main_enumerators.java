package Module_3_java;

import Module_3_java.Base_enumerators.jav;

public class Main_enumerators {
    public static void main(String[] args) {
        for(jav e : jav.values()){
            System.out.println("Nivel: "+ e +" id: "+e.getId() + " xp: "+e.xp+ " anos de experiencia");
        }
    }
}
