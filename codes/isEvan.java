public class isEvan {
    public static boolean isEvann(int x){
        if (x%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean a =  isEvann(7);
        System.out.println(a);
    }
}
