import java.util.*;
class findDuplicates{
    public static void main(String[] args){
        int[] arr={2,4,6,8,10,10,11,15};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    break;
                }
            }
        }
    }
}