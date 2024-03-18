//for using the api

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void convertInUsd() {
        Scanner scanner = new Scanner(System.in); // um eintippen zu lassen
        System.out.println("Bitte gebe einen Betrag ein: ");
        String input = scanner.next();
        String normalizedInput = input.replace(',', '.');
        double money;
        money = Double.parseDouble(normalizedInput); // with this line the user can write , or . -- with line 8 and 9
        double factor = 1.09;
        double moneyInUsd = money * factor;
        DecimalFormat df = new DecimalFormat("#.00"); // just for the 2 places after comma
        System.out.println(money + "€ are " + df.format(moneyInUsd) + "$.");
    }




}