import java.util.Scanner;

public class febonachhi {
    public static void main(String[] args) {

        //this area will take input from user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scn.nextInt();     
        int n1 = 0;
        int n2 = 1;
        int n3 = n1+n2;
        //this area will take input from user


        //this area will give fabonachii till "n"
        for(int i = 3; i<n; ++i){
            
            n1 = n2;
            n2 = n3;
            n3 = n1+n2;
            
        }
        //this area will give fabonachii till "n"

        System.out.println(n3);
        scn.close();
    }
}
