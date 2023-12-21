import Options.Option;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("MENU");
        Option.printOptions();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        Option choiceOption = Option.getOption(choice);
        choiceOption.runOption();

        scanner.close();
    }
}
