//Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
    public static void main(String[] args) {
        //create
        HashMap<Integer, String> map = new HashMap<>();
        //insert
        map.put(1, "Pink");
        map.put(2, "Blue");
        map.put(3, "Green");
        map.put(4, "Yellow");
        map.put(5, "White");
        //iteration
        for(Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println("Key: "+ e.getKey()+" Value: "+e.getValue());

        }
        System.out.println(map.get(1));

    }
}
