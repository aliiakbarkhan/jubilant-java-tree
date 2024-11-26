// Write a Java program to copy all mappings from the specified map to another map.
import java.util.HashMap;
import java.util.Map;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Iron Man");
        map.put(2, "Captian America");
        map.put(3, "Black Widow");
        map.put(4, "Spider Man");
        map.put(5, "Hulk");

        //new map
        HashMap<Integer,String> new_Map = new HashMap<>();
        new_Map.put(6, "Batman");
        new_Map.put(7, "Superman");
        new_Map.put(8, "Wonder Women");
        new_Map.put(9, "Flash");
        new_Map.put(10, "Cyborg");
        new_Map.put(11, "AquaMan");
        
        System.out.println("Map: ");
        System.out.println();
        for(Map.Entry<Integer,String> e: map.entrySet()){
            System.out.println("Keys: "+e.getKey()+" Values: "+ e.getValue());
        }
        System.out.println();
        System.out.println();
        System.out.println("New Map: ");
        System.out.println();
        for(Map.Entry<Integer,String> e: new_Map.entrySet()){
            System.out.println("Keys: "+e.getKey()+" Values: "+ e.getValue());
        }
        System.out.println();
        System.out.println();
        new_Map.putAll(map);
        System.out.println("New Map After Merging: ");
        System.out.println();
        for(Map.Entry<Integer,String> e: new_Map.entrySet()){
            System.out.println("Keys: "+e.getKey()+" Values: "+ e.getValue());
        }
    }
}
