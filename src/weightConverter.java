import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weitght;
        double newWeight;
        int option;

        System.out.println("Weigth convertion");
        System.out.print("Type the option do you want (1 = Lbs to Kg / 2 = Kg to Lbs): ");
        option = scanner.nextInt();

        if (option == 1){
            System.out.print("Type the weight that you want to convert in Pounds: ");
            weitght = scanner.nextDouble();
            newWeight = weitght * 0.453592;
            System.out.printf("Your weight in Kilograms is %.2f", newWeight);
        }
        else if (option == 2) {
            System.out.print("Type the weight that you want to convert in Kilograms: ");
            weitght = scanner.nextDouble();
            newWeight = weitght * 2.2;
            System.out.printf("Your weight in Pounds is %.2f", newWeight);
        } else {
            System.out.println("Not a valid choice, type 1 or 2");
        }
        scanner.close();
    }
}
