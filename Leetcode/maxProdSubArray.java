class maxProdSubArray{
    //2,3,-2,4
    public static void main(String[] args){
        int[] arr = {2,3,-2,4};
        System.out.println(maximumProduct(arr));
    }
    static int maximumProduct(int[] arr){
        int result = arr[0];
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            if(current > 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max, current * max);
            min = Math.min(min, current * min);
            result = Math.max(result, max);
        }
        return result;
    }
}