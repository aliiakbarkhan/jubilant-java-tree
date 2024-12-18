import java.util.Scanner;

public class SeachingInArray {

    public static int Ss(int[] a,int x){
        for(int i = 0; i<a.length; i++){
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter Value Of Array "+i+" : ");
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter Number to Search: ");
        int S = scn.nextInt();
        int target = Ss(arr, S);
        System.out.println(target);
        scn.close();
    }
}
