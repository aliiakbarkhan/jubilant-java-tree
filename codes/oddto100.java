public class oddto100 {
    public static void main(String[] args) {
        int st = 10;
        for(int i  = 1; i <=100; i++){
            if (i%2!=0) {
                System.out.println(i);
            }
            if (i==st) {
                System.out.println("----------");
                st = st+10;
            }
        }
    }
}
