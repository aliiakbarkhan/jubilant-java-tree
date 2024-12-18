import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a*b);
        scn.close();
    }
}
