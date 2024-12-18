public class PlusOne {
    public static void main(String[] args) {
        int nums[] = {9,8,7,6,5,4,3,2,1,0};
        int pow = 1;
        int resultNum = 0;
        int remain = 0;
        int count = 0;
        for(int i = nums.length-1; i>=0; i--) {
            if (nums[nums.length-1] == 0) {
                
            }
            resultNum += nums[i] * pow;
                pow = 10 * pow;
            count++;
        }
        resultNum = resultNum +1;
        System.out.println(resultNum);
    }
}
