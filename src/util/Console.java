package util;
import java.io.IOException;

public class Console {
    public static void clearConsole(){
        //Limpa a tela
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException e){
            System.err.println();
            System.err.println(e.getMessage());
        } catch(InterruptedException e){
            System.err.println();
            System.err.println(e.getMessage());
        }
    }
}