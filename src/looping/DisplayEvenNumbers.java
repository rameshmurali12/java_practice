package looping;
import java.util.Scanner;

public class DisplayEvenNumbers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = myObj.nextInt();
        System.out.println("List of Even numbers from 1 to"+number+":");
        for (int i=1;i<=number;i++)
        {
            if (i%2==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
