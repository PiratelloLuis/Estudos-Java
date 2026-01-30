import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1;
        char operator;
        double n2;
        boolean isValidOperation = true;
        double result = 0;


        System.out.print("Enter the first number: ");
        n1 = scanner.nextDouble();

        System.out.print("Whats the operation do you want to do?: (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        n2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = n1 + n2;

            case '-' -> result = n1 - n2;

            case '*' -> result = n1 * n2;

            case '/' -> {
               if(n2 == 0){
                   System.out.println("ERROR: YOU CAN'T DIVDE BY ZERO");
                   isValidOperation = false;
               }
               else {
                   result = n1 / n2;
               }
            }

            case '^' -> result = Math.pow(n1, n2);

            default -> {
                isValidOperation = false;
                System.out.println("Type a valid operator");
            }
        }
        if (isValidOperation) {
            System.out.printf("%.2f %c %.2f = %.2f", n1, operator, n2, result);
        }
        scanner.close();
    }


}
