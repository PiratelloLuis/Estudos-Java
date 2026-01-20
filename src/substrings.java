import java.util.Scanner;
public class substrings {

   public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);

        String email;
       System.out.print("Type your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            System.out.println("Your email is valid");
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring( email.indexOf("@") + 1);
            System.out.printf("Your username is %s\n", username);
            System.out.printf("Your domain is %s", domain);
        }
        else {
            System.out.println("Your email is invalid, type a email with '@' symbol");

        }



    }
}
