import java.util.Scanner;

public class factorprime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = scn.nextInt();

        for(int div=2; div*div<num;div++){
            
            while(num%div==0){
                    num = num/div;
                    System.out.print(div+" ");
                }
            }
        scn.close();
        }
        }
