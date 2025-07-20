import java.util.*;
class twoSum{
    public static void main(String[] args){
        int arr[]={10,15,3,7,8,11};
        int target=18;
        HashSet<Integer> set=new HashSet<>();
        for(int nums: arr){
            int element=target-nums;
            if(set.contains(element)){
                System.out.println(nums + " + " + element + " = " +target);
                break;
            }
            set.add(nums);
        }
    }
}