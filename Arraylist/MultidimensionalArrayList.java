package Arraylist;

import java.util.ArrayList;

public class MultidimensionalArrayList {
    public static void main(String[] args) {
         ArrayList<ArrayList<Integer>> list=new ArrayList<>();

         ArrayList<Integer> l1= new ArrayList<>();
         ArrayList<Integer> l2=new ArrayList<>();
         ArrayList<Integer> l3=new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*5);

        }
        list.add(l1);
        list.add(l2);
        list.add(l3);

        System.out.println(list);

        //print 2D ArrayList
        for (int i = 0; i <list.size() ; i++) {
            ArrayList<Integer> l=list.get(i);
            for (int j = 0; j < l.size(); j++) {
                System.out.print(l.get(j)+" ");

            }
            System.out.println();

        }

    }
}
