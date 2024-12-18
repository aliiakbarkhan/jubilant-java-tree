public class TwoSumTwo {
    public static void main(String[] args) {
        int n[] = {-10,-8,-2,1,2,5,6};
        int target = 0;
        int n2[] = new int[2];
        for(int i =0; i<n.length; i++){
            int j = i+1;
           while(j<n.length){
               if(n[i]+n[j] == target){
                   n2[0] = i+1;
                   n2[1] = j+1;
                   break;
               }
               j++;
           }
        }
        for(int i = 0; i<n2.length; i++){
            System.out.print(n2[i]+"    ");
        }
    }
}
