//Write a Java program to get a shallow copy of a HashMap instance.
import java.util.HashMap;

public class HashMap6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> n_map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);

        n_map = (HashMap)map.clone();

        System.out.println(n_map);

    }
}
