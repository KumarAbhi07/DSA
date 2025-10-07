package Arraylist;

import  java.util.ArrayList;
public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 1; i <=6 ; i++) {
            list.add(i);
        }
        int target=10;
        System.out.println(pairSum(list,target));
        System.out.println(optimisiedPairSum(list,target));
    }

    //brute force apporach
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    // Optimised
    public static boolean optimisiedPairSum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
}
