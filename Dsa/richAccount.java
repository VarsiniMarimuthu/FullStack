class richAccount{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {3,8,4},
            {4,7,9}
        };
        System.out.print(richestPerson(arr));
    }
    static int richestPerson(int[][] arr){
        int ans = 0;
        for(int row = 0; row < arr.length; row++){
            int sum = 0;
            for(int col = 0; col < arr[row].length; col++){
                sum += arr[row][col];
            }
            if(sum > ans){
            ans = sum;
        }
        }
        return ans;
    }
}