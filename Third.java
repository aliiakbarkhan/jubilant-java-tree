public class Third {
    public static void main(String[] args) {
        int n[] = {1,1,2};
        int max = 0;
        int mid = 0;
        int low = 1;

        for(int i = 0; i<n.length; i++){
            if(max <= n[i]){
                max = n[i];
            }
        }
    if(n.length>3){
        for(int i = 0; i<n.length; i++){
            if(mid <= n[i] && n[i]<max){
                mid = n[i];
            }
        }
        for(int i = 0; i<n.length; i++){
            if(low >= n[i] && n[i]<mid){
                low = n[i];
            }
        }
        System.out.println(low);
    }
    else{
        System.out.println(max);
    }
    }
}
