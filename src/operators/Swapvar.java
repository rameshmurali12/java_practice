package operators;

public class Swapvar {
    public static void main(String[] args) {
        int x =20;
        int y =30;
        System.out.println("Before Swapping");
        System.out.println("Value of x is :"+x);
        System.out.println("Value of y is :"+y);
        //add both numbers and assign it to first
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping");
        System.out.println("Value of x is :"+x);
        System.out.println("Value of y is :"+y);


    }
}
