class orderAgnosticBS{
    public static void main(String[] args){
        int[] arr = {9,8,6,4,2,1};
        int target = 2;
        System.out.println(agnosticbs(arr,target));
    }
    static int agnosticbs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc;
        if(arr[start] < arr[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return target;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}