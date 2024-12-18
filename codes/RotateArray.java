public class RotateArray {
    public static void main(String[] args) {
        int n[]= {1,2};
        int k =5;
        int j =0;
        int a = 0;
        int n2[] = new int[n.length];
        if (k>n.length) {
            int newk = k - n.length;
            k = newk;
            if (k>n.length) {
                k = newk-2;
            }
            
        }

        for(int i  =0; i<n.length; i++){
            if (i>=n.length-k) {
                n2[j] = n[i];
                j++;
            }
        }
        for(int i = k; i<n2.length; i++){
            n2[i] = n[a];
            a++;
        }
        for(int i = 0; i<n.length; i++){
            n[i] = n2[i];
        }
        System.out.println(k);
        for(int i = 0; i<n.length; i++){
            System.out.print(n[i]+"    ");
        }
    }
}
