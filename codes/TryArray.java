public class TryArray {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] two = new int[3];
        two = arr;
        two[0] = 200;

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.println(two[i]);
        }
        System.out.println();
        swap(arr, 0, 1);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
