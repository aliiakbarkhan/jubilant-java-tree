public class BITS {
    public static void main(String[] args) {
        int[] b = {1,1,0};
        if(b.length==1){
            System.out.println(true);
        }
        for(int i =0; i<b.length-1;i++){
            if (i%2!=0) {
                if (b[i]==0) {
                    System.out.println(true);
                }
            }
        }
        if(b.length==1){
            System.out.println(true);
        }
        if (b[b.length-2]==0) {
            System.out.println(true);
        }
        System.out.println(false);
        
}
}
