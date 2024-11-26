//Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.HashMap;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Right now Map have Values: ");
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println();
        System.out.println("After Deletion: ");
        System.out.println(map.isEmpty());
    }
}
