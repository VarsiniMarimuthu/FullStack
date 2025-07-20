class binarySearch{
    public static void main(String[] args){
        int[] arr = { 2,4,6,8,9,12,14,17};
        int target = 12;
        System.out.println(binary(arr,target));
    }
    static int binary(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}