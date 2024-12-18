import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println((a+b+c)/3);
        scn.close();
    }
}
