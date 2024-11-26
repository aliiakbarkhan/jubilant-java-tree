import java.util.Scanner;

public class evenn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = scn.nextInt();
        if (num%2==0) {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        scn.close();
    }
}
