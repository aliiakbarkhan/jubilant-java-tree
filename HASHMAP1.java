import java.util.*;

public class HASHMAP1 {
    public static void main(String[] args) {
        //contry poplulation
        HashMap<String, Integer> country = new HashMap<>();
        //insert
        country.put("INDIA", 4050);
        country.put("US", 5650);
        country.put("CANADA", 4600);
        country.put("JAPAN", 8950);
        country.put("CHINA", 9060);
        
        System.out.println(country);
        country.put("CHINA", 9);
        System.out.println(country);

        //search
        // if (country.containsKey("CHINA")) {
        //     System.out.println("Key is Present in the Map");    
        // }
        // System.out.println(country.get("CHINA"));
        
        
        //delete
        country.remove("CHINA");
        for(Map.Entry<String, Integer> e: country.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


    }
}
