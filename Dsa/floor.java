class floor{
    public static void main(String[] args){
        int[] arr = {2,4,6,8,9,12,14,16,18,20};
        int target = 16;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                    end = mid-1;
            }
            else if(target > arr[mid]){
                    start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}