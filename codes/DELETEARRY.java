
public class DELETEARRY {
    public static void del(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if (arr[i]==arr[j]) {
                    arr[j] = 999;
                }
            }
        }
        int k = 0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]!=999|| i==0) {
                arr[k] = arr[i];
                k++;
            }
        }
        System.out.print("arr = [ ");
        for(int i = 0; i<k;i++){
            System.out.print("  "+arr[i]);
        }
        System.out.print(" ]");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
            del(arr);
        }
    }
