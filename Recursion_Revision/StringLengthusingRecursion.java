package Recursion_Revision;

public class StringLengthusingRecursion {

    public static int stringlength(String str){
        if(str.length()==0){
            return 0;
        }
        return stringlength(str.substring(1))+1;

    }

    public static void main(String[] args) {
        String str="abcde";
        System.out.println(stringlength(str));
    }
}
