public class divs {
    public static void main(String[] args) {
        System.out.println("Divided by 3");
        for(int i = 1; i<101; i++){
            if (i%3==0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println("\n");
        System.out.println("Divided by 5");
            for(int i = 1; i<101; i++){
                if (i%5==0) {
                    System.out.print(i);
                    System.out.print(", ");
                }
            }
        System.out.println("\n");
        System.out.println("Divided by 3&5");
        for( int i = 1; i<101; i++){
            if (i%3==0 && i%5==0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
    }
}
