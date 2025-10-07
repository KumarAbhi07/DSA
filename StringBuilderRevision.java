public class StringBuilderRevision {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        System.out.println(str.charAt(0));
        str.setCharAt(0,'d');
        System.out.println(str);
        str.setCharAt(0,'h');
        str.insert(1,'b'); // add char at any index
        System.out.println(str);
        str.delete(1,2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.append('w');
        System.out.println(str);
    }

}
