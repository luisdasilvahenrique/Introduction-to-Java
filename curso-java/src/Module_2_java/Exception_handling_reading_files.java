package Module_2_java;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exception_handling_reading_files {
    public static void main(String[] args) {
        String path = "C:\\Users\\Administrador\\Documents\\Introdução ao desenvolvimento android\\Introduction-to-Java\\curso-java\\src\\Module_2_java\\teste.txt";
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
