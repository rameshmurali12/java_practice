package looping;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = myObj.nextInt();
        int i=1;
        while (i<=10)
        {
            System.out.printf("%d*%d=%d\n",num,i,num*i);
            i++;
        }
        /*for (i=1;i<=10;i++)
        {
            System.out.printf("%d*%d=%d\n",num,i,num*i);
        }*/
    }
}
