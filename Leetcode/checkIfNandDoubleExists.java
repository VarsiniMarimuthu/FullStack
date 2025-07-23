//10 2 5 3
import java.util.*;
public class checkIfNandDoubleExists {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkDouble(arr));
    }
    static boolean checkDouble(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],i);
        }
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(2 * arr[i]) && i != map.get(2 * arr[i])){
                return true;
            }
        }
        return false;
    }
}
