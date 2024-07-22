import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a NUMBER:");
        int num = scn.nextInt();


        while (num != 0) {

            int rem = num%10;
            System.out.println(rem);
            num = num/10;

        }
        scn.close();

    }
}
