import java.util.*;
class oddEven{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int nums : arr){
            if(nums % 2 == 0){
                even.add(nums);
            }
            else{
                odd.add(nums);
            }
        }

        Collections.sort(odd);
        Collections.sort(even, Collections.reverseOrder());

        List<Integer> result = new ArrayList<>();
            result.addAll(odd);
            result.addAll(even);

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}