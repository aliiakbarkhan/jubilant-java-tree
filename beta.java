//mport java.util.Scanner;

public class beta {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        //System.out.print("Enter Number:");
        int num = 1440;
        int i = 5;
        while(i>0){
            int count =1;
            if (num/count == 0) {
                num = num/count;
                System.out.print(count);
            }
            else{
                count++;
            }  
            i--;
        }
        //scn.close();
        }
    }
