package controler;
import util.Color;
/**
 * Classe extraída de https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
 */
class RunApp {
    public static void main(String[] args) {

        System.out.print(Color.BLACK_BOLD);
        System.out.println("Black_Bold");
        System.out.print(Color.RESET);

        System.out.print(Color.YELLOW);
        System.out.print(Color.BLUE_BACKGROUND);
        System.out.println("YELLOW & BLUE");
        System.out.print(Color.RESET);

        System.out.print(Color.YELLOW);
        System.out.println("YELLOW");
        System.out.print(Color.RESET);
    }
}