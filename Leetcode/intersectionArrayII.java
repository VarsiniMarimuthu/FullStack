import java.util.Arrays;
public class intersectionArrayII {
    public static void main(String[] args){
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.print(Arrays.toString(intersectionII(arr1, arr2)));
    }
    static int[] intersectionII(int[] arr1, int[] arr2){
        int l1 = arr1.length;
        int l2 = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j= 0;
        int k = 0;
        while(i < l1 && j < l2){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                arr1[k++] = arr1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(arr1, 0, k);
    }
}
