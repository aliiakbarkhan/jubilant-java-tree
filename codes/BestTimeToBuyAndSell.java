public class BestTimeToBuyAndSell {

    public static int further(int price[], int i, int max){
        int j = i+1;
        while(j<price.length) {
            int most = price[j] - price[i];
            if (most > max) {
                max = most;
            }                
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        int price[] = {7,6,4,3,1};
        int max =0;
        for(int i = 0; i<price.length; i++){
            max = further(price, i,max);
        }
            // for(int i = 0; i<price.length; i++){
                //     if (min>=price[i]) {
                    //         min = price[i];
                    //         st = i;
                    //     }
                    // }
                    
                    // for(int i = st+1; i<price.length; i++ ){
                        //     if (price[i] - min > max) {
                            //         max = price[i] - min;
                            //     }
                            // }
                            //System.out.println(min);
                            System.out.println(max);
                        }
                        }


