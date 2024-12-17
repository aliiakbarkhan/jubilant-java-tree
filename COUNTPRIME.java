import java.util.Scanner;

public class COUNTPRIME {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        int count = 0;
        for(int i = 2;i<n;i++){
            for(int j =  2; j<n;j++){
                if (i % j == 0) {
                    break; 
                    // n is divisible by some number other than 1 and itself
                }
                else{
                    if (j==n-1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        scn.close();
    }
}
