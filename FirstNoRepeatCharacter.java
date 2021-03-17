//Write a function that takes a single string parameter
//and returns the first non repeated character in the string.
//If no such condition exists, return an empty string.

import java.util.Scanner;

public class FirstNoRepeatCharacter {
    public static void main(String[] args) throws InterruptedException{

        Scanner scan = new Scanner(System.in);
        String string = "";
        System.out.println("Please enter a word. No spaces!");
        while (!scan.hasNext("^[a-zA-Z]+$")) {
            System.out.println("You broke me :(");
            Thread.sleep(500);
            System.out.println("--Please run me again!--");
            System.exit(0);
        }
        string = scan.next();

        System.out.println("Lets see if there are any non repeated characters!");
        Thread.sleep(1000);
        System.out.println(FirstNonRepeatedCharacter(string));
    }

    private static String FirstNonRepeatedCharacter(String SingleString) {
        String NonRepeatedCharacter = SingleString;
        for (Character ch : SingleString.toCharArray()) {
            if (SingleString.indexOf(ch) == SingleString.lastIndexOf(ch)) {
                NonRepeatedCharacter = "First non repeat character = " + ch;
                break;
            } else {
                NonRepeatedCharacter = "First non repeat character = \"\" there are none.";
            }
        }
        return NonRepeatedCharacter;
    }
}
