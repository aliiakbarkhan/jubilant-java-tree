import java.util.Scanner;

public class DigitsFrequency {

    public static int Appeard(int mainNum, int seeNum){
        int remian = 1;
        int count = 0;
        while (mainNum != 0) {
            remian = mainNum %10;
            mainNum = mainNum / 10;
            if (remian == seeNum) {
                count++;
            }
            }
            return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mainnNum = scn.nextInt();
        int mainNum = mainnNum;
        int seeNum = scn.nextInt();
         
        int count = Appeard(mainNum, seeNum);


        System.out.println(seeNum +" Appeard "+count+" Times in "+mainnNum);
        scn.close();
    }
}
