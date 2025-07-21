public class maxConsecutiveOnes {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1,2,1,1,1,1,1};
        System.out.print(countOnes(arr));
    }
    static int countOnes(int[] arr){
        int max = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count=0;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
