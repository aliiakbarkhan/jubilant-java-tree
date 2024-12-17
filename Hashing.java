import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        //insert
        set.add(1);
        set.add(2);
        set.add(65);
        set.add(1);
        set.add(14);
        set.add(51);
        set.add(781);
        
        //search
        if (set.contains(1)) {
            System.out.println("True"); 
        }
        if (!set.contains(6)) {
            System.out.println("False");
        }
        System.out.println(set);
        //delete
        set.remove(65);
        System.out.println(set);
        
        //iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
