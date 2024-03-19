import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class GuessNumbers {

    static JLabel resultText = new JLabel("");
    static int counter = 0;
    static Random random = new Random();
    static int myNumber = random.nextInt(10) +10; //random gibt zwischen 0 und 10 aus . danach wird die +10 dazu gerechnet

    public static void guess(int number) {
        counter++;
        if(number == myNumber) {
            if(counter == 1) resultText.setText("<html>Richtig geraten!<br>Du hast " + counter + " Versuch gebraucht.</html>");
            else resultText.setText("<html>Richtig geraten!<br>Du hast " + counter + " Versuche gebraucht.</html>");
        } else {
            if(number > myNumber) resultText.setText("<html>Leider falsch. Die Zahl ist zu groß.<br>Probiere es noch mal.</html>");
            else resultText.setText("<html>Leider falsch. Die Zahl ist zu klein.<br>Probiere es noch mal.</html>");
        }
    }

    public static void tellTheGame() {
        System.out.println("Wir spielen jetzt rate die Number. Die Zahl ist zwischen incl. 10 und 50. ");
    }
}
