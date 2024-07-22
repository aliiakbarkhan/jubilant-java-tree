import java.util.Scanner;

public class digimeter {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Enter Value From O to 1000:");
        int num = val.nextInt();
        val.close();

        int f1 = num%10;
        int remain = num/10;

        int f2 = remain%10;
        remain = remain/10;

        int f3 = remain%10;
        remain = remain/10;

        int f4 = remain%10;

        int total = f1+f2+f3+f4;

        System.out.println("Enterd Value:"+num);
        System.out.println("Sum of the digits of value:"+total);


        
    }
}
