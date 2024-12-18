import java.util.Scanner;

public class IntroToFunctions {
    public static int Factortial(int x){
        int nfact = 1;
        for(int i = 1; i<=x; i++){
            nfact = nfact * i;
        }
        return nfact;
    }

    public static int Factor(int x, int y){
        int nfact2 = 1;
        for(int i = 1; i<=x-y; i++){
            nfact2 = nfact2 * i;
        }
        return nfact2;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scn.nextInt();
        System.out.println("Enter R:");
        int r = scn.nextInt();

        int n1 = Factortial(n);
        int n2 = Factor(n, r);
        int npr = n1/n2;

        System.out.println(n + "P" + r + "="+npr);

        scn.close();
    }
}
