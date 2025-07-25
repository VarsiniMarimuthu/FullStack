public class thirdMaximum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr){
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i] > max3){
                max3 = arr[i];
            }
        }
        if(max3 == Long.MIN_VALUE){
                return (int) max1;
            }
            else{
                return (int) max3;
            }
    }
}
