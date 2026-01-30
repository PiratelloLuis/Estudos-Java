import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            String day;

        System.out.println("What day is it?");
        day = scanner.next();

        switch(day){
            case "Monday", "Tuesday" , "Wednesday","Thursday", "Friday"
                    -> System.out.println("It is a weekday");
            case "Saturday", "Sunday"
                    -> System.out.println("It is the weekend");

            default -> System.out.println("Not a day");
        }
    }

}
