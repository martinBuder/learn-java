import java.util.Scanner;
import java.util.Random;

public class GuessNumbers {

    static Random random = new Random();
    static int myNumber = random.nextInt(10) +10; //random gibt zwischen 0 und 10 aus . danach wird die +10 dazu gerechnet

    public static void guess() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rate die richtige Nummer:");
        int number = scanner.nextInt();
        if(number == myNumber) {
            System.out.println("Richtig geraten!");
        } else {
            if(number > myNumber) System.out.println("Leider falsch. Die Zahl ist zu groß. Probiere es noch mal.");
            else System.out.println("Leider falsch. Die Zahl ist zu klein. Probiere es noch mal.");
            guess();
        }
    }

    public static void tellTheGame() {
        System.out.println("Wir spielen jetzt rate die Number. Die Zahl ist zwischen incl. 10 und 50. ");
    }
}