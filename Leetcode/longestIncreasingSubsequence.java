public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.print(subsequence(arr));
    }
    static int subsequence(int[] arr){
        int[] subArr = new int[arr.length];
        int length = 0;
        for(int num : arr){
        int left = 0;
        int right = length;
        while(left < right){
            int mid = (left + right) / 2;
                if(subArr[mid] < num){
                    left = mid+1;
                }
                else{
                    right = mid;
                }
        }
        subArr[left] = num;
        if(left == length){
            length++;
        }
    }
        return length;
    }
}
