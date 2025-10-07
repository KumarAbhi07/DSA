package Arraylist;

import java.util.ArrayList;

public class MaximumInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(10);
        list.add(78);
        list.add(56);
        System.out.println(maxArr(list));
    }
    public static int maxArr(ArrayList<Integer> l){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            max=Math.max(max,l.get(i));
        }
        return max;
    }
}
