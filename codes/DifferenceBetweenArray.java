import java.util.Scanner;

public class DifferenceBetweenArray {

    public static int Diff(int[] x, int[] y, int SizeOfX, int SizeOfY){
        int pow1 = 1;
        int pow2 = 1;
        int aSum = 0;
        int bSum = 0;
        for(int i = SizeOfX-1; i>=0; i--){
            aSum += x[i] * pow1;
            pow1 = pow1 *10;
        }


        for(int i = SizeOfY-1; i>=0; i--){
            bSum += y[i] * pow2;
            pow2 = pow2 *10;
        }

        int ans = bSum - aSum;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array 1 Size:");
        int N1 = scn.nextInt();
        int[] a = new int[N1];

        
        for(int i = 0; i<a.length; i++){
            System.out.println("Enter Array 1 Value for "+i+" :");
            a[i] = scn.nextInt();
        }
        
        System.out.println("Enter Array 2 Size:");
        int N2 = scn.nextInt();
        int[] b = new int[N2];
        
        for(int i = 0; i<b.length; i++){
            System.out.println("Enter Array 2 Value for "+i+" :");
            b[i] = scn.nextInt();
        }
        
        int A = Diff(a, b, N1, N2);
        System.out.println(A);



        scn.close();

    }
}
