package controler;
import java.util.Scanner;

public class Tabuada {
    char operacao;
    int tabuadaDe;
    String tempString = "";
    Scanner scan = new Scanner(System.in);
    

    public void imprimeAbertura(){
        System.out.println("Tabuada da Elizabeth!!!");
    }
    
    public void imprimeEscolhaOperacao(){
        System.out.print("Escolha uma operação: soma(+), subtração (-), divisão(/) ou multiplicação(*)");
        tempString = scan.nextLine();
        if (isOperacaoValida(tempString)){
            System.out.printf("Você escolheu: %s", tempString);
        } else {
            System.out.printf("Elizabeth %s não é uma escolha válida!", tempString);
        }
    }

    public boolean isOperacaoValida(String texto) {
        boolean valido = false;
        if (texto.equals("+") || texto.equals("-") || texto.equals("*") || texto.equals("/") || texto.equalsIgnoreCase("sair")){
            return true;
        }

        return valido;
    }
}