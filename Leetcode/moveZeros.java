import java.util.*;
public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.print(Arrays.toString(move(arr)));
    }
    static int[] move(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
