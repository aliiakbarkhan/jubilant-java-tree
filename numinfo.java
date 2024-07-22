import java.util.Scanner;

public class numinfo {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.err.println("Enter Number:");
        float num = n.nextFloat();
        n.close();

        if (num == 0) {
            System.err.println(num+" is zero");
        }
        else if (num > 0) {
            System.err.println(num+" is positive");
            
        }
        else if (num < 0) {
            System.err.println(num+ "is negative");
        }
    }
}
