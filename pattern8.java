import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int sp = 0;
        int sp2 = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp2; j++){
                System.out.print("\t");
            }

                System.out.print("*\t");

            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
                sp++;
                sp2--;
            System.out.println();
        }
    }
}
