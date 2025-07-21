public class missingNum {
    public static void main(String[] args) {
        int[] arr={0,1,3,4};
        System.out.print(missing(arr));
    }
    static int missing(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
        }
        return n*(n+1)/2 - sum;
    }
}
