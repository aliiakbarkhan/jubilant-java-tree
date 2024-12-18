import java.util.Arrays;

public class DISAPPER {
    public static void main(String[] args) {
        int[] n ={4,3,2,7,8,2,3,1};
        Arrays.sort(n);
        int mis = n[n.length-1];
        int[] n2;
        n2  = new int[5];
        int k = 0;
        for(int i = 1;i<=mis;i++){
            for(int j = 0;j<=n.length;j++){
                if (i==n[j]) {
                    break;
                }
                if (j==n.length-1) {
                    n2[k] = mis;
                    k++;
                }
            }
            // System.out.println(n[i]);
        }
        for(int i = 0; i<n2.length; i++){
            System.out.println(n2[i]);
        }
    }
}
