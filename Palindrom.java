import java.util.Scanner;

public class Palindrom {
    public static int pal(int x){
        int last = x%10;
        while (x > 10) {
            x = x/10;
        }
        if (x == last) {
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Digit: ");
        int n = scn.nextInt();
        pal(n);
        scn.close();
    }
}
