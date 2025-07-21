
import java.util.Arrays;

public class squaresOfSortedArr {
    public static void main(String[] args) {
        int[] arr = {-4,5,7,3,2,1,9};
        System.out.println(Arrays.toString(square(arr)));
    }
    static int[] square(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= arr[i];
        }
        Arrays.sort(arr);
        int i = 0;
        int[] result = new int[arr.length];
        for(int num : arr){
            result[i++] =num;
        }
        return result;
    }
}
