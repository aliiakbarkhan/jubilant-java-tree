import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number of digits:");
        int t = n.nextInt();

        for(int i = 1; i<=t; i++){
            int a = n.nextInt();
            int count=0;
            for(int div = 2; div * div <=a; div++){
                if (a%div==0) {
                    count++;
                    break; 
                }
            }
            if (count==0) {
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
        n.close();

    }
}
