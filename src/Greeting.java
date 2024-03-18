import java.time.LocalTime;

public class Greeting {
    public static void greet() {
        String name = "Martin";
        int postcode = 83707;
        String city = "Bad Wiessee";
        String greeting = showGreeting();
        System.out.println(greeting);
        System.out.println("My name is " + name + ". I live in " + postcode + " " + city + ".");
        // Der Unterschied zwischen print und println ist, dass println ein 'enter' hinter der Ausführung hinzufügt.
    }
    public static String showGreeting() {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        if(hour < 12 && hour > 5) {
            return "Good Morning! ";
        } else if (hour > 12 && hour < 20) {
            return "Good Afternoon! ";
        } else {
            return "Good Evening! ";
        }

    }
}