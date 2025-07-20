import java.util.*;
class 2dArray{
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {5,6,7,8},
            {9,10,11,12}
        };
        int target = 3;
        int result[] = searchElement(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] searchElement(int[][] arr,int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}