public class InfiniteArray{
    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,9,10,22,33,35,42,44,46,48,50};
        int target=42;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2; 
            start=newStart;
        }
        return binary(arr,target,start,end);
    }
    static int binary(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}