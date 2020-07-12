package Collection_Exercise;

import java.util.*;

public class MyArrayList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Sushil");
        list.add("vijay");
        list.add("ravi");

        list.remove("Ravi");

        //printing object as it is
        Object ar = list.clone();
        System.out.println(ar);



        //Iterating object by casting it to specific type i.e ArrayList
        ArrayList<String> cloneLIst = (ArrayList)ar;
        Iterator it = cloneLIst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        Iterator itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        //INTEGER

        ArrayList<Integer> integerList =new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(4);

        boolean remove = integerList.remove((Object)5);


        for (Integer q :integerList) {
            q.intValue();
        }

        Iterator itr2 =integerList.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());

        }

        //character

        ArrayList<Character> characterList =new ArrayList<Character>();
        characterList.add('e');
        characterList.add('a');
        characterList.add('e');
        characterList.add('i');

        ArrayList<Character> list1 = new ArrayList<Character>();
        list1.add('r');
        list1.add('r');
        list1.add('r');

        boolean status = characterList.addAll(list1);
        System.out.println("The staus of my addition of list is : "+status);

        int size = characterList.size();

        Iterator it1 =characterList.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());

        }


        ArrayList<Float> f1 = new ArrayList<Float>();
        f1.add(1.5f);
        f1.add(1.6f);

        ArrayList<Float> f2 = new ArrayList<Float>();
        f2.add(1.5f);
        f2.add(1.7f);

        //Converting array to collection
        DevOne devOne = new DevOne();
        String[] countryArray = devOne.getCountries();

        List<String> countries = Arrays.asList(countryArray);//To convert into collection u need u use Arrays class
        //without sort
        Iterator country = countries.iterator();
        while(country.hasNext()){
            System.out.println("country: "+ country.next());
        }
        //with sort

        Collections.sort(countries);
        Iterator sorted = countries.iterator();
        while(sorted.hasNext()){
            System.out.println("sorted country: "+ sorted.next());
        }
    }
}
