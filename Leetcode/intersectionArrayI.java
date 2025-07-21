import java.util.*;
public class intersectionArrayI {
    public static void main(String[] args) {
    int[] arr1 = {1,2,2,1};
    int[] arr2 = {2,2};
    System.out.print(Arrays.toString(intersection(arr1, arr2)));
    }
    static int[] intersection(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> main = new HashSet<>();
        for(int i : arr1){
            set1.add(i);
        }
        for(int j : arr2){
            set2.add(j);
        }
        for(Integer num : set1){
            if(set2.contains(num)){
                main.add(num);
            }
        }
        int k = 0;
        int[] result = new int[main.size()];
        for(Integer i : main){
            result[k] = i;
            k++;
        }
        return result;
    }
}
