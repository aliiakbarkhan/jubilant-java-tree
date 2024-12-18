import java.util.Scanner;

public class SumOfTwoArrays {

    public static void SumAddition(int[]a,int[]b,int SizeOfOne, int SizeOfTwo){
        int NewSize = 0;
        if (SizeOfOne > SizeOfTwo) {
            NewSize = SizeOfOne;
        }
        else{
            NewSize = SizeOfTwo;
        }
        int[] NewArray = new int[NewSize];
        for(int i = 0; i<NewArray.length; i++){
            if(i < a.length){
            NewArray[i] = a[i]+b[i];
        }
        if (i == a.length) {
            NewArray[i] = b[i];
        }
    }
        
        for(int i = 0; i<NewArray.length; i++){
            System.out.println(NewArray[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size Of Arry One: ");
        int N = scn.nextInt();

        int[] one = new int[N];


        for(int i = 0; i<one.length; i++){
        System.out.println("Enter Value Of Arry One: "+i+" :");
        one[i] = scn.nextInt();
        }
        System.out.println("Enter Size Of Arry Two: ");
        int N2 = scn.nextInt();
        int[] two = new int[N2];
        for(int i = 0; i<two.length; i++){
            System.out.println("Enter Value Of Arry TWO: "+i+" :");
            two[i] = scn.nextInt();
            }
        System.out.println();
        System.out.println();
        SumAddition(one, two, N, N2);
        scn.close();
        
    }
}
