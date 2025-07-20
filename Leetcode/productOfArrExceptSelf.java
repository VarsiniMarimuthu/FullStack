import java.util.*;
class productOfArrExceptSelf{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }
    static int[] product(int[] arr){
        int[] leftProduct = new int[arr.length];
        int[] rightProduct = new int[arr.length];
        leftProduct[0] = 1;
        rightProduct[arr.length-1] = 1;
        for(int i = 1; i < arr.length; i++){
            leftProduct[i] = leftProduct[i-1] * arr[i-1];
        }
        for(int i = arr.length-2; i >= 0; i--){
            rightProduct[i] = rightProduct[i+1] * arr[i+1];
        }
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arr[i] = rightProduct[i];
            }
            else if(i == arr.length-1){
                arr[i] = leftProduct[i];
            }
            else{
                arr[i] = leftProduct[i] * rightProduct[i];
            }
        }
        int[] result = new int[arr.length];
        for(int num : arr){
            result[0] = num;
        }
        return result;
    }
}