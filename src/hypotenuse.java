import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args){
        //System.out.println(Math.PI);
        //System.out.println(Math.E);
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Digite um número para 'a'");
        a = scanner.nextDouble();
        System.out.println("Digite um número para 'b'");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenusa do (lado c):" + " √" + a + "^2" + " + " + b + "^2" + " = " + c+"cm");



        scanner.close();
    }

}
