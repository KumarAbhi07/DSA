package DIvideConquer;

public class MajorityElementBruteforce {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majority(arr));
    }
    public static int majority(int[] arr){
        int maj=arr.length/2;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count>maj){
                return arr[i];
            }


        }
        return -1;
    }
}
