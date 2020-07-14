package Collection_Exercise;


import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("pranita");
        set.add("sakshi");
        set.add("neha");
        //set.add("pranita");

        for (String str:set) {
            System.out.println(str);

        }

    }
}
