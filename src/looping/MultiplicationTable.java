package looping;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num=10,i=1;
        while (i<=10)
        {
            System.out.printf("%d*%d=%d\n",num,i,num*i);
            i++;
        }
    }
}
