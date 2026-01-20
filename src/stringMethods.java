public class stringMethods {
    public static void main(String[] args){

        String name = "A";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("e");
        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("a", "O");
        System.out.println(name.equals("A"));

    }
}
