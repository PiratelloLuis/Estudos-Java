import java.util.Scanner;

public class ifStatements {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age with a int number: ");
        age = scanner.nextInt();


        if(age >= 18){
           System.out.println("You can enter the site");
        }
        else if (age < 0){
            System.out.println("You haven't been born yet");
        }
        else{
            System.out.println("You must be 18 years old or more to enter this site");
        }

    }
}
