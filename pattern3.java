import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int i = 1; i<=n; i++){
            for(int j = n; j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
