import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int  B= scn.nextInt();

        int ans = getDecimalBase(N,B);
        System.out.println(ans);

        scn.close();
    }

    public static int getDecimalBase(int x, int y){
        int remian = 0;
        int pow = 1;
        int re = 0;

        while (x != 0) {
            remian = x % 10;
            x = x /10;
            re += remian * pow;
            pow = pow * y;
        }
        return re;
    }
}
