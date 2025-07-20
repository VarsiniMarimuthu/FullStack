class linearSearch{
    public static void main(String[] args){
        int[] arr = {2,8,7,11,10,13};
        int target = 10;
        System.out.print(linear(arr, target));
    }
    static int linear(int[] arr, int target){
        if(arr.length == 0)
        return -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}