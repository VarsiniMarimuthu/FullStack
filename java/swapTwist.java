class swapTwist{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int start = 1;
        int end = arr.length-2;
        for(int i = start; i < end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num : arr){
                System.out.print(num + " ");
            }
    }
}
// swap first and last elements only
/*
 class Main{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int start = 0;
        int end = arr.length-1;
        for(int i = start; i < end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for(int num : arr){
                System.out.print(num + " ");
            }
    }
}

 */
