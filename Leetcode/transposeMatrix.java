
import java.util.Arrays;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {2,3,4},
            {5,6,7},
            {8,9,10}
        };
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    static int[][] transpose(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int[][] matrix = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[j][i] = arr[i][j];
            }
        }
        return matrix;
    }
}
