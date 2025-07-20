class maximumSubArray{
    public static void main(String[] args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maximum(arr));
    }
    static int maximum(int arr[]){
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp=currSum+arr[i];
            if(temp<arr[i]){
                currSum=arr[i];
            }
            else{
                currSum=temp;
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        return maxSum;
    }
}
___________________________________________________

class maximumSubArray{
    public static void main(String[] args){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int temp=currSum+arr[i];
            if(temp<arr[i]){
                currSum=arr[i];
            }
            else{
                currSum=temp;
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        System.out.print(maxSum);
    }
}