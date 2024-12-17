import java.util.HashSet;
import java.util.Iterator;

public class ITERATEHASH {
    public static void main(String[] args) {
        HashSet <String> a = new HashSet<>();
        a.add("White");
        a.add("Black");
        a.add("Blue");
        a.add("Red");
        a.add("Green");
        a.add("Pink");
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
