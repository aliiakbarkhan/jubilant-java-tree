public class remdup {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int k = 0;
        for(int i  = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if (arr[i]==arr[j] && arr[j]>arr.length-1) {
                    arr[j] = arr[j+1];
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ,");
        }

    }
}
