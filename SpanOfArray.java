import java.util.Scanner;

public class SpanOfArray {

    public static void spanish(int[] a){
        int min = a[0];
        int max = a[a.length - 1];
        for(int i = 0; i<5; i++){
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        int tot = max - min;
        System.out.println("Span of This Array is: "+ tot);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Array "+ i+" :");
            arr[i] = scn.nextInt();
        }
        spanish(arr);

        scn.close();


    }
}
