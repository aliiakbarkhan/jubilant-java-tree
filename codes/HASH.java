import java.util.HashMap;

public class HASH {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,465};
        HashMap<Integer, Integer> ali = new HashMap<>();
        int n = nums.length;
        int duplicate = -1, missing = -1;
        for(int num : nums){
            ali.put(num, ali.getOrDefault(num, 0)+1);
        }
        for(int i = 1; i <=n; i++){
            if (ali.containsKey(i)) {
                if (ali.get(i)==2) {
                    duplicate = i;
                }
            }
            else{
                missing = i;
            }
        }
        int[] a  = {duplicate, missing};
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
