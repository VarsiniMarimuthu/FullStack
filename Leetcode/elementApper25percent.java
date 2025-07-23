//1 2 2 6 6 6 6 7 10
public class elementApper25percent {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(checkElement(arr));
    }
    static int checkElement(int[] arr){
        int count = 1;
        int n = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > arr.length/4){
            n = arr[i];
        }
        }
        return n;
    }
}
