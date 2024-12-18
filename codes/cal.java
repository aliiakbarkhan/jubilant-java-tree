import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int F = scn.nextInt();
        int S = scn.nextInt();
        System.out.println(F+S);
        System.out.println(F-S);
        System.out.println(F*S);
        System.out.println(F/S);
        System.out.println(F%S);
        scn.close();
    }
}
