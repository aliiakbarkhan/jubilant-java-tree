import java.util.Scanner;

public class IntroductionToArray {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[j] = arr[i];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i< marks.length; i++){
            marks[i] = scn.nextInt();
        }

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        
        scn.close();
    }
}


