import java.util.Scanner;

public class interestCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal_amount;
        double rate;
        int times_year;
        int years;
        double amount_after;


        System.out.print("Enter the principal amount: ");
        principal_amount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        times_year = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount_after = principal_amount * Math.pow(1 + rate/times_year, times_year * years);

        System.out.printf("The amout after %d years using %.2f of rate %d times per year is R$%,.2f", years, rate, times_year ,amount_after);

        scanner.close();
    }
}
