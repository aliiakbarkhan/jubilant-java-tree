public class INTERSECTION {
    public static void inter(int[] a, int[] b){
        int num = 0;
        int[] n;
        n = new int[6];
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if (a[i]==b[j]) {
                    n[num] = a[i];
                    num++;
                    break;
                }
            }
        }
        int[] n2;
        n2 = new int[num];
        for(int i = 0; i<n.length; i++){
            if (n[i]!=0) {
                n2[i] = n[i];
                System.out.println(n2[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] n1 = {4,9,5};
        int[] n2 = {9,4,9,8,4};
        inter(n1, n2);


    }
}
