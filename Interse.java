import java.util.HashSet;

public class Interse {
    public static void main(String[] args) {
        //349
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> new_set = new HashSet<>();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        for(int val: nums1){
            set.add(val);
        }
        for(int val : nums2){
            if (set.contains(val)) {
                new_set.add(val);
                
            }
        }
        //this code is also working and just need to be published.
        //and yes it is done.
        int i = 0;
        int[] arr = new int[new_set.size()];
        for(int ele:new_set){ 
            arr[i++] = ele; 
          }
          for (int n : arr){
          System.out.println(n); 
  }
    }
}
