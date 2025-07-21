public class searchin2d {
    public static void main(String[] args) {
        int[][] arr= {
       {10,20,30,40},
       {15,25,35,45},
       {28,29,37,49},
       {33,34,38,50} 
    };
    int target = 34;
    System.out.println(search(arr,target));
    }
    static  boolean search(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;
            while(r < arr.length && c >=0){
                if(arr[r][c]==target){
                    return true;
                }
                if(arr[r][c]< target){
                    r++;
                }
                else{
                    c--;
                }
            }
        return false;
    }
}
