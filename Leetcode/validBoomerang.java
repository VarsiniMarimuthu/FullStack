//1 1, 2 3, 3 2
public class validBoomerang {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1},
            {2,3},
            {3,2}
        };
        System.out.println(boomerang(arr));
    }
    static boolean boomerang(int[][] arr){
        int dx1 = arr[1][0] - arr[0][0];
        int dx2 = arr[2][0] - arr[1][0];
        int dy1 = arr[1][1] - arr[0][1];
        int dy2 = arr[2][1] - arr[1][1];
        return dy1 * dx2 != dy2 * dx1;
    }
}
