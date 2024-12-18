import java.util.*;

public class DelHashset {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        set.add("White");
        set.add("Black");
        set.add("Blue");
        set.add("Red");
        set.add("Green");
        set.add("Pink");
        System.out.println(set);
        String[] new_arr = new String[set.size()];
        set.toArray(new_arr);
        for(String val: new_arr){
            System.out.println("Array Value: "+val);
        }

    }
}
