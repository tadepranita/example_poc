package Collection_Exercise;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {
    public static void main(String args[]) {

        Vector<String> stringVector =new Vector<String>();
        stringVector.add("Ayush");
        stringVector.add("rahul");
        stringVector.add("Ayush");

        Iterator itr1 = stringVector.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
