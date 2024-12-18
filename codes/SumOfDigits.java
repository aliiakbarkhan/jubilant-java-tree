import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Digit: ");
        int n = scn.nextInt();
        int sum = 0;
        while (n > 0) {
            int digi = n%10;
            sum = sum + digi;
            n = n/10;
        }
        System.out.println(sum);
        scn.close();
    }
}
