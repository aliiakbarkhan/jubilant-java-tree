import java.util.Arrays;
import java.util.Scanner;
public class MoveZeros {
    public static void main(String[] args) {
        int temp = 0;
        int n[] = {0,1,0,3,12};
        int n2[] = new int[n.length];
        int j=0;
        for(int i = 0; i<n.length; i++){
            if (n[i]!=0) {
                n2[j] = n[i];
                j++;    
            }
        }
        for(int i = 0; i<n2.length; i++){
            System.out.print(n2[i]+"   ");
        }

    }
}
