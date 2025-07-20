class secondLargest{
    public static void main(String[] args){
        int[] arr={35,40,58,98,100};
        int largest=arr[0];
        int secondlarge=arr[0];
        for(int nums:arr){
            if(nums>largest){
                secondlarge=largest;
                largest=nums;
            }
            else if(nums>secondlarge && nums!=largest){
                secondlarge=nums;
            }
        }
        System.out.println("The second largest element is :" +secondlarge);
    }
}