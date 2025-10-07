package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        //add elements
        list.add(1);
        list.add(34);
        list.add(56);
        list.add(4);
        list.add(10);
        System.out.println(list);

        //get element
        System.out.println(list.get(2));

        //remove element
        list.remove(2);  //removeFirst removeLast
        System.out.println(list);

        //set element
        list.set(2,49);
        System.out.println(list);

        //contains
        System.out.println(list.contains(49));
        System.out.println(list.contains(4));

        // insert element
        list.add(2,4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list );
    }

}
