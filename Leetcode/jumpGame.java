class jumpGame{
    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println(jump(arr));
    }
    static boolean jump(int[] arr){
        int stepsLeft = arr[0];
        for(int i = 1; i < arr.length; i++){
            stepsLeft--;
            if(stepsLeft < 0){
            return false;
        }
            if(i == arr.length-1){
            return true;
        }
        if(stepsLeft < arr[i]){
            stepsLeft = arr[i];
        }
        }
        return false;
    }
}