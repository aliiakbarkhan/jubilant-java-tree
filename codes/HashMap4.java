// Write a Java program to remove all mappings from a map.
import java.util.HashMap;
import java.util.Map;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Cow");
        map.put(2, "Dog");
        map.put(3, "Cat");
        map.put(4, "Bat");
        map.put(5, "Bird");

        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }
        System.out.println();
        System.out.println("After Remove All Elements: ");
        map.clear();
        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
        }
    }
}
