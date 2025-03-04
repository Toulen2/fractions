package pro1;

import java.util.Scanner;

public class InteractiveDoubleParsing {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("Zadejte číslo: ");
            String input = scanner.nextLine();

            try {
                double num = Double.parseDouble(input);
                System.out.println("Dadal jste double: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Neplatný vstup, zkuste znovu");
            }

        }
    }
}
