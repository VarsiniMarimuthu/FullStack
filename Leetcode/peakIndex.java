class peakIndex{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,7,6,3,2};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[start]; // or return arr[end]
        //return start or end (if we want index)
    }
}