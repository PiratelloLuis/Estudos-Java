import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Username must be between 4-12 chars
        //username must not contain spaces or underscores

        String username;

        System.out.print("Enter your username between 4-12 chars and not containing any spaces or underscore: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("Your name must contain 4-12 chars");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Your name must not contain any spaces or underscores");
        }
        else {
            System.out.println("Hello " + username);
        }

        scanner.close();
    }

}
