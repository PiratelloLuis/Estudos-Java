public class ternaryOperator {

    public static void main(String[] args){


        int income = 39999;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        double totalTax = income * taxRate;

        System.out.printf("Your total tax to pay is %.2f", totalTax);
    }
}
