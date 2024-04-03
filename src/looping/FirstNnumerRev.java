package looping;

import java.util.Scanner;

public class FirstNnumerRev {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = myObj.nextInt();
        System.out.println("The first N natural numbers in Reverse");
        for (int i=number;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
