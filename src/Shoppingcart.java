import java.util.Scanner;
public class Shoppingcart {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    int quantity;
    String item;
    double price;
    char currency = '$';
    double total;

    System.out.print("What item would you like to buy?: ");
    item = scanner.nextLine();
    System.out.print("What is the price for each?: ");
    price = scanner.nextDouble();
    System.out.print("How many would you like to buy?: ");
    quantity = scanner.nextInt();

    System.out.println("You have bought " + quantity + " " + item + "/s.");

    total = price * quantity;

    System.out.println("Your total is " + currency + total+ ".");


    scanner.close();
    }
}