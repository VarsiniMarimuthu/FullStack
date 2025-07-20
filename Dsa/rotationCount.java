class rotationCount{
    public static void main(String[] args){
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(findRotationCount(arr));
    }
    static int findRotationCount(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length;
        while(start < end){
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}