import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = scn.nextInt();
        System.out.println("Enter Rotation:");
        int k = scn.nextInt();

        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp/10;
           nod++;
        }
        int div = 1;
        int mult = 1;
        for(int i = 1; i<=nod; i++){
            if (i<=k) {
                div = div*10;
            }else{
                mult = mult*10;
            }
        }
        int q = n/div;
        int r = n % div;
        int rot = r * mult +q;
        System.out.print(rot);
        scn.close();
    }
}
