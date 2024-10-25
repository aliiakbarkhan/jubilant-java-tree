public class MSA {
    public static void main(String[] args) {
        int n1[] = {1,2,3,0,0,0};
        int m = 3;
        int n2[] = {2,5,6};
        int n = 3;
        int j = 0;

        int new_n[] = new int[m+n];

        for(int i  = 0; i<n1.length; i++){
            if (n1[i]  == 0) {
                while (j<n2.length) {   
                    n1[i] = n2[j];
                    break;
                }
                j++;
            }
            }

            for(int i = 0; i<n1.length; i++){
                int temp = 0;
                for(int k = i+1; k<n1.length; k++){
                    if (n1[i] >= n1[k]) {
                        temp = n1[k];
                        n1[k] = n1[i];
                        n1[i] = temp;
                    }
                }
            }
            for(int i =0; i<n1.length; i++){
                System.out.print(n1[i]+"    ");
            }

        }

    }

