package controler;
import util.Console;

public class Main {
    public static void main (String[] args){
        Tabuada tabuada = new Tabuada();

        //Limpa a tela
        Console.clearConsole();
        
        //Imprime saudações
        System.out.print(Color.MAGENTA_BOLD);
        tabuada.imprimeAbertura();
        System.out.print(Color.RESET);
        tabuada.imprimeEscolhaOperacao();
    }
}