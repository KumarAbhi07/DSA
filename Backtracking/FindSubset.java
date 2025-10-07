package Backtracking;

public class FindSubset {
    public static void main(String[] args) {
        String str="abc";
        findsubset(str,"",0);
    }
    public static void findsubset(String str,String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        findsubset(str,ans+str.charAt(i),i+1);
        findsubset(str,ans,i+1);

    }
}
