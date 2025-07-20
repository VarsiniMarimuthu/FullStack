class maximumSubArray{
    public static void main(String[] args){
        int[] arr = {-2,-1,1,3,5,7,9};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int temp = currSum + arr[i];
            if(temp < arr[i]){
                currSum = arr[i];
            }
            else{
                currSum = temp;
            }
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}