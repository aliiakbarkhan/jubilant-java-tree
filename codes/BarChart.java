import java.util.Scanner;

public class BarChart {

    public static void Bar(int[] a){
        int max = a[0];
        for(int  i = 0; i<a.length; i++){
            if (a[i]> max) {
                max = a[i];
            }
        }



        for(int floor = max; floor>0; floor--){
            for(int i = 0; i<a.length; i++){
            if (a[i] >= floor) {
                System.out.println("*\t");              
            }
            else{
                System.out.println("\t");    
            }
        }
            System.out.println();
            }
        }
        

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter Size of Array: ");
            int N = scn.nextInt();//for size of array
            int[] arr = new int[N];
            
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter Values of Array: "); 
            arr[i] = scn.nextInt();
        }
        Bar(arr);
        scn.close();
    }
}

