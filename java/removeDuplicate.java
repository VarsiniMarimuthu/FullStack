import java.util.*;

public class removeDuplicate {
    public static void main(String[] args){
        int[] arr={1,2,3,4,3,4,5};
        System.out.print(remove(arr));
    }
    static int[] remove(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int element : set) {
            result[i++] = element;
        }
        return result;
    }

}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,5};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    static int[] removeDuplicates(int[] nums) {
        int indexForNextNumber=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                nums[indexForNextNumber]=nums[i];
                indexForNextNumber++;
            }
        }
        return Arrays.copyOf(nums, indexForNextNumber);
    }
}