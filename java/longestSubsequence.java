import java.util.*;
class longestSubsequence{
    public static void main(String[] args){
        int[] arr={100,2,200,4,3,1};
        System.out.print(maximum(arr)); 
    }
    static int maximum(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(set.contains(num-1))
            continue;
            int currlength=0;
            while(set.contains(num)){
                currlength+=1;
                num+=1;
            }
            max=Math.max(max,currlength);
        }
        return max;
    }
}