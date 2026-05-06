
import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input_String = scan.nextLine();

        try {
            int number = Integer.parseInt(input_String);
            System.out.println(input_String + " is an " + ((number % 2 == 0) ? "even number!" : "odd number!"));
        } catch (NumberFormatException e) {
            System.out.println(input_String + " is not a number.");
        }
    }
}