public class Jump {
    public static void main(String[] args) {
        int i = 0;
        int jump = 0;
        int n[] = {2,3,1,1,4};
        while (i<n.length-1) {
            jump = n[i+n[i]];
            i = i+n[i];
            if (jump == 0) {
                break;
            }
            if (i == n.length-1) {
                System.out.println("true");
            }
        }
        if (i!=n.length-1) {
            
            System.out.println("false");
        }
    }
}
