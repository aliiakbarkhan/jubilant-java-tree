import java.util.Scanner;

public class bigone {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.err.println("Enter First Number:");
        int first = num.nextInt();

        System.err.println("Enter Secound Number:");
        int secound = num.nextInt();

        System.err.println("Enter Third Number:");
        int thrird = num.nextInt();
        num.close();

        if (first>secound) {
            if (first>thrird) {
                System.err.println(first+" is the greatest");
            }
            else{
                System.err.println(thrird+" is the greatest");
            }
        }
        else if (secound>thrird) {
            System.err.println(secound+" is the greatest");
            
            
        }
        else{
            System.err.println(thrird+" is the greatest");
        }
    }
}
