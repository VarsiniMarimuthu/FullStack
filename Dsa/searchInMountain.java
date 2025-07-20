class searchInMountain{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int firstTry = orderAgnostic(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int orderAgnostic(int[] arr,int target,int start, int end){
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc = true;
        }
        else{
            isAsc=false;
        }
        if(arr[mid==target]){
            return arr[mid];
        }
        while(start <= end){
            int mid = start + (end -start)/2;
            if(isAsc){
            if(target < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
            if(target > arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        }
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
        return start;
    }
}