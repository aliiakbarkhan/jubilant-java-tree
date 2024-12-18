import java.util.Scanner;
//worng
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int B1 = scn.nextInt();
        int B2 = scn.nextInt();

        int ans = getAnybase(N, B1, B2);
        System.out.println(ans);
        scn.close();
    }

    public static int getAnybase(int x, int y,int z){
        int remian = 0;
        int pow = 1;
        int re = 0;
        while (x != 0) {
            remian = x % z;
            x = x/z;
            re += remian * pow;
            pow = pow * z;
        }
        return re;
    }
}
