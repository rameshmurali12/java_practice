package looping;
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = myObj.nextInt();
        if (number%2==0)
        {
            // If remainder is zero then this number is even
            System.out.println("Entered number is Even");
        }
        else
        {
            // If remainder is not zero then this number is odd
            System.out.println("Entered number is Odd");
        }
    }
}
