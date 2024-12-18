import java.util.Scanner;

public class AvgOfThree {
    public static int avg(int x, int y, int z){
        int n = (x+y+z)/3;
        return n;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int av = avg(a, b, c);
        scn.close();
        System.out.println(av);
    }
}
