import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = n.nextInt();
        n.close();
        if (num>0) {
            System.out.println(num+"is a positive number");
        }
        else if (num == 0) {
            System.out.println(num+"is zero");
            
        }
        else{
            System.err.println(num+"is negetive");
        }
    }
}
