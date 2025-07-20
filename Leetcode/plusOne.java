import java.util.*;
class plusOne{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(nextNumber(arr)));
    }
    static int[] nextNumber(int[] arr){
        for(int i = arr.length-1; i >=0; i++){
            if(arr[i]+1 < 10){
                arr[i]++;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }
        arr = new int[arr.length];
        arr[0] = 1;
        return arr;
    }
}