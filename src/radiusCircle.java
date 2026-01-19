import java.util.Scanner;
public class radiusCircle {

    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);


         double area;
         double circumference;
         double volume;
         double radius;

        System.out.print("Type the radius of your circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of the circle is: %.1fcm\n",circumference);
        area = Math.PI * Math.pow(radius,2);
        System.out.printf("The area of the circle is: %.1fcm²\n",area);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the circle is: %.1fcm³\n",volume);

        scanner.close();

    }
}
