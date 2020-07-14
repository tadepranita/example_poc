package Collection_Exercise;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyPrivQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("amey");
        queue.add("cherry");
        queue.add("gaurav");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        for (String str:queue) {
            System.out.println(str);
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        for (String str1:queue) {
            System.out.println(str1);

        }

    }
}
