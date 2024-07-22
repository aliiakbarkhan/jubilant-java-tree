import java.util.Scanner;


public class digitsofnum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = scn.nextInt();
        int digit = 0;
        int count = 0;
        int n2 = n;

        while (n2 != 0) {
            n2 = n2/10;
            count++;
        }
        System.out.println("No. of digits: "+count);
        int div = (int)Math.pow(10, n2-1);

        while (n != 0) {
            int rem = n/div;
            digit = rem;
            System.out.println(digit);
            n = n%div;
            div = div /10;
        }
        //imcomplete
        scn.close();


    }
}
