import java.util.*;
class maxIn2d{
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}