class medianOfArr{
    public static void main(String[] args){
        int nums1[] = {1,3};
        int nums2[] = {2};
        System.out.print(median(nums1,nums2));
    }
    static double median(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m+n];
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >=0){
            if(nums1[i] > nums2[j]){
                arr[k--] = nums1[i--];
            }
            else{
                arr[k--] = nums2[j--];
            }
        }
        while(i >= 0){
            arr[k--] = nums1[i--];
        }
        while(j >= 0){
            arr[k--] = nums2[j--];
        }
        int total = m+n;
        double median;
        if(total % 2 == 0){
            median = arr[total/2];
        }
        else{
            median = (arr[(total/2) - 1] + arr[total / 2]) / 2.0;
        }
        return median;
    }
}