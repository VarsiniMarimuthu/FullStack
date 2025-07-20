class sameNumadd{
    public static void main(String[] args){
        int[] arr={2,2,0,4,0,8};
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = 0;
            }
        }

        int j = 0;
        for(int i = 0; i < arr.length ; i++){
        if(arr[i] !=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        }
        for(int nums : arr){
            System.out.print(nums);
        }
    }
}