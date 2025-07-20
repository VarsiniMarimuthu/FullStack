import java.util.*;
class containsDuplicate{
    public static void main(String[] args){
        int[] arr = {1,1,2,3,5};
        System.out.print(duplicate(arr));
    }
    static boolean duplicate(int[] arr){
        Map<Integer,Boolean> map =  new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num))
            return true;
            map.put(num, true);
        }
        return false;
    }
}