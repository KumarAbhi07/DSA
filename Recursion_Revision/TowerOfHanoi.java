package Recursion_Revision;

public class TowerOfHanoi {
    public static void main(String[] args){
        towerofhanoi(3,"s","d","h");
    }
    public static void towerofhanoi(int n, String src , String des,String helper){
        if(n==1) {
            System.out.println(src+"-->"+ des);
            return;
        }
        towerofhanoi(n-1,src,des,helper);
        System.out.println(src+"-->"+helper);
        towerofhanoi(n-1,helper,src,des);

    }
}
