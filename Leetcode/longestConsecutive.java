//100,4,200,1,3,2
import java.util.*;
class LongestConsecutive{
    public static void main(String[] args){
        int[] arr={100,4,200,1,3,2};
        System.out.println(subsequence(arr));
    }
    static int subsequence(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int nums : arr){
            set.add(nums);
        }
        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currLen = 1;
                int currNum = num;
            while(set.contains(currNum+1)){
                currNum+=1;
                currLen+=1;
            }
            max = Math.max(max,currLen);
        }
    }
    return max;
}
}