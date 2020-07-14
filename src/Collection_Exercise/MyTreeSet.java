package Collection_Exercise;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(4);

        for (Integer itr:set) {
            System.out.println(itr);
        }
    }

}
