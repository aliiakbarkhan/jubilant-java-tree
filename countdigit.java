import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Digit:");
        int n = scn.nextInt();

        int digit = 0;

        while (n !=0) {
            n = n/10;
            digit++;
        }
        System.out.println(digit);
        scn.close();

    }
}
