import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();

        int H = 0;
        int P = 0;
        int B = 0;

        if (a > b) {
            if(a>c){
                H = a;
                B = b;
                P = c;
            }
            else{
                H = c;
                B = b;
                P = a;
            }
        }
        else if (b>c) {
            H = b;
            B = a;
            P = c;       
        }
        else{
            H = c;
            B = b;
            P = a;
        }

        int pythagorean = (P*P) + (B*B);

        if (pythagorean == H*H) {
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }
}
