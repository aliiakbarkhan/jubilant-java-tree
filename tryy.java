import java.util.Scanner;


public class tryy {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {3,0,1};
        int n = 0;
        for(int i =0; i<=nums.length; i++){
            for(int j =0; j<nums.length; j++){
                if (nums[j] == i) {
                    
                }
                else{
                    n = i;
                }
            }
        }
        System.out.println(n);
        scn.close();
    }
}
