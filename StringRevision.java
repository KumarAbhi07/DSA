import java.util.Scanner;

public class StringRevision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        //concatenation
        String str3=str1+" "+ str2;
        System.out.println(str3);

        // charAt
        for (int i = 0; i < str3.length() ; i++) {
            System.out.println(str3.charAt(i));

        }
        //compareTo
        if(str1.compareTo(str2)==0){
            System.out.println((true));
        }
        else{
            System.out.println(false);
        }
        //substring
        String str="computer science branch";
        String s=str.substring(5);
        String s1=str.substring(0,4);
        String s2=str.substring(1,3);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        //Interger --> string
        int n=1234;
        String s4=Integer.toString(n);
        System.out.println(s4);


        //string-->integer
        String s3="1234";
        int n1=Integer.parseInt(s3);
        System.out.println(n1);
        combinedLength();
        change_etoi();
    }
    public static void combinedLength(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[] arr=new String[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.next();
        }
        int l=0;

        for (int i = 0; i <size ; i++) {
            l+=arr[i].length();

        }
        System.out.println(l);
    }
    static void change_etoi(){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String str1="";
        for (int j = 0; j <str.length(); j++) {
            if(str.charAt(j)=='e') str1=str1 + 'i';
            else str1=str1+str.charAt(j);

        }
        System.out.println(str1);

    }
}

