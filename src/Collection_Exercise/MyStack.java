package Collection_Exercise;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<String> st= new Stack<String>();
        st.push("amey");
        st.push("sushil");
        st.push("rahul");
        st.pop();

        Iterator<String> itr= st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
