//Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        //declear
        HashMap<Integer, String> map = new HashMap<>();
        //insert
        map.put(1, "Batman");
        map.put(2, "Superman");
        map.put(3, "Wonder Women");
        map.put(4, "Flash");
        map.put(5, "Cyborg");
        map.put(6, "AquaMan");
        //size
        System.out.println("Total Number Of Key Value Pairs Are: "+map.size());
    }
}
