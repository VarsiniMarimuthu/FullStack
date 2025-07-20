class ceiling{
    public static void main(String[] args){
        int[] arr = {2,4,6,8,9,12,14,16,18,20};
        int target = 16;
        System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            if(target > arr.length-1){
                return -1;
            }
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
        return start;
    }
}