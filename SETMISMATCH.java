public class SETMISMATCH {
    public static void main(String[] args) {
        int[] num = {1,2,2,4};
        int number = 1;
        int[] num2 = {0,0};
        for(int i = 0; i< num.length; i++){
            if (number!=num[i]) {
                num2[0] = num[i];
                num2[1] = number;
                break;
            }
            else{
                number++;
            }
        }
        for(int i = 0; i<num2.length; i++){
            System.out.println(num2[i]);
        }
    }
}
