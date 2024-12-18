import java.util.HashSet;

public class Ndouble {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        int i = 0;
        int j = 0;
        HashSet<Integer> set  = new HashSet<>();
        for(int val: arr){
            set.add(val);
        }
        System.out.println(set.contains(0));

        for(int val: arr){
            if (set.contains(2*val)) {
                i = val;
                j = 2*val;
                System.out.println("True");
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
