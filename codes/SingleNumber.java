public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        int a= 0;
        int a2= 0;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if (nums[i] != nums[j]) {
                    a = nums[i];
                }
                else{
                    continue;
                }
            }

        }
        System.out.println(a);
    }
}
