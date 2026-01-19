public class printf {

    public static void main(String[] args){

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name);
        System.out.printf("\nYour name starts with a %c", firstLetter);
        System.out.printf("\nYou are %d years old ", age);
        System.out.printf("\nYou have %.1f inches tall", height);
        System.out.printf("\nEmployed: %b ", isEmployed);

        System.out.printf("\n%s is %d years old", name, age);
    }
}
