public class SquareofArray {
    public static void main(String[] args) {
        int n[] = {-4,-1,0,3,10};
               for(int i = 0; i<n.length; i++) {
                n[i] = n[i]*n[i];
               }
            //    for(int i = 0; i<n.length; i++){
            //     int temp = 0;
            //     int j = i+1;
            //     while(j<n.length){
            //         if(n[i]>=n[j]){
            //             temp = n[j];
            //             n[j] = n[i];
            //             n[i] = temp;
            //             j++;
            //         }
            //     }
            //    }
            Arrays.sort(n);
               for(int i = 0; i<n.length; i++){
                System.out.print(n[i]+" ");
               }
            }
        
        }
