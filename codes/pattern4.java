import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int i = 1; i<=n; i++){
            for(int j =0; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
