import java.util.Arrays;

public class THIRDMAX {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i]==arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        int k = 0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]!=0|| i==0) {
                arr[k] = arr[i];
                k++;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
}
