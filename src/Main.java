//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        String name = "Martin";
        int postcode = 83707;
        String city = "Bad Wiessee";

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        String greeting;

        if(hour < 12 && hour > 5) {
            greeting = "Good Morning! ";
        } else if (hour > 12 && hour < 20) {
            greeting = "Good Afternoon! ";
        } else {
            greeting = "Good Evening! ";
        }


        System.out.print(greeting + "My name is " + name + ". I live in " + postcode + " " + city + ".");
        // Der Unterschied zwischen print und println ist, dass println ein 'enter' hinter der Ausführung hinzufügt.
    }
}