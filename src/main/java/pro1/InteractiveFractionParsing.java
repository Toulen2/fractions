package pro1;

import java.util.Scanner;

public class InteractiveFractionParsing {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Zadejte zlomek: ");
            String input = scanner.nextLine();

            try {
                Fractions num = Fractions.parse(input);
                System.out.println("Dadal jste zlomek: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Zadal jste neplatný řetězec ABC");
            }
        }


    }
}
