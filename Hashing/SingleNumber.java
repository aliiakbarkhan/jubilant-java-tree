import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,2,1,2,1,3,3};
        HashSet<Integer> set  = new HashSet<>();

        for(int num : nums){
            if (!set.contains(num)) {
                set.add(num);
            }
            else{
                set.remove(num);
            }
        }

        //code is working just need to find a way to return this set a number.
    }
}
