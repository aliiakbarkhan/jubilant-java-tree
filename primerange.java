import java.util.Scanner;

public class primerange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Lower Limit:");
        int lower = scn.nextInt();
        System.out.println("Enter Higher Limit:");
        int higher = scn.nextInt();

        for(int i = lower; i<=higher; i++){
            int prime=0;
            // try to divide i and then increase prime
            for(int div = 2; div * div <=i; div++){
                if (i%div==0) {
                    prime++;
                    break;
                }
            }
            // try to divide i and then increase prime
            if (prime==0) {
                System.out.println(i);
            }
        }
        scn.close();
    }
}
