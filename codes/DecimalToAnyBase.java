import java.util.Scanner;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int D = scn.nextInt();
        int B = scn.nextInt();

        int ans = getAnybase(D, B);
        System.out.println(ans);
        scn.close();
    }


public static int getAnybase(int x, int y){
    int remian = 1;
    int r = 0;

    int p = 1;
        while (x != 0) {
            remian = x % y; 
            x = x / y;

            r += remian * p;
            p = p *10;

        }
        return r;
}
}