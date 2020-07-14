package Collection_Exercise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MyArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("sonika");
        deque.add("pranita");
        deque.add("chaitali");

        Iterator itr = deque.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
