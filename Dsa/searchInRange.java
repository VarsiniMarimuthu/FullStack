class searchInRange{
    public static void main(String[] args){
        int[] arr = {2,8,7,11,10,13};
        int target = 10;
        System.out.println(search(arr, target, 2,5));
    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0)
        return -1;
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}