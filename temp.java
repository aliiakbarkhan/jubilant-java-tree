import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        System.out.println("This Program Convert F into C");
        System.out.println("Enter Value Of Temprature:");
        Scanner Temp = new Scanner(System.in);
        int vald = Temp.nextInt();
        int ansd = vald - 30;
        ansd = ansd/2;
        System.out.println("Temp in Calcious will be:"+ansd);
        Temp.close();


    
    }
}
