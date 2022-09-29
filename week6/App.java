
import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        char swipe;
        String match = "";
        String ignore = "";
        String name;

        System.out.println("Welcome to NUmble");
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Swipe Left to ignore or Swipe Right to match!");
        System.out.println(" ");

        System.out.println("1. Abigail");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);

        if (swipe == 'R') {
            match = match + "Abigail, ";
        } else if (swipe == 'L') {
            ignore = ignore + "Abigail, ";
        } else {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("2.Lyan");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);

        if (swipe == 'R') {
            match = match + "Lyan, ";
        } else if (swipe == 'L') {
            ignore = ignore + "Lyan, ";
        } else {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("3. Fiona");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);

        if (swipe == 'R') {
            match = match + "Fiona, ";
        } else if (swipe == 'L') {
            ignore = ignore + "Fiona, ";
        } else {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("4. Fitz");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);

        if (swipe == 'R') {
            match = match + "Fitz, ";
        } else if (swipe == 'L') {
            ignore = ignore + "Fitz, ";
        } else {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("5. Paula");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);

        if (swipe == 'R') {
            match = match + "Paula";
        } else if (swipe == 'L') {
            ignore = ignore + "and Paula";
        } else {
            System.out.println("Invalid input!");
            return;
        }

        if (match.length() > 0) {
            System.out.println("You will be matched with: " + match + " if they also swipe you right :)");
        } else if (ignore.length() > 0) {
            System.out.println("Profiles ignored: " + ignore);
        }

        System.out.println("Thank you for playing :)");

        scan.close();
    }
}
