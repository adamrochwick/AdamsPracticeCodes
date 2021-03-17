//Write a function that takes two parameters that are both Integer Arrays named Numbers and
//Matches. The function should return true if all numbers in Matches can be found in Numbers,
//otherwise return false.

import java.util.Scanner;

public class CanWeFindAMatch {

    public static void main(String[] args) throws InterruptedException{

        Scanner scan = new Scanner(System.in);

        Integer[] Numbers = new Integer[4];
        System.out.println("Let's choose some numbers! (Please Enter 4 total)");
        for (int i = 0; i <= Numbers.length - 1; i++) {
            while (!scan.hasNext("-?[0-9]\\d*")) {
                System.out.println("Lets stick to whole numbers only please! No letters or decimals.");
                scan.next();
            }
            Numbers[i] = Integer.valueOf(scan.next());
        }
        System.out.println("Thanks for those!");
        scan.nextLine();

        System.out.println("How many numbers do you want to use for comparing?");
        int user = 0;
        while (!scan.hasNext("[1-4]+")) {
            System.out.println("Lets stick to numbers between 1 and 4");
            scan.next();
        }
        user = scan.nextInt();
        scan.nextLine();

        Integer[] Matches = new Integer[user];
        System.out.println("Lets choose some more numbers!");
        for (int i = 0; i <= Matches.length - 1; i++) {
            while (!scan.hasNext("-?[0-9]\\d*")) {
                System.out.println("Lets stick to whole numbers only please! No letters or decimals.");
                scan.next();
            }
            Matches[i] = Integer.valueOf(scan.next());
        }

        System.out.println("Ok lets compare them both!");
        Thread.sleep(1000);
        System.out.println("Still calculating please wait...");
        Thread.sleep(1000);
        System.out.println("Are all the numbers matching in both? True or False: " + CanWeFindMatches(Numbers, Matches));
    }


    private static boolean CanWeFindMatches(Integer Numbers[], Integer Matches[]) {
        boolean compare = false;
        Integer TotalMatched = 0;

        for (Integer MatchIteration : Matches) {
            Integer Comparing = MatchIteration;

            for (Integer NumbersIteration : Numbers) {
                if (Comparing == NumbersIteration) {
                    TotalMatched++;
                }
            }

            if (TotalMatched == Matches.length) {
                compare = true;
            }
        }
        return compare;
    }
}
