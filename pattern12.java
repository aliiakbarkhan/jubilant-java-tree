import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int febo = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = n1+n2;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if (i<=2) {
                    System.out.print(febo+"\t");
                    febo++;   
                }
                if (i>2) {
                    n1 = n2;
                    n2 = n3;
                    n3 = n1+n2;
                    System.out.print(n3+"\t");
                }

            }
            System.out.println();
        }
    }
}
