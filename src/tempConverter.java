import java.util.Scanner;

public class tempConverter {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       double temp;
       double newTemp;
       String option;
       String response;

       System.out.print("Enter the temperature: ");
       temp = scanner.nextDouble();


       System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
       option = scanner.next();


       newTemp = (option.equalsIgnoreCase("C"))
               ? (temp - 32) * 5 / 9
               : (temp * 9 / 5) + 32;

       response = (option.equalsIgnoreCase("C"))
               ? "Sua temperatura em Celsius é:"
               : "Sua temperatura em Fahrenheit é:";


       System.out.printf("%s %.1fº%s", response, newTemp,option);
       scanner.close();
   }
}
