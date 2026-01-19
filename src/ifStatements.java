import java.util.Scanner;

public class ifStatements {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age with a int number: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false):");
        isStudent = scanner.nextBoolean();


        //Group 1 name
        if (name.isEmpty()){
            System.out.println("You didn't enter your name");
        }
        else{
            System.out.println("Hello "+name + "!");
        }


        //Group 2 age
        if(age >= 65){
           System.out.println("You are a senior and can enter the site");
        }
        else if (age >= 18){
            System.out.println("You can enter the site");
        }
        else if (age < 0){
            System.out.println("You haven't been born yet");
        }
        else if (age == 0){
            System.out.println("You don't have 1 year old yet");
        }
        else{
            System.out.println("You must be 18 years old or more to enter this site");
        }

        //Group 3 isStudent
        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a student!");
        }

        scanner.close();
    }
}
