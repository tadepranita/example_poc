package Collection_Exercise;



import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String args[]){

        LinkedList<Integer> integerList =new LinkedList<Integer>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);


        Iterator<Integer> itr1 =integerList.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        //STRING

        LinkedList<String> list = new LinkedList<String>();
        list.add("sushil");
        list.add("rahul");
        list.add("pranita");

        list.add(1,"adding to index one");



        Iterator itr2=list.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }



    }
}

