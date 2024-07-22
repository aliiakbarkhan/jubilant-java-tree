import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int GCD = 0;

        for(int i = 1; i<=1000; i++){

            if (num1%i==0 && num2%i==0) {
                GCD = i;
            }

        }
        int LCM = (num1*num2)/GCD;
        System.out.println("GCD of "+num1+" and "+num2+" is ="+GCD);
        System.out.println("LCM of "+num1+" and "+num2+" is ="+LCM);
        scn.close();


    }
}
