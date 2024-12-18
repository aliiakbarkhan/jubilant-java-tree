import java.util.Scanner;

public class tab {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = cn.nextInt();
        for(int i = 1; i <=10; i++){
            System.out.println(n +"X"+i+"="+n*i);
        }
        cn.close();
    }
}
