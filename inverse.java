//wrong and incomplete
import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   
        System.out.println("Enter Digit:");
        int a = scn.nextInt();
        int b = a;
        int count = 0;

        while (a != 0) {
            a = a/10;
            count++;

        }
        //System.out.println(count);

        for(int i = 1; i<=count; i++){
            int rem = b%10;
            b = b/10;
            int i2 = i;
            int third = 0;
            third = i2;
            i2 = rem;
            rem = third;
                System.out.print(i2);
        }
        scn.close();
    }
}
