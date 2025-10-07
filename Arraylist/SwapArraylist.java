package Arraylist;

import java.util.ArrayList;

public class SwapArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(10);
        list.add(78);
        list.add(56);
        System.out.println(list);
        swap(list,1,3);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    static void swap(ArrayList<Integer> list, int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    static void reverse(ArrayList<Integer> list){
        int start=0;
        int end=list.size()-1;
        while(start<end){
            swap(list,start,end);
            start++;
            end--;
        }
    }

}
