import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double c = scn.nextDouble();
        System.out.println("Parimeter: "+2*3.14*c);
        System.out.println("Area: "+3.14*c*c);
        scn.close();
    }
}
